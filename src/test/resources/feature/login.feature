Feature: Efetuar Login

  Scenario Outline:
    Given Usuario seleciona a <Esteira> e clica em Enviar
    And   Seleciona a Opcao "Ja tenho Conta"
    And   Autoriza a GeoLocalizacao
    Then  Digita o <CPF> e a <Senha>
    Then  Seleciona a opcao Entrar




    Examples:
      | Esteira   | CPF              | Senha    |
      | "PB-1018" | "578.988.438-51" | "147258" |
      | "PB-1070" | "578.988.438-51" | "147258" |
      | "PB-1071" | "578.988.438-51" | "147258" |