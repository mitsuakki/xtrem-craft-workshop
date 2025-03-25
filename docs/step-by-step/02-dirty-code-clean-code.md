# Clean code VS Dirty code

> En groupe, répondre aux 2 questions suivantes
 
- Qu'est-ce que du code sale ?
  - Répéter une condition au lieu de mettre l'expression dans un booléen
  - Comparer deux objets au lieu de comparer l'objet avec des valeurs dans les tests
  - Laisser des commentaires inutiles (par exemple : ici)
  - Importer tout avec librairies.*
  - AssertEqual(null, X) au lieu de AssertNull (de même pour assertTrue et assertFalse) quand la librairie le permet
  - Réécrire des fonctions natives / existantes, ne pas utiliser de librairie
  - Avoir des fonctions en escalier
Correction
  - Mélanger les langues dans le code
  - Ecrire une fonction avec + de 7 paramètres
  - Mal nommer les variables
    - pas technique
    - pas respecter les normes de langage (Snake VS Pascal)


- Qu'est-ce que du code propre ?
  - Toujours utiliser la même convention de nommage pour les fonctions et variables dans `src`
  - Rédiger une documentation claire et concise (pas de phrase inutile) 
  - Extraire les parties de code communes dans des fonctions plus petites
  - Découper le code
  - Organiser les imports par librairie pour la lecture
  - Formater le fichier (espace, tabulation, indentation, parenthèses) via un linter par exemple
  - Respecter les principes SOLID
  - Utiliser les patrons de conception
  - Utiliser du snake case pour les tests pour avoir l'explication la plus complète (phrase) 
Correction
  - Coder en anglais
  - Respecter le Single responsibility principle (classe et méthode)
  - Nommer les variables grâce à l'ubiquitous language
  - Ne pas mettre de types dans le nom des fonctions et variables.

> Partagez vos réponses dans le fichier [Clean code VS Dirty code](../solution/02-dirty-code-clean-code.md)
