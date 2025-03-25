# Code review

## TODO

> En équipe, réaliser une revue de code du code et des tests

- Que cherchons-nous ?
  - comprendre le métier
  - des code smells
  - de mauvais nommages
  - de la duplication
  - des incohérences
  - ...
  
> Partager le résultat dans un backlog d'amélioration continue

Dans le fichier [code review](../solution/01-code-review.md), ajouter une issue par point d'amélioration, cette base sera utile pour la suite.

Dans code de prog:

Dans fichier Bank :
withExchangeRate 
pas de doc, meilleur nommage des paramètres (Currency from, Currency to, double rate)

addExchangeRate
on peut mettre deux fois la meme currency avec une rate diff de 1
convert
negation + || très bizarre, refactor extraction de fonction
!(currency1 == currency2 || exchangeRates.containsKey(currency1 + "->" + currency2))

Dans fichier BankTest :

convert_eur_to_eur_returns_same_value() throws MissingExchangeRateException {
assertThat(Bank.withExchangeRate(EUR, USD, 1.2).convert(10, EUR, EUR))
.isEqualTo(10);
pas besoin de mettre un taux de change pour la meme devise

Dans fichier MoneyCalculatorTest
shouldAddInUsd 
use assertNotNull et autre assertEqual

manque des cas de test

Dans fichier MoneyCalculator:
double et int font qu'il n'y a pas de restriction : on peut mettre des valeurs négatives.
add
il manque la currency du amount2