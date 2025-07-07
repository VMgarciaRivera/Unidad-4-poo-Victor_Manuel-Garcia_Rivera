package Taller10.Ejercicios.Ejercicio1;

class Persona{
    public void presentarse(){
        System.out.println("Persona se presenta");
    }
}

class Estudiante extends Persona{
    @Override
    public void presentarse(){
        System.out.println("Estudiante se presenta");
    }
}

class Profesor extends Persona{
    @Override
    public void presentarse(){
        System.out.println("Profesor se presenta");
    }
}