drop database dtbAlmacen;
create database dtbAlmacen;
use dtbAlmacen;
-- tabla de Usuarios
create table tblUsuarios(
		IdUsuarios int not null auto_increment,
        Nombre varchar(45) not null,
        Usuario varchar(45) not null,
        Clave varchar(45) not null,
        Perfil varchar(45) not null,
        primary key(IdUsuarios)
        );

-- tabla de lineas
create table tblLineas(
		IdLineas int not null auto_increment,
        Nombre varchar(45) not null,
        primary key(IdLineas)
        );

-- tabla de Proveedores
create table tblProveedores(
		IdProveedores int not null auto_increment,
        NombreRS varchar(45) not null,
        Telefono varchar(45) not null,
        Domicilio varchar(45) not null,
        primary key(IdProveedores)
        );

-- tabla de Almacen
create table tblAlmacen(
		IdAlmacen int not null auto_increment,
        LineasId int not null,
        Descripcion varchar(45) not null,
        Stock int not null,
        UMedida varchar(45) not null,
        PUnitario decimal(10,2),
        primary key(IdAlmacen),
        foreign key(LineasId) references tblLineas(IdLineas)
        );
-- tabla de Facturas
create table tblFacturas(
		IdFacturas int not null auto_increment,
        LineasId int not null,
        ProveedoresId int not null,
        FechaEntrada date  not null,
        primary key(IdFacturas),
        foreign key(LineasId)
        references tblLineas(IdLineas),
        foreign key(ProveedoresId) references tblProveedores(IdProveedores)
        );
-- tabla detalle de facturas
create table tblDetalleFacturas(
		IdDetalleFacturas not null auto_increment,
        FacturasId int not null,
        MaterialesId int not null,
        Cantidad int not null,
        Total decimal(10,2) not null,
        primary key(IdDetalleFacturas),
        foreign key(FacturasId) references tblFacturas(IdFacturas),
        foreign key(MaterialesId) references tblAlmacen(IdAlmacen)
        );
-- Tabla de Areas
create table tblAreas(
		IdAreas int not null auto_increment,
        Nombre varchar(45) not null,
        primary key(IdAreas)
        );
-- Tabla de Recibos
create table tblRecibos(
		IdRecibos int not null auto_increment,
        AreasId int not null,
        FechaSalida date not null,
        PersonaRecibe varchar(45) not null,
        PersonaEntrega varchar(45) not null,
        primary key(IdRecibos),
        foreign key(AreasId) references tblAreas(IdAreas)
        );

-- Tabla Detalle Recibos
create table tblDetalleRecibos(
		IdDetalleRecibos int not null auto_increment,
        RecibosId int not null,
        MaterialesId int not null,
        Cantidad int not null,
        total decimal(10,2) not null,
        primary key(IdDetalleRecibos),
        foreign key(RecibosId) references tblRecibos(IdRecibos),
        foreign key(MaterialesId) references tblAlmacen(IdAlmacen)
        );
-- Tabla Cliente
create table 
