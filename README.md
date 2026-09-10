# TP_1

## Étape 1 - Affichage du menu

* On utilise `System.out.println()` pour afficher le menu principal.
* Le menu présente les différentes opérations disponibles : addition, multiplication, moyenne, maximum et quitter.
* À cette étape, le programme affiche uniquement les choix proposés à l'utilisateur.
* L'objectif est de présenter clairement les fonctionnalités avant de commencer les calculs.

**Capture d'écran :**

<img width="1280" height="673" alt="Étape 1 - Affichage du menu" src="Capture d'écran 2026-09-09 184531.png" />

---

## Étape 2 - Lecture du choix + boucle

* On crée un objet `Scanner` avec `new Scanner(System.in)` pour lire les données saisies au clavier.
* `sc.nextInt()` permet de récupérer le choix de l'utilisateur.
* Le menu est placé dans une boucle `do { ... } while (choix != 0)`.
* Le `do-while` permet de réafficher le menu après chaque opération.
* La boucle s'arrête lorsque l'utilisateur choisit l'option `0`.

**Capture d'écran :**

<img width="1280" height="673" alt="Étape 2 - Lecture du choix et boucle" src="nbproject/Capture d'écran 2026-09-09 205625.png" />

---

## Étape 3 - Création des méthodes

Les différentes opérations sont séparées dans la classe `Calculatrice`.

* `addition(int a, int b)` retourne la somme de deux entiers.
* `multiplication(int a, int b)` retourne le produit de deux entiers.
* `moyenne(int... valeurs)` utilise les **varargs** pour accepter plusieurs valeurs, calcule leur somme et retourne leur moyenne.
* `maximum(int... valeurs)` parcourt plusieurs valeurs et retourne la plus grande.
* Les méthodes sont déclarées `static`, ce qui permet de les appeler directement depuis la classe `Tp1` sans créer un objet `Calculatrice`.

**Captures d'écran :**

<img width="1280" height="673" alt="Étape 3 - Méthodes" src="Capture d'écran 2026-09-09 205721.png" />

<img width="1258" height="640" alt="Étape 3 - Méthodes" src="Capture d'écran 2026-09-09 205732.png" />

---

## Étape 4 - Connexion du menu aux méthodes

* On utilise `switch (choix)` pour exécuter l'opération correspondant au choix de l'utilisateur.
* **case 1** : demande deux entiers et appelle `Calculatrice.addition(a, b)`.
* **case 2** : demande deux entiers et appelle `Calculatrice.multiplication(x, y)`.
* **case 3** : demande le nombre de valeurs, les stocke dans un tableau `int[]`, puis appelle `Calculatrice.moyenne(valeurs)`.
* **case 4** : demande le nombre de valeurs, les stocke dans un tableau `int[]`, puis appelle `Calculatrice.maximum(entiers)`.
* **case 0** : affiche `Fin du programme.` et permet de quitter la boucle.
* **default** : affiche `Option invalide !` lorsque le choix n'est pas reconnu.
* Cette organisation permet de séparer la saisie des données et les calculs, ce qui rend le programme plus clair et plus facile à maintenir.

**Captures d'écran :**

<img width="901" height="474" alt="Étape 4 - Switch" src="src/Capture d'écran 2026-09-09 205642.png" />

<img width="948" height="491" alt="Étape 4 - Addition" src="Capture d'écran 2026-09-09 205658.png" />

<img width="1082" height="520" alt="Étape 4 - Multiplication" src="src/Capture d'écran 2026-09-09 205709.png" />

<img width="1280" height="670" alt="Étape 4 - Moyenne" src="src/Capture d'écran 2026-09-09 211758.png" />

<img width="1277" height="666" alt="Étape 4 - Maximum" src="src/Capture d'écran 2026-09-09 211817.png" />

<img width="1280" height="673" alt="Étape 4 - Exécution" src="src/Capture d'écran 2026-09-09 212030.png" />

<img width="1280" height="676" alt="Étape 4 - Fin du programme" src="src/Capture d'écran 2026-09-09 212058.png" />

<img width="1280" height="676" alt="Étape 4 - Fin du programme" src="src/Capture d'écran 2026-09-09 212122.png" />

