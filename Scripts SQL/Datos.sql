INSERT INTO clientes (Cli_Nombre,Cli_Apellido_Paterno,Cli_Apellido_Materno,Cli_Email,Cli_Password,Cli_Colonia,Cli_Calle,Cli_Telefono) 
VALUES 
('Luis Ángel','Aguilar','Ceja','laacarguilarceja@gmail.com','luis123','Del Parque','Calle 1325 #47','5563713264'),
('Victor Manuel','Cabello','Vargas','victor.cabello091@gmail.com','victor123','Federal','Trabajo #162','5566906963'),
('Cesar Sadrak','Martin','Moreno','kreytos.pavi10@gmail.com','cesar123','Progresista','Plutarco#166','5621398162'),
('Emilio','Gallegos','Salinas','emilio_gallegos112@gmail.com','emilio123','Del valle','Calle 15 #47','5563778264'),
('Laura','Bazaldua','Monroy','lauura_bm@gmail.com','lau123','Los Angeles','Del Real #47','5563713421'),
('Miguel','Aguilera','Sanchez','superbrandon@gmail.com','manu123','Desarrollo Urbano','Villa #47','5563430864'),
('José Ángel','Abarca','Romero','foraAcapulco39@gmail.com','fora123','Regadera','Calle #47','5555173563'),
('Ana Laura','Namour','Antolin','anaCDMX@gmail.com','ana123','Del Valle','Felix Cuevas #810','5556886288'),
('Ricardo','Jiménez','Gómez','juaGomezSD@gmail.com','lrichi123','Vallejo','Guadalupe #224','5598244487'),
('Brenda','Aguirre','Solís','brenAgu23@gmail.com','brend123','Naucalpan','Calle 3 #0','5535722615'),
('Francisco','León','Velasco','fran98V@outlook.com','leo123','Pinos','Calle 22 #225','5556119473'),
('Francisco','Rodríguez','Osorio','oso.Ro02@gmail.com','oso223','Prados de la Loma','Gustavo Baz','5515366577'),
('Alejandro','García','Cruz','cruAG_2a@hotmail.com','cruz223','Coyoacán','Canal de Miramontes #102','5556791383'),
('Isaac','Hernández','Rodríguez','nande83@gmail.com','issa123','Tacubaya','Observatorio #216','5552718333'),
('Itzel','Cabrera','Vázquez','vaCaIt28@gmail.com','itzel123','Viaducto Piedad','Sur 73 #101','5555383829'),
('Cesar','Cabello','Lara','ca998rui@outlook.com','ces12234','Polanco','Campos Eliseos #188','5556571566'),
('Cinthya','Reyes','Rodríguez','recinro092@gmail.com','cin1234','Roma','Chihuahua #26','5556408592'),
('Anahí','Contreras','Avilés','analicon0_0@hotmail.com','ana123','San Miguel Chapultepec','Alumnos #38','5552116488'),
('Francisco','Vargas','Martínez','maFRA982@gmail.com','var123','Del Valle Centro','Ave. Felix Cuevas #630','5556056641'),
('Guillermo','Rodríguez','Mancera','mAgUi73@gmail.com','gui123','Tepepan','Arenal #655','5556762840'),
('Ivonne','Ugalde','Guerrero','gue_rro98@outlook.com','ivon1123','Tacuba','Marina Nacional #62','5553990664'),
('Javier','Meléndez','López','jameLo902@gmail.com','jav123','Santa Isabel Tola','Ave. Xochiquetzal #240','5555771797'),
('Karla','Benítez','Quiroz','quiroz_beni66@outlook.com','Karla123','Santiago Norte','La Viga #785','5555965229'),
('Maria','Sandoval','Martinez','marmar26@gmail.com','Maria123','Las Lomas','Calzada de la Manzana #48','5576458792'),
('Fernando','Reyes','Paiz','wichoMer@gmail.com','Fer123','Juarez','Florencia #57','5552083859'),
('Misael','Valenzuela','Morales','valeMora.Mi@gmail.com','Misa123','Narvarte','Nicolas San Juan #112','5556397113'),
('Nilsen','Alfaro','Parra','nil_82par@outlook.com','Nil123','Roma Sur','Colima #124','5552816363'),
('Anahí','Salto','Cruz','cruz_relg291@gmail.com','Anahi123','Lindavista','Arequipa #668','5555776558'),
('Rolando','Mota','Vergara','churro23@gmail.com','Mota123','Iztapalapa','Manuel #12','5555774028'),
('Desconcha','De la lora','Perez','conchita@gmail.com','Pan123','Linda','areums #668','5555710973');


INSERT INTO tipos (Tipo_Nombre,Tipo_Sueldo)VALUES
('Chef',2300),
('Mesero',1500),
('Limpieza',1100),
('Gerente',5300),
('Finanzas',4500),
('Publicidad',3500);

ALTER TABLE empleados auto_increment = 1;

INSERT INTO empleados (Emp_Nombre,Emp_Apellido_Paterno,Emp_Apellido_Materno, Emp_Email,Emp_telefono,Emp_Calle,Emp_Colonia,Emp_Fecha_Nacimiento,Emp_Password,Emp_Id_Tipo) 
VALUES 
('Ana','Zapata','Moreno','bibvb@gmail.com','5555144116','La Morena #1309','Narvarte','1998-12-01','ana123',4),
('Juan','Cabello','Gutierrez','vidb@gmail.com','5555143795','Saltillo #19','Condesa','1999-02-16','juan123',2),
('Sofia','Lara','Martinez','poinfm@gmail.com','5527373644','Insurgentes Sur #92','Juarez','1989-05-14','sof1234',3),
('Gabriela','Cruz','Gallegos','ocbej@gmail.com','5551650291','Nuevo Leon #210','Hipodromo','1996-04-10','gabriela145',4),
('Alejandra','Salto','Alfaro','cnmlah@gmail.com','5555118636','Insurgentes Sur #126','Juarez','1997-10-17','alejandra144',5),
('Ramon','Gutierrez','Alemon','esg@gmail.com','5555474678','Parque España #49','Polanco','2000-11-10','ra1234',6),
('Luis','Aguilar','Ceja','Esbjc@gmail.com','5555849712','Ave. Popocatepetl #396','General Maria Anaya','1999-05-06','Luis123','2'),
('Mario','Casas','Rodriguez','dbdu3b8@gmail.com','5557147561','Buen Tono #7','Industrial','1998-07-18','Mario123','2'),
('Roberto','Bazaldua','Zapata','w0wes@gmail.com','5555383829','Constituyentes #581','16 de Septiembre','2003-02-16','Roberto123','1'),
('Maria','Barradas','Morningstar','ppwbh@gmail.com','5555308496','Ave. Centenario #1156','Atzacoalco','2000-03-19','Maria123','2'),
('Monica','Cruz','Cabello','etalll@gmail.com','5525084354','Antonio Leon y Gama #7','Obrera','1998-12-03','Monica123','2'),
('Victor','Mendez','Quiroz','dbbb@gmail.com','5555786516','Colima #254','Roma Norte','1997-12-23','Victor123','1'),
('Manuel','Jaramillo','Wayne','shbj@gmail.com','5555876524','Diana #53','Industrial Vallejo','2000-05-02','Manuel123','2'),
('Jose','Perez','Moreno','Www@gmail.com','5555765824','Marina Nacional #62','San Rafael','2000-03-04','Jose123','1'),
('Sheyla','Romero','Monroy','Ensjv@gmail.com','5555766516','Patriotismo #615','Mixcoac','1999-08-19','Sheyla123','3'),
('Antonia','Ramirez','Ruiz','patitoFeo@gmail.com','5554264427','Edgar Allan Poe #8','Polanco Chapultepec','1989-05-20','Antonia123','2'),
('Juan','Renteria','Hernandez','Juanchin@gmail.com','5552342424','Cleveland #39','Napoles','1996-10-11','Juan123','1'),
('Marco','Duran','Romero','patosycorbatas@gmail.com','5553560052','5 de Febrero #18','Centro de la Ciudad','2001-08-13','Marco123','2'),
('Antonio','Ceja','Gonzalez','elpepe@gmail.com','5556733612','Paseo de las Palmas #239','Lomas de Chapultepec','2003-11-16','Antonio123','2'),
('Patricia','Vargas','Arredondo','etesech99@gmail.com','5551000428','Año de Juarez #343','Granjas San Antonio','2001-05-06','Patricia123','2'),
('Gabriel','Cabello','Mancilla','pinturillo912@gmail.com','5556725280','Bolivar #297','Obrera','1999-07-10','Gabriel123','2'),
('Anahi','Salinas','Hernandez','holacomoestas@gmail.com','5556727693','Ave.  Ejercito Nacional #884','Centro','1988-08-21','Anahi123','1'),
('Yunuen','Gallegos','Portillo','patatasrojas@gmail.com','5557323058','Moneda #19','Centro de la Ciudad','1999-02-20','Yunuen123','2'),
('Karla','Benitez','Molina','perrossobrehielo@gmail.com','5557323355','Ave. Marti #211','Escandon','1998-01-03','Karla123','1'),
('Laura','Quiroz','Almaraz','conejos_voladores@gmail.com','5589067057','Sor Juana Ines de la Cruz #54','Sta. Maria la rivera','2000-01-12','Laura123','2'),
('Martin','Namour','Ranchero','kreytosdeat@gmail.com','5589076647','Ave.17 de mayo #73','San Bartolo Atepehuacan','1996-01-18','Martin123','3'),
('Lucia','Antolin','Rivera','Lromero@gmail.com','5521630830','Oaxaca #96','Roma','1999-01-05','Lucia123','2'),
('Brenda','Cisneros','Lopez','BrenLopez@gmail.com','5521630831','San Miguel #18','San Lucas','1997-02-20','Brenda123','3'),
('Brandon','Zapata','Obrador','Zapata_brn@gmail.com','5526140731','Mineria #15','Escandon','2000-09-25','Brandon123','3'),
('Carlos','Mendez','Aguilera','Carlitos@gmail.com','5556466816','Ave. primero de mayo #231','San Pedro de los pinos','2003-03-14','Carlos123','1');

INSERT INTO categorias (Cat_Nombre) VALUES ('Entradas'),
					('Sopas'),
					('Plato Fuerte'),
					('Ensaladas'),
					('Complementos'),
					('Postre'),
					('Bebidas Calientes'),
					('Bebidas Frias'),
					('Bebidas Alcoholicas');

INSERT INTO menus Values(3,'Cena');
INSERT INTO menus Values(2,'Comida');
INSERT INTO menus Values(1,'Desayuno');


INSERT INTO platillos (Pla_Nombre,Pla_Descripcion,Pla_Precio,Pla_Categoria_Id,Pla_Cantidad,Pla_Menu_Id,Pla_Imagen) VALUES
('Nachos','Crujientes chips de tortilla de maiz cubiertos con mezcla de quesos monterrey jack y cheddar, salsa de queso blanco',32,1,50,2,'/Imagenes/Platillos/nachos.jpg'),
('Plato Mixto','Molletes, sincronizada, taquitos dorados de queso y huarachito',36,1,50,2,'/Imagenes/Platillos/plato-mixto.jpg'),
('Pan Tostado','El aliado ideal si quieres mantener la línea, ya que es bajo en grasas y su consumo aporta proteínas y vitaminas',19,1,50,1,'/Imagenes/Platillos/pan-tostado.jpg'),
('Galletas','Preparación culinaria de pequeño tamaño, dulce o salada, horneada y hecha normalmente a base de harina de trigo',14,1,50,1,'/Imagenes/Platillos/galletas.jpg'),
('Mini Cereal','Los cereales son plantas de la familia de las poáceas cultivadas por su grano.',23,1,50,1,'/Imagenes/Platillos/mini-cereal.jpg'),
('Camarones Rokka','Camarones crujientes bañados en salsa chipotle acompañados con ensalada.',38,1,50,2,'/Imagenes/Platillos/camarones-rokka.jpg'),
('Kani Gyozas','Ravioles japoneses con cangrejo y filadelfia, acompañados de salsa agripicante.',60,1,50,2,'/Imagenes/Platillos/kani-gyozas.jpg'),
('Ika Dragon','Crujientes aros de calamar y verdura con un toque de limón y salsa dragon.',40,1,50,2,'/Imagenes/Platillos/ika-dragon.jpg'),
('Guacamole','Es una salsa mexicana preparada a base de aguacate y chile verde o chile pimiento acompañado con totopos',45,1,50,2,'/Imagenes/Platillos/guacamole.jpg'),
('Buffalo Wings','Crujientes trocitos de pechuga de pollo ligeramente empanizados y bañados con la salsa Bufalo',98,1,50,3,'/Imagenes/Platillos/buffalo-wings.jpg'),

('Alitas BBQ','Crujientes trocitos de pechuga de pollo ligeramente empanizados y bañados con la salsa BBQ',92,1,50,3,'/Imagenes/Platillos/alitas-bbq.jpg'),
('Alitas Chipotle','Crujientes trocitos de pechuga de pollo ligeramente empanizados y bañados con la salsa Chipotle',87,1,50,3,'/Imagenes/Platillos/alitas-chipotle.jpg'),
('Pozole','Incluye:4 tostadas, limones, oregano, piquin y salsa de la casa',89,2,50,2,'/Imagenes/Platillos/pozole.jpg'),
('Sopa de Tortilla','Con queso Oaxaca, aguacate y chile pasilla; acompañada de chicharrón, crema y queso.',40,2,50,2,'/Imagenes/Platillos/sopa-de-tortilla.jpg'),
('Sopa de Fideos','Deliciosa sopa de fideo',43,2,50,2,'/Imagenes/Platillos/sopa-de-fideos.jpg'),
('Caldo de Camaron','Preparado de camarón fresco con las cáscaras de ellos. Con un toque de limón y chile',72,2,50,2,'/Imagenes/Platillos/caldo-de-camaron.jpg'),
('Consome de Pollo','Se sirve con trozos de carne o con granos de arroz o cebada, pasta, zanahoria, papa amarilla, etc.',57,2,50,2,'/Imagenes/Platillos/consome-de-pollo.jpg'),
('Misoshiro','Caldo miso, tofu, cebollín y alga.',70,2,50,2,'/Imagenes/Platillos/misoshiro.jpg'),
('Torisozui','Pollo, huevo, espinaca, germen, zanahoria, champiñón, y arroz.',75,2,50,2,'/Imagenes/Platillos/torisozui.jpg'),
('Ratatouille','Guiso de tomate, ajo, pimiento morrón, cebolla, calabacín y berenjena.',60,3,50,2,'/Imagenes/Platillos/ratatouille.jpg'),

('Chilaquiles con Pollo','Disfruta nuestros deliciosos chilaquiles verdes o rojos con pollo',45,3,50,1,'/Imagenes/Platillos/chilaquiles-con-pollo.jpg'),
('Chilaquiles Sencillos','Deliciosos chilaquiles verdes o rojos, recién hechos con crema, queso espolvoreado y cebollita rebanada.',40,3,50,1,'/Imagenes/Platillos/chilaquiles-sencillos.jpg'),
('Huevos a la Mexicana','Incluyen 3 Tortillas',80,3,50,1,'/Imagenes/Platillos/huevos-a-la-mexicana.jpg'),
('Huevos divorciados','El encuentro de dos mundos, el de la salsa verde y el de la roja.',50,3,50,1,'/Imagenes/Platillos/huevos-divorciados.jpg'),
('Huevos con Jamon','Un clásico, pero con el sabor único y el sazón especial de la casa. Está acompañado de sus deliciosos frijoles refritos. ',50,3,50,1,'/Imagenes/Platillos/huevos-con-jamon.jpg'),
('Copa de Yogurt','Con manzana, durazno, fresa, miel, topping de fresa y granola',42,4,50,1,'/Imagenes/Platillos/copa-de-yogurt.jpg'),
('Omelette','Elaborado con huevo batido y cocinado con mantequilla o aceite, en una sartén.',38,3,50,1,'/Imagenes/Platillos/omelette.jpg'),
('Crepas Poblanas','Rellenas de chile poblano, hongos y granos de elote, acompañadas de salsa poblana y gratinadas con queso.',40,3,50,1,'/Imagenes/Platillos/crepas-poblanas.jpg'),
('Huevos Veracruzanos','Enfrijoladas veracruzanas rellenas con huevos revueltos y acompañadas de chorizo toluqueño',42,3,50,1,'/Imagenes/Platillos/huevos-veracruzanos.jpg'),
('Mini Hotcakes con Chispas de Chocolate','¡Disfrútalos con jarabe de fresa, chocolate y miel de maple!',36,1,50,1,'/Imagenes/Platillos/mini-hotcakes-con-chispas-de-chocolate.jpg'),

('Hotcakes','¡Para todos los antojos! Disfrútalos con mermelada de fresa o chabacano.',48,3,50,1,'/Imagenes/Platillos/hotcakes.jpg'),
('Mollete','Bolillo partido con frijolels, chorizo y queso acompañado de pico de gallo',45,3,50,3,'/Imagenes/Platillos/mollete.jpg'),
('Pan Dulce','gran variedad de panes que incluyen azúcar',30,3,50,1,'/Imagenes/Platillos/pan-dulce.jpg'),
('Coctel de Frutas','Fresa, Kiwi, Mora Azul y Melon',35,4,50,1,'/Imagenes/Platillos/coctel-de-frutas.jpg'),
('Tacos de chile relleno','Tortilla de maíz con chile jalapeño, carne molida, queso fundido y crema.',30,3,50,2,'/Imagenes/Platillos/tacos-de-chile-relleno.jpg'),
('Enchiladas Verdes','Tres deliciosas tortillas con una buena porción de pollito desmenuzado y bañadas con salsa verde. Acompañadas de crema y el queso.',53,3,50,2,'/Imagenes/Platillos/enchiladas-verdes.jpg'),
('Enchiladas Rojas','Tres deliciosas tortillas con una buena porción de pollito desmenuzado y bañadas con salsa roja. Acompañadas de crema y el queso.',53,3,50,2,'/Imagenes/Platillos/enchiladas-rojas.jpg'),
('Enfrijoladas','Tres tortillas perfectamente dobladas, rellenas de pollo desmenuzado y bañadas con una salsa de frijol',53,3,50,2,'/Imagenes/Platillos/enfrijoladas.jpg'),
('Tacos de birria','Tortilla de maíz con birria',27,3,50,2,'/Imagenes/Platillos/tacos-de-birria.jpg'),
('Sopes','Sope sencillo con frijoles, queso rallado y lechuga.',65,3,50,3,'/Imagenes/Platillos/sopes.jpg'),

('Tacos al Pastor','Tortilla con carne preparada al pastor',50,3,50,3,'/Imagenes/Platillos/tacos-al-pastor.jpg'),
('Burrito','En tortilla de harina, 150 gramos de carne diezmillo angus y queso menonita envuelto en tocino.',45,3,50,3,'/Imagenes/Platillos/burrito.jpg'),
('Quesadilla Sencilla','Tortilladas dobladas rellenas de queso Oaxaca',30,3,50,3,'/Imagenes/Platillos/quesadilla-sencilla.jpg'),
('Kani Maki','Rollo cubierto de cangrejo y relleno de queso, aguacate y pepino.',140,3,50,3,'/Imagenes/Platillos/kani-maki.jpg'),
('Filadelfia Maki','Rollo envuelto en Alga, relleno de filadelfia y el ingrediente que más te guste.',65,3,50,3,'/Imagenes/Platillos/filadelfia-maki.jpg'),
('Pizza de Queso','Pizza grande preparada con nuestra deliciosa salsa de tomate y una mezcla de quesos mozzarella y muenster',109,3,50,2,'/Imagenes/Platillos/pizza-de-queso.jpg'),
('Pizza de Pepperoni','Pizza grande de pepperoni preparada con nuestra deliciosa salsa de tomate, una mezcla de quesos mozzarella y muenster.',109,3,50,2,'/Imagenes/Platillos/pizza-de-pepperoni.jpg'),
('Cowboy Burger','Cubierta con crujientes tiras de cebolla, queso Cheddar blanco, tocino ahumado, lechuga, tomate, pepinillos y BBQ.',160,3,50,2,'/Imagenes/Platillos/cowboy-burger.jpg'),
('Avocado Burger','Jugosa hamburguesa cubierta con queso suizo, tocino y frescas rebanadas de aguacate.',170,3,50,2,'/Imagenes/Platillos/avocado-burger.jpg'),
('Bacon Cheese Burger','Hamburguesa con queso Cheddar, tocino, lechuga, tomate, cebolla y pepinillos.',140,3,50,2,'/Imagenes/Platillos/bacon-cheese-burger.jpg'),

('Ensalada Caribeña','Combinación de lechugas,pechuga marinada a la parrilla, durazno , fresas y vinagreta de naranja.',93,4,50,1,'/Imagenes/Platillos/ensalada-caribeña.jpg'),
('Del Chef con pechuga marinada','Combinación de germen de alfalfa, jitomate, huevo cocido y aderezo blue cheese.',90,4,50,2,'/Imagenes/Platillos/del-chef-con-pechuga-marinada.jpg'),
('California Shrimp Salad','Variedad de lechugas con cremoso aderezo aguacate-ranch y suculentos camarones a la plancha',102,4,50,2,'/Imagenes/Platillos/california-shrimp-salad.jpg'),
('Santa Fe Chicken Salad','Mezcla de lechugas, tiritas de tortilla fritas, queso y pico de gallo en nuestro aderezo mexi-ranch',109,4,50,2,'/Imagenes/Platillos/santa-fe-chicken-salad.jpg'),
('Buffalo Salad','Mezcla de ensalada, tomate, tiritas de tortilla fritas y aderezo bleu cheese.',115,4,50,2,'/Imagenes/Platillos/buffalo-salad.jpg'),
('Oriental Chicken Salad','Nuestra original mezcla de lechugas, almendras y tallarines de arroz tostado, bañada con delicioso aderezo oriental.',110,4,50,2,'/Imagenes/Platillos/oriental-chicken-salad.jpg'),
('Mantequilla','Es una emulsión más o menos sólida considerada apta para consumo humano, producto del batido, amasado y lavado de grasas lácteas y agua',10,5,50,1,'/Imagenes/Platillos/mantequilla.jpg'),
('Mermemlada','Es una conserva de fruta cocida en azúcar​ originaria de Portugal.​​​ Su composición y preparación es muy parecida a la confitura',10,5,50,1,'/Imagenes/Platillos/mermelada.jpg'),
('Cajeta','En diversos países latinoamericanos se le conoce como cajeta a una serie de dulces elaborados, principalmente, con dulce de leche.',10,5,50,1,'/Imagenes/Platillos/cajeta.jpg'),
('Miel','La miel es un fluido muy dulce y viscoso producido por abejas del género Apis, principalmente la abeja doméstica',10,5,50,1,'/Imagenes/Platillos/miel.jpg'),

('Ensalada de Atun','La ensalada de atún es una mezcla de típicamente tres ingredientes: atún, huevo y algún tipo de mayonesa o sucedáneo',100,4,50,2,'/Imagenes/Platillos/ensalada-de-atun.jpg'),
('Guarnicion','Preparación culinaria que acompaña a la preparación principal en una comida.',25,5,50,2,'/Imagenes/Platillos/guarnicion.jpg'),
('Pure de Papa','Elaborado con papas cocidas y molidas, así como otros ingredientes.',30,5,50,2,'/Imagenes/Platillos/pure-de-papa.jpg'),
('Salsa Verde','Está hecha de tomate verde molido con cebolla, ajo, cilantro, chile jalapeño o serrano, sal y pimienta al gusto.',10,5,50,2,'/Imagenes/Platillos/salsa-verde.jpg'),
('Salsa Roja','Está hecha de jitomate o tomate rojo, molido con cebolla, ajo, cilantro, chile, sal y pimienta al gusto.',10,5,50,2,'/Imagenes/Platillos/salsa-roja.jpg'),
('Tortillas de Maiz','Una tortilla de maíz es un alimento de forma plana y circular elaborado con maíz nixtamalizado, que se muele, se hace masa',10,5,50,2,'/Imagenes/Platillos/tortillas-de-maiz.jpg'),
('Tortillas de Harina','Ricas tortillas elaboradas de harina',10,5,50,2,'/Imagenes/Platillos/tortillas-de-harina.jpg'),
('Cheesecake de Fresa','Delicioso cheesecake con fresas, acompáñalo con un café de nuetra barra de cafés',90,6,50,1,'/Imagenes/Platillos/cheesecake-de-fresa.jpg'),
('Cheesecake de trufa','Este producto contiene 0.7% de alcohol. Prohibida su venta a menores de edad.',100,6,50,2,'/Imagenes/Platillos/cheesecake-de-trufa.jpg'),
('Crepas de cajeta','Tres crepas, rellenas de queso crema, bañadas con cajeta y trozos de nuez;servidas con plátano y con helado de vainilla',95,6,50,2,'/Imagenes/Platillos/crepas-de-cajeta.jpg'),

('Crepas con fresas y chocolate','Tres crepas rellenas de queso crema y chocolate liquido, bañadas con salsa y trozos de fresa',110,6,50,1,'/Imagenes/Platillos/crepas-con-fresa-y-chocolate.jpg'),
('Pastel de Chocolate','Pan, crema y cobertura de chocolate semi amargo. Servido con durazno y un toque de salsa de naranja',100,6,50,1,'/Imagenes/Platillos/pastel-de-chocolate.jpg'),
('Pay limon','Pay de Limon, contiene mucho azucar, no recomendable para niños',90,6,50,2,'/Imagenes/Platillos/pay-limon.jpg'),
('Flan Napolitano','El flan es un postre que se prepara con huevos enteros, leche y azúcar.',90,6,50,2,'/Imagenes/Platillos/flan-napolitano.jpg'),
('Pay de platano','Con una relleno a escoger de dulce de lecheo nutella, una capa de plátano fresco',86,6,50,3,'/Imagenes/Platillos/pay-de-platano.jpg'),
('Pastel ferrero','Pastel de Chocolate con deliciosas capas de crema de avallena en su interior y una cubierta de chocolate y avellanas finamente tostadas',75,6,50,3,'/Imagenes/Platillos/pastel-ferrero.jpg'),
('Arroz con leche','Se le suele espolvorear canela, vainilla',35,6,50,3,'/Imagenes/Platillos/arroz-con-leche.jpg'),
('Leche','Leche natural, Entera, Deslactosada, etc.',13,7,50,1,'/Imagenes/Platillos/leche.jpg'),
('Leche de Chocolate','Leche de chocolate, Entera, Deslactosada, etc.',13,7,50,1,'/Imagenes/Platillos/leche-de-chocolate.jpg'),
('Leche de Vainilla','Leche de vainilla, Entera, Deslactosada, etc.',13,7,50,1,'/Imagenes/Platillos/leche-de-vainilla.jpg'),
('Espresso','Se caracteriza por su rápida preparación y por un sabor y textura más concentrados.',40,7,50,1,'/Imagenes/Platillos/espresso.jpg'),

('Cafe Americano','El café americano es la mezcla de agua caliente y café.',40,7,50,1,'/Imagenes/Platillos/cafe-americano.jpg'),
('Capuccino','Un capuchino se compone de 125 ml de leche y 25 ml de café expreso, se agrega cacao en polvo o canela',50,7,50,1,'/Imagenes/Platillos/capuccino.jpg'),
('Cafe Mocha','Un café moca es una variante del café con leche. Suele llevar un tercio de expreso y dos tercios de leche vaporizada',50,7,50,1,'/Imagenes/Platillos/cafe-mocha.jpg'),
('Coca Cola','Bedida gaseosa',25,8,50,2,'/Imagenes/Platillos/coca-cola.jpg'),
('Pepsi','Bedida gaseosa',20,8,50,2,'/Imagenes/Platillos/pepsi.jpg'),
('Limonada Mineral','Refrescante limonada mineral',30,8,50,2,'/Imagenes/Platillos/limonada-mineral.jpg'),
('Naranjada Mineral','Refrescante naranjada mineral',30,8,50,2,'/Imagenes/Platillos/naranjada-mineral.jpg'),
('Agua','Agua Natural',12,8,50,2,'/Imagenes/Platillos/agua.jpg'),
('Clamato','Clamato es una bebida comercial hecha de concentrado de jugo de tomate reconstituido y azúcar',30,8,50,2,'/Imagenes/Platillos/clamato.jpg'),

('Cerveza','La cerveza es una bebida alcohólica que se produce a partir de la germinación de granos de cereales que se fermentan en agua.',30,9,50,3,'/Imagenes/Platillos/cerveza.jpg'),
('Cuba','El cubalibre es un cóctel cubano resultante de la mezcla del refresco de cola con ron. Una "Cubaby"',47,9,50,3,'/Imagenes/Platillos/cuba.jpg'),
('Paloma','La paloma es un cóctel a base de tequila.',43,9,50,3,'/Imagenes/Platillos/paloma.jpg');

INSERT INTO platillos (Pla_Nombre,Pla_Descripcion,Pla_Precio,Pla_Categoria_Id,Pla_Cantidad,Pla_Menu_Id,Pla_Imagen) VALUES
('Ensalada de Pasta con Atún y Kale','Si estás buscando un plato deliciosa y también ligero, tienes que probar esta ensalada de pasta con atun y kale.',70,4,50,3,'/Imagenes/Platillos/ensalada-de-pasta-con-atun-kale.jpg'),
('Ensalada Griega con Pasta','Si eres fan de las ensaladas saludables y también te encanta la pasta, no dejes pasar esta ensalada griega con pasta.',72,4,50,3,'/Imagenes/Platillos/ensalada-griega-con-pasta.jpg'),
('Ensalada de Quinoa con Camaron','Justo para explotar el máximo sabor de la ensalada de quinoa con camarón y enamorarte de ella, ¿te quedarás con el antojo?',80,4,50,3,'/Imagenes/Platillos/ensalada-de-quinoa-con-camaron.jpg');

INSERT INTO platillos (Pla_Nombre,Pla_Descripcion,Pla_Precio,Pla_Categoria_Id,Pla_Cantidad,Pla_Menu_Id,Pla_Imagen) VALUES
('Mojito','Un cóctel popular originario de Cuba, compuesto de ron, limón, menta o eucalipto y agua mineral.',47,9,50,1,'/Imagenes/Platillos/mojito.jpg'),
('Margarita','Un cóctel compuesto por tequila, triple sec y jugo de lima o limón. A menudo se sirve con sal en el borde de la copa.',47,9,50,1,'/Imagenes/Platillos/margarita.jpg'),
('Malteada','Es una bebida elaborada a base de leche o helado, que puede llevar frutas, chocolate, turrón o también helado.',35,9,50,1,'/Imagenes/Platillos/malteada.jpg'),
('Tequila','Bebida alcohólica que se obtiene a partir del agave, una planta que también se conoce como maguey.',44,9,50,2,'/Imagenes/Platillos/tequila.jpg'),
('Mezcal','Bebida alcohólica regional obtenida por destilación y rectificación de mostos preparados directa y azúcares',50,9,50,2,'/Imagenes/Platillos/mezcal.jpg'),
('Vino','Bebida obtenida de la uva, mediante la fermentación alcohólica de su mosto o zumo.​',54,9,50,2,'/Imagenes/Platillos/vino.jpg');

INSERT INTO platillos (Pla_Nombre,Pla_Descripcion,Pla_Precio,Pla_Categoria_Id,Pla_Cantidad,Pla_Menu_Id,Pla_Imagen) VALUES
('Mojito','Un cóctel popular originario de Cuba, compuesto de ron, limón, menta o eucalipto y agua mineral.',47,9,50,3,'/Imagenes/Platillos/mojito.jpg'),
('Margarita','Un cóctel compuesto por tequila, triple sec y jugo de lima o limón. A menudo se sirve con sal en el borde de la copa.',47,9,50,3,'/Imagenes/Platillos/margarita.jpg'),
('Malteada','Es una bebida elaborada a base de leche o helado, que puede llevar frutas, chocolate, turrón o también helado.',35,8,50,2,'/Imagenes/Platillos/malteada.jpg'),
('Tequila','Bebida alcohólica que se obtiene a partir del agave, una planta que también se conoce como maguey.',44,9,50,3,'/Imagenes/Platillos/tequila.jpg'),
('Mezcal','Bebida alcohólica regional obtenida por destilación y rectificación de mostos preparados directa y azúcares',50,9,50,3,'/Imagenes/Platillos/mezcal.jpg'),
('Vino','Bebida obtenida de la uva, mediante la fermentación alcohólica de su mosto o zumo.​',54,9,50,3,'/Imagenes/Platillos/vino.jpg');


INSERT INTO empleados (Emp_Nombre,Emp_Apellido_Paterno,Emp_Apellido_Materno, Emp_Email,Emp_telefono,Emp_Calle,Emp_Colonia,Emp_Fecha_Nacimiento,Emp_Password,Emp_Id_Tipo) 
VALUES 
('pepe','Zapata','Moreno','bimailb@vvvvm','5516','La Morena #1309','Narvarte','1998-12-01','a',4);


DELETE From platillos Where Pla_Nombre = 'Mojito';
DELETE From platillos Where Pla_Nombre = 'Margarita';
DELETE From platillos Where Pla_Nombre = 'Malteada';
DELETE From platillos Where Pla_Nombre = 'Tequila';
DELETE From platillos Where Pla_Nombre = 'Mezcal';
DELETE From platillos Where Pla_Nombre = 'Vino';