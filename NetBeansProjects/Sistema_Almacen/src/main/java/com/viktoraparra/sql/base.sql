drop database DBAlmacen;
create database DBAlmacen;
use DBAlmacen;
-- tabla de usuarios
create table Usuarios(
        Codigo int not null auto_increment,
        Nombre varchar (24) not null,
        Usuario varchar (24) not null,
        Clave varchar (12) not null,
        Perfil enum('Administrador','Supervisor','Vendedor','Empleado'),
        primary key(IdUsuario));
-- tabla de lineas        
create table Lineas(
		Codigo int not null auto_increment,
        Nombre varchar (24) not null,
        primary key(IdLineas));
-- Tabla Proveedores
create table Proveedores(
        Codigo int not null auto_increment,
        NombreRS varchar (42) not null,
        telefono varchar (18) not null,
        Domicilio varchar(42) not null,
        primary key(IdProveedores));
-- tabla almacen
-- idAlmacen se puede configurar con codigos de barras
create table Almacen(
		Codigo int not null auto_increment,
        LineasId int not null,
        Descripcion varchar(42) not null,
        Stock int not null,
        UMedida varchar (24) not null,
        PUnitario decimal(10,2) not null,
        primary key(IdAlmacen),
        foreign key(LineasID) references Lineas(Codigo));
-- tabla de facturas        
create table Facturas(
		Codigo int not null auto_increment,
        LineasId int not null,
        ProveedoresId int not null,
        FechaEntrada date not null,
        primary key(IdFacturas),
        foreign key(LineasId) references Lineas(Codigo),
        foreign key(ProveedoresId) references Proveedores(Codigo));
-- tabla detalle de facturas
create table DetalleFacturas(
		Codigo int not null auto_increment,
		FacturasId int not null,
        MaterialesId int not null,
        Cantidad int not null,
        Total decimal(10,2) not null,
        primary key(IdDetalleFacturas),
        foreign key(FacturasId) references Facturas(Codigo),
        foreign key(MaterialesId) references Almacen(Codigo));
-- tabla de Areas
create table Areas(
		Codigo int not null auto_increment,
        Nombre varchar(28)not null,
        primary key(IdAreas));
-- Tabla Recibos
 create table Recibos(
		Codigo int not null auto_increment,
        AreasId int not null,
        FechaSalida date not null,
        PersonaRecibe varchar(42) not null,
        PersonaEntrega varchar(42) not null,
        primary key(IdRecibos),
        foreign key(AreasId) references Areas(Codigo));       
-- Tabla Detalle de recibos
create table DetalleRecibos(
		Codigo int not null auto_increment,
        RecibosId int not null,
        MaterialesId int not null,
        Cantidad int not null,
        Total decimal(10,2) not null,
        primary key(IdDetalleRecibos),
        foreign key(RecibosId) references Recibos(Codigo),
        foreign key(MaterialesId) references Almacen(Codigo));
-- Tabla de Clientes
create table Clientes(
		Codigo int not null unique,
        Nombre varchar(20) not null,
        Apellido varchar(20) not null,
        telefono varchar(20) not null,
        Correo varchar(30),
        domicilio varchar(50),
        primary key(Codigo)
        );
-- Tabla Domicilio
create table Domicilio(
		calle varchar(25) not null,
        numero int not null,
        PisoOcasa varchar(10) not null,
        Barrio varchar(25) not null,
        Provincia varchar(30) not null,
        Ciudad varchar(30) not null
        );
