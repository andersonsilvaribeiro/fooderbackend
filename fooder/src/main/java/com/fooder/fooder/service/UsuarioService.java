package com.fooder.fooder.service;

import com.fooder.fooder.model.Usuario;
import com.fooder.fooder.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario){return usuarioRepository.save(usuario);}
    public List<Usuario> buscarTodosOsUsuarios(){return usuarioRepository.findAll();}
    public Optional<Usuario> buscarUsuarioPorId(Integer id){return usuarioRepository.findById(id);}
    public Usuario atualizarUsuario(Usuario usuario){return usuarioRepository.save(usuario);}
    public void excluirUsuario(Integer id){usuarioRepository.deleteById(id);}

}
