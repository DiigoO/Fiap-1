package br.com.fiap.entity;

import java.io.Serializable;
import java.util.List;

public class Clientes implements Serializable{
	
	private static final long serialVersionUID = -3516585719847373891L;
	
	private int id;
	private String nome;
	private String email;
	private List<Pedidos> pedidos;
	
	public Clientes(){
		
	}
	
	public Clientes(int id, String nome, String email, List<Pedidos> pedidos) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.pedidos = pedidos;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public List<Pedidos> getPedidos() {
		return pedidos;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}
	
	
}
