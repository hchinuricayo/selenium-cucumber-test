Feature: SingUpCreate

  Scenario: creacion de una nueva cuenta
    Given que la pagina "https://todo.ly/" este abierta
    When yo quiero registra la nueva cuenta
      | name     | reyna chinuri cayo        |
      | email    | reynachinuri@maestria.com |
      | password | 123456                    |
    Then yo debo ingresar al web app
