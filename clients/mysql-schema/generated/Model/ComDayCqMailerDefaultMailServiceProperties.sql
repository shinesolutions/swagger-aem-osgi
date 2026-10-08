--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMailerDefaultMailServiceProperties' definition.
--


--
-- SELECT template for table `comDayCqMailerDefaultMailServiceProperties`
--
SELECT `smtp.host`, `smtp.port`, `smtp.user`, `smtp.password`, `from.address`, `smtp.ssl`, `smtp.starttls`, `debug.email` FROM `comDayCqMailerDefaultMailServiceProperties` WHERE 1;

--
-- INSERT template for table `comDayCqMailerDefaultMailServiceProperties`
--
INSERT INTO `comDayCqMailerDefaultMailServiceProperties`(`smtp.host`, `smtp.port`, `smtp.user`, `smtp.password`, `from.address`, `smtp.ssl`, `smtp.starttls`, `debug.email`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqMailerDefaultMailServiceProperties`
--
UPDATE `comDayCqMailerDefaultMailServiceProperties` SET `smtp.host` = ?, `smtp.port` = ?, `smtp.user` = ?, `smtp.password` = ?, `from.address` = ?, `smtp.ssl` = ?, `smtp.starttls` = ?, `debug.email` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMailerDefaultMailServiceProperties`
--
DELETE FROM `comDayCqMailerDefaultMailServiceProperties` WHERE 0;

