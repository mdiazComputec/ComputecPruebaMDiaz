package com.Computec.Prueba.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.Computec.Prueba.commons.GenericServiceImpl;
import com.Computec.Prueba.dao.api.ClienteRepository;
import com.Computec.Prueba.model.Cliente;
import com.Computec.Prueba.service.api.ClienteServiceAPI;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Long> implements ClienteServiceAPI{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public CrudRepository<Cliente, Long> getDao() {
		// TODO Auto-generated method stub
		return clienteRepository;
	}

}
