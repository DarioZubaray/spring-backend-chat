package com.github.dariozubaray.springboot.backend.chat.models.service;

import java.util.List;

import com.github.dariozubaray.springboot.backend.chat.models.documents.Mensaje;

public interface ChatService {

	public List<Mensaje> obtenerUltimos10mensaje();
	
	public Mensaje guardar(Mensaje mensaje);
}
