# Piotr_Kotarba-shoes-factory
Projekt zaliczeniowy z przedmiotu Wzorce Projektowe
Do uruchomienia nie potrzeba zadnych narzedzi, jest to projekt konsolowy (IntelliJ).

Opis: Jest to prosta aplikacja symulujaca przyjecie klienta w fabryce/sklepie z butami.
Klient ma mozliwosc przeglądnąć wyprodukowane buty będące w magazynie, zlecić wyprodukowanie butów dla niego na wymiar i zakupienie ich lub którychkolwiek innych.

Wykorzystane wzorce projektowe:
1. Builder do tworzenia kolejnych par butow
2. Iterator do przegladania butow dostepnych w magazynie
3. Fasada do ukrycia części logiki i utrzymania głównej klasy do obsługi menu w czystości
4. Singleton do utworzenia jednej i tylko jednej bazy danych butów w magazynie
