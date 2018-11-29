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
		setContentView(R.layout.mix_transcendence);
		
		String[] list = { "����","����","����","���","���","����","�κ�","����Ű","���","�ö�ȣ��","��ī�̴�","�ƿ�Ű��"
				,"Ű�ڷ�","��������","��ũ��","�ο�","���ö�ְ�","�纸"};
		
		ArrayAdapter<String> adapter;
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, list);
		
		ListView listview = (ListView) findViewById(R.id.transcendence_list);
		listview.setAdapter(adapter);
		
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				if (position == 0) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�������̵ɻ糪��").setMessage("����-����JET��Ʋ��\n����-���ǳ���Ʈ�޾�/���-���� ����\n�ʿ�-��"
							+ "\n\n����\n����180-���(10),��ü����2%\n����(1% / 0.75��)\n�̰�(9% / 2�� / 50%)\n���÷���(260)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 1) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�ְ��ǰ˻�").setMessage("����-����\n����-��ȣũ\n���-ī��\n������-��γ�\n�ʿ�-��"
							+ "\n\n����\n����160-����(3��)\n�ߵ����(3% / 5��  / 30)-��������35\n�̰�����(60%)-��������70%").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 2) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�����¸���").setMessage("����-����\n����-�ݻ��ڽ�Ű\nƯ��-���� ũ������Ʈ\nƯ��-�Ʒ�\n�ʿ�-��"
							+ "\n\n����\n���ӿ���(25%)\n�ߵ��̰�(5% / 5�� / 80%)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 3) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�ٴ�������").setMessage("����-ī������\n����-����\n���-�� ��ũ��\n������-��γ�\n�ʿ�-��"
							+ "\n\n����\n����140-�������(2%),����(3��)\n���纸�� (2%)\n�ߵ����(10% / 2.5�� / 20)\n���÷���(300)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 4) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�����������ƿ���").setMessage("����-���\n����-����\nƯ��-���� ũ������Ʈ\n�ʿ�-��"
							+ "\n\n����\n����135-20%�� 400���� 400��(x1~1.5)������,80%�� 400���� 245��������\n�浿�̰�(5% / 3�� / 60%)\n��ũ(1000����)\n�����̵�").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 5) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�����ǻ�!").setMessage("����-���� ����\n����-Dr.�����ũ\n�ʿ�-��"
							+ "\n\n����\n���(65)\n���ӿ���(45%)\n��������(70%)\n��������(80%,�ڽ�X)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 6) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�Ǹ����ڽ�").setMessage("����-�ٸ���θ޿�\n����-�κ� ��ġ\nƯ��-�κ� ���϶�\nƯ��-ũ��Ŀ����\n�ʿ�-��"
							+ "\n\n����\n����130-�������1%,�ߵ��̰�(3�� / 60%)\n���(55)\n����(10%  / 2.6��)\n��Ƽ��(6)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 7) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�����Ǿ��̾����̷���").setMessage("����-�� ����\n����-ī��\n���-��ġ �����ĵ�\n������-����Ű\n�ʿ�-��"
							+ "\n\n����\n����100-��������200��������\n���ȣ����(����10,2ȸ,��600)\n����ȸ��(�ʴ�5,�ڽ�X)\n��ŷ(5%)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 8 ) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�ҿ� ŷ").setMessage("����-���\n����-����\n���-��γ� �װ�Ƽ��\nƯ��-�𸮾�\n�ʿ�-��"
							+ "\n\n����\n����140-����(2��),��ŷ(10%)\n�������(8% / 30%)\n���纸��(8% / 1%)\n���ӿ���(25%)\n�����̵�").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 9) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�ؿշ����ٽ������ξ����").setMessage("����-¡��\n����-�� �� ����\n���-���\n�ʿ�-��"
							+ "\n\nȥ��\n����160-����(3��)\n����(15% / 2.1��)\n�ؿշ�-���÷���(275)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 10) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�ر�����������").setMessage("����-������\n����-��ī�̴�\nƯ��-���̽�\n�ʿ�-��"
							+ "\n\n����\n����(10%,2.5��)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 11) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:���ر�����Ǫ����").setMessage("����-����\n����-�ƿ�Ű��\nƯ��-�κ�\n������-����Ŀ\n�ʿ�-��"
							+ "\n\n����\n����(10%,2�� / 12�ʸ��� 2.5��)\n�̰�����(70%)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 12) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�ر�������������").setMessage("����-�������\n����-Ű�ڷ�\nƯ��-X-�巹��ũ\nƯ��-���� �ʽż�\nƯ��-�Ʒ�\n�ʿ�-��"
							+ "\n\n����\n����185-450���� 800��������\n����(7% / 2.5��)\n��ũ(2500����)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 13) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:ġ���ϰ���Ѿ��").setMessage("����-��������\n����-�����\nƯ��-���� ȣŲ��\n�ʿ�-��"
							+ "\n\n����\n����145-�������(3%)\n�浿�̰�(11% / 3�� / 80%)\n�ڼ�(20% / ���ϵ�ŷ(20%)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 14) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:��������������").setMessage("����-��ũ��\n����-��ȣ ��ȣũ\n���-ĸƾŰ��\nƯ��-���� ������\n�ʿ�-��"
							+ "\n\n����\n����160-��������200�� ����\n����(10% / 1.5��)\n����(12%  / 2��)\n���ӿ���(20%)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 15) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�鰳�ǽ�������ģ��").setMessage("����-�ο�\n����-���� ũ���\n������-����\n������-����\n�ʿ�-��"
							+ "\n\n�湫��(45%)\n����134-�������(3% / 1%),��������(7��,70%),�̰�����(5��,45%)\n�������(3.5% / 25%)\n���纸��(3.5% / 1%)\n�ߵ��̰�(7% / 2.2�� / 40%)\n�ߵ��̰�(3.5% / 4�� / 50%)").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 16) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:�����Ŀ").setMessage("����-���ö�ְ�\n����-�������\n���-����\n���-�ο�\n�ʿ�-��"
							+ "\n\n����\n����170-���(4�� / 65)\n�������(3% / 1%)\n����(7.5% / 2.3��)\n�ߵ��̰�(12% / 3�� / 70%)\n���÷���(220)\n�����̵�").setPositiveButton("Ȯ��", null).show(); 
				}
				if (position == 17) {
					Builder builder = new Builder(Transcendence.this);
					builder.setTitle("��ɾ�:������������").setMessage("����-������\n����-�纸\n���-������\nƯ��-���̽�\n����-������\n�ʿ�-��"
							+ "\n\n����\n����110-�������(2%),����(3��)\n���(30%)\n�̰�����(50%)\n�ߵ��̰�(10% / 60%)\n���÷���(350,50%)").setPositiveButton("Ȯ��", null).show(); 
				}
 
			}
		});
	}
	
}
