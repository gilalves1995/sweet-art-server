package main.utils;

import main.model.*;

public class StaticDB {

    public static void addUsers(UserRepository repository) {
        repository.save(new User("VincentVanGogh@art.com","vangogh",true,"","",""));
        repository.save(new User("LeonardoDaVinci@art.com","davinci",true,"LeoDaVinci","912345678","Male"));
        repository.save(new User("PabloPicasso@art.com","picasso",true,"","",""));
        repository.save(new User("MiguelAngelo@art.com","miguelangelo",true,"","",""));
        repository.save(new User("ClaudeMonet@art.com","monet",true,"","",""));
        repository.save(new User("SalvadorDali@art.com","dali",true,"","",""));
        repository.save(new User("GilAlves@user.com","gil",false,"","",""));
        repository.save(new User("MiguelPereira@user.com","miguel",false,"","",""));
        repository.save(new User("JoaoDias@user.com","joao",false,"","",""));
        repository.save(new User("MichaelSilva@user.com","michael",false,"","",""));
        repository.save(new User("BrunoFernandes@user.com","bruno",false,"","",""));
        repository.save(new User("EdvardMunch@art.com","munch",true,"","",""));
        repository.save(new User("miguel.alp15@gmail.com","pass",true,"","",""));
        repository.save(new User("gilc.hermen.10@gmail.com","pass",false,"Gilzinho","012345678","Female"));
        repository.save(new User("someone@gmail","pass",true,"","",""));
        repository.save(new User("someone2@gmail","pass",false,"","",""));
    }


    public static void addArtPieces(ArtPieceRepository repository) {
        repository.save(new ArtPiece(1, "A Noite Estrelada", 1889, 136100000, "Materiais: Lona, Tinta a Óleo. Descrição: A Noite Estrelada é uma pintura de Vincent van Gogh de 1889.", null, "VincentVanGogh@art.com", "Available to sale", false, 0, "https://i.kinja-img.com/gawker-media/image/upload/s--jUIvpvke--/c_fill,fl_progressive,g_center,h_450,q_80,w_800/p3e4iimfxckmnaiec30m.jpg"));
        repository.save(new ArtPiece(2, "Lírios", 1889, 102300000, "Materiais: Lona, Tinta a Óleo.", null, "VincentVanGogh@art.com", "Available to sale", false, 0, "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Irises-Vincent_van_Gogh.jpg/1280px-Irises-Vincent_van_Gogh.jpg"));
        repository.save(new ArtPiece(3, "Os Comedores de Batata", 1885, -1, "Materiais: Tinta a Óleo. Descrição: Os comedores de batata é um quadro do pintor Vincent van Gogh.", null, "VincentVanGogh@art.com", "Not available to sale", false, 0, "http://c10.quickcachr.fotos.sapo.pt/i/Gee15e980/16235330_ofFV2.jpeg"));
        repository.save(new ArtPiece(4, "Quarto em Arles", 1885, -1, "Materiais: Lona, Tinta a Óleo.", null, "VincentVanGogh@art.com", "Not available to sale", false, 0, "https://slm-assets0.secondlife.com/assets/996379/lightbox/b1adef84524db139f64b6e43bcacab7b.jpg?1277178687"));
        repository.save(new ArtPiece(5, "Terraço do Cafe na Praça do Fórum", 1888, 946000001, "Materiais: Tinta a Óleo. Descrição: Terraço do Café à Noite, cujo nome completo é O Terraço do Café na Place du Forum", null, "VincentVanGogh@art.com", "Available to sale", false, 0,"http://dasartes.com.br/wp-content/uploads/2014/10/ed-07-dez-2009-terraco-do-cafe-a-noite-1000x770.jpg"));
        repository.save(new ArtPiece(6, "Mona Lisa", 1503, 200000000, "Materiais: Tinta a Óleo. Descrição: Mona Lisa também conhecida como A Gioconda.", null, "LeonardoDaVinci@art.com", "Available to sale", false, 0, "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Mona_Lisa%2C_by_Leonardo_da_Vinci%2C_from_C2RMF_retouched.jpg/1200px-Mona_Lisa%2C_by_Leonardo_da_Vinci%2C_from_C2RMF_retouched.jpg"));
        repository.save(new ArtPiece(7, "A Última Ceia", 1498, -1, "Materiais: Têmpera, Mástique, Breu, Levkas. Descrição: A Última Ceia é um afresco de Leonardo da Vinci.", null, "LeonardoDaVinci@art.com", "Not available to sale", false, 0, "https://www.infoescola.com/wp-content/uploads/2012/03/santa-ceia.jpg"));
        repository.save(new ArtPiece(8, "A Anunciação", 1472, -1, "Materiais: Têmpera, Tinta a óleo. Descrição: A Anunciação, ou L’annunciazione, em italiano.", null, "LeonardoDaVinci@art.com", "Not available to sale", false, 0, "https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/Leonardo_da_Vinci_-_Annunciazione_-_Google_Art_Project.jpg/1200px-Leonardo_da_Vinci_-_Annunciazione_-_Google_Art_Project.jpg"));
        repository.save(new ArtPiece(9, "Homem Vitruviano", 1490, -1, "Materiais: Tinta. Descrição: Homem vitruviano é um conceito apresentado na obra Os dez livros da Arquitetura.", null, "LeonardoDaVinci@art.com", "Not available to sale", false, 0, "http://www.sitedecuriosidades.com/im/g/27D63.gif" ));
        repository.save(new ArtPiece(10, "Autorretrato", 1512, -1, "Materiais: Giz.", null, "LeonardoDaVinci@art.com", "Available to sale", false, 0, "http://westerncivart.com/archive/fullsize/4006d9c5d07511ce37db4593b97ef712.jpg"));
        repository.save(new ArtPiece(11, "Guernica", 1937, -1, "Materiais: Tinta a óleo. Descrição: Com 349 cm de altura por 776,5 cm de comprimento.", null, "PabloPicasso@art.com", "Not available to sale", false, 0, "https://www.infoescola.com/wp-content/uploads/2009/08/guernica.jpg"));
        repository.save(new ArtPiece(12, "Les demoiselles d'Avignon", 1907, 1189000001, "Materiais: Tinta a óleo. Descrição: Les Demoiselles d'Avignon é um quadro do pintor espanhol Pablo Picasso feito em 1907.", null, "PabloPicasso@art.com", "Available to sale", false, 0, "http://www.nhstechnology.org/wp-content/uploads/2016/09/Les-Demoiselles-dAvignon.jpg" ));
        repository.save(new ArtPiece(13, "Vieux guitariste aveugle", 1904, -1, "Materiais: Tinta a óleo. Descrição: Vieux guitariste aveugle é uma pintura do espanhol Pablo Picasso.", null, "PabloPicasso@art.com", "Not available to sale", false, 0, "http://www.nhstechnology.org/wp-content/uploads/2016/09/Les-Demoiselles-dAvignon.jpg"));
        repository.save(new ArtPiece(14, "A Mulher que Chora", 1937, 1018000001, "Materiais: Tinta a óleo.", null, "PabloPicasso@art.com", "Available to sale", false, 0, "https://www.historiadasartes.com/wp-content/uploads/2016/06/m_PicassoMulherChorandoDestaca-560x450.jpg" ));
        repository.save(new ArtPiece(15, "Three Musicians", 1921, -1, "Materiais: Tinta a óleo. Descrição: Three Musicians é o título de duas colagens e pinturas a óleo similares.", null, "PabloPicasso@art.com", "Not available to sale", false, 0, "https://www.libertypuzzles.com/userfiles/media/images/4955/three-musicians-image-1300.jpg" ));
        repository.save(new ArtPiece(16, "Teto da Capela Sistina", 1512, -1, "Materiais: Ouro, Reboco. Descrição: O teto da Capela Sistina é constituído por um extenso afresco.", null, "MiguelAngelo@art.com", "Not available to sale", false, 0, "https://3.bp.blogspot.com/-3R8TI46WbHM/VY1ptwMsQvI/AAAAAAAAHiY/6UwIl0UZs1k/s1600/capela_sistina1.jpeg" ));
        repository.save(new ArtPiece(17, "Juízo Final", 1541, -1, "Materiais: Tinta, Reboco. Descrição: O Dia do Juízo Final é um fresco do pintor renascentista italiano Michelangelo Buonarroti.", null, "MiguelAngelo@art.com", "Not available to sale", false, 0, "https://www.infoescola.com/wp-content/uploads/2012/05/juizo-final.jpg" ));
        repository.save(new ArtPiece(18, "Pietà", 1499, -1, "Materiais: Mármore. Descrição: A Pietà de Michelangelo é talvez a pietà mais conhecida e uma das mais famosas esculturas.", null, "MiguelAngelo@art.com", "Not available to sale", false, 0, "https://unalucciola.files.wordpress.com/2017/03/762.jpg"));
        repository.save(new ArtPiece(19, "David", 1504, -1, "Materiais: Mármore de Carrara. Descrição: David ou Davi é uma das esculturas mais famosas do artista renascentista Michelangelo.", null, "MiguelAngelo@art.com", "Not available to sale", false, 0,"https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/%27David%27_by_Michelangelo_JBU0001.JPG/1200px-%27David%27_by_Michelangelo_JBU0001.JPG" ));
        repository.save(new ArtPiece(20, "A Criação de Adão", 1511, -1, "Materiais: Tinta, Reboco. Descrição: A Criação de Adão é um afresco de 280 cm x 570 cm.", null, "MiguelAngelo@art.com", "Not available to sale", false, 0,"https://diocesan.com/shop/wp-content/uploads/2016/12/God2-Sistine_Chapel-1000x466.png" ));
        repository.save(new ArtPiece(21, "Banhistas na Grenouillière", 1869, -1, "Materiais: Tinta a óleo. Descrição: Banhistas na Grenouillière é um célebre óleo sobre tela.", null, "ClaudeMonet@art.com", "Not available to sale", false, 0,"https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/La_Grenouill%C3%A8re_MET_DT833.jpg/1280px-La_Grenouill%C3%A8re_MET_DT833.jpg" ));
        repository.save(new ArtPiece(22, "Impressão, nascer do sol", 1872, -1, "Materiais: Tinta a óleo.", null, "ClaudeMonet@art.com", "Not available to sale", false, 0,"https://segredosdeviagem.com.br/wp-content/uploads/2013/05/foto-3.jpg" ));
        repository.save(new ArtPiece(23, "Mulher com sombrinha", 1875, -1, "Materiais: Tinta a óleo.", null, "ClaudeMonet@art.com", "Not available to sale", false, 0,"http://warburg.chaa-unicamp.com.br/img/obras/1argen7-1.jpg" ));
        repository.save(new ArtPiece(24, "A Pega", 1869, -1, "Materiais: Lona, Tinta a óleo.", null, "ClaudeMonet@art.com", "Not available to sale", false, 0,"https://i.ytimg.com/vi/TGLqcGQU7ec/maxresdefault.jpg" ));
        repository.save(new ArtPiece(25, "Campo de Papoulas", 1873, -1, "Materiais: Lona, Tinta a óleo.", null, "ClaudeMonet@art.com", "Not available to sale", false, 0,"https://media.overstockart.com/optimized/cache/data/product_images/MON578-1000x1000.jpg" ));
        repository.save(new ArtPiece(26, "A Persistência da Memória", 1931, -1, "Materiais: Bronze, Tinta a óleo. Descrição: A Persistência da Memória é uma pintura de 1931 de Salvador Dalí.", null, "SalvadorDali@art.com", "Not available to sale", false, 0,"http://noticias.universia.com.br/net/images/cultura/p/pe/per/persistencia-da-memoria-salvador-dali-wallpaper.jpg" ));
        repository.save(new ArtPiece(27, "Girafa em Chamas", 1937, -1, "Materiais: Panel, Tinta a óleo. Descrição: Girafa em Chamas pertence ao pintor espanhol Salvador Dalí.", null, "SalvadorDali@art.com", "Not available to sale", false, 0,"http://www.jayrus.art.br/Salvador_Dali_Girafa_em_chamas.jpg" ));
        repository.save(new ArtPiece(28, "Sonho Causado Pelo Voo de uma Abelha ao Redor de Uma Romã um Segundo Antes de Acordar", 1944, -1, "Materiais: Tinta a óleo. Descrição: É é uma pintura surrealista.", null, "SalvadorDali@art.com", "Not available to sale", false, 0,"https://i2.wp.com/virusdaarte.net/wp-content/uploads/2014/05/dalitig.png" ));
        repository.save(new ArtPiece(29, "O Grande Masturbador", 1929, -1, "Materiais: Tinta a óleo. Descrição: O Grande Masturbador é um óleo sobre tela de Salvador Dalí.", null, "SalvadorDali@art.com", "Not available to sale", false, 0,"https://ae01.alicdn.com/kf/HTB1I3jaKVXXXXapaXXXq6xXFXXXu/World-Famous-Dream-Minimalism-Surrealism-Art-Movie-Vintage-Retro-Decorative-Poster-DIY-Wall-Home-Bar-Posters.jpg_640x640.jpg" ));
        repository.save(new ArtPiece(30, "Cristo de São João da Cruz", 1951, 80000000, "Materiais: Tinta a óleo. Descrição: Cristo de São João da Cruz é uma pintura do espanhol Salvador Dalí executada em 1951.", null, "SalvadorDali@art.com", "Available to sale", false, 0,"https://upload.wikimedia.org/wikipedia/pt/thumb/4/46/Cristo_sao_joao_da_cruz.jpg/250px-Cristo_sao_joao_da_cruz.jpg" ));
        repository.save(new ArtPiece(31, "O Grito", 1893, 119900000, "Materiais: Óleo sobre tela, Têmpera e Pastel sobre cartão.", null, "EdvardMunch@art.com", "Available to sale", false, 0,"https://www.edvardmunch.org/images/paintings/the-scream.jpg" ));
        repository.save(new ArtPiece(32, "Amor e Dor", 1895, 30900000, "Materiais: Tinta a óleo. Descrição: Amor e Dor é um quadro pintado por Edvard Munch entre 1893 e 1894.", null, "EdvardMunch@art.com", "Available to sale", false, 0,"http://issocompensa.com/wp-content/uploads/2011/07/munch_vampire-1.jpg" ));
        repository.save(new ArtPiece(33, "Ansiedade", 1894, -1, "", null, "EdvardMunch@art.com", "Available to sale", false, 0, "https://2.bp.blogspot.com/-z_raXNKwoYc/VbEvzX04XxI/AAAAAAAAG8g/c_PO0Gx3I7I/s400/Ansiedade%2Bde%2BMunch.jpg" ));
    }

    public static void addImages(ImageRepository images) {
        images.save(new Image("https://i.kinja-img.com/gawker-media/image/upload/s--jUIvpvke--/c_fill,fl_progressive,g_center,h_450,q_80,w_800/p3e4iimfxckmnaiec30m.jpg", 1));
        images.save(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Irises-Vincent_van_Gogh.jpg/1280px-Irises-Vincent_van_Gogh.jpg", 2));
        images.save(new Image("http://c10.quickcachr.fotos.sapo.pt/i/Gee15e980/16235330_ofFV2.jpeg", 3));
        images.save(new Image("https://slm-assets0.secondlife.com/assets/996379/lightbox/b1adef84524db139f64b6e43bcacab7b.jpg?1277178687", 4));
        images.save(new Image("http://dasartes.com.br/wp-content/uploads/2014/10/ed-07-dez-2009-terraco-do-cafe-a-noite-1000x770.jpg", 5));
        images.save(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Mona_Lisa%2C_by_Leonardo_da_Vinci%2C_from_C2RMF_retouched.jpg/1200px-Mona_Lisa%2C_by_Leonardo_da_Vinci%2C_from_C2RMF_retouched.jpg", 6));
        images.save(new Image("https://www.infoescola.com/wp-content/uploads/2012/03/santa-ceia.jpg", 7));
        images.save(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/Leonardo_da_Vinci_-_Annunciazione_-_Google_Art_Project.jpg/1200px-Leonardo_da_Vinci_-_Annunciazione_-_Google_Art_Project.jpg", 8));
        images.save(new Image("http://www.sitedecuriosidades.com/im/g/27D63.gif", 9));
        images.save(new Image("http://westerncivart.com/archive/fullsize/4006d9c5d07511ce37db4593b97ef712.jpg", 10));
        images.save(new Image("https://www.infoescola.com/wp-content/uploads/2009/08/guernica.jpg", 11));
        images.save(new Image("http://www.nhstechnology.org/wp-content/uploads/2016/09/Les-Demoiselles-dAvignon.jpg", 12));
        images.save(new Image("http://www.nhstechnology.org/wp-content/uploads/2016/09/Les-Demoiselles-dAvignon.jpg", 13));
        images.save(new Image("https://www.historiadasartes.com/wp-content/uploads/2016/06/m_PicassoMulherChorandoDestaca-560x450.jpg", 14));
        images.save(new Image("https://www.libertypuzzles.com/userfiles/media/images/4955/three-musicians-image-1300.jpg", 15));
        images.save(new Image("https://3.bp.blogspot.com/-3R8TI46WbHM/VY1ptwMsQvI/AAAAAAAAHiY/6UwIl0UZs1k/s1600/capela_sistina1.jpeg", 16));
        images.save(new Image("https://www.infoescola.com/wp-content/uploads/2012/05/juizo-final.jpg", 17));
        images.save(new Image("https://unalucciola.files.wordpress.com/2017/03/762.jpg", 18));
        images.save(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/%27David%27_by_Michelangelo_JBU0001.JPG/1200px-%27David%27_by_Michelangelo_JBU0001.JPG", 19));
        images.save(new Image("https://diocesan.com/shop/wp-content/uploads/2016/12/God2-Sistine_Chapel-1000x466.png", 20));
        images.save(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/La_Grenouill%C3%A8re_MET_DT833.jpg/1280px-La_Grenouill%C3%A8re_MET_DT833.jpg", 21));
        images.save(new Image( "https://lh6.googleusercontent.com/proxy/VTXiHJWhablY2ObE0frgPJwUaS0s9GuOgxuaNTFnHFciStmLYIjW57LgeHUslctl6RUqiVeTYd4zoKKqcPnx1NcgXePsffmpPUHUKCAFgHpH_K6YZ4FE1-3ySTVj89yhSC1Cbl4a_HyIfWB7se1tdttbD", 22));
        images.save(new Image( "http://warburg.chaa-unicamp.com.br/img/obras/1argen7-1.jpg", 23));
        images.save(new Image( "https://i.ytimg.com/vi/TGLqcGQU7ec/maxresdefault.jpg", 24));
        images.save(new Image( "https://media.overstockart.com/optimized/cache/data/product_images/MON578-1000x1000.jpg", 25));
        images.save(new Image( "http://noticias.universia.com.br/net/images/cultura/p/pe/per/persistencia-da-memoria-salvador-dali-wallpaper.jpg", 26));
        images.save(new Image( "http://www.jayrus.art.br/Salvador_Dali_Girafa_em_chamas.jpg", 27));
        images.save(new Image( "http://www.virtualdali.com/assets/paintings/44DreamCaused.jpg", 28));
        images.save(new Image( "https://ae01.alicdn.com/kf/HTB1I3jaKVXXXXapaXXXq6xXFXXXu/World-Famous-Dream-Minimalism-Surrealism-Art-Movie-Vintage-Retro-Decorative-Poster-DIY-Wall-Home-Bar-Posters.jpg_640x640.jpg", 29));
        images.save(new Image( "https://upload.wikimedia.org/wikipedia/pt/thumb/4/46/Cristo_sao_joao_da_cruz.jpg/250px-Cristo_sao_joao_da_cruz.jpg", 30));
        images.save(new Image( "https://www.edvardmunch.org/images/paintings/the-scream.jpg", 31));
        images.save(new Image( "http://issocompensa.com/wp-content/uploads/2011/07/munch_vampire-1.jpg", 32));
        images.save(new Image( "https://2.bp.blogspot.com/-z_raXNKwoYc/VbEvzX04XxI/AAAAAAAAG8g/c_PO0Gx3I7I/s400/Ansiedade%2Bde%2BMunch.jpg", 33));
    }

    public static void addKeywords (KeywordRepository repository) {
        repository.save(new Keyword("vanGogh",1));
        repository.save(new Keyword("noite",1));
        repository.save(new Keyword("estrelas",1));
        repository.save(new Keyword("pintura",1));
        repository.save(new Keyword("arteModerna",1));
        repository.save(new Keyword("pós-Impressionismo",1));
        repository.save(new Keyword("lona",1));
        repository.save(new Keyword("óleo",1));
        repository.save(new Keyword("vanGogh",2));
        repository.save(new Keyword("flores",2));
        repository.save(new Keyword("verde",2));
        repository.save(new Keyword("pintura",2));
        repository.save(new Keyword("arteModerna",2));
        repository.save(new Keyword("pós-Impressionismo",2));
        repository.save(new Keyword("lona",2));
        repository.save(new Keyword("óleo",2));
        repository.save(new Keyword("vanGogh",3));
        repository.save(new Keyword("noite",3));
        repository.save(new Keyword("batatas",3));
        repository.save(new Keyword("pessoas",3));
        repository.save(new Keyword("pintura",3));
        repository.save(new Keyword("arteModerna",3));
        repository.save(new Keyword("realismo",3));
        repository.save(new Keyword("óleo",3));
        repository.save(new Keyword("vanGogh",4));
        repository.save(new Keyword("quarto",4));
        repository.save(new Keyword("cama",4));
        repository.save(new Keyword("janela",4));
        repository.save(new Keyword("pintura",4));
        repository.save(new Keyword("pós-Impressionismo",4));
        repository.save(new Keyword("lona",4));
        repository.save(new Keyword("óleo",4));
        repository.save(new Keyword("vanGogh",5));
        repository.save(new Keyword("noite",5));
        repository.save(new Keyword("café",5));
        repository.save(new Keyword("luz",5));
        repository.save(new Keyword("pintura",5));
        repository.save(new Keyword("pós-Impressionismo",5));
        repository.save(new Keyword("praça",5));
        repository.save(new Keyword("óleo",5));
        repository.save(new Keyword("daVinci",6));
        repository.save(new Keyword("mulher",6));
        repository.save(new Keyword("retrato",6));
        repository.save(new Keyword("beleza",6));
        repository.save(new Keyword("renascimento",6));
        repository.save(new Keyword("óleo",6));
        repository.save(new Keyword("daVinci",7));
        repository.save(new Keyword("jesus",7));
        repository.save(new Keyword("ceia",7));
        repository.save(new Keyword("igreja",7));
        repository.save(new Keyword("pintura",7));
        repository.save(new Keyword("têmpera",7));
        repository.save(new Keyword("mástique",7));
        repository.save(new Keyword("breu",7));
        repository.save(new Keyword("levkas",7));
        repository.save(new Keyword("renascimento",7));
        repository.save(new Keyword("daVinci",8));
        repository.save(new Keyword("anunciação",8));
        repository.save(new Keyword("anjo",8));
        repository.save(new Keyword("maria",8));
        repository.save(new Keyword("pintura",8));
        repository.save(new Keyword("têmpera",8));
        repository.save(new Keyword("renascimento",8));
        repository.save(new Keyword("óleo",8));
        repository.save(new Keyword("daVinci",9));
        repository.save(new Keyword("homem",9));
        repository.save(new Keyword("nudez",9));
        repository.save(new Keyword("janela",9));
        repository.save(new Keyword("abstracto",9));
        repository.save(new Keyword("pintura",9));
        repository.save(new Keyword("tinta",9));
        repository.save(new Keyword("vitruvio",9));
        repository.save(new Keyword("renascimento",9));
        repository.save(new Keyword("daVinci",10));
        repository.save(new Keyword("homem",10));
        repository.save(new Keyword("retrato",10));
        repository.save(new Keyword("giz",10));
        repository.save(new Keyword("renascimento",10));
        repository.save(new Keyword("picasso",11));
        repository.save(new Keyword("guerra",11));
        repository.save(new Keyword("cinzento",11));
        repository.save(new Keyword("narrativa",11));
        repository.save(new Keyword("pintura",11));
        repository.save(new Keyword("surrealismo",11));
        repository.save(new Keyword("óleo",11));
        repository.save(new Keyword("picasso",12));
        repository.save(new Keyword("mulheres",12));
        repository.save(new Keyword("cama",12));
        repository.save(new Keyword("corpos",12));
        repository.save(new Keyword("pintura",12));
        repository.save(new Keyword("cubismo",12));
        repository.save(new Keyword("óleo",12));
        repository.save(new Keyword("picasso",13));
        repository.save(new Keyword("guitarra",13));
        repository.save(new Keyword("velho",13));
        repository.save(new Keyword("histórica",13));
        repository.save(new Keyword("pintura",13));
        repository.save(new Keyword("períodoAzul",13));
        repository.save(new Keyword("expressionismo",13));
        repository.save(new Keyword("óleo",13));
        repository.save(new Keyword("picasso",14));
        repository.save(new Keyword("mulher",14));
        repository.save(new Keyword("chorar",14));
        repository.save(new Keyword("pintura",14));
        repository.save(new Keyword("sofrimento",14));
        repository.save(new Keyword("cubismo",14));
        repository.save(new Keyword("óleo",14));
        repository.save(new Keyword("picasso",15));
        repository.save(new Keyword("homem",15));
        repository.save(new Keyword("música",15));
        repository.save(new Keyword("pessoas",15));
        repository.save(new Keyword("pintura",15));
        repository.save(new Keyword("cubismo",15));
        repository.save(new Keyword("sintético",15));
        repository.save(new Keyword("óleo",15));
        repository.save(new Keyword("michaelangelo",16));
        repository.save(new Keyword("capela",16));
        repository.save(new Keyword("igreja",16));
        repository.save(new Keyword("vaticano",16));
        repository.save(new Keyword("pintura",16));
        repository.save(new Keyword("ouro",16));
        repository.save(new Keyword("reboco",16));
        repository.save(new Keyword("renascimento",16));
        repository.save(new Keyword("michaelangelo",17));
        repository.save(new Keyword("capela",17));
        repository.save(new Keyword("altar",17));
        repository.save(new Keyword("vaticano",17));
        repository.save(new Keyword("pintura",17));
        repository.save(new Keyword("tinta",17));
        repository.save(new Keyword("reboco",17));
        repository.save(new Keyword("renascimento",17));
        repository.save(new Keyword("michaelangelo",18));
        repository.save(new Keyword("maria",18));
        repository.save(new Keyword("jesus",18));
        repository.save(new Keyword("vaticano",18));
        repository.save(new Keyword("escultura",18));
        repository.save(new Keyword("mármore",18));
        repository.save(new Keyword("renascimento",18));
        repository.save(new Keyword("michaelangelo",19));
        repository.save(new Keyword("david",19));
        repository.save(new Keyword("homem",19));
        repository.save(new Keyword("escultura",19));
        repository.save(new Keyword("carrara",19));
        repository.save(new Keyword("mármore",19));
        repository.save(new Keyword("renascimento",19));
        repository.save(new Keyword("michaelangelo",20));
        repository.save(new Keyword("criação",20));
        repository.save(new Keyword("homem",20));
        repository.save(new Keyword("capela",20));
        repository.save(new Keyword("deus",20));
        repository.save(new Keyword("pintura",20));
        repository.save(new Keyword("tinta",20));
        repository.save(new Keyword("reboco",20));
        repository.save(new Keyword("renascimento",20));
        repository.save(new Keyword("monet",21));
        repository.save(new Keyword("praia",21));
        repository.save(new Keyword("água",21));
        repository.save(new Keyword("árvores",21));
        repository.save(new Keyword("banhistas",21));
        repository.save(new Keyword("pintura",21));
        repository.save(new Keyword("óleo",21));
        repository.save(new Keyword("histórica",21));
        repository.save(new Keyword("monet",22));
        repository.save(new Keyword("rio",22));
        repository.save(new Keyword("sol",22));
        repository.save(new Keyword("barcos",22));
        repository.save(new Keyword("pintura",22));
        repository.save(new Keyword("óleo",22));
        repository.save(new Keyword("impressionismo",22));
        repository.save(new Keyword("monet",23));
        repository.save(new Keyword("mulher",23));
        repository.save(new Keyword("chapéu",23));
        repository.save(new Keyword("criança",23));
        repository.save(new Keyword("lona",23));
        repository.save(new Keyword("pintura",23));
        repository.save(new Keyword("óleo",23));
        repository.save(new Keyword("histórica",23));
        repository.save(new Keyword("monet",24));
        repository.save(new Keyword("pastoral",24));
        repository.save(new Keyword("neve",24));
        repository.save(new Keyword("lona",24));
        repository.save(new Keyword("arteModerna",24));
        repository.save(new Keyword("pintura",24));
        repository.save(new Keyword("óleo",24));
        repository.save(new Keyword("histórica",24));
        repository.save(new Keyword("monet",25));
        repository.save(new Keyword("céu",25));
        repository.save(new Keyword("flores",25));
        repository.save(new Keyword("campo",25));
        repository.save(new Keyword("lona",25));
        repository.save(new Keyword("impressionismo",25));
        repository.save(new Keyword("pintura",25));
        repository.save(new Keyword("óleo",25));
        repository.save(new Keyword("histórica",25));
        repository.save(new Keyword("arteModerna",25));
        repository.save(new Keyword("dali",26));
        repository.save(new Keyword("alegoria",26));
        repository.save(new Keyword("tempo",26));
        repository.save(new Keyword("relógios",26));
        repository.save(new Keyword("bronze",26));
        repository.save(new Keyword("pintura",26));
        repository.save(new Keyword("óleo",26));
        repository.save(new Keyword("vanguarda",26));
        repository.save(new Keyword("surrealismo",26));
        repository.save(new Keyword("dali",27));
        repository.save(new Keyword("girafa",27));
        repository.save(new Keyword("mulher",27));
        repository.save(new Keyword("chamas",27));
        repository.save(new Keyword("panel",27));
        repository.save(new Keyword("pintura",27));
        repository.save(new Keyword("óleo",27));
        repository.save(new Keyword("surrealismo",27));
        repository.save(new Keyword("dali",28));
        repository.save(new Keyword("mulher",28));
        repository.save(new Keyword("tigre",28));
        repository.save(new Keyword("peixe",28));
        repository.save(new Keyword("elefante",28));
        repository.save(new Keyword("pintura",28));
        repository.save(new Keyword("óleo",28));
        repository.save(new Keyword("surrealismo",28));
        repository.save(new Keyword("dali",29));
        repository.save(new Keyword("mulher",29));
        repository.save(new Keyword("grande",29));
        repository.save(new Keyword("relógios",29));
        repository.save(new Keyword("pintura",29));
        repository.save(new Keyword("óleo",29));
        repository.save(new Keyword("surrealismo",29));
        repository.save(new Keyword("dali",30));
        repository.save(new Keyword("cruz",30));
        repository.save(new Keyword("jesus",30));
        repository.save(new Keyword("cristão",30));
        repository.save(new Keyword("pintura",30));
        repository.save(new Keyword("óleo",30));
        repository.save(new Keyword("surrealismo",30));
        repository.save(new Keyword("munch",31));
        repository.save(new Keyword("sol",31));
        repository.save(new Keyword("grito",31));
        repository.save(new Keyword("homem",31));
        repository.save(new Keyword("ponte",31));
        repository.save(new Keyword("pintura",31));
        repository.save(new Keyword("óleo",31));
        repository.save(new Keyword("têmpera",31));
        repository.save(new Keyword("pastel",31));
        repository.save(new Keyword("cartão",31));
        repository.save(new Keyword("munch",32));
        repository.save(new Keyword("mulher",32));
        repository.save(new Keyword("amor",32));
        repository.save(new Keyword("dor",32));
        repository.save(new Keyword("vampiro",32));
        repository.save(new Keyword("pintura",32));
        repository.save(new Keyword("óleo",32));
        repository.save(new Keyword("expressionismo",32));
        repository.save(new Keyword("arteModerna",32));
        repository.save(new Keyword("simbolismo",32));
        repository.save(new Keyword("munch",33));
        repository.save(new Keyword("mulher",33));
        repository.save(new Keyword("homem",33));
        repository.save(new Keyword("ansiedade",33));
        repository.save(new Keyword("pintura",33));
        repository.save(new Keyword("expressionismo",33));
        repository.save(new Keyword("arteModerna",33));
        repository.save(new Keyword("simbolismo",33));
        repository.save(new Keyword("beautiful",34));
    }
}
