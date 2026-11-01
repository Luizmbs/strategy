package org.example;

public class DivisaoStrategy implements PriorityStrategy {

    public float calcular(float diasEspera, float reservasAtivas) {
        return diasEspera / reservasAtivas;
    }
}
