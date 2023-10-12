package com.tancy.convidados

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "convidados")
// nome, email e telefone
class Convidado(
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    @ColumnInfo(name = "nome")
    var nome: String,

    @ColumnInfo(name = "email")
    var email: String,

    @ColumnInfo
    var telefone: String) {
    override fun toString(): String {
        return "Convidado( id=$id), nome='$nome', email='$email', telefone='$telefone'"
    }
}