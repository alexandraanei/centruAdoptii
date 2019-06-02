# Centru adoptii animale
## Definirea sistemului

## Interogari
- Sa se afiseze istoricul adoptiilor
- Sa se afiseze in ordine alfabetica angajatii
- Sa se afiseze lista de pisici pentru adoptie
- Sa se afiseze lista de caini pentru adoptie
- Sa se caute salile cu capacitatea de 10 animale
- Sa se scrie in adopt.csv adoptatorii mai in varsta de 30 de ani
- +operatii de tip CRUD, utilizand JDBC


## Tipuri de obiecte:
- Animal (prin mostenire: Pisica, Caine)
- Angajat
- Adoptator
- Sala (prin mostenire: sala pisici, sala caini, sala mixta)
- Clinica
- Proiect
- Formular (interfata)-> FormularAdoptie, FormularPlata
- Locatie

## Colectii:
* IstoricAdoptii (Lista de Formulare)
* Angajati (Lista de Angajati)

## Servicii:
* Angajati
* IstoricAdoptii
* Adoptator
* Citire CSV
* Audit
* JDBC (Adoptator, Clinica, FormularPlata, Locatie)