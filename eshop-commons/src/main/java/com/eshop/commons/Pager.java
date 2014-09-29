package com.eshop.commons;

import java.util.List;

public class Pager<T> {
	private int total;
	/*
	private int pegeSize;
	private int showPages;
	private String currentPageStyle;*/
	private List<T> pageList;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	/*public int getPegeSize() {
		return pegeSize;
	}
	public void setPegeSize(int pegeSize) {
		this.pegeSize = pegeSize;
	}
	public int getShowPages() {
		return showPages;
	}
	public void setShowPages(int showPages) {
		this.showPages = showPages;
	}
	public String getCurrentPageStyle() {
		return currentPageStyle;
	}
	public void setCurrentPageStyle(String currentPageStyle) {
		this.currentPageStyle = currentPageStyle;
	}*/
	public List<T> getPageList() {
		return pageList;
	}
	public void setPageList(List<T> pageList) {
		this.pageList = pageList;
	}
}
