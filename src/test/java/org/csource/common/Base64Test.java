/**
 * 
 */
package org.csource.common;

import java.util.Date;

/**
 * @author sunff
 *
 */
public class Base64Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base64 b=new Base64();
		String s="CgAFklSJUvGAL96CAAAF1vgN0rw96";
		byte[] bb=b.decodeAuto(s);//[10, 0, 5, -110, 
		//84, -119, 82, -15, -128, 47, -34, -126,
		//0, 0, 5, -42, -8, 13, -46, -68, 
		//61]
		/*
		 * Storage_id（ip的数值型）

timestamp（创建时间）

file_size（若原始值为32位则前面加入一个随机值填充，最终为64位）

crc32（文件内容的检验码）
		 */
		byte[] bt= {84, -119, 82, -15, -128, 47, -34, -126};
		
		//System.out.println(new String(bt));
		//System.out.println(new String("84"));
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<bt.length;i++) {
			int bti=bt[i]>0?bt[i]:bt[i]+256;
			sb.append(bti);
		}
		System.out.println(new String(sb.toString() ));
		
		System.out.println(new Date(Long.valueOf(sb.toString()) ));
	}

}
