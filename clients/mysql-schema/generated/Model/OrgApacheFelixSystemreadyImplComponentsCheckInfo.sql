--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixSystemreadyImplComponentsCheckInfo' definition.
--


--
-- SELECT template for table `orgApacheFelixSystemreadyImplComponentsCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheFelixSystemreadyImplComponentsCheckInfo` WHERE 1;

--
-- INSERT template for table `orgApacheFelixSystemreadyImplComponentsCheckInfo`
--
INSERT INTO `orgApacheFelixSystemreadyImplComponentsCheckInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixSystemreadyImplComponentsCheckInfo`
--
UPDATE `orgApacheFelixSystemreadyImplComponentsCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixSystemreadyImplComponentsCheckInfo`
--
DELETE FROM `orgApacheFelixSystemreadyImplComponentsCheckInfo` WHERE 0;

