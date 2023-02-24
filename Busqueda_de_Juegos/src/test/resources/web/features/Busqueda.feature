Feature: Navegación por sitio Web

  @Smoke
  Scenario Outline: Busqueda de juegos en google
    Given Como usuario estoy en la main page de google
    When Como usuario busco referencia a <juegos>
    Then El buscador muestra los siguentes resultados <juegos>

    Examples:
      | juegos             |
      | Half life          |
      | Escape from Tarkov |
      | Dota 2             |
