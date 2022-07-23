Feature: ChangePWD
  Scenario: cambio de password de una cuenta registrada
    Given la pagina "https://todo.ly/" este abierta
    And yo quiero realizar login
      | email    | hchinuri@maestria.com |
      | password | 123456                |
    And yo quiero ingresar al web app
    When deberia cambiar el password actual "123456" a password nuevo "123"
    And yo quiero realizar login
      | email    | hchinuri@maestria.com |
      | password | 123                |
    Then yo quiero ingresar al web app
