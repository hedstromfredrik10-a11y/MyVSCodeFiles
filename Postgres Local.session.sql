-- 1. Lista författar-id och pseudonym för samtliga författare. KLAR
-- 2. Lista all information om förlagen. KLAR
-- 3. Lista kategorier i stigande bokstavsordning. KLAR
-- 4. Lista titel, inköpspris och antal sidor för de böcker som har ett pris som är lika med
-- antalet sidor i boken. KLAR
-- 5. Lista de länder där det finns förlag. Ange varje land endast 1 gång. KLAR
-- 6. Lista förlagen sorterade stigande på land och fallande på specialitet! Ta ej med förlag i
-- USA. KLAR
-- 7. Lista efternamn och pseudonym för alla författare. Om författaren inte har någon
-- pseudonym skall den kolumnen innehålla ett minustecken i svaret (i stället för NULL).
-- Om författaren har ett ”sson”-namn (efternamnet slutar på ”sson”) skall det i
-- kolumnen stå ”SSON” i stället. KLAR
-- 8. Lista för- och efternamn på de författare som har ett efternamn där bokstaven n
-- förekommer minst 2 gånger. KLAR
-- 9. Lista de förlag som har ordet "och" i sin specialitet, och som ligger i USA, England
-- eller Finland. KLAR
-- 10. Lista titel och själva prissänkningen för alla böcker om priset sänks med 10 %. KLAR
-- 11. Lista priset per sida för de böcker som kostar mindre än 1 kr/sida. Lista den dyraste
-- först. Sätt rubriken ”sidpris” för kolumnen med priset/sida. KLAR
-- 12. Lista lägsta, högsta och medelvärdet av inköpspriset för böcker med mindre än 450
-- sidor. KLAR
-- 13. Lista land och antalet förlag i landet. KLAR
-- 14. Lista kategori och antalet böcker per kategori. Ta bara med böcker utgivna 1992 eller
-- senare och kategorier med fler än 4 böcker. KLAR
-- 15. Lista den kategori som har den billigaste boken. KLAR
-- 16. Lista för- och efternamn på författare som ej skrivit någon bok. KLAR
-- 17. Lista titeln och inköpsdatumet för alla böcker som är inköpta under andra halvåret
-- (juli - december) oavsett årtal. KLAR
SELECT category,
    COUNT(book_id) AS antal_böcker
FROM books
    JOIN categories ON categories.category_id = books.category_id
WHERE published_year >= 1992
GROUP BY category
HAVING COUNT(book_id) > 4
ORDER BY antal_böcker DESC;