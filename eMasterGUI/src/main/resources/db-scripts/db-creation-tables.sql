create database emaster;
CREATE USER 'emaster_admin'@'%' IDENTIFIED BY 'Fun1Learn_admin';

CREATE USER 'emaster_user'@'%' IDENTIFIED BY 'Fun1Learn_user';

GRANT ALL PRIVILEGES ON emaster.* TO 'emaster_admin'@'%' WITH GRANT OPTION;
use emaster;

CREATE TABLE `user_info` (
  `user_id` INT NOT NULL,
  `user_email` VARCHAR(50) NOT NULL,
  `progress` VARCHAR(1000) NULL,
  `device_id` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`user_email`, `device_id`));


CREATE TABLE `category` (
  `category_id` INT NOT NULL,
  `category_desc` VARCHAR(100) NOT NULL,
  `sub_category_desc` VARCHAR(100) NULL,
  PRIMARY KEY (`category_id`));




CREATE TABLE `questions` (
  `question_id` INT NOT NULL,
  `question_number` INT NOT NULL,
  `question_text` VARCHAR(1000) NOT NULL,
  `category_id` INT NOT NULL,
  `diff_id` INT NOT NULL,
  `question_answer` VARCHAR(10) NOT NULL,
  `option1` VARCHAR(200) NULL,
  `option2` VARCHAR(200) NULL,
  `option3` VARCHAR(200) NULL,
  `option4` VARCHAR(200) NULL,
  `option6` VARCHAR(200) NULL,
  `option5` VARCHAR(200) NULL,
  `explanation` VARCHAR(1000) NULL,
  PRIMARY KEY (`question_id`),
  INDEX `fk_cat_id1_idx` (`category_id` ASC),
  CONSTRAINT `fk_cat_id1`
    FOREIGN KEY (`category_id`)
    REFERENCES `category` (`category_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


    select * from questions;

    insert into category VALUES(1,"simple", "simple");