package com.curriculo.cvwiki.cvwiki_backend.service;

import com.curriculo.cvwiki.cvwiki_backend.dto.UsuarioDTO;
import com.curriculo.cvwiki.cvwiki_backend.entity.UsuarioEntity;
import com.curriculo.cvwiki.cvwiki_backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioDTO> ListarUsuarios(){
        List<UsuarioEntity> usuarios = usuarioRepository.findAll();
        return usuarios.stream().map(UsuarioDTO::new).toList();
    }

    public void CadastrarUsuario(UsuarioDTO usuarioDTO){
        UsuarioEntity usuario = new UsuarioEntity(usuarioDTO);
        usuarioRepository.save(usuario);
    }

    public UsuarioDTO AtualizarUsuario(UsuarioDTO usuarioDTO){
        UsuarioEntity usuario = new UsuarioEntity(usuarioDTO);
        return new UsuarioDTO(usuarioRepository.save(usuario));
    }

    public void ExcluirUsuario(Long id){
        UsuarioEntity usuario = usuarioRepository.findById(id).get();
        usuarioRepository.delete(usuario);
    }

    public UsuarioDTO FindUsuarioPorId(Long id){
        UsuarioEntity usuario = usuarioRepository.findById(id).get();
        return new UsuarioDTO(usuario);
    }
}
