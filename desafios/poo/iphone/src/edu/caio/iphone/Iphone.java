package edu.caio.iphone;

public class Iphone implements WebBrowser, Phone, MusicPlayer {

	//music---------------------------------------------------
	public void playerMusic(int select, String music) {
	    switch (select) {
	        case 1:
	            if (music == null) {
	                System.out.println("É necessário escolher uma música primeiro");
	                return;
	            }
	            play();
	            break;
	        case 2:
	            if (music == null) {
	                System.out.println("É necessário escolher uma música primeiro");
	                return;
	            }
	            pause();
	            break;
	        case 3:
	            selectMusic(music);
	            break;
	        case 0:
	        	System.out.println("Saindo do Aplicativo");
	        	break;
	    }
	    
	    if (select > 3 || select < 0) {
	        System.err.println("Opção inválida");
	    }
	    
	}
	
	@Override
	public void play() {
		System.out.println("Tocando Música");
		
	}

	@Override
	public void pause() {
		System.out.println("Pausando Música");
		
	}

	@Override
	public void selectMusic(String music) {
		System.out.println("Selecionando Música : " + music);
		play();
	}
	
	
	//phone---------------------------------------------------
	public void userPhone(int select, String ligar) {
	    switch (select) {
	        case 1:
	        	call(ligar);
	            break;
	        case 2:
	            answer();
	            break;
	        case 3:
	            startVoicemail();
	        	break;
	        case 0:
	        	System.out.println("Saindo do Aplicativo");
	        	break;
	    }
	    
	    if (select > 3 || select < 0) {
	        System.err.println("Opção inválida");
	    }
	    
	}
	
	@Override
	public void call(String number) {
		System.out.println("Discando...");
		System.out.println("Ligando para " + number);
		
	}

	@Override
	public void answer() {
		System.out.println("Atendendo a chamada");
		
	}

	@Override
	public void startVoicemail() {
		System.out.println("Iniciando um correio de voz");
		
	}

	//web---------------------------------------------------
	
	public void Browser(int select, String pagina) {
	    switch (select) {
	        case 1:
	           showPage(pagina);
	            break;
	        case 2:
	            addNewTab();
	            break;
	        case 3:
	        	refreshPage();
	            break;
	        case 0:
	        	System.out.println("Saindo do Aplicativo");
	        	break;
	    }
	    
	    if (select > 3 || select < 0) {
	        System.err.println("Opção inválida");
	    }
	    
	}
	
	@Override
	public void showPage(String url) {
		System.out.println("Abrindo a página " + url);
		
	}

	@Override
	public void addNewTab() {
		System.out.println("Abrindo uma nova página ");
		
	}

	@Override
	public void refreshPage() {
		System.out.println("Atualizando a página ");
		
	}

}
