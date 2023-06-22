package project;

import java.util.Scanner;


public class Project2 extends Thread {
    static Scanner sc = new Scanner(System.in);
    static int type;
    static int price;
    static int count;
    StringBuilder fictionPurchased = new StringBuilder();
    StringBuilder novelPurchased = new StringBuilder();
    StringBuilder thrillerPurchased = new StringBuilder();
    StringBuilder crimePurchase = new StringBuilder();
    StringBuilder horrorPurchased = new StringBuilder();

    void aboutGenre() throws InterruptedException {
        String[] about;
        about = new String[]{"\n\n\n#1) Fiction:\n \"Fiction\" refers to literature created from the imagination. Mysteries, science fiction, romance, fantasy, chick lit, crime thrillers are all fiction genres. \n",
                "#2) Novel:\n A novel is a relatively long work of narrative fiction, typically written in prose and published as a book. \n",
                "#3) Thriller:\n Thriller is a genre of fiction with numerous, often overlapping, subgenres, including crime, horror and detective fiction. \n",
                "#4) True Crime:\n These stories usually revolve around a crime from the moment it is committed to the time it is solved. \n",
                "#5) Horror:\nHorror is a genre that seeks to provoke fear, terror, shock, and other similar kinds of feelings in readers. \n"};
        for (String s : about) {
            System.out.println(s);
        }
        Thread.sleep(10000);
    }

    void fiction() throws InterruptedException {
        String[] fiction_title;
        fiction_title = new String[]{
                "Ulysses",
                "The Hobbit",
                "Catch-22",
                "Crime and Punishment ",
                "The Lord of the Rings",
                "A Gentleman in Moscow",
                "DUNE",
                "1984",
                "Blood Meridian, or, the Evening Redness in the West",
                "To Kill a Mockingbird"
        };
        String[] fiction_author;
        fiction_author = new String[]{
                "\033[4mJames Joyce\033[0m",
                "\033[4mJ.R.R. Tolkien\033[0m",
                "\033[4mJoseph Heller\033[0m",
                "\033[4mFyodor Dostoevsky\033[0m",
                "\033[4mJ.R.R. Tolkien\033[0m",
                "\033[4mAmor Towles\033[0m",
                "\033[4mFrank Herbert\033[0m",
                "\033[4mGeorge Orwell\033[0m",
                "\033[4mCormac McCarthy\033[0m",
                "\033[4mHarper Lee\033[0m",
        };
        for (int i = 0; i <= fiction_title.length - 1; i++) {
            System.out.println(i + 1 + ". " + fiction_title[i] + "\tby\t" + fiction_author[i]);
        }
        System.out.print("Which book you want accourding to the serial no: ");
        int input = sc.nextInt();
        switch (input) {
            case 1://Ulysses
                System.out.println("1. " + fiction_title[0] + "\tby\t" + fiction_author[0]);
                String Ulysses = "Ulysses, a novel by the Irish writer James Joyce, is a key text of literary modernism. \n" +
                        " Divided into 18 chapters, it follows the structure of Homer's Odyssey, the ancient Greek epic poem about Odysseus's journey home from the Trojan War to his wife Penelope in Ithaca.";
                if (fictionPurchased.toString().contains("1")) {
                    System.out.println("you have purchased this books");
                    System.out.println(Ulysses);
                    Thread.sleep(10000);
                    count++;
                    break;
                }

                System.out.println("You have no access to this book: ");
                System.out.println("Price of the book: 284");
                System.out.print("Do you want to purchase this book y/n:");
                String pur = sc.next();
                if (pur.equals("y")) {
                    fictionPurchased.append("1");
                    price = price + 284;
                    System.out.println("\n" + Ulysses + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;

            case 2://The Hobbit
                System.out.println("2. " + fiction_title[1] + "\tby\t" + fiction_author[1]);
                String hobbit = ("""
                        The Hobbit, or There and Back Again is a children's fantasy novel by English author J. R. R. Tolkien.
                        It was published in 1937 to wide critical acclaim, being nominated for the Carnegie Medal and awarded a prize
                        from the New York Herald Tribune for best juvenile fiction.""");
                if (fictionPurchased.toString().contains("2")) {
                    System.out.println("you have purchased this books");
                    System.out.println(hobbit);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book2 = sc.next();
                if (book2.equals("y")) {
                    fictionPurchased.append("2");
                    price = price + 284;
                    System.out.println("\n" + hobbit + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;


            case 3://Catch-22
                System.out.println("3. " + fiction_title[2] + "\tby\t" + fiction_author[2]);
                String Catch = "Catch-22 remains a cornerstone of American literature and one of the funniest—and most celebrated—books of all time. In recent years it has been \n" +
                        "  named to “best novels” lists by Time, Newsweek, the Modern Library, and the London Observer.";
                if (fictionPurchased.toString().contains("3")) {
                    System.out.println("you have purchased this books");
                    System.out.println(Catch);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book3 = sc.next();
                if (book3.equals("y")) {
                    fictionPurchased.append("3");
                    price = price + 284;
                    System.out.println("\n" + Catch + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 4://Crime and Punishment
                System.out.println("4. " + fiction_title[3] + "\tby\t" + fiction_author[3]);
                String Crime = "Raskolnikov, a destitute and desperate former student, wanders through the slums of St Petersburg and commits a random murder without remorse or regret. \n" +
                        "       He imagines himself to be a great man, a Napoleon: acting for a higher purpose beyond conventional moral law. \n";
                if (fictionPurchased.toString().contains("4")) {
                    System.out.println("you have purchased this books");
                    System.out.println(Crime);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book4 = sc.next();
                if (book4.equals("y")) {
                    fictionPurchased.append("4");
                    price = price + 284;
                    System.out.println("\n" + Crime + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 5://The Lord of the Rings
                System.out.println("5. " + fiction_title[4] + "\tby\t" + fiction_author[4]);
                String lord = "In ancient times the Rings of Power were crafted by the Elven-smiths, and Sauron, the Dark Lord, forged the One Ring, filling it with his own power so that he could rule all others. \n" +
                        "      But the One Ring was taken from him, and though he sought it throughout Middle-earth, it remained lost to him. \n" +
                        "      After many ages it fell by chance into the hands of the hobbit Bilbo Baggins. \n";
                if (fictionPurchased.toString().contains("5")) {
                    System.out.println("you have purchased this books");
                    System.out.println(lord);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book5 = sc.next();
                if (book5.equals("y")) {
                    fictionPurchased.append("5");
                    price = price + 284;
                    System.out.println("\n" + lord + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 6: //A Gentleman in Moscow
                System.out.println("6. " + fiction_title[5] + "\tby\t" + fiction_author[5]);
                String gentalman = "A Gentleman in Moscow immerses us in another elegantly drawn era with the story of Count Alexander Rostov. \n" +
                        "          When, in 1922, he is deemed an unrepentant aristocrat by a Bolshevik tribunal, the count is sentenced to house arrest in the Metropol,\n" +
                        "          a grand hotel across the street from the Kremlin.";
                if (fictionPurchased.toString().contains("6")) {
                    System.out.println("you have purchased this books");
                    System.out.println(gentalman);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book6 = sc.next();
                if (book6.equals("y")) {
                    fictionPurchased.append("6");
                    price = price + 284;
                    System.out.println("\n" + gentalman + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;

            case 7: //DUNE
                System.out.println("7. " + fiction_title[6] + "\tby\t" + fiction_author[6]);
                String dune = "Dune is the story of the boy Paul Atreides, heir to a noble family tasked with ruling \n" +
                        "      an inhospitable world where the only thing of value is the “spice” melange, \n" +
                        "      a drug capable of extending life and enhancing consciousness.";
                if (fictionPurchased.toString().contains("7")) {
                    System.out.println("you have purchased this books");
                    System.out.println(dune);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book7 = sc.next();
                if (book7.equals("y")) {
                    fictionPurchased.append("7");
                    price = price + 284;
                    System.out.println("\n" + dune + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;

            case 8: //1984
                System.out.println("8. " + fiction_title[7] + "\tby\t" + fiction_author[7]);
                String nine = "The new novel by George Orwell is the major work towards which all his previous writing has pointed. \n" +
                        "      Critics have hailed it as his \"most solid, most brilliant\" work. \n" +
                        "      Though the story of Nineteen Eighty-Four takes place thirty-five years hence, it is in every sense timely.";
                if (fictionPurchased.toString().contains("8")) {
                    System.out.println("you have purchased this books");
                    System.out.println(nine);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book8 = sc.next();
                if (book8.equals("y")) {
                    fictionPurchased.append("8");
                    price = price + 284;
                    System.out.println("\n" + nine + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;

            case 9: //Blood Meridian, or, the Evening Redness in the West
                System.out.println("9. " + fiction_title[8] + "\tby\t" + fiction_author[8]);
                String blood = "Blood Meridian is an epic novel of the violence and depravity that attended America's westward expansion, \n" +
                        "       brilliantly subverting the conventions of the Western novel and the mythology of the Wild West.";
                if (fictionPurchased.toString().contains("9")) {
                    System.out.println("you have purchased this books");
                    System.out.println(blood);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book9 = sc.next();
                if (book9.equals("y")) {
                    fictionPurchased.append("9");
                    price = price + 284;
                    System.out.println("\n" + blood + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;

            case 10: //To Kill a Mockingbird
                System.out.println("10. " + fiction_title[9] + "\tby\t" + fiction_author[9]);
                String kill = "To Kill A Mockingbird\" became both an instant bestseller and a critical success when it was first published in 1960.\n" +
                        "      It went on to win the Pulitzer Prize in 1961 and was later made into an Academy Award-winning film, also a classic.\n";
                if (fictionPurchased.toString().contains("!")) {
                    System.out.println("you have purchased this books");
                    System.out.println(kill);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book10 = sc.next();
                if (book10.equals("y")) {
                    fictionPurchased.append("!");
                    price = price + 284;
                    System.out.println("\n" + kill + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            default:
                System.out.println("INVALID CHOICE");
        }

    }

    void novel() throws InterruptedException {
        String[] novel_title;
        novel_title = new String[]{
                "Fellowship Point",
                "Finding Me",
                "Anna: The Biography",
                "Cult Classic"
        };
        String[] novel_author;
        novel_author = new String[]{
                "\033[4mAlice Elliott Dark\033[0m",
                "\033[4mViola Davis\033[0m",
                "\033[4mAmy Odell\033[0m",
                "\033[4mSloane Crosley\033[0m"
        };
        for (int i = 0; i <= novel_title.length - 1; i++) {
            System.out.println(i + 1 + ". " + novel_title[i] + "\tby\t" + novel_author[i]);
        }
        System.out.print("Which book you want according to the serial no: ");
        int input = sc.nextInt();

        switch (input) {
            case 1://Fellowship Point
                System.out.println("1. " + novel_title[0] + "\tby\t" + novel_author[0]);
                String fellow = "Dark’s new novel explores female friendship between two women who are among the last shareholders of a large, undeveloped piece of Maine coastal land.\n";
                if (novelPurchased.toString().contains("1")) {
                    System.out.println("you have purchased this books");
                    System.out.println(fellow);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book1 = sc.next();
                if (book1.equals("y")) {
                    novelPurchased.append("1");
                    price = price + 284;
                    System.out.println("\n" + fellow + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 2://Finding Me
                System.out.println("2. " + novel_title[1] + "\tby\t" + novel_author[1]);
                String find = "This revealing memoir dives into Davis’s traumatic childhood in which she dealt with poverty, abuse and an alcoholic father, and takes readers through how she discovered acting and honed her craft at Juilliard.\n";
                if (novelPurchased.toString().contains("2")) {
                    System.out.println("you have purchased this books");
                    System.out.println(find);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book2 = sc.next();
                if (book2.equals("y")) {
                    novelPurchased.append("2");
                    price = price + 284;
                    System.out.println("\n" + find + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 3://Anna: The Biography
                System.out.println("3. " + novel_title[2] + "\tby\t" + novel_author[2]);
                String anna = " This comprehensive biography of the fashion icon is based on hundreds of interviews with Wintour’s closest friends and colleagues, and delves into her childhood in 1960s London and her long career at Vogue.\n";
                if (novelPurchased.toString().contains("3")) {
                    System.out.println("you have purchased this books");
                    System.out.println(anna);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book3 = sc.next();
                if (book3.equals("y")) {
                    novelPurchased.append("3");
                    price = price + 284;
                    System.out.println("\n" + anna + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 4://Cult Classic
                System.out.println("4. " + novel_title[3] + "\tby\t" + novel_author[3]);
                String cult = "Crosley, a prolific essayist, has written a novel that combines experimental psychology with modern dating \n";
                if (novelPurchased.toString().contains("3")) {
                    System.out.println("you have purchased this books");
                    System.out.println(cult);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book4 = sc.next();
                if (book4.equals("y")) {
                    novelPurchased.append("3");
                    price = price + 284;
                    System.out.println("\n" + cult + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            default:
                System.out.println("INVALID CHOICE");
                break;
        }
    }

    void thriller() throws InterruptedException {
        String[] thriller_title;
        thriller_title = new String[]{
                "The Guest List",
                "Stillhouse Lake",
                "Nine Perfect Strangers",
                "In a Dark, Dark Wood"
        };
        String[] thriller_author;
        thriller_author = new String[]{
                "\033[4mLucy Foley\033[0m",
                "\033[4mRachel Caine\033[0m",
                "\033[4mLiane Moriarty\033[0m",
                "\033[4mRuth Ware\033[0m"
        };
        for (int i = 0; i <= thriller_title.length - 1; i++) {
            System.out.println(i + 1 + ". " + thriller_title[i] + "\tby\t" + thriller_author[i]);
        }
        System.out.print("Which book you want accourding to the serial no: ");
        int input = sc.nextInt();

        switch (input) {
            case 1://The Guest List
                System.out.println("1. " + thriller_title[0] + "\tby\t" + thriller_author[0]);
                String guest = "The Guest List is an Agatha Christie-esque mystery set over the course of a highly exclusive weekend wedding.";
                if (thrillerPurchased.toString().contains("1")) {
                    System.out.println("you have purchased this books");
                    System.out.println(guest);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book1 = sc.next();
                if (book1.equals("y")) {
                    thrillerPurchased.append("1");
                    price = price + 284;
                    System.out.println("\n" + guest + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 2://Stillhouse Lake
                System.out.println("2. " + thriller_title[1] + "\tby\t" + thriller_author[1]);
                String still = "An \"average\" housewife's life is changed forever when a car accident reveals that her husband is a serial killer.";
                if (thrillerPurchased.toString().contains("2")) {
                    System.out.println("you have purchased this books");
                    System.out.println(still);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book2 = sc.next();
                if (book2.equals("y")) {
                    thrillerPurchased.append("2");
                    price = price + 284;
                    System.out.println("\n" + still + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 3://Nine Perfect Strangers
                System.out.println("3. " + thriller_title[2] + "\tby\t" + thriller_author[2]);
                String nine = "The author of Big Little Lies set her latest novel at a remote wellness center. Masha, Tranquillum House's charismatic owner, lures nine guests deeper and deeper into her spa's twisted philosophy.             \n" +
                        "\n";
                if (thrillerPurchased.toString().contains("3")) {
                    System.out.println("you have purchased this books");
                    System.out.println(nine);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book3 = sc.next();
                if (book3.equals("y")) {
                    thrillerPurchased.append("3");
                    price = price + 284;
                    System.out.println("\n" + nine + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 4://In a Dark, Dark Wood
                System.out.println("4. " + thriller_title[3] + "\tby\t" + thriller_author[3]);
                String dark = "Reclusive writer Leonora attends what's supposed to be an exciting, care-free bachelorette weekend in the English countryside, but it soon turns into something sinister in this psychological thriller.             \n" +
                        "\n";
                if (thrillerPurchased.toString().contains("4")) {
                    System.out.println("you have purchased this books");
                    System.out.println(dark);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book4 = sc.next();
                if (book4.equals("y")) {
                    thrillerPurchased.append("4");
                    price = price + 284;
                    System.out.println("\n" + dark + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            default:
                System.out.println("INVALID CHOICE");
                break;
        }
    }

    void crime() throws InterruptedException {
        String[] crime_title;
        crime_title = new String[]{
                "Cast a Cold Eye",
                "The Murder Wall",
                "Simply Lies",
                "Date with Evil"
        };
        String[] crime_author;
        crime_author = new String[]{
                "\033[4mRobbie Morrison\033[0m",
                "\033[4m Mari Hannah\033[0m",
                "\033[4mDavid Baldacci\033[0m",
                "\033[4mJulia Chapman\033[0m"
        };
        for (int i = 0; i <= crime_title.length - 1; i++) {
            System.out.println(i + 1 + ". " + crime_title[i] + "\tby\t" + crime_author[i]);
        }
        System.out.print("Which book you want accourding to the serial no: ");
        int input = sc.nextInt();

        switch (input) {
            case 1://Cast a Cold Eye
                System.out.println("1. " + crime_title[0] + "\tby\t" + crime_author[0]);
                String cast = " With violence erupting between rival gangs and political tensions rising, for war veterans turned investigators Dreghorn and McDaid, murder on their patch in interwar Glasgow is nothing new.            \n" +
                        "\n";
                if (crimePurchase.toString().contains("1")) {
                    System.out.println("you have purchased this books");
                    System.out.println(cast);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book1 = sc.next();
                if (book1.equals("y")) {
                    crimePurchase.append("1");
                    price = price + 284;
                    System.out.println("\n" + cast + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 2://The Murder Wall
                System.out.println("2. " + crime_title[1] + "\tby\t" + crime_author[1]);
                String murder = "Months after failing to solve a brutal double murder that rocked a sleepy town in the Northumbrian countryside, DCI Kate Daniels is still reeling from the case and looking for a new chance to prove her mettle.                          \n";
                if (crimePurchase.toString().contains("2")) {
                    System.out.println("you have purchased this books");
                    System.out.println(murder);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book2 = sc.next();
                if (book2.equals("y")) {
                    crimePurchase.append("2");
                    price = price + 284;
                    System.out.println("\n" + murder + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 3://Simply Lies
                System.out.println("3. " + crime_title[2] + "\tby\t" + crime_author[2]);
                String lies = "A brand new standalone thriller from David Baldacci, Simply Lies introduces former New Jersey detective and single mother of two Mickey Gibson.     \n" +
                        "\n";
                if (crimePurchase.toString().contains("3")) {
                    System.out.println("you have purchased this books");
                    System.out.println(lies);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book3 = sc.next();
                if (book3.equals("y")) {
                    crimePurchase.append("3");
                    price = price + 284;
                    System.out.println("\n" + lies + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 4://Date with Evil
                System.out.println("4. " + crime_title[3] + "\tby\t" + crime_author[3]);
                String evil = " Samson and Delilah come up against their biggest case yet in Date with Evil, the eighth crime novel in this series set in the Yorkshire Dales.     \n";
                if (crimePurchase.toString().contains("4")) {
                    System.out.println("you have purchased this books");
                    System.out.println(evil);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book4 = sc.next();
                if (book4.equals("y")) {
                    crimePurchase.append("4");
                    price = price + 284;
                    System.out.println("\n" + evil + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            default:
                System.out.println("INVALID CHOICE");
                break;
        }
    }

    void horror() throws InterruptedException {
        String[] horror_title;
        horror_title = new String[]{
                "Salem’s Lot",
                "Those Across the River",
                "The Exorcist",
                "The Ruins"
        };
        String[] horror_author;
        horror_author = new String[]{
                "\033[4mStephen King (1975)n\033[0m",
                "\033[4m Christopher Buehlman (2011)\033[0m",
                "\033[4mWilliam Peter Blatty (1971)\033[0m",
                "\033[4mScott Smith (2006)\033[0m"
        };
        for (int i = 0; i <= horror_title.length - 1; i++) {
            System.out.println(i + 1 + ". " + horror_title[i] + "\tby\t" + horror_author[i]);
        }
        System.out.print("Which book you want accourding to the serial no: ");
        int input = sc.nextInt();

        switch (input) {
            case 1://Salem’s Lot
                System.out.println("1. " + horror_title[0] + "\tby\t" + horror_author[0]);
                String lot = "This story of a small town overrun by vampires is deliciously chilling.\n";
                if (horrorPurchased.toString().contains("1")) {
                    System.out.println("you have purchased this books");
                    System.out.println(lot);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book1 = sc.next();
                if (book1.equals("y")) {
                    horrorPurchased.append("1");
                    price = price + 284;
                    System.out.println("\n" + lot + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 2://Those Across the River
                System.out.println("2. " + horror_title[1] + "\tby\t" + horror_author[1]);
                String river = "                        In 1935, a professor fleeing scandal moves with his wife to a family home in Georgia, located near the ruins of a plantation that his ancestors owned.                         \n";
                if (horrorPurchased.toString().contains("2")) {
                    System.out.println("you have purchased this books");
                    System.out.println(river);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book2 = sc.next();
                if (book2.equals("y")) {
                    horrorPurchased.append("2");
                    price = price + 284;
                    System.out.println("\n" + river + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 3://The Exorcist
                System.out.println("3. " + horror_title[2] + "\tby\t" + horror_author[2]);
                String the = "The reason The Exorcist was made into one of the scariest movies of all time is that it was one of the scariest novels of all time. It follows the demonic possession of an 11-year-old girl named Regan.\n";
                if (horrorPurchased.toString().contains("3")) {
                    System.out.println("you have purchased this books");
                    System.out.println(the);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book3 = sc.next();
                if (book3.equals("y")) {
                    horrorPurchased.append("3");
                    price = price + 284;
                    System.out.println("\n" + the + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            case 4://The Ruins
                System.out.println("4. " + horror_title[3] + "\tby\t" + horror_author[3]);
                String ruins = "In this novel by Scott Smith, a group of young, happy-go-lucky travelers in the Mexican jungle stumble upon the site of ancient ruins—and ancient evil.\n";
                if (horrorPurchased.toString().contains("4")) {
                    System.out.println("you have purchased this books");
                    System.out.println(ruins);
                    Thread.sleep(10000);
                    count++;
                    break;
                }
                System.out.println("You have no access to this book: ");
                System.out.print("Do you want to purchase this book y/n:");
                String book4 = sc.next();
                if (book4.equals("y")) {
                    horrorPurchased.append("4");
                    price = price + 284;
                    System.out.println("\n" + ruins + "\n");
                    Thread.sleep(10000);
                    count++;
                }
                break;
            default:
                System.out.println("INVALID CHOICE");
                break;
        }
    }

    void billing() throws InterruptedException {
        System.out.println("----------------------------");
        System.out.println("            BILLING");
        System.out.println();
        System.out.println("NUMBER OF BOOKS: " + count);
        System.out.println("TOTAL PRICE: " + price);
        System.out.println("----------------------------");
        this.exit();
    }

    public static void pause1() {
        System.out.println("Continue: press c");
        Scanner s = new Scanner(System.in);
        s.next();
    }

    public void exit() throws InterruptedException {
        System.out.print("Exiting");
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Project2 Project2 = new Project2();


        System.out.println("""

                ██████╗░░█████╗░░█████╗░██╗░░██╗  ░██████╗████████╗░█████╗░██████╗░███████╗
                ██╔══██╗██╔══██╗██╔══██╗██║░██╔╝  ██╔════╝╚══██╔══╝██╔══██╗██╔══██╗██╔════╝
                ██████╦╝██║░░██║██║░░██║█████═╝░  ╚█████╗░░░░██║░░░██║░░██║██████╔╝█████╗░░
                ██╔══██╗██║░░██║██║░░██║██╔═██╗░  ░╚═══██╗░░░██║░░░██║░░██║██╔══██╗██╔══╝░░
                ██████╦╝╚█████╔╝╚█████╔╝██║░╚██╗  ██████╔╝░░░██║░░░╚█████╔╝██║░░██║███████╗
                ╚═════╝░░╚════╝░░╚════╝░╚═╝░░╚═╝  ╚═════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝╚══════╝            
                                """);


        System.out.print("Do you want to purchase a book y/n - ");
        String entry = sc.next().toLowerCase();
        if (entry.equals("y")) {
            for (int i = 0; ; i++) {
                System.out.println("""
                        \n
                                                    
                                                    
                        ********************************************************************************************************************************************************


                                             ▄█   █▀ █ ▄▀▀ ▀█▀ █ ▄▀▄ █▄ █           ▀█   █▄ █ ▄▀▄ █ █ ██▀ █             ▀▀█   ▀█▀ █▄█ █▀▄ █ █   █   ██▀ █▀▄
                                              █ ▄ █▀ █ ▀▄▄  █  █ ▀▄▀ █ ▀█           █▄ ▄ █ ▀█ ▀▄▀ ▀▄▀ █▄▄ █▄▄           ▄▄█ ▄  █  █ █ █▀▄ █ █▄▄ █▄▄ █▄▄ █▀▄

                                               █▄   ▀█▀ █▀▄ █ █ ██▀   ▄▀▀ █▀▄ █ █▄ ▄█ ██▀           █▄   █▄█ ▄▀▄ █▀▄ █▀▄ ▄▀▄ █▀▄
                                                █ ▄  █  █▀▄ ▀▄█ █▄▄   ▀▄▄ █▀▄ █ █ ▀ █ █▄▄           ▄█ ▄ █ █ ▀▄▀ █▀▄ █▀▄ ▀▄▀ █▀▄
                                                
                                                6.BILLING           7.ABOUT BOOKS GENRE            8.EXIT
                                                
                                                
                        ********************************************************************************************************************************************************
                            
                                            """);
                System.out.print("Enter you genre by number:");
                int genreChoice = sc.nextInt();
                System.out.println(" \n\n\n\n");
                if (genreChoice == 1) {
                    Project2.fiction();
                } else if (genreChoice == 2) {
                    Project2.novel();
                } else if (genreChoice == 3) {
                    Project2.thriller();
                } else if (genreChoice == 4) {
                    Project2.crime();
                } else if (genreChoice == 5) {
                    Project2.horror();
                } else if (genreChoice == 6) {
                    Project2.billing();
                    break;
                } else if (genreChoice == 7) {
                    Project2.aboutGenre();
                } else if (genreChoice == 8) {
                    Project2.exit();
                    break;
                } else {
                    System.out.println("NOT THIS GENRE");
                    System.out.println("Invalid Choice");
                }
            }
        } else {
            Project2.exit();
        }
    }
}



