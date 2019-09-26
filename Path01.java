package cn.io.study01;

import java.io.File;

/**
 * / \名称分割符 separator
 * @author dell
 *
 */

public class Path01 {
	public static void main(String[] args) {
		String path="E:\\workspace-java\\IO流技术\\捕获.PNG";// 使用\做分割符，需要加上\转义分隔符。
		
		System.err.println(File.separator);
		
		path="E:"+File.separator+"workspace-java"+File.separator+"IO流技术"+File.separator+"捕获.PNG";
		System.out.println(path);
		path="E:/workspace-java/IO流技术/捕获.PNG";//自己写建议使用/作为分割符
		System.out.println(path);
	}

}
