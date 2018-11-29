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

public class Transcendence  extends Activity{

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mix_list);

		String[] list = { "루피","조로","나미","우솝","상디","쵸파","로빈","프랑키","브룩","시라호시","아카이누","아오키지"
				,"키자루","검은수염","샹크스","로우","도플라밍고","사보"};
		
		ArrayAdapter<String> adapter;
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, list);
		
		ListView listview = (ListView) findViewById(R.id.mix_list);
		listview.setAdapter(adapter);

		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				if (position == 0) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:해적왕이될사나이").setMessage("전설-루피JET개틀링\n전설-루피나이트메어/희귀-에넬 뇌신\n초월-쿠마"
							+ "\n\n물뎀\n마나180-방깍(10),전체단퍼2%\n스턴(1% / 0.75초)\n이감(9% / 2초 / 50%)\n스플래시(260)").setPositiveButton("확인", null).show();
				}
				if (position == 1) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:최강의검사").setMessage("전설-조로\n히든-미호크\n희귀-카쿠\n안흔함-페로나\n초월-쿠마"
							+ "\n\n물뎀\n마나160-스턴(3초)\n발동방깍(3% / 5초  / 30)-류마업글35\n이감오라(60%)-류마업글70%").setPositiveButton("확인", null).show();
				}
				if (position == 2) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:날씨는맑음").setMessage("전설-나미\n전설-금사자시키\n특별-나미 크리마텍트\n특별-아론\n초월-쿠마"
							+ "\n\n마뎀\n공속오라(25%)\n발동이감(5% / 5초 / 80%)").setPositiveButton("확인", null).show();
				}
				if (position == 3) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:바다의전사").setMessage("전설-카르가라\n전설-슈가\n희귀-벤 베크만\n안흔함-페로나\n초월-쿠마"
							+ "\n\n물뎀\n마나140-현재범퍼(2%),스턴(3초)\n현재보스 (2%)\n발동방깍(10% / 2.5초 / 20)\n스플래시(300)").setPositiveButton("확인", null).show();
				}
				if (position == 4) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:지옥에서돌아온자").setMessage("전설-상디\n전설-제프\n특별-나미 크리마텍트\n초월-쿠마"
							+ "\n\n마뎀\n마나135-20%로 400범위 400만(x1~1.5)데미지,80%로 400범위 245만데미지\n방동이감(5% / 3초 / 60%)\n블랭크(1000범위)\n공중이동").setPositiveButton("확인", null).show();
				}
				if (position == 5) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:순록의사!").setMessage("전설-쵸파 포주\n전설-Dr.히루루크\n초월-쿠마"
							+ "\n\n물뎀\n방깍(65)\n공속오라(45%)\n공증오라(70%)\n공증오라(80%,자신X)").setPositiveButton("확인", null).show();
				}
				if (position == 6) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:악마의자식").setMessage("전설-바르토로메오\n전설-로브 루치\n특별-로빈 오하라\n특별-크로커다일\n초월-쿠마"
							+ "\n\n물뎀\n마나130-현재범퍼1%,발동이감(3초 / 60%)\n방깍(55)\n스턴(10%  / 2.6초)\n멀티샷(6)").setPositiveButton("확인", null).show();
				}
				if (position == 7) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:무적의아이언파이러츠").setMessage("전설-쿠마 폭군\n히든-카쿠\n희귀-루치 레오파드\n안흔함-프랑키\n초월-쿠마"
							+ "\n\n마뎀\n마나100-직선범위200만데미지\n써니호조선(목재10,2회,쿨600)\n마나회복(초당5,자신X)\n도킹(5%)").setPositiveButton("확인", null).show();
				}
				if (position == 8 ) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:소울 킹").setMessage("전설-라분\n히든-류마\n희귀-페로나 네거티브\n특별-모리아\n초월-쿠마"
							+ "\n\n마뎀\n마나140-스턴(2초),도킹(10%)\n현재단퍼(8% / 30%)\n현재보스(8% / 1%)\n공속오라(25%)\n공중이동").setPositiveButton("확인", null).show();
				}
				if (position == 9) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:해왕류를다스리는인어공주").setMessage("전설-징베\n히든-반 더 데켄\n희귀-비비\n초월-쿠마"
							+ "\n\n혼합\n마나160-스턴(3초)\n스턴(15% / 2.1초)\n해왕류-스플래시(275)").setPositiveButton("확인", null).show();
				}
				if (position == 10) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:해군원수붉은개").setMessage("전설-센고쿠\n히든-아카이누\n특별-에이스\n초월-쿠마"
							+ "\n\n마뎀\n스턴(10%,2.5초)").setPositiveButton("확인", null).show();
				}
				if (position == 11) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:전해군대장푸른꿩").setMessage("전설-제파\n히든-아오키지\n특별-로빈\n안흔함-스모커\n초월-쿠마"
							+ "\n\n마뎀\n스턴(10%,2초 / 12초마다 2.5초)\n이감오라(70%)").setPositiveButton("확인", null).show();
				}
				if (position == 12) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:해군대장노란원숭이").setMessage("전설-후지토라\n히든-키자루\n특별-X-드레이크\n특별-조로 초신성\n특별-아론\n초월-쿠마"
							+ "\n\n마뎀\n마나185-450범위 800만데미지\n스턴(7% / 2.5초)\n블링크(2500번위)").setPositiveButton("확인", null).show();
				}
				if (position == 13) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:치밀하고비열한어둠").setMessage("전설-검은수염\n전설-흰수염\n특별-바질 호킨스\n초월-쿠마"
							+ "\n\n마뎀\n마나145-현재범퍼(3%)\n방동이감(11% / 3초 / 80%)\n자석(20% / 단일도킹(20%)").setPositiveButton("확인", null).show();
				}
				if (position == 14) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:정상해전종결자").setMessage("전설-샹크스\n히든-검호 미호크\n희귀-캡틴키드\n특별-루피 기어세컨드\n초월-쿠마"
							+ "\n\n마뎀\n마나160-직선범위200만 마뎀\n스턴(10% / 1.5초)\n스턴(12%  / 2초)\n공속오라(20%)").setPositiveButton("확인", null).show();
				}
				if (position == 15) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:백개의심장을바친자").setMessage("전설-로우\n전설-시저 크라운\n안흔함-베포\n안흔함-베포\n초월-쿠마"
							+ "\n\n방무뎀(45%)\n마나134-현재범퍼(3% / 1%),공증오라(7초,70%),이감오라(5초,45%)\n현재범퍼(3.5% / 25%)\n현재보스(3.5% / 1%)\n발동이감(7% / 2.2초 / 40%)\n발동이감(3.5% / 4초 / 50%)").setPositiveButton("확인", null).show();
				}
				if (position == 16) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:어돔의조커").setMessage("변이-도플라밍고\n전설-후지토라\n희귀-슈가\n희귀-로우\n초월-쿠마"
							+ "\n\n물뎀\n마나170-방깍(4초 / 65)\n현재범퍼(3% / 1%)\n스턴(7.5% / 2.3초)\n발동이감(12% / 3초 / 70%)\n스플래시(220)\n공중이동").setPositiveButton("확인", null).show();
				}
				if (position == 17) {
					Builder builder = new AlertDialog.Builder(Transcendence.this);
					builder.setTitle("명령어:혁명군참모총장").setMessage("전설-마르코\n히든-사보\n희귀-바제스\n특별-에이스\n히든-해적선\n초월-쿠마"
							+ "\n\n물뎀\n마나110-현재범퍼(2%),스턴(3초)\n방깍(30%)\n이감오라(50%)\n발동이감(10% / 60%)\n스플래시(350,50%)").setPositiveButton("확인", null).show();
				}

			}
		});
	}
	
}
