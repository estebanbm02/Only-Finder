package com.example.miapp;
import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainActivity extends AppCompatActivity {

        private String email;
        private String password;

        public EditText editTextPassword,editTextEmail;
        public Button buttonLogin, buttonRegister, buttonAtras;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            editTextEmail = (EditText) findViewById(R.id.editTextEmail);
            editTextPassword = (EditText) findViewById(R.id.editTextPassword);
            buttonLogin = (Button) findViewById(R.id.btnLogin);
            buttonRegister = (Button) findViewById(R.id.btnRegister);
            buttonAtras = (Button) findViewById(R.id.btnAtras);
            buttonLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String email = editTextEmail.getText().toString();
                    String password = editTextPassword.getText().toString();


                    if (compararDatos(email, password)) {

                        // aqui se puede entrar a la pagina de inicio
                        // Esteban tienes qui escribir a qui la instancia de clase de ventana de inicio
                    } else {
                        Toast.makeText(getApplicationContext(), "El Email o Contraseña no es correcto", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            // Configurar el evento clic para el botón de registro (Register)
            buttonRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Registrar reg = new Registrar();
                    // para el usuario hace rigestrar
                }
                });
        buttonAtras.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // a qui pones la instancia de la clase de David
                        // para volvemos atras
                    }


            });
        }
            public static boolean compararDatos(String miEmail, String miPassword){
                // Santi tienes que serializar el objeto usuario en un fichero despues de registrar el usuario pa guardamos datos
                // y yo a que deserializo el objet para comparar los datos si estan correcto o no
         File f = new File("ruta del fichero Santi yiene que ponerla");
         Usuario usuario = new Usuario();
                boolean boleano = false;
                ObjectInputStream ois = null;
                try {
                    ois = new ObjectInputStream(new ObjectInputStream(f));
                    usuario = (Usuario) ois.readObject();
                    if (miEmail.equals(usuario.getEmail()) && miPassword.equals(usuario.getPassword())) {
                        boleano = true;
                    } else {
                        boleano = false;
                    }
                }catch(IOException e){
                    e.getMessage();

                }finally {
                    ois.close();
                }

                return boleano;

            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }



        }
