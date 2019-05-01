/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
public class Pessoa {

    private Integer seqPessoa;
    private String nomePessoa;
    private String ufPessoa;
    private String cidadePessoa;
    private String telefonePessoa;
    private String loginPessoa;
    private String senhaPessoa;
    private String tipoPessoa;
    private String emailPessoa;

    public Pessoa(Integer seqPessoa, String nomePessoa, String ufPessoa, String cidadePessoa, String telefonePessoa, String loginPessoa, String senhaPessoa, String tipoPessoa, String emailPessoa) {
        this.seqPessoa = seqPessoa;
        this.nomePessoa = nomePessoa;
        this.ufPessoa = ufPessoa;
        this.cidadePessoa = cidadePessoa;
        this.telefonePessoa = telefonePessoa;
        this.loginPessoa = loginPessoa;
        this.senhaPessoa = senhaPessoa;
        this.tipoPessoa = tipoPessoa;
        this.emailPessoa = emailPessoa;

    }

    public Pessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getSeqPessoa() {
        return seqPessoa;
    }

    public void setSeqPessoa(Integer seqPessoa) {
        this.seqPessoa = seqPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getUfPessoa() {
        return ufPessoa;
    }

    public void setUfPessoa(String ufPessoa) {
        this.ufPessoa = ufPessoa;
    }

    public String getCidadePessoa() {
        return cidadePessoa;
    }

    public void setCidadePessoa(String cidadePessoa) {
        this.cidadePessoa = cidadePessoa;
    }

    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    public String getLoginPessoa() {
        return loginPessoa;
    }

    public void setLoginPessoa(String loginPessoa) {
        this.loginPessoa = loginPessoa;
    }

    public String getSenhaPessoa() {
        return senhaPessoa;
    }

    public void setSenhaPessoa(String senhaPessoa) {
        this.senhaPessoa = senhaPessoa;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
    
    

}
