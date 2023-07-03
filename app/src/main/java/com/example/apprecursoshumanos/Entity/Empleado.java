package com.example.apprecursoshumanos.Entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "empleado_table")
public class Empleado {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "empleado_dni")
    @NonNull
    private String dni;

    @NonNull
    @ColumnInfo(name = "empleado_nombre")
    private String nombre;

    @NonNull
    @ColumnInfo(name = "departamento_id")
    private int departamento;

    @NonNull
    @ColumnInfo(name = "empleado_sexo")
    private String sexo;

    @NonNull
    @ColumnInfo(name = "empleado_salario")
    private double salario;

    public Empleado(@NonNull String dni, @NonNull String nombre, int departamento, @NonNull String sexo, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.departamento = departamento;
        this.sexo = sexo;
        this.salario = salario;
    }

    @NonNull
    public String getDni() {
        return dni;
    }

    public void setDni(@NonNull String dni) {
        this.dni = dni;
    }

    @NonNull
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@NonNull String nombre) {
        this.nombre = nombre;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    @NonNull
    public String getSexo() {
        return sexo;
    }

    public void setSexo(@NonNull String sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
