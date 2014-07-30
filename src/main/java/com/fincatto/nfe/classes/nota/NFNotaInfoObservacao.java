package com.fincatto.nfe.classes.nota;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import com.fincatto.nfe.classes.NFBase;
import com.fincatto.nfe.validadores.StringValidador;

public class NFNotaInfoObservacao extends NFBase {
    @Attribute(name = "xCampo", required = true)
    private String identificacaoCampo;

    @Element(name = "xTexto", required = true)
    private String conteudoCampo;

    public void setIdentificacaoCampo(final String identificacaoCampo) {
        StringValidador.tamanho20(identificacaoCampo);
        this.identificacaoCampo = identificacaoCampo;
    }

    public void setConteudoCampo(final String conteudoCampo) {
        StringValidador.tamanho60(conteudoCampo);
        this.conteudoCampo = conteudoCampo;
    }
}