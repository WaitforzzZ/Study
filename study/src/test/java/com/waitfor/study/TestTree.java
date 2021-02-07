package com.wisoft.ghzs.controller;

import java.util.ArrayList;
import java.util.List;

public class TestTree {
	
	
	public static void main(String[] args) {
		TempDto d = new TempDto("1", "节点1","root", true);
		TempDto d1 = new TempDto("1.1", "节点1.1","1", false);
		TempDto d2 = new TempDto("1.2", "节点1.2","1", true);
		TempDto d3 = new TempDto("1.2.1", "节点1.2.1","1.2", false);
		TempDto d4 = new TempDto("1.2.2", "节点1.2.2","1.2", true);
		TempDto d5 = new TempDto("1.2.2.1", "节点1.2.2.1","1.2.2", false);
		TempDto d6 = new TempDto("2", "节点2","root", true);
		TempDto d7 = new TempDto("2.1", "节点2.1","2", false);
		TempDto d8 = new TempDto("2.2", "节点2.2","2", true);
		TempDto d9 = new TempDto("2.2.1", "节点2.2.1","2.2", false);
		List<TempDto> list = new ArrayList<TempDto>();
		list.add(d);list.add(d1);list.add(d2);list.add(d3);list.add(d4);
		list.add(d5);list.add(d6);list.add(d7);list.add(d8);list.add(d9);
		
		List<TempDto> reslist = new ArrayList<TempDto>();
		for(int i=0;i<list.size();i++){
			TempDto t = list.get(i);
			if("root".equals(t.getParentid())){
				reslist.add(t);
				if(t.isIsparent()){
					t.setChildren(getChildren(t.getId(), i+1, list));
				}
			}
		}
		System.out.println(reslist.size());
	}
	
	public static List<TempDto> getChildren(String parentid,int i,List<TempDto> list){
		List<TempDto> clildren = new ArrayList<TempDto>();
		for(int j=i;j<list.size();j++){
			TempDto jdto = list.get(j);
			if(jdto.getParentid().equals(parentid)){
				clildren.add(jdto);
				if(jdto.isIsparent()){
					jdto.setChildren(getChildren(jdto.getId(), j+1, list));
				}
			}else{
				break;
			}
		}
		return clildren;
	}
}
class TempDto{
	private String id;
	private String name; //名称
	private String parentid;
	private boolean isparent;
	private List<TempDto> children;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIsparent() {
		return isparent;
	}
	public void setIsparent(boolean isparent) {
		this.isparent = isparent;
	}
	
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	public List<TempDto> getChildren() {
		return children;
	}
	public void setChildren(List<TempDto> children) {
		this.children = children;
	}
	public TempDto(String id, String name,String parentid, boolean isparent) {
		super();
		this.id = id;
		this.name = name;
		this.parentid = parentid;
		this.isparent = isparent;
	}
	
}