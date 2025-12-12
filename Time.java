public class Time {
	private int hora;
	private int minu;
	private int segu;
	
	public void setTime(int hora, int minu, int segu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}
	public void setTime(int hora, int minu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = 0;
	}
	public void setTime(int hora) {
		this.hora = hora;
		this.minu = 0;
		this.segu = 0;
	}
   public String exibirHoraUniversal() {
	   return formatanumero(this.hora) + ":" + formatanumero(this.minu) + ":" + formatanumero(this.segu);
   }
   public String exibirHoraPadrao() {
	   String strHora, sufixo;
	   if (this.hora == 12) {
		   strHora = "12";
		   sufixo = "AM";
	   }
	   else if (this.hora == 0) {
		   strHora = "12";
		   sufixo = "AM";
	   }
	   else if (this.hora >= 1 && this.hora <= 11 ) {
		   strHora = formatanumero(this.hora);
		   sufixo = "AM";
	   }
	   else {
		   strHora = formatanumero(this.hora - 12);
		   sufixo  = "PM";
	   }
	   return strHora + ":" +  formatanumero(this.minu) + ":" + formatanumero(this.segu) + sufixo;
		   
   }
   private String formatanumero(int numero) {
	   if (numero < 10) {
		   return "0" + numero;
	   }
	   return String.valueOf(numero);
	   
	   
   }
}