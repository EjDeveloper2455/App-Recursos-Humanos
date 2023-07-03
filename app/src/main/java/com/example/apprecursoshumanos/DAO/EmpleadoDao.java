package com.example.apprecursoshumanos.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.apprecursoshumanos.Entity.Empleado;

import java.util.List;

public interface EmpleadoDao {
    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Empleado empleado);

    @Update
    void update(Empleado word);

    @Query("DELETE FROM empleado_table")
    void deleteAll();

    @Query("SELECT * FROM empleado_table ORDER BY empleado_nombre ASC")
    LiveData<List<Empleado>> getAlphabetizedWords();
}
