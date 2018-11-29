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
		setContentView(R.layout.mix_eternity);

String[] list = {"����Ŀ","���̽�","����","����","ī������","���"};
		
		ArrayAdapter<String> adapter;
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, list);
		
		ListView listview = (ListView) findViewById(R.id.eternity_list);
		listview.setAdapter(adapter);
		
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				if (position == 0) {
					Builder builder = new Builder(Eternity.this);
					builder.setTitle("��ɾ�:�Ͼ��ɲ�").setMessage("����-������\n����-ī��\n���-����Ŀ ����\n���-��ġ �����ĵ�\n����� ��ū 2��\n+����5��"
							+ "\n\n����\n����110-����(3��)\nŬ����Ƚ����ʵ�����\n���(35)\n��������(70%)\n�̰�����(65%)\n���÷���(270)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 1) {
					Builder builder = new Builder(Eternity.this);
					builder.setTitle("��ɾ�:ȭ���ǿ��̽�").setMessage("����-���̽�\n����-������\nƯ��-¡��\nƯ��-����-\nƯ��-���⸶��ź\n+����5��\n+Ŭ���� 5ȸ"
							+ "\n\n����\n����200-��ü����(MAX / 3%)\n�̰�����(55%)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 2) {
					Builder builder = new Builder(Eternity.this);
					builder.setTitle("��ɾ�:õ�ɱ���").setMessage("����-����\n���-�̿��ں�\n����-������\nƯ��-����\nƯ��-���⸶��ź\n+����5��\n+Ŭ���� 10ȸ"
							+ "\n\n����\n���(33)\n���ӿ���50%)\n��������(100)\n�㼼!-��������(5% / 3.5�� / 40%),��������(n*% / �ִ�80%)\n��ȯ���� ���÷���").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 3) {
					Builder builder = new Builder(Eternity.this);
					builder.setTitle("��ɾ�:�Ƹ��������ǿ���").setMessage("����-����\n����-�Ǽ�Ÿ�̰�\n����-���̷�����ŷ6\n���-���� ����\nƯ��-¡��\n+Ȯ��������\n+����5��\n+Ŭ����20ȸ"
							+ "\n\nȥ��\n����155-��ü����(25%),�߰�����(2%),�����۱�(1%,6ȸ)\n���(50)\n�浿�̰�(10% / 50%)\n�б�!-2%(��ü����1%),�ߵ��̰�(60%)\n��罺ų�ߵ��� ����(20% / 3��").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 4) {
					Builder builder = new Builder(Eternity.this);
					builder.setTitle("��ɾ�:��������").setMessage("����-�ο�\n����-ų��\n���-���� ����\nƯ��-���� �ʽż�\n�ʿ�-��\n+����5��\n+Ŭ���� 25ȸ"
							+ "\n\n����\n����100-20%,3�� ����ٵ���\n���(40)\n����(10% / 2.3��)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 5) {
					Builder builder = new Builder(Eternity.this);
					builder.setTitle("��ɾ�:���̷����ճ�").setMessage("����-ũ��Ŀ����\n����-���\n����-����ī\n���-�� ��ũ��\nƯ��-�κ� ���϶�\nƯ��-���̷�����ŷ5\n+Ȯ��������\n+����5��\n+Ŭ���� 30ȸ"
							+ "\n\n����\n����130-��������(MAX,3��),��ü����(5%)\n��弦!-5%(�ߵ��̰�(80%),��ü����(30%)\n��ü����(25% / 14%)\n��������(����10 / 4�� / 50%)\n��ũ(2500����)\n��罺ų��ȭ �߰��۵�(MAX 10%)").setPositiveButton("Ȯ��", null).show(); 
				}
							
 
			}
		});
	}

}

