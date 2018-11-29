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

public class Eternity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mix_list);

		String[] list = {"스모커","에이스","버기","핸콕","카벤딧슈","비비"};
		
		ArrayAdapter<String> adapter;
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, list);
		
		ListView listview = (ListView) findViewById(R.id.mix_list);
		listview.setAdapter(adapter);

		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				if (position == 0) {
					Builder builder = new AlertDialog.Builder(Eternity.this);
					builder.setTitle("명령어:하얀사냥꾼").setMessage("히든-베르고\n히든-카쿠\n희귀-스모커 준장\n희귀-루치 레오파드\n행운의 토큰 2개\n+목재5개"
							+ "\n\n물뎀\n마나110-스턴(3초)\n클리어횟수비례데미지\n방깍(35)\n공증오라(70%)\n이감오라(65%)\n스플래시(270)").setPositiveButton("확인", null).show();
				}
				if (position == 1) {
					Builder builder = new AlertDialog.Builder(Eternity.this);
					builder.setTitle("명령어:화권의에이스").setMessage("변이-에이스\n전설-마르코\n특별-징베\n특별-죠즈-\n특별-버기마기탄\n+목재5개\n+클리어 5회"
							+ "\n\n마뎀\n마나200-전체범퍼(MAX / 3%)\n이감오라(55%)").setPositiveButton("확인", null).show();
				}
				if (position == 2) {
					Builder builder = new AlertDialog.Builder(Eternity.this);
					builder.setTitle("명령어:천냥광대").setMessage("전설-나미\n희귀-이완코브\n전설-마젤란\n특별-봉쿠레\n특별-버기마기탄\n+목재5개\n+클리어 10회"
							+ "\n\n물뎀\n방깍(33)\n공속오라50%)\n공증오라(100)\n허세!-공증오라(5% / 3.5초 / 40%),공증오라(n*% / 최대80%)\n소환유닛 스플래시").setPositiveButton("확인", null).show();
				}
				if (position == 3) {
					Builder builder = new AlertDialog.Builder(Eternity.this);
					builder.setTitle("명령어:아마존릴리의여제").setMessage("전설-핸콕\n히든-피셔타이거\n히든-파이러츠도킹6\n희귀-루피 기어서드\n특별-징베\n+확장팩인증\n+목재5개\n+클리어20회"
							+ "\n\n혼합\n마나155-던체단퍼(25%),추가물뎀(2%),보스퍼깍(1%,6회)\n방깍(50)\n방동이감(10% / 50%)\n패기!-2%(전체범퍼1%),발동이감(60%)\n모든스킬발동시 스턴(20% / 3초").setPositiveButton("확인", null).show();
				}
				if (position == 4) {
					Builder builder = new AlertDialog.Builder(Eternity.this);
					builder.setTitle("명령어:해적왕자").setMessage("전설-로우\n히든-킬러\n희귀-루피 기어서드\n특별-조로 초신성\n초월-쿠마\n+목재5개\n+클리어 25회"
							+ "\n\n물뎀\n마나100-20%,3초 하쿠바등장\n방깍(40)\n스턴(10% / 2.3초)").setPositiveButton("확인", null).show();
				}
				if (position == 5) {
					Builder builder = new AlertDialog.Builder(Eternity.this);
					builder.setTitle("명령어:파이러츠왕녀").setMessage("제한-크로커다일\n변이-비비\n히든-레베카\n희귀-벤 베크만\n특별-로빈 오하라\n특별-파이러츠도킹5\n+확장팩인증\n+목재5개\n+클리어 30회"
							+ "\n\n마뎀\n마나130-공속증가(MAX,3초),전체단퍼(5%)\n헤드샷!-5%(발동이감(80%),전체단퍼(30%)\n전체단퍼(25% / 14%)\n공속증가(절쿨10 / 4초 / 50%)\n블링크(2500범위)\n모든스킬강화 추가퍼뎀(MAX 10%)").setPositiveButton("확인", null).show();
				}


			}
		});
	}

}

