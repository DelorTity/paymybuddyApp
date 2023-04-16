DROP DATABASE IF EXISTS paymybuddy;
CREATE DATABASE paymybuddy;
USE paymybuddy;
--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
   `name` varchar(225) NOT NULL,
  `surname` varchar(225) NOT NULL,
  `email` varchar(225) NOT NULL,
  `telephone` varchar(225) NOT NULL,
  `sold` int(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`name`, `surname`,`email`, `telephone`, `sold`) VALUES
('Komto', 'Pierre-Yves', 'komto@gmail.com', '651-955471', 100000),
('Nzima', 'Thone', 'nzima@yahoo.com',`695-624691`, 200000);


-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contacts`;
CREATE TABLE IF NOT EXISTS `contacts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `users_id` int(11) NOT NULL,
  `payement_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `users_id` (`users_id`)
  KEY `payement_id` (`payement_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Constraints for dumped tables
--
INSERT INTO `contacts` (`id`, `users_id`, 'payement_id') VALUES

(1,),
(5,),
(8,),
(9,),
(16,),
(21,);


--
-- Table structure for table `payement`
--

DROP TABLE IF EXISTS `payement`;
CREATE TABLE IF NOT EXISTS `payement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_dest` int(11) NOT NULL,
  PRIMARY KEY (`id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
CREATE TABLE IF NOT EXISTS `transactions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
   `type` varchar(225) NOT NULL,
  `account_number_dest` varchar(225) NOT NULL,
  `amount` int(20) NOT NULL,
  `status` varchar(225) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
CREATE TABLE IF NOT EXISTS `accounts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_number` varchar(225) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `account`
--

INSERT INTO `accounts` (`account_number`) VALUES
('01009005299565195'),
('0105100507565195');


--
-- Constraints for table `contacts`
--
ALTER TABLE `contacts`
  ADD CONSTRAINT `users_idfk_1` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
    ADD CONSTRAINT `payement_idfk_1` FOREIGN KEY (`payement_id`) REFERENCES `payement` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

DROP DATABASE IF EXISTS paymybuddytest;
CREATE DATABASE paymybuddytest;
use paymybuddytest;

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
   `name` varchar(225) NOT NULL,
  `surname` varchar(225) NOT NULL,
  `email` varchar(225) NOT NULL,
  `telephone` varchar(225) NOT NULL,
  `sold` int(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`name`, `surname`,`email`, `telephone`, `sold`) VALUES
('Komto', 'Pierre-Yves', 'komto@gmail.com', '651-955471', 100000),
('Nzima', 'Thone', 'nzima@yahoo.com',`695-624691`, 200000);


-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contacts`;
CREATE TABLE IF NOT EXISTS `contacts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `users_id` int(11) NOT NULL,
  `payement_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `users_id` (`users_id`)
  KEY `payement_id` (`payement_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Constraints for dumped tables
--
INSERT INTO `contacts` (`id`, `users_id`, 'payement_id') VALUES

(1,),
(5,),
(8,),
(9,),
(16,),
(21,);


--
-- Table structure for table `payement`
--

DROP TABLE IF EXISTS `payement`;
CREATE TABLE IF NOT EXISTS `payement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_dest` int(11) NOT NULL,
  PRIMARY KEY (`id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
CREATE TABLE IF NOT EXISTS `transactions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
   `type` varchar(225) NOT NULL,
  `account_number_dest` varchar(225) NOT NULL,
  `amount` int(20) NOT NULL,
  `status` varchar(225) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
CREATE TABLE IF NOT EXISTS `accounts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_number` varchar(225) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `account`
--

INSERT INTO `accounts` (`account_number`) VALUES
('01009005299'),
('01051005075');


--
-- Constraints for table `contacts`
--
ALTER TABLE `contacts`
  ADD CONSTRAINT `users_idfk_1` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
    ADD CONSTRAINT `payement_idfk_1` FOREIGN KEY (`payement_id`) REFERENCES `payement` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

