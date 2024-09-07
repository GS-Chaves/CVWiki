package com.curriculo.cvwiki.cvwiki_backend.controller;

import com.curriculo.cvwiki.cvwiki_backend.dto.UsuarioDTO;
import com.curriculo.cvwiki.cvwiki_backend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDTO> listarUsuarios() {
        return usuarioService.ListarUsuarios();
    }

    public List<UsuarioDTO> buscarUsuariosPorNome(String nome) {
        return usuarioService.buscarPorNome(nome);
    }

    @PostMapping
    public void CadastrarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        usuarioService.CadastrarUsuario(usuarioDTO);
    }

    @PutMapping
    public UsuarioDTO AtualizarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.AtualizarUsuario(usuarioDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> ExcluirUsuario(@PathVariable("id") Long id) {
        usuarioService.ExcluirUsuario(id);
        return ResponseEntity.ok().build();
    }
}
