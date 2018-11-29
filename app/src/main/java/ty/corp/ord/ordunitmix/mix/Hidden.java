package ty.corp.ord.ordunitmix.mix;
 
import ty.corp.ord.ordunitmix.R;
import ty.corp.ord.ordunitmix.UnitVO;
import ty.corp.ord.ordunitmix.databinding.FargMixBinding;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.databinding.DataBindingUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

 
public class Hidden extends Fragment {

	UnitVO[] unit_obj;
	String[] unit_list;

	phpDown task;
	FargMixBinding mixLayout;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mixLayout = DataBindingUtil.inflate(inflater, R.layout.farg_mix, container, false);
		task = new phpDown();
		task.execute("http://pty1026.cafe24.com/booking/selectBookingList.php","00");

		mixLayout.mixList.setClickable(true);
		mixLayout.mixList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Object booking_list_obj = mixLayout.mixList.getItemAtPosition(position);

				Builder builder = new Builder(getContext());
				builder.setTitle(unit_obj[position].getUnit_no()
						+ "\n\n"+unit_obj[position].getMain_unit()).setPositiveButton("Check", null).show();
			}
		});

		return mixLayout.getRoot();
	}

	private class phpDown extends AsyncTask<String, Integer, String> {

		public phpDown(){
			Log.d("phpDown","생성자");
		}
		@Override
		protected void onPreExecute() {
			Log.d("phpDown","onPreExecute");
		}

		@Override
		protected String doInBackground(String... urls) {
			Log.d("phpDown","doInBackground");
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


		protected void onPostExecute(String str){
			Log.d("phpDown","onPostExecute");
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
			ArrayAdapter<String> mix_list_adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, unit_list);
			mixLayout.mixList.setAdapter(mix_list_adapter);
		}

	}
}
