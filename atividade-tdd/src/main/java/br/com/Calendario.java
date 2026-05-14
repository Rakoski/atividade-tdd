package br.com;

import java.time.LocalDate;

public class Calendario {

    public String getCalendario() {
        LocalDate hoje = LocalDate.now();
        return "Calendario do mes " + hoje.getMonthValue() + "/" + hoje.getYear();
    }

    public String getCalendario(String ano) {
        validarAno(ano);
        int anoInt = Integer.parseInt(ano);
        return "Calendario do ano " + anoInt;
    }

    public String getCalendario(String mes, String ano) {
        validarAno(ano);
        validarMes(mes);
        int mesInt = Integer.parseInt(mes);
        int anoInt = Integer.parseInt(ano);

        if (anoInt == 1752 && mesInt == 9) {
            return "Calendario de 9/1752 (Reforma Gregoriana: dias 3 a 13 ausentes)";
        }
        return "Calendario do mes " + mesInt + "/" + anoInt;
    }

    public String getCalendario(String... variosParametros) {
        if (variosParametros.length == 0) return getCalendario();
        if (variosParametros.length == 1) return getCalendario(variosParametros[0]);
        return getCalendario(variosParametros[0], variosParametros[1]);
    }

    private void validarAno(String ano) {
        int anoInt;
        try {
            if (ano.contains(".")) throw new IllegalArgumentException("Ano deve ser inteiro");
            anoInt = Integer.parseInt(ano);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ano invalido: " + ano);
        }
        if (anoInt < 1 || anoInt > 9999) throw new IllegalArgumentException("Ano fora do intervalo permitido (1 a 9999)");
    }

    private void validarMes(String mes) {
        int mesInt;
        try {
            if (mes.contains(".")) throw new IllegalArgumentException("Mes deve ser inteiro");
            mesInt = Integer.parseInt(mes);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Mes invalido: " + mes);
        }
        if (mesInt < 1 || mesInt > 12) throw new IllegalArgumentException("Mes fora do intervalo permitido (1 a 12)");
    }
}
