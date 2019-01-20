package ty.corp.ord.ordunitmix.mix;

import ty.corp.ord.ordunitmix.OrdListViewAdapter;
import ty.corp.ord.ordunitmix.R;
import ty.corp.ord.ordunitmix.UnitVO;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
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

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class Transcendence  extends Activity{

	UnitVO[] unit_obj;
	String[] unit_list;

	phpDown task;
	Context context;
	ListView listview;
	OrdListViewAdapter ordListViewAdapteradapter;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mix_list);
		context = this.getApplicationContext();
		ordListViewAdapteradapter = new OrdListViewAdapter() ;
		listview = (ListView) findViewById(R.id.mix_list);


		task = new phpDown();
		task.execute("http://pty1026.cafe24.com/ordUnitList/selectMixTrans.php","00");

		listview.setClickable(true);
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

				Builder builder = new Builder(Transcendence.this);
				builder.setTitle(unit_obj[position].getMain_unit())
						.setMessage(unit_obj[position].getSub_unit1()+"\n"
								+unit_obj[position].getSub_unit2()+"\n"
								+unit_obj[position].getSub_unit3()+"\n"
								+unit_obj[position].getSub_unit4()+"\n"
								+unit_obj[position].getSub_unit5()+"\n")
						.setPositiveButton("Check", null).show();

			}
		});
	}

	private class phpDown extends AsyncTask<String, Integer, String> {

		public phpDown(){
		}
		@Override
		protected void onPreExecute() {
			//Log.d("phpDown","onPreExecute");
		}

		@Override
		protected String doInBackground(String... urls) {
			StringBuilder jsonHtml = new StringBuilder();
			try{
				java.net.URL url = new URL(urls[0]);
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
			//Log.d("phpDown","onPostExecute");
			String id;
			try{
				listview.setAdapter(ordListViewAdapteradapter);
				//Log.d("phpDown","onPostExecute TRY str ->"+str);
				JSONObject root = new JSONObject(str);
				//Log.d("phpDown","onPostExecute JSON");
				JSONArray ja = root.getJSONArray("result"); //get the JSONArray which I made in the php file. the name of JSONArray is "results"
				unit_obj = new UnitVO[ja.length()];
				unit_list = new String[ja.length()];
				for(int i=0;i<ja.length();i++){
					unit_obj[i] = new UnitVO();
					JSONObject jo = ja.getJSONObject(i);
					unit_obj[i].setUnit_no(jo.getString("unit_no"));
					unit_obj[i].setMain_unit(jo.getString("main_unit"));

					unit_obj[i].setSub_unit1(jo.getString("sub_unit1"));
					unit_obj[i].setSub_unit2(jo.getString("sub_unit2"));
					unit_obj[i].setSub_unit3(jo.getString("sub_unit3"));
					unit_obj[i].setSub_unit4(jo.getString("sub_unit4"));
					unit_obj[i].setSub_unit5(jo.getString("sub_unit5"));
					unit_obj[i].setSub_unit6(jo.getString("sub_unit6"));
					unit_obj[i].setSub_unit7(jo.getString("sub_unit7"));
					unit_obj[i].setSub_unit8(jo.getString("sub_unit8"));

					unit_obj[i].setFrequently(jo.getString("frequently"));
					unit_obj[i].setEtc(jo.getString("etc"));

					//Log.d("phpDown","onPostExecute TRY //"+ unit_obj[i].getUnit_no() + " / " + unit_obj[i].getMain_unit());
					if("1".equals(unit_obj[i].getFrequently())){
						ordListViewAdapteradapter.addItem(ContextCompat.getDrawable(context, R.drawable.pu_star),
								unit_obj[i].getMain_unit(), unit_obj[i].getEtc()) ;
					}else{
						ordListViewAdapteradapter.addItem(ContextCompat.getDrawable(context, R.drawable.em_star),
								unit_obj[i].getMain_unit(), unit_obj[i].getEtc()) ;
					}
				}
			}catch (JSONException e){
				//Log.d("phpDown","onPostExecute Catch");
				e.printStackTrace();
			}
		}

	}


}
