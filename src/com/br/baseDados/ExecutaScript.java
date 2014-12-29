package com.br.baseDados;

public class ExecutaScript {
	public ExecutaScript() {

	}


	
	public String[] insertComentario(){
		return new String[] {"INSERT INTO COMENTARIO VALUES (1,'KLT Empregos','R.drawble.ic_user','03/11/14','Hoje, dia 03/11, dezenas de pessoas que passaram pela seleção de Assistente de Depósito na KLT, iniciaram seu primeiro dia de trabalho no CD E-Commerce da CENTAURO em Jarinu!!!');",
				"INSERT INTO COMENTARIO VALUES (2,'MV Móveis','R.drawble.mvmoveis','23/10/14','" +
				"Convocamos todos para uma Mega Liquidação de Móveis nesta próxima Quinta-Feira dia 20/11 na MV - Móveis . Corram e Aproveitem !!! !!');",
				"INSERT INTO COMENTARIO VALUES (3,'Renato Augusto','','10/10/14','No próximo sábado (15-11), às 20:30 horas, tem cinema na praça com o filme Frozen. A sessão é grátis e ainda tem distribuição gratuita de pipoca e refrigerante!!');",
				"INSERT INTO COMENTARIO VALUES (4,'Luana Campos','','09/10/14','BAZAR SOLIDÁRIO MMARTAN EM JARINU !!!" +
"Será no fim de semana de 31/10 e 01/11 – Sexta das 13h às 18hs e Sábado das 09h às 16 hs, com parte da renda destinada a APAE. Tudo em até 8 vezes sem juros no cartão de crédito. !!');",
				"INSERT INTO COMENTARIO VALUES (5,'Prefeitura','','04/10/14','COORDENADORIA DO TRABALHO informa:"+
"Entrevista dia 15/10/2014 - 14:00 "+
"assistente de depósito (ambos os sexos) "+
"comparecer no prédio do Terminal Rodoviário munidos de Documentos Pessoais e Currículo."+
"Informações (11) 4016-2037!!');",
				"INSERT INTO COMENTARIO VALUES (6,'Prefeitura Jarinu','R.drawble.opcao','23/09/14','População de Jarinu! Segue informativo sobre a nova Unidade Mista de Saúde. Foram quase 10 anos de espera, mas a partir das 19h desta quarta-feira, as portas da nova Unidade Mista de Saúde <Monsenhor Jacob Conti> serão abertas e não vão mais fechar. ');"
				
		};
	}
	
	public String[] insertAnuncio(){
		return new String[] {
	            
				// PIZZARIAS 
				"INSERT INTO ANUNCIO VALUES " +"(1,'1','PIZZARIA BELLA BARI','(11) 4016-5601','(11) 4417-7300','(11) 998090210','Rua Lorencini 574','exemplo@exemplo.com','http://facebook.com','0','http://goo.gl/eFvBc0','http://desagil.com.br','anuncio','A Melhor Pizzaria da Região');",
				"INSERT INTO ANUNCIO VALUES " +"(2,'1','ESTAÇÃO GOURMERT','(11) 4016-2042','','','','','','0','http://goo.gl/eFvBc0','http://desagil.com.br','anuncio','A Melhor Pizzaria da Região');",
				"INSERT INTO ANUNCIO VALUES " +"(3,'1','PIZZARIA DA CIDA','(11) 4016-3345','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(4,'1','PIZZARIA VIDA MANSA','(11) 4016-4573','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(5,'1','PIZZARIA 2 IRMÃOS','(11) 4016-1853','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(6,'1','PIZZARIA CASA NOSTRA','(11) 4016-3230','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(7,'1','PIZZARIA BAR','(11) 4016-3230','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(8,'1','PIZZARIA PEKAS','(11) 4038-2099','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(9,'1','PIZZARIA JCS OLIVEIRA','(11) 4812-2937','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(10,'1','PIZZARIA CAMPO LIMPO','(11) 4038-4999','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(11,'1','PIZZARIA BELEZA PURA','(11) 4038-4525','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(12,'1','PIZZARIA SAN MATEO','(11) 4016-3230','','','','','','0','','','','');",
				
				
				// LOJAS
				"INSERT INTO ANUNCIO VALUES " +"(299,'2','RENATOs FLORES','(11) 4016-1901','','','Av. Ernesto de Moraes, Jarinu SP (Em frente ao Supermercado Catroque)','','','1','https://goo.gl/maps/PNQad','','anuncio','Arranjos Florais, Cestas, Cachepos, Vasos, Presentes. Venha nos fazer uma visita ! Otimos Preços todos os dias.');",
				"INSERT INTO ANUNCIO VALUES " +"(303,'2','MV MÓVEIS','(11) 96064-0977','(11) 97095-1470','(11) 96473-0282','Rua Goar Lorencini, 157 - Centro / Jarinu SP','mvmoveisleiloes@hotmail.com','mvmoveiseestofados','1','https://goo.gl/maps/WTg1O','','anuncio','Movéis e Estofados, Sofás, Gazebos, Iluminação e Decoração, Mesas e Muito mais. Venha Nos Visitar e conferir nossas variedades. ');",
				"INSERT INTO ANUNCIO VALUES " +"(300,'2','JARINU GAMES','(11) 4016-5866','','','Rua João Pessoa , 80 Centro - Jarinu (Ao lado do Moura)','jarinugameslanhouse@hotmail.com','jarinuGames','1','https://goo.gl/maps/vPr9J','','anuncio','Vendas e Consertos de : Video Games, Computadores, Jogos, Impressoras, Tablets, Celulares, Dvds e Desbloqueio e Instalação de Softwares em Celulares.');",
				"INSERT INTO ANUNCIO VALUES " +"(302,'2','FLORA MANACA','(11) 97401-2787','98129-8613','99558-8490','Av. Angelo Bernucci, 51 Centro Jarinu','elizeu@floramanaca.com.br','flora.manaca','1','https://goo.gl/maps/qGkv2','www.floramanaca.com.br','anuncio','Agora em Jarinu um novo espaço com muitas opções de flores, plantas ornamentais e árvores frutíferas.A Flora Manacá trabalha com empenho e amor para que sua casa ganhe uma decoração especial com vasos, arranjos e serviços de jardinagem. As cores e aromas das flores e plantas farão toda a diferença.Temos cestas de café da manhã para as mais diversas ocasiõesNão podendo esquecer dos enfeites artesanais, uma coleção de artesões de várias regiões buscando somente o melhor para você e sua casa.Estamos aguardando sua visita, venha conferir.');",
				"INSERT INTO ANUNCIO VALUES " +"(301,'2','CASA SÃO JOSÉ','(11) 4016-4366','','','Av. Ernesto de Moraes, 110 Jarinu SP','csjagricola@hotmail.com','','1','https://goo.gl/maps/PNQad','','anuncio','Produtos Veterinários, Produtos Quimicos de uso na agropecuária, forragens, rações e produtos alimentícios para animais. Vacinas, Soros, Adubos, Fertilizantes, Corretivos do Solo, Fungicidas, Pesticidas e etc. Venha nos visitar.');",
				"INSERT INTO ANUNCIO VALUES " +"(313,'2','BONARTE MÓVEIS','(11) 4016-5661','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(307,'2','TSUJI MOTOS','(11) 4016-4344','','','','','','0','','','','');",
				
				"INSERT INTO ANUNCIO VALUES " +"(304,'2','DRAGON GAMES','(11) 4016-4476','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(305,'2','JARI AUTO PEÇAS','(11) 4016-4507','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(306,'2','ITALIA CONFEC.','(11) 4016-1508','','','','','','0','','','','');",
				
				"INSERT INTO ANUNCIO VALUES " +"(308,'2','FOTO UNIVERSO','(11) 4016-3080','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(309,'2','CASA DO OLEO','(11) 4016-3759','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(310,'2','CASA RAZZI','(11) 4016-5353','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(311,'2','ADEMIR ANTENAS','(11) 4016-4883','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(312,'2','ANTENAS NT','(11) 9.7415-0942','','','','','','0','','','','');",
				
				"INSERT INTO ANUNCIO VALUES " +"(314,'2','BOUTIQUE EROTICA','(11) 4016-4697','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(315,'2','DOCERIA TRUFFE','(11) 4016-5520','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(316,'2','DOCERIA LA DOLCERIE','(11) 4016-3881','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(317,'2','ILUMINAÇÃO','(11) 4016-1359','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(318,'2','LOJA MAIS MAIS','(11) 4016-1678','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(319,'2','LUBRIFICAR','(11) 4016-4413','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(320,'2','MARMORARIA CHIEZO','(11) 4016-1078','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(321,'2','MARMORARIA DOMINGUES','(11) 4016-3574','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(322,'2','MERCANTIL PAULISTA','(11) 4016-1222','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(323,'2','MICROLINS','(11) 4016-3202','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(324,'2','PAPELARIA PAPELAO','(11) 4016-3171','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(325,'2','OPTICA VISION','(11) 4016-5037','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(326,'2','PET KING','(11) 4887-1732','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(327,'2','PLANET LAN HOUSE','(11) 4016-4844','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(328,'2','PET KING','(11) 4887-1732','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(329,'2','RACOES DOG HOUSE','(11) 4016-6030','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(330,'2','RIK BIKE','(11) 4016-4969','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(331,'2','SINTONIA PARABOLICA','(11) 4016-4210','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(332,'2','SPORT CENTER','(11) 4016-1748','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(333,'2','STAR CENTER','(11) 4887-1815','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(334,'2','TREVO MADEIRAS','(11) 4016-1073','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(335,'2','ULTRAGAZ','(11) 4016-5756','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(336,'2','VIDRAÇARIA JARINU','(11) 4016-3544','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(337,'2','AGRO VIPS','(11) 4016-4289','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(338,'2','AGRO DOG HOUSE','(11) 4016-6030','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(339,'2','AGRO GABBANI','(11) 4016-4609','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(340,'2','AGRO TRIESTE','(11) 4016-5126','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(341,'2','FAZENDÃO','(11) 4016-4656','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(342,'2','TEIXEIRA VIDRAÇARIA','(11) 4016-3544','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(343,'2','ROSANA MODAS','(11) 4016-5510','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(344,'2','NORMA MODAS','(11) 4016-5596','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(345,'2','SONIA LTDA','(11) 4016-3066','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(346,'2','ESTAÇÃO KIDS','(11) 4039-3457','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(347,'2','GUTSHI MODAS','(11) 4016-5596','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(348,'2','SKALA CENTER','(11) 4016-5344','','','','','','0','','','','');",
			
				
				// FARMACIAS
	
				"INSERT INTO ANUNCIO VALUES " +"(201,'3','DROGARIA ALIANÇA','(11) 4016-3135','(11)99889-4802','','Av. Ernesto de Moraes, 72 Centro Jarinu','aliancadrogaria@hotmail.com','','1','https://goo.gl/maps/PNQad','','anuncio','Na Compra de produtos das nossas linhas solares, ganhe brindes para esquentar ainda mais o seu verão. Venha conferir! Otimos preços em toda linha de perfumaria.');",
				"INSERT INTO ANUNCIO VALUES " +"(202,'3','DROGARIA JARINU','(11) 4016-4659','(11) 4016-5398','','Rua Indepedência, 124 Centro- Jarinu','drjarinu@uol.com.br','','1','https://goo.gl/maps/zCGTO','','anuncio','Com o início de suas atividades em 27.6.1989 – e consolidada há 20 anos no segmento farmacêutico – o objetivo principal estabelecido pela Drogaria Jarinu está em conhecer as reais necessidades de seus clientes e amigos. E desta maneira prioriza, por meio de sua equipe de colaboradores, um atendimento diferenciado de qualidade e responsabilidade que supera as expectativas de seus clientes. Horário de atendimento: Diariamente de segunda a Sábado das 8h00 às 20h00 ');",
				"INSERT INTO ANUNCIO VALUES " +"(204,'3','GARUTTI - DORVALINO','(11) 4016-4653','','','Rua Indepedência, 82 Centro- Jarinu','drogariagarutti@hotmail.com','','1','https://goo.gl/maps/zCGTO','www.drogariagarutti.com.br','anuncio','A DROGARIA GARUTTI, fundada em 1980 atua no varejo farmacêutico e higiene pessoal, com a sua experiência e tradição adquirida durante todos esses anos de atuação no setor. Hoje contamos com uma rede lojas para melhor atender nossos Clientes. Venha nos visitar!');",
				"INSERT INTO ANUNCIO VALUES " +"(203,'3','GARUTTI - ROBSON','(11) 4016-4960','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(205,'3','GARUTTI - EMPORIO','(11) 4016-1561','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(206,'3','GARUTTI - MARACANÃ','(11) 4016-5532','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(207,'3','GARUTTI - TRIESTE','(11) 4016-4105','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(208,'3','DROGARIA NOVA FARMA','(11) 4016-5108','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(209,'3','DENTISTA CLINICA','(11) 4016-5010','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(210,'3','CENTRAL DENT','(11) 4016-5976','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(211,'3','DRA. ADRIANA','(11) 4016-3538','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(212,'3','DRA. ANA CAROLINA LUCCA','(11) 4016-1644','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(213,'3','DRA. ANA CAROLINA','(11) 4016-1910','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(214,'3','DRA. ANA PAULA','(11) 4887-1533','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(215,'3','DRA. CAMILA COUTO','(11) 4016-1430','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(216,'3','DRA. CINIRA M.A','(11) 4016-1859','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(217,'3','DRA. CRISTIANE','(11) 4016-3538','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(218,'3','DR. DIVINO B.','(11) 4016-1859','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(219,'3','DRA. LINDAURA','(11) 4016-3394','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(220,'3','DRA. MARIA T.O','(11) 4016-4156','','','','','','0','','','','');",

			
				
				// DEPOSITOS
				"INSERT INTO ANUNCIO VALUES " +"(350,'4','VAGÃO MATERIAIS','(11) 4016-5777','(11) 947651991','22*77601','Estrada Atilio Squiziato, S/N','vagaoterraplenagem@hotmail.com','Vagão Terraplenagem','1','https://goo.gl/maps/jUIn9','','anuncio','À 15 anos no segmento de terraplenagem em Jarinu, o vagão agora vem com a novidade, Material de Construção para continuar servindo os amigos e clientes com a honestidade e qualidade que todos já conhecem na cidade. Faça-nos uma visita! Aproveite para conferir : Cimento Nassau CPII à retirar só R$ 21,50.');",
				"INSERT INTO ANUNCIO VALUES " +"(351,'4','JL MATERIAIS','(11) 4016-3845','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(352,'4','ORMAGIL MATERIAIS','(11) 4016-4233','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(353,'4','DEPOSITO VIDÃO','(11) 4016-6060','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(354,'4','BM MATERIAIS','(11) 4016-3048','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(355,'4','BM MARACANÃ','(11) 4016-1653','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(356,'4','PEREIRA','(11) 4016-3212','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(357,'4','CS MATERIAIS','(11) 4016-5264','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(358,'4','FUSUZZI MATERIAIS','(11) 4016-6054','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(359,'4','ANDAMES E COMPANHIA','(11) 4016-2850','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(360,'4','FERRAÇO C. LIMPO','(11) 4038-8581','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(361,'4','ESPAÇO DO GESSO','(11) 4016-3883','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(362,'4','GESSO MUNHOS','(11) 4412-5308','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(363,'4','GESSO FORTE','(11) 4016-5690','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(364,'4','FUTURO TELHAS','(11) 4016-2005','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(365,'4','PORTAS E JANELAS','(11) 4016-4963','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(366,'4','CEMAFER','(11) 4016-5145','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(367,'4','RMG REVEST.','(11) 4412-7584','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(368,'4','MORA HIDRAULICA','(11) 4016-5264','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(369,'4','COLOR TINTAS','(11) 4016-6054','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(370,'4','ECOVERDE CIMENTO','(11) 4012-4437','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(371,'4','ALUMITELHA','(11) 4012-4437','','','','','','0','','','','');",
				
				// BARES
				"INSERT INTO ANUNCIO VALUES " +"(400,'5','OPÇÃO BAR','(11) 9.9989-4424','','','Av. Angelo Bernucci, 424 Centro Jarinu','','opcaobarelanchonete','1','https://goo.gl/maps/eYkOy','','anuncio','A bacalhoada,todos os lanches as porções os drinks os sucos,o atendimento e o calor dos amigos!!! Na opção bar só você indo la!!');",
				"INSERT INTO ANUNCIO VALUES " +"(401,'5','FRANGO FRITO','(11) 4016-4599','','','Av. Angelo Bernucci, 380 Centro Jarinu','','orei.dofrangofrito','1','https://goo.gl/maps/eYkOy','','anuncio','Galera estamos com um novo horário de funcionamento!venham conferir compartilhem com seus amigos frango e costela assada apartir do dia 13/09! Terça e Quinta 18:00 às 22:00, Sexta 18:00 às 00:00, Sábado 18:00 às 00 e Domingo 18:00 às 22:00. Porções : Frango, Batata, Polenta, Calabresa e Mandioca. O Lugar Certo é aqui!');",
				"INSERT INTO ANUNCIO VALUES " +"(402,'5','ADEGA TAFARELO','(11) 4016-1901','','','Rua Sebastião Bueno Ferraz, 34 Centro Jarinu','renato.tafarelo@hotmail.com','','1','https://goo.gl/maps/90HpQ','','anuncio','Vinos, Licores, Baceira, Queijo Minas, Cachaça, Jurupinga, Vinagre Caseiro, Produtos Artesanais . Venha nos visitar.');",
				"INSERT INTO ANUNCIO VALUES " +"(403,'5','TOCHA LANCHONETE','(11) 4016-1287','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(404,'5','VILA SERTANEJA','(11) 4016-5011','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(405,'5','ADEGA PAULETO','(11) 4016-4692','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(406,'5','CHARLÃO LANCHES','(11) 4016-4444','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(407,'5','VINICOLA SANTA BRUNA','(11) 4016-3321','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(408,'5','ALAMBIQUE FERRARA','(11) 4016-4130','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(409,'5','ALAMBIQUE ZANONI','(11) 4016-4511','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(410,'5','CACHAÇA CHACARA','(11) 4016-3628','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(411,'5','NOVA FERRARA','(11) 4016-4511','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(412,'5','LIG CHOPP GERMANIA','(11) 4016-9928','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(413,'5','TROPICAL PASTELARIA','(11) 4016-3865','','','','','','0','','','','');",
				
				// RESTAURANTES
				"INSERT INTO ANUNCIO VALUES " +"(450,'6','CHURRASCARIA GALPÃO','(11) 4016-3572','','','Rod. Edgar Maximo Zambotto, Km 71 (ao Lado do Posto Zacan)','churrascariagalpaogaucho@hotmail.com','galpaoGaucho','1','https://goo.gl/maps/x5DN8','www.galpaogauchochurrascaria.com.br','anuuncio',' O tradicional churrasco Gaucho pode ser apreciado em Jarinu. A Churrascaria Galpão Gaucho brinda seus clientes com o melhor rodízio de carnes da região. Fazemos Confraternização e Eventos (Aniversário, Festas de Fim de ano,Formaturas e muito mais). ');",
				"INSERT INTO ANUNCIO VALUES " +"(454,'6','OPÇÃO BAR','(11) 9.9989-4424','','','Av. Angelo Bernucci, 424 Centro Jarinu','','opcaobarelanchonete','1','https://goo.gl/maps/eYkOy','','anuncio','A bacalhoada,todos os lanches as porções os drinks os sucos,o atendimento e o calor dos amigos!!! Na opção bar só você indo la!!');",
				"INSERT INTO ANUNCIO VALUES " +"(455,'6','FRANGO FRITO','(11) 4016-4599','','','Av. Angelo Bernucci, 380 Centro Jarinu','','orei.dofrangofrito','1','https://goo.gl/maps/eYkOy','','anuncio','Galera estamos com um novo horário de funcionamento!venham conferir compartilhem com seus amigos frango e costela assada apartir do dia 13/09! Terça e Quinta 18:00 às 22:00, Sexta 18:00 às 00:00, Sábado 18:00 às 00 e Domingo 18:00 às 22:00. Porções : Frango, Batata, Polenta, Calabresa e Mandioca. O Lugar Certo é aqui!');",
				"INSERT INTO ANUNCIO VALUES " +"(451,'6','BARRIL GRILL','(11) 4016-1255','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(452,'6','GRILL SUL','(11) 4416-4302','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(453,'6','DNAP RESTAURANTE','(11) 4016-3896','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(456,'6','TOCHA LANCHONETE','(11) 4016-1287','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(457,'6','17 DE ABRIL','(11) 4016-4334','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(458,'6','TIA NILZA','(11) 4016-4452','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(459,'6','2 IRMÃOS','(11) 4016-1853','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(460,'6','PEIXE FRITO','(11) 99964-7968','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(461,'6','LA LUCE','(11) 4016-1803','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(462,'6','SKINA DO RECANTO','(11) 4016-3809','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(463,'6','RIO TINTO','(11) 4016-4031','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(464,'6','PARADIES','(11) 4016-7500','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(465,'6','RESTAURANTE ALMEIDA','(11) 4016-5085','','','','','','0','','','','');",
				
				// SUPERMERCADOS
				"INSERT INTO ANUNCIO VALUES " +"(501,'7','EVANDRO CARNES','(11) 4016-4825','','','Rua Indepedência, 271 Centro Jarinu','evandrocarnes@terra.com.br','evandroCarnes','1','https://goo.gl/maps/zCGTO','','anuncio','Como Menos, Mas coma Bem! Bovinos, Suinos, Aves e Peixes. Carnes Frescas diariamente. Aproveite o Fim de Ano e Faça suas encomendas.');",
				"INSERT INTO ANUNCIO VALUES " +"(502,'7','RAISA DOCES','(11) 4038-8909','(11) 99848-4523','','Campo Limpo Paulista','rahbrigadeiros@gmail.com','raisa.rosa.5','1','https://www.facebook.com/pages/Raisa-Doces-Brigadeiros-Gourmet/323917971126124?fref=ts','','anuncio','Aceitamos encomendas para qualquer ocasião. Caixinhas de Presentes para presentear quem você ama com doces finos! Produtos da Melhor Qualidade e tudo com total confiança.');",
				"INSERT INTO ANUNCIO VALUES " +"(503,'7','LA DOLCERIE','(11) 4016-3881','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(504,'7','PARISE PANETERIA','(11) 4016-3379','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(505,'7','TRUFEE DOÇARIA','(11) 4016-5520','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(506,'7','CATROQUE SUPERMERCADO','(11) 4016-4980','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(507,'7','EMPÓRIO CATROQUE','(11) 4016-3013','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(508,'7','MOURA SUPERMERCADO','(11) 4016-4980','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(509,'7','BAHIA SUPERMERCADO','(11) 4016-5061','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(510,'7','CRISMARRE SUPERMERMECADO','(11) 4016-4980','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(511,'7','AMORIM SUPERMERCADO','(11) 4016-3369','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(512,'7','ELTON SUPERMERCADO','(11) 4016-3074','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(513,'7','PIG BOM SUPERMERCADO','(11) 4016-9928','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(514,'7','O DORIO','(11) 4417-1273','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(515,'7','MERCADO JARINU','(11) 4016-5001','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(516,'7','SÃO JORGE MERCADO','(11) 4017-5256','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(517,'7','PESCADOS HARUMI','(11) 7799-9636','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(518,'7','PEIXE FRITO','(11) 97091-3875','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(519,'7','AÇOUGUE SÃO JOSÉ','(11) 97295-0417','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(520,'7','SÃO JORGE MERCADO','(11) 4017-5256','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(521,'7','MERCADO JARINU','(11) 4016-5001','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(522,'7','RUSSI SUPERMERCADO','(11) 4039-3000','','','','','','0','','','','');",
				
				// IMOBILIARIAS
				"INSERT INTO ANUNCIO VALUES " +"(556,'8','PRADO E MANARA','(11) 4016-0229','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(551,'8','JANIO IMÓVEIS','(11) 4887-1730','','','','','','1','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(552,'8','PIONEIRA','(11) 4016-4212','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(553,'8','LORENCINI IMÓVEIS','(11) 4016-4169','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(554,'8','LIMA IMÓVEIS','(11) 4016-1450','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(555,'8','LORENCINI IMÓVEIS','(11) 4016-4169','','','','','','0','','','','');",
				
				"INSERT INTO ANUNCIO VALUES " +"(557,'8','CONTACT IMÓVEIS','(11) 4887-1743','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(558,'8','TERRA IMÓVEIS','(11) 4812-2777','','','','','','0','','','','');",
				
				
				// DISK FACIL
				"INSERT INTO ANUNCIO VALUES " +"(601,'9','MANU GÁS','(11) 4016-6006','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(602,'9','FACIGÁS - GÁS E AGUA','(11) 4016-4372','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(603,'9','ULTRAGAZ','(11) 4016-4372','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(604,'9','A10 EXPRESS - MOTOBOY','(11) 4016-1824','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(605,'9','R.G.S TRANSPORTES','(11) 94731-1509','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(606,'9','CARGAS TRANSPORTE','(11) 4012-7662','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(607,'9','TAXI JARINU','(11) 4016-4124','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(608,'9','TAXI AUGUSTO','(11) 97235-4085','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(609,'9','TAXI JOÃO','(11) 4016-2016','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(610,'9','ALEMÃO MOTOBOY','(11) 9549-5106','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(611,'9','TROPICAL PASTELARIA','(11) 4016-3865','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(612,'9','MOTATUR VIAGENS','(11) 4016-4026','','','','','','0','','','','');",
				
				
				// ACADEMIAS
				"INSERT INTO ANUNCIO VALUES " +"(650,'10','FISICAL FORM ( ADÃO )','(11) 4016-1159','','','Rua Indepedência, 41 Centro Jarinu','silvana.cassia0015@terra.com.br','fisicalForm','1','https://goo.gl/maps/zCGTO','','anuncio','Aberto das 06:00 da manhã até as 22:00hrs  de segunda a sexta e aos sabados das  09:00 ás 12:00 hrs .');",
				"INSERT INTO ANUNCIO VALUES " +"(651,'10','DANNY HEALTH','(11) 4016-5910','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(652,'10','OXY ACADEMIA','(11) 4016-3062','','','','','','0','','','','');",
				
				// SEGUROS
				"INSERT INTO ANUNCIO VALUES " +"(700,'11','ROSSI SEGUROS','(11) 4016-1403','(11) 99649-6694','101*21549','Av. Dr. Artur Bernades, 278 Centro - Jarinu','contato@rossiseguros.com.br','rossisegurosjarinu','1','https://goo.gl/maps/G2fH7','http://www.rossiseguros.com.br/','anuncio','A Rossi Seguros é uma empresa familiar e comprometida com um atendimento personalizado, e eficiente, a fim de garantir a sua satisfação. Nossos Seguros : Automovel, Moto, Frota,Residência, Riscos de Engenharia, Vida e Acidentes Pessoais, Viagem, Rural, Planos de Saude e muito mais.');",
				"INSERT INTO ANUNCIO VALUES " +"(701,'11','HBN SEGUROS','(11) 4016-5179','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(702,'11','SEGUROS TAVOLA','(11) 4016-3425','','','','','','0','','','','');",
				
				
				// SERVIÇOS
				"INSERT INTO ANUNCIO VALUES " +"(749,'12','RENATO.s FLORES','(11) 4016-1901','','','Av. Ernesto de Moraes, Jarinu SP (Em frente ao Supermercado Catroque)','','','1','https://goo.gl/maps/PNQad','','anuncio','Arranjos Florais, Cestas, Cachepos, Vasos, Presentes. Venha nos fazer uma visita ! Otimos Preços todos os dias.');",
				"INSERT INTO ANUNCIO VALUES " +"(750,'12','PRO STREET','(11) 4016-5620','','','Rua Goar Lorenci, 143 Jarinu SP','','Pro Street Audio Film','1','https://goo.gl/maps/WTg1O','','anuncio','Nossos Serviços : Som, Insul-Filme, Acessórios, Bancos em couro . Fazemos instalação de Insul-Filme Residêncial.');",
				"INSERT INTO ANUNCIO VALUES " +"(751,'12','FLORA MANACA','(11) 97401-2787','98129-8613','99558-8490','Av. Angelo Bernucci, 51 Centro Jarinu','elizeu@floramanaca.com.br','flora.manaca','1','https://goo.gl/maps/qGkv2','www.floramanaca.com.br','anuncio','Agora em Jarinu um novo espaço com muitas opções de flores, plantas ornamentais e árvores frutíferas.A Flora Manacá trabalha com empenho e amor para que sua casa ganhe uma decoração especial com vasos, arranjos e serviços de jardinagem. As cores e aromas das flores e plantas farão toda a diferença.Temos cestas de café da manhã para as mais diversas ocasiõesNão podendo esquecer dos enfeites artesanais, uma coleção de artesões de várias regiões buscando somente o melhor para você e sua casa.Estamos aguardando sua visita, venha conferir.');",
				"INSERT INTO ANUNCIO VALUES " +"(753,'12','EDSON DESPACHANTE','(11) 4016-1761','(11) 99691-0369','','Rua Indepedência, 165 Centro Jarinu','edson-bordinasso@ig.com.br','Edson-despachante','1','https://goo.gl/maps/zCGTO','','anuncio','Licenciamento, Emplacamento, Transferências e Parcelamento de Débitos.');",
				"INSERT INTO ANUNCIO VALUES " +"(754,'12','BALÃO MAGIC','(11) 97299-3515','','','Rua 15 de Novembro, 198 Centro Jarinu','cassiaaugusta@hotmail.com','Cassia Lorencini Decoradora','1','https://goo.gl/maps/WZczR','','anuncio','Festas e Eventos. Aluguel de Decoração Infantil • Teen, 15 anos, Locação de Brinquedos,Barraquinhas, Artigos para festa em geral');",
				"INSERT INTO ANUNCIO VALUES " +"(755,'12','SPEED KAR','(11) 4887-2116','(11) 7705-1541','(11) 99612-7872','Av. Dr. Antenor Soares Gandra, 75 Centro Jarinu','marcelococholdi@hotmail.com','Speed Kar Auto Center','1','https://goo.gl/maps/zCGTO','','anuncio','Nossos Serviços : Alinhamento, Balanceamento, Freio , Suspensão, Embreagem, Correia Dentada, Escapamento, Peneus, Borracharia Leve.');",
				"INSERT INTO ANUNCIO VALUES " +"(747,'12','ROSSI SEGUROS','(11) 4016-1403','(11) 99649-6694','101*21549','Av. Dr. Artur Bernades, 278 Centro - Jarinu','contato@rossiseguros.com.br','rossisegurosjarinu','1','https://goo.gl/maps/G2fH7','http://www.rossiseguros.com.br/','anuncio','A Rossi Seguros é uma empresa familiar e comprometida com um atendimento personalizado, e eficiente, a fim de garantir a sua satisfação. Nossos Seguros : Automovel, Moto, Frota,Residência, Riscos de Engenharia, Vida e Acidentes Pessoais, Viagem, Rural, Planos de Saude e muito mais.');",
				"INSERT INTO ANUNCIO VALUES " +"(756,'12','A10 MOTOBOY','(11) 4016-1824','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(786,'12','MECÂNICA RAMON','(11) 4016-3649','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(787,'12','MECÂNICA BITS STOP','(11) 4016-4019','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(752,'12','R&R CENTRO AUTOMOTIVO','(11) 4016-5825','','','','','','1','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(757,'12','PAULINHO PISCINAS','(11) 97522-0356','','','','','','1','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(758,'12','LAVANDERIA DIAMANTE','(11) 4016-1616','','','','','','1','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(759,'12','SITES DESAGIL','(11) 99809-0210','','','','','','1','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(760,'12','JARINU GAMES','(11) 4016-5866','','','','','','1','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(761,'12','COMUNICA. VISUAL','(11) 4016-5763','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(762,'12','LÉO ELETRECISTA','(11) 4016-3606','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(763,'12','MBJ FUNILARIA','(11) 4016-5961','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(764,'12','KLT EMPREGOS','(11) 4016-4842','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(765,'12','ELETRICA 2 IRMÃOS','(11) 4016-1651','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(766,'12','ELETRICA PREDIAL','(11) 94873-9679','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(767,'12','GUINCHO SOCORRO','(11) 4812-4113','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(768,'12','FELIX FESTAS','(11) 40163269','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(769,'12','JARINU BOMBAS','(11) 4016-5914','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(770,'12','JARISEG','(11) 4887-1860','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(771,'12','LAVANDERIA DIAMANTE','(11) 4016-1816','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(772,'12','GESSO DRYWALL','(11) 4016-5960','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(773,'12','MICROLINS','(11) 4016-3202','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(774,'12','PADARIA CATROQUE','(11) 4016-4980','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(775,'12','PET KING','(11) 4887-1732','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(776,'12','KSA COMUNICAÇÂO VISUAL','(11) 4016-0229','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(777,'12','PRADO E MANARA','(11) 4016-0229','','','','','','1','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(778,'12','BORRACHARIA ROBERTO','(11) 4016-4413','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(779,'12','DOUGLAS PENEUS','(11) 4016-0229','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(780,'12','FURO D.GUA','(11) 4016-5825','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(781,'12','PRADO E MANARA','(11) 4016-0229','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(782,'12','QUADRA SPINAZZI','(11) 4016-1748','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(783,'12','LIBRA SUCATAS','(11) 9.7103-1247','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(784,'12','GR PINTURAS','(11) 40169-1807','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(785,'12','BALILA PINTURAS','(11) 4812-4113','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(788,'12','MANUTENÇÂO RESIDENCIAL EDMILSON','(11) 94873-9679','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(789,'12','SERRALHERIA YPÊ','(11) 4016-1619','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(790,'12','FERRAÇO ','(11) 95449-1426','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(791,'12','PET KING','(11) 4887-1732','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(792,'12','NEW TEC','(11) 4016-3202','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(793,'12','ELETRO LIGHT','(11) 4016-6019','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(794,'12','TRIBUNA JARINU','(11) 4016-5512','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(795,'12','CHIKINHO LAVA CAR','(11) 99662-3730','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(796,'12','ADVOCACIA PIRES PIMENTEL','(11) 4016-3899','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(797,'12','ADVOCACIA KATIA BELLI','(11) 4016-3005','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(798,'12','ADVOCACIA LORENCINI','(11) 4887-3899','','','','','','0','','','','');",
				
			
	
				
				
				// ESCOLAS E CURSOS,
				"INSERT INTO ANUNCIO VALUES " +"(800,'13','UNINTER - CENTRO UNIVERSITÁRIO','(11) 4016-1379','','','Rua José de Moura, 22 Centro Jarinu','uninterjarinu@outlook.com','Uninter-Polo-Jarinu','1','https://goo.gl/maps/j2NZ6','www.uninter.com','anuncio','Graduação a Distância. Aulas ministradas por professores especialistas e transmitidas via satélite para todos os Polos de Apoio Presenecial UNINTER no Brasil. Você também pode assistir às aulas pela internet, com o suporte tecnológico para organizar seus estudos, tirar dúvidas e acessar material didático por meio do Ambiente Virtual de Aprendizagem (AVA). Oferecemos Cursos de Pós - Graduação');",
				"INSERT INTO ANUNCIO VALUES " +"(801,'13','MICROLINS JARINU','(11) 4016-3202','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(802,'13','FISK JARINU','(11) 4016-4424','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(803,'13','FAST COMP','(11) 4016-5622','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(804,'13','COLEGIO OBJETIVO','(11) 4016-3442','','','','','','0','','','','');",
				
				"INSERT INTO ANUNCIO VALUES " +"(805,'13','COLEGIO PILAR','(11) 4016-3202','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(806,'13','AUTO CONQUISTA','(11) 4016-5536','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(807,'13','AUTO PAPALEGUAS','(11) 4016-1356','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(808,'13','EE DUILIO MAZ.','(11) 4016-1365','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(809,'13','ESC. ORLANDO MAURICIO','(11) 4016-6264','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(810,'13','E.E JERÔNIMO','(11) 4016-4345','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(811,'13','ESCOLA PITANGAL','(11) 4016-1028','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(812,'13','ESC. JULIO SQUIZATTO','(11) 4017-9007','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(813,'13','FAZENDA PRIMAVERA','(11) 4495-0034','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(814,'13','MARIA HELENA','(11) 4016-4052','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(815,'13','MARIO COVAS','(11) 4016-3044','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(816,'13','DIRNEY ROSSI - TRIESTE','(11) 4016-3502','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(817,'13','ESC. PRIMAVERA','(11) 4016-1911','','','','','','0','','','','');",
				
				
				// FACULDADES
				"INSERT INTO ANUNCIO VALUES " +"(840,'14','UNINTER - CENTRO UNIVERSITÁRIO','(11) 4016-1379','','','Rua José de Moura, 22 Centro Jarinu','uninterjarinu@outlook.com','Uninter-Polo-Jarinu','1','https://goo.gl/maps/j2NZ6','www.uninter.com','anuncio','Graduação a Distância. Aulas ministradas por professores especialistas e transmitidas via satélite para todos os Polos de Apoio Presenecial UNINTER no Brasil. Você também pode assistir às aulas pela internet, com o suporte tecnológico para organizar seus estudos, tirar dúvidas e acessar material didático por meio do Ambiente Virtual de Aprendizagem (AVA). Oferecemos Cursos de Pós - Graduação');",
				"INSERT INTO ANUNCIO VALUES " +"(841,'14','FACCAMP','(11) 4016-1379','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(842,'14','UNIP JUNDIAI','(11) 4016-1379','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(843,'14','UNICAMP','(11) 4016-1379','','','','','','0','','','','');",
				
				// TELEFONES ÚTEIS
				"INSERT INTO ANUNCIO VALUES " +"(850,'15','DEFESA CÍVIL','(11) 4016-2035','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(851,'15','PREFEITURA JARINU','(11) 4016-8200','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(852,'15','PREVIDÊNCIA SOCIAL','(11) 4016-1246','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(853,'15','POSTO SAÚDE JARINU','(11) 4016-8100','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(854,'15','POSTO SAÚDE CAMPO LARGO','(11) 4017-5239','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(855,'15','POSTO SAÚDE MARACANÃ','(11) 4016-1133','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(856,'15','SÃO VICENTE HOSPITAL','(11) 4583-8155','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(857,'15','POLICIA CÍVIL','(11) 4016-3322','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(858,'15','POSTO MILITAR','(11) 4016-4394','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(859,'15','FUNDO SOCIAL','(11) 4016-1017','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(860,'15','GARAGEM MUNICIPAL','(11) 4016-2026','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(861,'15','ELEKTRO','(11) 4016-4281','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(862,'15','DEC','(11) 4016-0200','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(863,'15','CRECHE(CENTRO)','(11) 4016-4021','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(864,'15','CRECHE(MARACANÃ)','(11) 4016-4666','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(865,'15','CRECHE(TRIESTE)','(11) 4016-5655','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(866,'15','CIRETRAN','(11) 4016-4445','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(867,'15','CCI','(11) 4016-2924','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(868,'15','CARTÓRIO JARINU','(11) 4016-4020','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(869,'15','CAMARA MUNICIPAL','(11) 4016-4330','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(870,'15','BIBLIOTECA MUNICIPAL','(11) 4016-2012','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(871,'15','BRADESCO','(11) 4016-4101','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(872,'15','BANCO BRASIL','(11) 4016-4264','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(873,'15','BANCO ITAU','(11) 4016-4310','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(874,'15','CORREIOS(CENTRO)','(11) 4016-4315','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(875,'15','CORREIOS(MARACANÃ)','(11) 4016-3003','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(876,'15','GINÁSIO DE ESPORTES','(11) 4016-3232','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(877,'15','RODOVIARIA','(11) 4016-2016','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(878,'15','SABESP','(11) 4016-4361','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(879,'15','MEIO AMBIENTE','(11) 4016-4278','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(880,'15','SECRETARIA AGRICULTURA','(11) 4016-3843','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(881,'15','LAR EDUARDO FERRARA','(11) 4016-3506','','','','','','0','','','','');",
				
				// BELEZA
				"INSERT INTO ANUNCIO VALUES " +"(920,'16','SALÃO DE BELEZA JULIANA','(11) 4016-3581','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(921,'16','BELEZA BRAZIL','(11) 4016-1527','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(922,'16','DIAS CABELELEIRO','(11) 97411-8753','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(923,'16','FELIPE e NICOLAS CABELELEIRO','(11) 9999-9999','','','','','','0','','','','');",
				"INSERT INTO ANUNCIO VALUES " +"(924,'16','VALDIR CABELELEIRO','(11) 9999-9999','','','','','','0','','','','');",
				
		
				             
				
		};
	}
}