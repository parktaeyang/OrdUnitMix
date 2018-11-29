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

public class Limit extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mix_list);

		String[] list = {"에넬","크로커다일","후지토라","레드필드","레베카"};
		
		ArrayAdapter<String> adapter;
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, list);
		
		ListView listview = (ListView) findViewById(R.id.mix_list);
		listview.setAdapter(adapter);

		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				if (position == 0) {
					Builder builder = new AlertDialog.Builder(Limit.this);
					builder.setTitle("히든-방주맥심조합").setMessage("전설-시저 크라운\n히든-방주 맥심\n히든-해적석\n특별-나미 크리마텍트\n+목재5개"
							+ "\n\n마뎀\n마나140-현재범퍼(1%),도킹(12%),스턴(3초)\n블랭크(3000범위)").setPositiveButton("확인", null).show();
				}
				if (position == 1) {
					Builder builder = new AlertDialog.Builder(Limit.this);
					builder.setTitle("희귀-크로커다일 Mr.0 조합").setMessage("변이-비비\n히든-아카이누\n희귀-크로커다일 Mr.0\n+목재5개"
							+ "\n\n물뎀\n스턴(4% / 2.5초)\n방깍(35)\n이감오라(40%)").setPositiveButton("확인", null).show();
				}
				if (position == 2) {
					Builder builder = new AlertDialog.Builder(Limit.this);
					builder.setTitle("전설-후지토라 조합").setMessage("삭제된 유닛"
							+ "").setPositiveButton("확인", null).show();
				}
				if (position == 3) {
					Builder builder = new AlertDialog.Builder(Limit.this);
					builder.setTitle("전설-Dr.히루루크비석 조합").setMessage("전설-Dr.히루루크 비석\n전설-바르토로메오\n히든-파이러츠도킹6\n희귀-브룩음악가"
							+ "\n+확장팩 인증\n+목재5개\n\'41라운드\'이전에만 조합가능"
							+ "\n\n마뎀\n전체범퍼(4% / 0.8%)\n전체단퍼(2%)\n탐색(쿨150)").setPositiveButton("확인", null).show();
				}
				if (position == 4) {
					Builder builder = new AlertDialog.Builder(Limit.this);
					builder.setTitle("히든-레베카 조합").setMessage("히든-레베카\n희귀-슈가\n변이-도플라밍고\n+확장팩 인증\n+목재5개"
							+ "\n\n방깍(35)\n자신공속 50%증가\n300범위 스플래시\n12%-100만+검투사레벨*50000데미지,이속40%감소\n단일적 16%로 3초스턴").setPositiveButton("확인", null).show();
				}



			}
		});
	}

}

