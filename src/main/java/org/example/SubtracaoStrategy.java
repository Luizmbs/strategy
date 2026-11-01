package org.example;

public class SubtracaoStrategy implements PriorityStrategy {

    public float calcular(float diasEspera, float reservasAtivas) {
        return diasEspera - reservasAtivas;
    }
}
