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
		setContentView(R.layout.mix_immortal);

		String[] list = {"����","���ϸ�","�����۰���","����","�����","������","�ݻ��ڽ�Ű","�巡��","��Ʈ"};
		
		ArrayAdapter<String> adapter;
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, list);
		
		ListView listview = (ListView) findViewById(R.id.immortal_list);
		listview.setAdapter(adapter);
		
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				if (position == 0) {
					Builder builder = new Builder(Immortal.this);
					builder.setTitle("��ɾ�:�����հ�D����").setMessage("����-���̽�\n����-����\n����-������\n+����10��"
							+ "\n\n����\n����125-�ߵ��̰�(2��,90%)\n���(85)\n��������100%)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 1) {
					Builder builder = new Builder(Immortal.this);
					builder.setTitle("��ɾ�:��սǹ���ϸ�").setMessage("����-����\n����-���� ����Ʈ�޾�\n����-�巡��\n+����10��"
							+ "\n\nȥ��\n����120-���(20),����(3��)\n��������(100%,�ڽ�X)\n���ۿ���(60%)\n����ȸ��(0.65%)\n���÷���(400)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 2) {
					Builder builder = new Builder(Immortal.this);
					builder.setTitle("��ɾ�:���ȣ�����۰���").setMessage("����-��ũ��\n����-����\n����-������\n+����10��"
							+ "\n\n����\n����50-��ü����(40%)\n���Ϲ��(60)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 3) {
					Builder builder = new Builder(Immortal.this);
					builder.setTitle("��ɾ�:�ر���������").setMessage("����-�ں�\n����-����\n����-����JET��Ʋ��\n+����5��"
							+ "\n\n����\n����150-�������(4)\n����(6% / 2.5��)\n�߰�����(5%)\n��������(5% / 3�� / 80%)\n���÷���(300)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 4) {
					Builder builder = new Builder(Immortal.this);
					builder.setTitle("��ɾ�:�����������").setMessage("����-�����\n����-������\n����-�ٸ���θ޿�\n+����10��"
							+ "\n\n����\n����110-����(3.5��)\n���(75)\n�浿�Ⱘ(12% / 3�� / 70%)\n���÷���(350)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 5) {
					Builder builder = new Builder(Immortal.this);
					builder.setTitle("��ɾ�:��ó�Լ�����").setMessage("����-������\n����-������\n����-��ġ\n+����10��"
							+ "\n\n����\n�������(3% / 2%)\n����(10% / 2��)\n���÷���(400)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 6) {
					Builder builder = new Builder(Immortal.this);
					builder.setTitle("��ɾ�:õ�űݻ��ڽ�Ű").setMessage("����-�ݻ��� ��Ű\n����-���\n����-ī������\n+����10��"
							+ "\n\n����\n����130-��ŷ15%\n����(11% / 3��)\n�Դ뽺�÷���").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 7) {
					Builder builder = new Builder(Immortal.this);
					builder.setTitle("��ɾ�:��ǳ�����ƿ��¹ٶ�").setMessage("����-�巡��\n����-�� ����\n����-����\n+����10��"
							+ "\n\n����\n����140-800���� 40(x0.5~2)����\n����(10% / 3��)\n�������10% /10%)\n���ӿ���(25%)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 8) {
					Builder builder = new Builder(Immortal.this);
					builder.setTitle("��ɾ�:�ų��������Ʈ").setMessage("����-��Ʈ\n����-����JET��Ʋ��\n����-����\n+����5��"
							+ "\n\n����\n�̼� 45%����\n2000���� �����̵�\n����170-400��+����ü��%�� ���� + 3�ʽ���\n5%-200������,��������80������\n10%-40������\n15%-������3�ʽ���").setPositiveButton("Ȯ��", null).show(); 
				}
				
 
			}
		});
	}

}
