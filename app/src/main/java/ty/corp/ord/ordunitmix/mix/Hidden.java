package ty.corp.ord.ordunitmix.mix;
 
import ty.corp.ord.ordunitmix.R;
import ty.corp.ord.ordunitmix.UnitVO;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Hidden extends AppCompatActivity {

	UnitVO[] unit_obj;
	String[] unit_list;

	phpDown task;
	Context context;
    ListView listview;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mix_list);
		context = this.getApplicationContext();
        listview = (ListView) findViewById(R.id.mix_list);

		task = new phpDown();
		task.execute("http://pty1026.cafe24.com/booking/selectBookingList.php","00");

		listview.setClickable(true);
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

				Builder builder = new Builder(Hidden.this);
				builder.setTitle(unit_obj[position].getUnit_no())
						.setMessage(unit_obj[position].getMain_unit())
						.setPositiveButton("Check", null).show();

			}
		});
	}

	private class phpDown extends AsyncTask<String, Integer, String> {

		public phpDown(){
		}
		@Override
		protected void onPreExecute() {
			Log.d("phpDown","onPreExecute");
		}

		@Override
		protected String doInBackground(String... urls) {
			StringBuilder jsonHtml = new StringBuilder();
			try{
				URL url = new URL(urls[0]);
				HttpURLConnection conn = (HttpURLConnection)url.openConnection();
				if(conn != null){
					conn.setConnectTimeout(10000);
					conn.setUseCaches(false);
					if(conn.getResponseCode() == HttpURLConnection.HTTP_OK){
						BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
						for(;;){
							String line = br.readLine();
							if(line == null) break;
							jsonHtml.append(line + "\n");
						}
						br.close();
					}
					conn.disconnect();
				}
			} catch(Exception ex){
				ex.printStackTrace();
			}
			return jsonHtml.toString();

		}

        @Override
		protected void onPostExecute(String str){
			String id;
			try{
				JSONObject root = new JSONObject(str);
				JSONArray ja = root.getJSONArray("result"); //get the JSONArray which I made in the php file. the name of JSONArray is "results"
				unit_obj = new UnitVO[ja.length()];
				unit_list = new String[ja.length()];
				for(int i=0;i<ja.length();i++){
					unit_obj[i] = new UnitVO();
					JSONObject jo = ja.getJSONObject(i);
					unit_obj[i].setUnit_no(jo.getString("user_name"));
					unit_obj[i].setMain_unit(jo.getString("field_name"));

					unit_list[i] = "예약 / "+ unit_obj[i].getMain_unit() + " / " + unit_obj[i].getUnit_no();
				}
			}catch (JSONException e){
				e.printStackTrace();
			}

			ArrayAdapter<String> mix_list_adapter = new ArrayAdapter<String>(context, R.layout.list_custom_text, unit_list);
			listview.setAdapter(mix_list_adapter);
		}

	}
}
