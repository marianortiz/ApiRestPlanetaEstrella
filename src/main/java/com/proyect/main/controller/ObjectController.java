package com.proyect.main.controller;

import java.util.List;

import javax.xml.ws.Response;

import org.springframework.http.ResponseEntity;

public interface ObjectController <T>{
	public List<T> getAll();
	public T getOner(int id);
	public ResponseEntity save(T t);
	public ResponseEntity update(T t);
	public ResponseEntity delete(int id);
	
	
}
