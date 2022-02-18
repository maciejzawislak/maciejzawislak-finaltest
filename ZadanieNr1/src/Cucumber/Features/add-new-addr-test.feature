Feature: Add new address on website

  Scenario Outline: User can add new address

    Given an open browser on mystore-testlab.coderslab.pl page

    When user signs in

    And wants to add new address

    And fills form alias <alias>, address <address>, city <city>, zip/postal code <zip/postal code>, country <country>, phone <phone>

    Then new address is added

    And browser is closed


    Examples:
      | alias | address | city    | zip/postal code | country        | phone       |
      | mz    | ulica   | miasto  | 66-001          | united kingdom | 123-456-789 |
      | mz1   | ulica1  | miasto1 | 66-001          | united kingdom | 123-456-789 |
      | mz2   | ulica2  | miasto2 | 66-001          | united kingdom | 123-456-789 |