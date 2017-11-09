package com.example.administrador.myapplication.Dao;

import android.support.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.example.administrador.myapplication.Model.Cliente;

/**
 * Created by Administrador on 9/11/2017.
 */

public class ClienteDao {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference clienteRef = database.getReference("Cliente");

    public int ingresarCliente(Cliente cliente){

        clienteRef.child(String.valueOf(cliente.getIdCliente())).setValue(cliente).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){

                }else{

                    
                }
            }
        });

        return 1;
    }







}
