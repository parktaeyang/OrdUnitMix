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
		setContentView(R.layout.mix_limit);

String[] list = {"����","ũ��Ŀ����","�������","�����ʵ�","����ī"};
		
		ArrayAdapter<String> adapter;
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, list);
		
		ListView listview = (ListView) findViewById(R.id.limit_list);
		listview.setAdapter(adapter);
		
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				if (position == 0) {
					Builder builder = new Builder(Limit.this);
					builder.setTitle("����-���ָƽ�����").setMessage("����-���� ũ���\n����-���� �ƽ�\n����-������\nƯ��-���� ũ������Ʈ\n+����5��"
							+ "\n\n����\n����140-�������(1%),��ŷ(12%),����(3��)\n��ũ(3000����)").setPositiveButton("Ȯ��", null).show();
				}
				if (position == 1) {
					Builder builder = new Builder(Limit.this);
					builder.setTitle("���-ũ��Ŀ���� Mr.0 ����").setMessage("����-���\n����-��ī�̴�\n���-ũ��Ŀ���� Mr.0\n+����5��"
							+ "\n\n����\n����(4% / 2.5��)\n���(35)\n�̰�����(40%)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 2) {
					Builder builder = new Builder(Limit.this);
					builder.setTitle("����-������� ����").setMessage("������ ����"
							+ "").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 3) {
					Builder builder = new Builder(Limit.this);
					builder.setTitle("����-Dr.�����ũ�� ����").setMessage("����-Dr.�����ũ ��\n����-�ٸ���θ޿�\n����-���̷�����ŷ6\n���-������ǰ�"
							+ "\n+Ȯ���� ����\n+����5��\n\'41����\'�������� ���հ���"
							+ "\n\n����\n��ü����(4% / 0.8%)\n��ü����(2%)\nŽ��(��150)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 4) {
					Builder builder = new Builder(Limit.this);
					builder.setTitle("����-����ī ����").setMessage("����-����ī\n���-����\n����-���ö�ְ�\n+Ȯ���� ����\n+����5��"
							+ "\n\n���(35)\n�ڽŰ��� 50%����\n300���� ���÷���\n12%-100��+�����緹��*50000������,�̼�40%����\n������ 16%�� 3�ʽ���").setPositiveButton("Ȯ��", null).show(); 
				}
				
					
 
			}
		});
	}

}

