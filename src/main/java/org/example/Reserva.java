package org.example;

public class Reserva {

    private float prioridade;

    public float getPrioridade() {
        return prioridade;
    }

    public void calcularPrioridadePorSoma(float diasEspera, float reservasAtivas) {
        WaitlistCalculator calculator = new WaitlistCalculator(diasEspera, reservasAtivas);
        this.prioridade = calculator.calcular(new SomaStrategy());
    }

    public void calcularPrioridadePorSubtracao(float diasEspera, float reservasAtivas) {
        WaitlistCalculator calculator = new WaitlistCalculator(diasEspera, reservasAtivas);
        this.prioridade = calculator.calcular(new SubtracaoStrategy());
    }

    public void calcularPrioridadePorDivisao(float diasEspera, float reservasAtivas) {
        WaitlistCalculator calculator = new WaitlistCalculator(diasEspera, reservasAtivas);
        this.prioridade = calculator.calcular(new DivisaoStrategy());
    }

    public void calcularPrioridadePorMultiplicacao(float diasEspera, float reservasAtivas) {
        WaitlistCalculator calculator = new WaitlistCalculator(diasEspera, reservasAtivas);
        this.prioridade = calculator.calcular(new MultiplicacaoStrategy());
    }

    public void calcularPrioridadeMedia(float diasEspera, float reservasAtivas) {
        WaitlistCalculator calculator = new WaitlistCalculator(diasEspera, reservasAtivas);
        this.prioridade = calculator.calcular(new MediaStrategy());
    }

}
