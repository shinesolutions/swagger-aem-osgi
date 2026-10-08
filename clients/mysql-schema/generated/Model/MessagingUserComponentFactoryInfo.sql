--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'MessagingUserComponentFactoryInfo' definition.
--


--
-- SELECT template for table `MessagingUserComponentFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `MessagingUserComponentFactoryInfo` WHERE 1;

--
-- INSERT template for table `MessagingUserComponentFactoryInfo`
--
INSERT INTO `MessagingUserComponentFactoryInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `MessagingUserComponentFactoryInfo`
--
UPDATE `MessagingUserComponentFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `MessagingUserComponentFactoryInfo`
--
DELETE FROM `MessagingUserComponentFactoryInfo` WHERE 0;

