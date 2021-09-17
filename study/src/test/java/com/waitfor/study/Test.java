package com.waitfor.study;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.Rserve.RConnection;

public class Test {

	public static void main(String[] args) {
//	       RConnection rc = null;
//	       try {
//	           rc = new RConnection();//建立与Rserve的连接
//	           REXP x = rc.eval("R.version.string");//执行R语句
//	           System.out.println(x.asString());
//	       } catch (Exception e) {
//	            e.printStackTrace();
//	       } finally{
//	          rc.close();//关闭与Rserve的连接
//	       }


		RConnection rc = null;
		try {
			rc = new RConnection();//建立与Rserve的连接
			// statinform.R的路径
			/*String fileName = "F:\\WorkFiles\\wisoft\\R\\statinform.r";*/
			/*String fileName = "F:\\WorkFiles\\wisoft\\R\\XXHG.R";*/
			/*String fileName = "F:\\WorkFiles\\wisoft\\R\\aov1.R";*/
			String fileName = "F:\\WorkFiles\\wisoft\\R\\ESV.r";
			rc.assign("fileName", fileName);
			//执行statinform.R脚本，执行这一步才能调用里面的自定义函数myFunc，如果不行，就在R工具上也执行一下statinform.R脚本
			rc.eval("source(fileName)");
//			String num = "3";
//			//调用myFunc函数
//			REXP rexp=rc.eval("myFunc("+num+")");

			//声明变量，相当于在R命令行中输入data<-datas命令
			/*String[] datas={"Mn","Co","Ni","Cu","Zn","As","Cd","Pb"};
			rc.assign("data",datas);*/
			/*String[] datas={"Sepal.Length", "Sepal.Width", "Petal.Width"};
			rc.assign("data",datas);*/

			//调用函数 路径名称不能带中文
			/*REXP rexp=rc.eval("statinform('F://WorkFiles//wisoft//R//youxiaotai.xlsx',select=data,means=T,std=T,ste=T,cv=T,mins=T,qua=T)");*/
			/*REXP rexp=rc.eval("XXHG(filename='F://WorkFiles//wisoft//R//d4.7.3.xlsx',formula='y~x1+x2+x3+x4')");*/
			/*REXP rexp=rc.eval("aov1(filename='F://WorkFiles//wisoft//R//npk.xlsx',formula=yield~N,x='N')");*/
			/*REXP rexp=rc.eval("relativeany(filename='F://WorkFiles//wisoft//R//iris.xlsx',mtd='pearson',select=data)");*/
			REXP rexp=rc.eval("ESV(43960,80,5,10)");
			/*REXP rexp=rc.eval("ESV(filename='F://aaa.csv',AT=43960,FP=80,HP=4,GP=5,WP=10,CP=1)");*/
			//返回类型是一个整数类型，所以用asInteger
//			System.out.println(rexp.asString());
			rc.close();//用完记得关闭连接


		} catch (Exception e) {
			e.printStackTrace();
			rc.close();//关闭与Rserve的连接
		}



	}








}
