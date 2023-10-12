package com.tancy.convidados;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
interface ConvidadoDao {

    @Insert
    void inserir(Convidado convidado);

    @Delete
    void remover(Convidado convidado);

    @Update
    void atualizar(Convidado convidado);

    // Procura um convidado pelo ID
    @Query("SELECT * FROM convidados WHERE id = :id")
    Convidado procurarPorId(int id);

    // Procura todos os convidados
    @Query("SELECT * FROM convidados")
    Convidado[] procurarTodos();

    // Consulta o total de convidados cadastrados
    @Query("SELECT COUNT(*) FROM convidados")
    int contar();

}
