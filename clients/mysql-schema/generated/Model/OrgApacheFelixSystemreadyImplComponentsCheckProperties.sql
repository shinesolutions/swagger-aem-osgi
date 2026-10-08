--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixSystemreadyImplComponentsCheckProperties' definition.
--


--
-- SELECT template for table `orgApacheFelixSystemreadyImplComponentsCheckProperties`
--
SELECT `components.list`, `type` FROM `orgApacheFelixSystemreadyImplComponentsCheckProperties` WHERE 1;

--
-- INSERT template for table `orgApacheFelixSystemreadyImplComponentsCheckProperties`
--
INSERT INTO `orgApacheFelixSystemreadyImplComponentsCheckProperties`(`components.list`, `type`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheFelixSystemreadyImplComponentsCheckProperties`
--
UPDATE `orgApacheFelixSystemreadyImplComponentsCheckProperties` SET `components.list` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixSystemreadyImplComponentsCheckProperties`
--
DELETE FROM `orgApacheFelixSystemreadyImplComponentsCheckProperties` WHERE 0;

