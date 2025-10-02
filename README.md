Code smells/Problemi u kodu
fajl Calculator.java 
Linija / blok 5                     Zapažanje / Code Smell 
                                    Globalna statička promenljiva – nije threadsafe i otežava testiranje. Bolje bi bilo vratiti rezultat iz metode.
Linija / blok 8-19                  Zapažanje / Code Smell
                                    Unutrašnja statička klasa sa samo konstantama i metodom ToString(). Metoda ToString() ima veliko slovo – A treba da bude je toString().
Linija / blok 21                    Zapažanje / Code Smell 
                                    Nepoštovanje Java naming convention (mora toString()).
Linija / blok 26-30	            Zapažanje / Code Smell 
                                    Metoda je OK, ali je samo proxy za evaluateExpression. Možda nepotrebna metoda. Teško održavanje i testiranje.
Linija / blok 32-81                 Zapažanje / Code Smell     
                                    Dupliranje logike, velika metoda → teško za testiranje. Preporuka: razdvojiti parsiranje brojeva i operacija u više metoda.
Linija / blok 36                    Zapažanje / Code Smell 
                                    Greška tipa: 0 + expression pravi String concatenation, možda je bolje expression = "0" + expression; da bude jasno.
Linija / blok 39		    Zapažanje / Code Smell 
                                    Dinamički regex sa specijalnim karakterima može izazvati greške. Potrebno escape-ovati regex znakove.
Linija / blok 42-50                 Zapažanje / Code Smell 
                                    Dupliranje koda, iteriranje po stringu → bolje koristiti regex matcher ili char stream.
Linija / blok 53-69                 Zapažanje / Code Smell 				    
                                    Greške u Exception handling – hvata generički Exception. Bolje je NumberFormatException.
Linija / blok 71                    Zapažanje / Code Smell 
                                    Rekurzija sa modifikacijom liste – može izazvati ConcurrentModificationException u drugim kontekstima.
Linija / blok 75-144		    Zapažanje / Code Smell
                                    Dupliranje koda – isti pattern za +, -, *, / se ponavlja nekoliko puta. Može se refaktorisati u petlju ili mapu operatora.
Linija / blok 36, 53-69             Zapažanje / Code Smell
                                    Nepotrebni else blokovi nakon return → kod može biti čitljiviji.
Linija / blok Opšte                 Nema validacije praznog stringa pre expression.charAt(0) → može baciti StringIndexOutOfBoundsException.

Linija / blok Opšte                 Komentari postoje, ali nisu u Javadoc formatu → za javne metode je bolje koristiti Javadoc.

Linija / blok Opšte                 Nema testova, niti validacije izraza (npr. deljenje sa nulom).


Code smells/Problemi u kodu
fajl start.java

Linija / blok 7                     Zapažanje / Code Smell
                                    Promenljiva Expression je velika slova, Java naming convention kaže mala početna slova: expression.
Linija / blok 9                     Zapažanje / Code Smell
                                    Ime active je ok, ali moglo bi biti isActive da se jasno vidi da je boolean.
Linija / blok 11                    Zapažanje / Code Smell
                                    Direktni System.out.println u main-u – za testabilnost bolje koristiti metodu koja vraća string, main samo poziva.
Linija / blok 14                    Zapažanje / Code Smell
                                    Scanner se kreira unutar petlje → stalno alocira nove objekte. Bolje je kreirati jedan Scanner pre petlje i zatvoriti ga na kraju.
Linija / blok 17                    Zapažanje / Code Smell
                                    Poređenje stringa je ok, ali opet promenljiva bi trebalo da se zove expression.
Linija / blok 19                    Zapažanje / Code Smell
                                    Scanner zatvoren unutar petlje, što je problematično ako petlja nastavlja. Bolje zatvoriti Scanner nakon izlaska iz petlje.
Linija / blok 22                    Zapažanje / Code Smell
                                    Direktan poziv statičke metode Calculator.Run je ok, ali nije testabilno → teško za unit testove.


LINES OF CODE

Language Java
Files 2
code 148
comments 5
blank 61 
total 214













				    



















