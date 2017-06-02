package com.asesoftware.pilotoconciso.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="SYSTEM.CB_CUENTAS")
@NamedQueries({
    @NamedQuery(name = "CB_CUENTAS.findAll", query = "SELECT c FROM CB_CUENTAS c")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_CTACIA", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_CTACIA = :CTA_CTACIA")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_CTAENF", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_CTAENF = :CTA_CTAENF")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_NUMERO", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_NUMERO = :CTA_NUMERO")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_CTAINT", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_CTAINT = :CTA_CTAINT")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_CODCOM", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_CODCOM = :CTA_CODCOM")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_SUC_NUMERO", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_SUC_NUMERO = :CTA_SUC_NUMERO")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_EMP_CODIGO", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_EMP_CODIGO = :CTA_EMP_CODIGO")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_PRS_IDENT", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_PRS_IDENT = :CTA_PRS_IDENT")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_SUC_EMPNUM", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_SUC_EMPNUM = :CTA_SUC_EMPNUM")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_CLASE_CUENTA", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_CLASE_CUENTA = :CTA_CLASE_CUENTA")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_USUARIO_PROPIETARIO", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_USUARIO_PROPIETARIO = :CTA_USUARIO_PROPIETARIO")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_ACTIVA", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_ACTIVA = :CTA_ACTIVA")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_EN_PROCESO", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_EN_PROCESO = :CTA_EN_PROCESO")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_BANCARIA", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_BANCARIA = :CTA_BANCARIA")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_ACUMULA_SALDOS", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_ACUMULA_SALDOS = :CTA_ACUMULA_SALDOS")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_PRO_CODIGO", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_PRO_CODIGO = :CTA_PRO_CODIGO")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_SUB_CODIGO", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_SUB_CODIGO = :CTA_SUB_CODIGO")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_TIPO_CUENTA", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_TIPO_CUENTA = :CTA_TIPO_CUENTA")
    , @NamedQuery(name = "CB_CUENTAS.findByCTA_CODIGO_MONEDA", query = "SELECT c FROM CB_CUENTAS c WHERE c.CTA_CODIGO_MONEDA = :CTA_CODIGO_MONEDA")
})
public class CB_CUENTAS implements Serializable{

private static final long serialVersionUID = 1L;

	    @Column(name="")
		private String CTA_CTACIA;
	
	    @Column(name="")
		private String CTA_CTAENF;
	
		@Id
	    @Column(name="")
		private String CTA_NUMERO;
	
	    @Column(name="")
		private String CTA_CTAINT;
	
	    @Column(name="")
		private String CTA_CODCOM;
	
	    @Column(name="")
		private String CTA_SUC_NUMERO;
	
	    @Column(name="")
		private String CTA_EMP_CODIGO;
	
	    @Column(name="")
		private String CTA_PRS_IDENT;
	
	    @Column(name="")
		private String CTA_SUC_EMPNUM;
	
	    @Column(name="")
		private String CTA_CLASE_CUENTA;
	
	    @Column(name="")
		private String CTA_USUARIO_PROPIETARIO;
	
	    @Column(name="")
		private String CTA_ACTIVA;
	
	    @Column(name="")
		private String CTA_EN_PROCESO;
	
	    @Column(name="")
		private String CTA_BANCARIA;
	
	    @Column(name="")
		private String CTA_ACUMULA_SALDOS;
	
	    @Column(name="")
		private String CTA_PRO_CODIGO;
	
	    @Column(name="")
		private String CTA_SUB_CODIGO;
	
	    @Column(name="")
		private String CTA_TIPO_CUENTA;
	
	    @Column(name="")
		private String CTA_CODIGO_MONEDA;
	

		public String getCTA_CTACIA(){
			return this.CTA_CTACIA;
		}
		
		public void setCTA_CTACIA(String CTA_CTACIA){
			this.CTA_CTACIA = CTA_CTACIA;
		}
		
		public String getCTA_CTAENF(){
			return this.CTA_CTAENF;
		}
		
		public void setCTA_CTAENF(String CTA_CTAENF){
			this.CTA_CTAENF = CTA_CTAENF;
		}
		
		public String getCTA_NUMERO(){
			return this.CTA_NUMERO;
		}
		
		public void setCTA_NUMERO(String CTA_NUMERO){
			this.CTA_NUMERO = CTA_NUMERO;
		}
		
		public String getCTA_CTAINT(){
			return this.CTA_CTAINT;
		}
		
		public void setCTA_CTAINT(String CTA_CTAINT){
			this.CTA_CTAINT = CTA_CTAINT;
		}
		
		public String getCTA_CODCOM(){
			return this.CTA_CODCOM;
		}
		
		public void setCTA_CODCOM(String CTA_CODCOM){
			this.CTA_CODCOM = CTA_CODCOM;
		}
		
		public String getCTA_SUC_NUMERO(){
			return this.CTA_SUC_NUMERO;
		}
		
		public void setCTA_SUC_NUMERO(String CTA_SUC_NUMERO){
			this.CTA_SUC_NUMERO = CTA_SUC_NUMERO;
		}
		
		public String getCTA_EMP_CODIGO(){
			return this.CTA_EMP_CODIGO;
		}
		
		public void setCTA_EMP_CODIGO(String CTA_EMP_CODIGO){
			this.CTA_EMP_CODIGO = CTA_EMP_CODIGO;
		}
		
		public String getCTA_PRS_IDENT(){
			return this.CTA_PRS_IDENT;
		}
		
		public void setCTA_PRS_IDENT(String CTA_PRS_IDENT){
			this.CTA_PRS_IDENT = CTA_PRS_IDENT;
		}
		
		public String getCTA_SUC_EMPNUM(){
			return this.CTA_SUC_EMPNUM;
		}
		
		public void setCTA_SUC_EMPNUM(String CTA_SUC_EMPNUM){
			this.CTA_SUC_EMPNUM = CTA_SUC_EMPNUM;
		}
		
		public String getCTA_CLASE_CUENTA(){
			return this.CTA_CLASE_CUENTA;
		}
		
		public void setCTA_CLASE_CUENTA(String CTA_CLASE_CUENTA){
			this.CTA_CLASE_CUENTA = CTA_CLASE_CUENTA;
		}
		
		public String getCTA_USUARIO_PROPIETARIO(){
			return this.CTA_USUARIO_PROPIETARIO;
		}
		
		public void setCTA_USUARIO_PROPIETARIO(String CTA_USUARIO_PROPIETARIO){
			this.CTA_USUARIO_PROPIETARIO = CTA_USUARIO_PROPIETARIO;
		}
		
		public String getCTA_ACTIVA(){
			return this.CTA_ACTIVA;
		}
		
		public void setCTA_ACTIVA(String CTA_ACTIVA){
			this.CTA_ACTIVA = CTA_ACTIVA;
		}
		
		public String getCTA_EN_PROCESO(){
			return this.CTA_EN_PROCESO;
		}
		
		public void setCTA_EN_PROCESO(String CTA_EN_PROCESO){
			this.CTA_EN_PROCESO = CTA_EN_PROCESO;
		}
		
		public String getCTA_BANCARIA(){
			return this.CTA_BANCARIA;
		}
		
		public void setCTA_BANCARIA(String CTA_BANCARIA){
			this.CTA_BANCARIA = CTA_BANCARIA;
		}
		
		public String getCTA_ACUMULA_SALDOS(){
			return this.CTA_ACUMULA_SALDOS;
		}
		
		public void setCTA_ACUMULA_SALDOS(String CTA_ACUMULA_SALDOS){
			this.CTA_ACUMULA_SALDOS = CTA_ACUMULA_SALDOS;
		}
		
		public String getCTA_PRO_CODIGO(){
			return this.CTA_PRO_CODIGO;
		}
		
		public void setCTA_PRO_CODIGO(String CTA_PRO_CODIGO){
			this.CTA_PRO_CODIGO = CTA_PRO_CODIGO;
		}
		
		public String getCTA_SUB_CODIGO(){
			return this.CTA_SUB_CODIGO;
		}
		
		public void setCTA_SUB_CODIGO(String CTA_SUB_CODIGO){
			this.CTA_SUB_CODIGO = CTA_SUB_CODIGO;
		}
		
		public String getCTA_TIPO_CUENTA(){
			return this.CTA_TIPO_CUENTA;
		}
		
		public void setCTA_TIPO_CUENTA(String CTA_TIPO_CUENTA){
			this.CTA_TIPO_CUENTA = CTA_TIPO_CUENTA;
		}
		
		public String getCTA_CODIGO_MONEDA(){
			return this.CTA_CODIGO_MONEDA;
		}
		
		public void setCTA_CODIGO_MONEDA(String CTA_CODIGO_MONEDA){
			this.CTA_CODIGO_MONEDA = CTA_CODIGO_MONEDA;
		}
		
} 