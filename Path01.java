package cn.io.study01;

import java.io.File;

/**
 * / \���Ʒָ�� separator
 * @author dell
 *
 */

public class Path01 {
	public static void main(String[] args) {
		String path="E:\\workspace-java\\IO������\\����.PNG";// ʹ��\���ָ������Ҫ����\ת��ָ�����
		
		System.err.println(File.separator);
		
		path="E:"+File.separator+"workspace-java"+File.separator+"IO������"+File.separator+"����.PNG";
		System.out.println(path);
		path="E:/workspace-java/IO������/����.PNG";//�Լ�д����ʹ��/��Ϊ�ָ��
		System.out.println(path);
	}

}
