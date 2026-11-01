package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void deveCalcularPrioridadePorSoma() {
        Reserva reserva = new Reserva();
        reserva.calcularPrioridadePorSoma(5, 2);
        assertEquals(7, reserva.getPrioridade());
    }

    @Test
    void deveCalcularPrioridadePorSubtracao() {
        Reserva reserva = new Reserva();
        reserva.calcularPrioridadePorSubtracao(5, 2);
        assertEquals(3, reserva.getPrioridade());
    }

    @Test
    void deveCalcularPrioridadePorDivisao() {
        Reserva reserva = new Reserva();
        reserva.calcularPrioridadePorDivisao(6, 2);
        assertEquals(3, reserva.getPrioridade());
    }

    @Test
    void deveCalcularPrioridadePorMultiplicacao() {
        Reserva reserva = new Reserva();
        reserva.calcularPrioridadePorMultiplicacao(5, 2);
        assertEquals(10, reserva.getPrioridade());
    }

    @Test
    void deveCalcularPrioridadeMedia() {
        Reserva reserva = new Reserva();
        reserva.calcularPrioridadeMedia(6, 2);
        assertEquals(4, reserva.getPrioridade());
    }

}
