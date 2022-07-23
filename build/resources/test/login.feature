Feature: Login

  Scenario: verificar el correcto login

    Given la pagina "https://todo.ly/" este abierta
    When yo quiero realizar login
      | email    | hchinuri@maestria.com |
      | password | 123456                |
    Then yo quiero ingresar al web app