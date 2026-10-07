--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixSystemreadyImplServicesCheckProperties' definition.
--


--
-- SELECT template for table `orgApacheFelixSystemreadyImplServicesCheckProperties`
--
SELECT `services.list`, `type` FROM `orgApacheFelixSystemreadyImplServicesCheckProperties` WHERE 1;

--
-- INSERT template for table `orgApacheFelixSystemreadyImplServicesCheckProperties`
--
INSERT INTO `orgApacheFelixSystemreadyImplServicesCheckProperties`(`services.list`, `type`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheFelixSystemreadyImplServicesCheckProperties`
--
UPDATE `orgApacheFelixSystemreadyImplServicesCheckProperties` SET `services.list` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixSystemreadyImplServicesCheckProperties`
--
DELETE FROM `orgApacheFelixSystemreadyImplServicesCheckProperties` WHERE 0;

