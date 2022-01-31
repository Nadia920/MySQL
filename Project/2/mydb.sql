CREATE TABLE `Взятые взаймы средства у банка ` (
    `Фио того, кто берёт` varchar(60) NOT NULL,
	`Номер паспорта` varchar(20) NOT NULL,
	`Дата рождения` DATE NOT NULL,
	`Причина` varchar(45) NOT NULL,
	`Сумма` varchar(10) NOT NULL DEFAULT '0',
	`Срок возвращения средств` DATE NOT NULL,
    	`Проценты` varchar(4) NOT NULL,
    	`Фио поручителя` varchar(60) NOT NULL,
    	`Дата рождения поручителя` DATE NOT NULL ,
    	`Номер паспорта поручителя` varchar(20) NOT NULL ',
	PRIMARY KEY (`Фио того, кто берёт`)
);

CREATE TABLE `Заявки клиентов` (
	`Кто` varchar(60) NOT NULL ,
	`На что` varchar(45) NOT NULL,
	`Описание` varchar(60) NOT NULL,
	`Статус` varchar(10) NOT NULL,
    `Информация об исполнении` varchar(10) NOT NULL DEFAULT '4',
	PRIMARY KEY (`Кто`)
);

CREATE TABLE `Карты` (
	`Номер карты` varchar(20) NOT NULL,
	`Номер счёта` varchar(20) NOT NULL,
	`Срок действия` varchar(10) NOT NULL,
	`3 цифры на обороте` INT(3) NOT NULL,
	`Фио владельца` varchar(60) NOT NULL,
    `Дата рождения владельца` DATE NOT NULL,
    `Баланс карты` varchar(10) NOT NULL,
	PRIMARY KEY (`Номер карты`)
);

CREATE TABLE `Клиенты банка` (
	`ФИО` varchar(60) NOT NULL ,
	`Дата рождения` DATE NOT NULL,
	`Номер паспорта` varchar(20) NOT NULL,
	`Есть работа или нет(Да/Нет)` varchar(3) NOT NULL,
     Номер телефона` varchar(45) NOT NULL,
     Номер счёта в банке` varchar(20) NOT NULL,
     Номер карты` varchar(20) NOT NULL,
     Кредитная история` varchar(300) NOT NULL,
	PRIMARY KEY (`ФИО`)
);
CREATE TABLE `Платежи` (
	`Номер карты` varchar(20) NOT NULL,
	`Информация о платеже` varchar(200) NOT NULL,
	`Сумма платежа`varchar(10) NOT NULL,
	`Статус` varchar(10) NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`Номер карты`)
);
CREATE TABLE `Пользователи` (
	`Имя пользователя` varchar(20) NOT NULL,
	`Логин` varchar(20) NOT NULL,
	`Пароль` varchar(20) NOT NULL,
	`Второй пароль`varchar(20) NOT NULL,
    Счёт в банке` varchar(45) NOT NULL,
    Номер карты` varchar(20) NOT NULL,
	PRIMARY KEY (`Имя пользовател`)
);
CREATE TABLE `Услуги банка` (
	`Название услуги` varchar(45) NOT NULL,
	`Описание услуги` varchar(45) NOT NULL,
	`Кому предоставляется` varchar(20) NOT NULL,
	PRIMARY KEY (`Название услуги`)
);
ALTER TABLE `Взятые взаймы средства у банка` ADD CONSTRAINT `Клиенты банка` FOREIGN KEY (`Номер паспорта`) REFERENCES `Клиенты банка`(`Номер паспорта`);

ALTER TABLE `Заявки клиентов` ADD CONSTRAINT `Клиенты банка` FOREIGN KEY (`Кто`) REFERENCES `Клиенты банка`(`ФИО`);

ALTER TABLE `Карты` ADD CONSTRAINT `Платежи` FOREIGN KEY (`Номер карты`) REFERENCES `Платежи`(`Номер картвы`);
ALTER TABLE `Клиенты банка` ADD CONSTRAINT `Карты` FOREIGN KEY (`Номер карты`) REFERENCES `Карты`(`Номер картвы`);
ALTER TABLE `Клиенты банка` ADD CONSTRAINT `Пользователи` FOREIGN KEY (`Номер счёта в банке`) REFERENCES `Пользователи`(`Номер картвы`);