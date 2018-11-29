package ty.corp.ord.ordunitmix.mix;

import ty.corp.ord.ordunitmix.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Immortal extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mix_list);

		String[] list = {"로져","레일리","스코퍼가반","거프","흰수염","센고쿠","금사자시키","드래곤","제트"};
		
		ArrayAdapter<String> adapter;
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, list);
		
		ListView listview = (ListView) findViewById(R.id.mix_list);
		listview.setAdapter(adapter);

		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				if (position == 0) {
					Builder builder = new AlertDialog.Builder(Immortal.this);
					builder.setTitle("명령어:해적왕골D로져").setMessage("전설-에이스\n전설-거프\n전설-센고쿠\n+목재10개"
							+ "\n\n물뎀\n마나125-발동이감(2초,90%)\n방깍(85)\n공증오라100%)").setPositiveButton("확인", null).show();
				}
				if (position == 1) {
					Builder builder = new AlertDialog.Builder(Immortal.this);
					builder.setTitle("명령어:명왕실버즈레일리").setMessage("전설-핸콕\n전설-루피 나이트메어\n전설-드래곤\n+목재10개"
							+ "\n\n혼합\n마나120-방깍(20),스턴(3초)\n공증오라(100%,자신X)\n공송오라(60%)\n유닛회유(0.65%)\n스플래시(400)").setPositiveButton("확인", null).show();
				}
				if (position == 2) {
					Builder builder = new AlertDialog.Builder(Immortal.this);
					builder.setTitle("명령어:대검호스코퍼가반").setMessage("전설-샹크스\n전설-조로\n전설-마젤란\n+목재10개"
							+ "\n\n물뎀\n마나50-전체단퍼(40%)\n단일방깍(60)").setPositiveButton("확인", null).show();
				}
				if (position == 3) {
					Builder builder = new AlertDialog.Builder(Immortal.this);
					builder.setTitle("명령어:해군영웅거프").setMessage("변이-코비\n전설-거프\n전설-루피JET개틀링\n+목재5개"
							+ "\n\n물뎀\n마나150-현재범퍼(4)\n스턴(6% / 2.5초)\n추가물뎀(5%)\n공속증가(5% / 3초 / 80%)\n스플래시(300)").setPositiveButton("확인", null).show();
				}
				if (position == 4) {
					Builder builder = new AlertDialog.Builder(Immortal.this);
					builder.setTitle("명령어:대해적흰수염").setMessage("전설-흰수염\n전설-마르코\n전설-바르토로메오\n+목재10개"
							+ "\n\n물뎀\n마나110-스턴(3.5초)\n방깍(75)\n방동기감(12% / 3초 / 70%)\n스플래시(350)").setPositiveButton("확인", null).show();
				}
				if (position == 5) {
					Builder builder = new AlertDialog.Builder(Immortal.this);
					builder.setTitle("명령어:부처님센고쿠").setMessage("전설-센고쿠\n전설-마젤란\n전설-루치\n+목재10개"
							+ "\n\n마뎀\n현재범퍼(3% / 2%)\n스턴(10% / 2초)\n스플래시(400)").setPositiveButton("확인", null).show();
				}
				if (position == 6) {
					Builder builder = new AlertDialog.Builder(Immortal.this);
					builder.setTitle("명령어:천신금사자시키").setMessage("전설-금사자 시키\n전설-상디\n전설-카르가라\n+목재10개"
							+ "\n\n마뎀\n마나130-도킹15%\n스턴(11% / 3초)\n함대스플래시").setPositiveButton("확인", null).show();
				}
				if (position == 7) {
					Builder builder = new AlertDialog.Builder(Immortal.this);
					builder.setTitle("명령어:폭풍을몰아오는바람").setMessage("전설-드래곤\n전설-쿠마 폭군\n전설-제프\n+목재10개"
							+ "\n\n마뎀\n마나140-800범위 40(x0.5~2)마뎀\n스턴(10% / 3초)\n현재단퍼10% /10%)\n공속오라(25%)").setPositiveButton("확인", null).show();
				}
				if (position == 8) {
					Builder builder = new AlertDialog.Builder(Immortal.this);
					builder.setTitle("명령어:신념의흑완제트").setMessage("변이-제트\n전설-루피JET개틀링\n전설-슈가\n+목재5개"
							+ "\n\n마뎀\n이속 45%감소\n2000범위 순간이동\n마나170-400만+잃은체력%의 마뎀 + 3초스턴\n5%-200만마뎀,직선범위80만마뎀\n10%-40만마뎀\n15%-단일적3초스턴").setPositiveButton("확인", null).show();
				}


			}
		});
	}

}
