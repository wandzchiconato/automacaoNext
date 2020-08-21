package steps;

import appiumCore.baseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.geolocalizacaoPage;
import pages.splashPage;

public class login extends baseTest {
    private splashPage splash = new splashPage();
    private geolocalizacaoPage geo = new geolocalizacaoPage();

    @Given("^Usuario seleciona a \"([^\"]*)\" e clica em Enviar$")
    public void usuario_seleciona_a_e_clica_em_Enviar(String Esteira) throws Throwable {
        splash.selecionarEsteira();
        splash.enviarTxtEsteira(Esteira);
        splash.confirmarEsteira();
        System.out.println("Passo 1 - Selecionou a esteira desejada");
    }

    @And("^Seleciona a Opcao \"([^\"]*)\"$")
    public void seleciona_a_Opcao(String conta) throws Throwable {
        splash.clicarJaTenhoConta();
        System.out.println("Passo 2");
    }

    @And("^Autoriza a GeoLocalizacao$")
    public void autoriza_a_GeoLocalizacao() throws Throwable {
        geo.clicarBtnOk();
        geo.allowAccess();
        System.out.println("Passo 3");
    }


    @Then("^Digita o \"([^\"]*)\" e a \"([^\"]*)\"$")
    public void digita_o_e_a(String CPF, String Senha) throws Throwable {
        System.out.println("Passo 4");
    }

    @Then("^Seleciona a opcao Entrar$")
    public void seleciona_a_opcao_Entrar() throws Throwable {
        System.out.println("Passo 5");
    }

}
