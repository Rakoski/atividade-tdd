package br.com;

public class IRPF {

    public double calcular(double renda) {
        if (renda < 0) {
            throw new IllegalArgumentException("Renda nao pode ser negativa");
        }

        if (renda <= 1903.98) {
            return 0.0;
        } else if (renda <= 2826.65) {
            return arredondar(renda * 0.075 - 142.80);
        } else if (renda <= 3751.05) {
            return arredondar(renda * 0.15 - 354.80);
        } else if (renda <= 4664.68) {
            return arredondar(renda * 0.225 - 636.13);
        } else {
            return arredondar(renda * 0.275 - 869.36);
        }
    }

    public double calcular(String renda) {
        try {
            double valor = Double.parseDouble(renda);
            return calcular(valor);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Valor invalido: " + renda);
        }
    }

    private double arredondar(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
}
