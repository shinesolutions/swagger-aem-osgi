--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixSystemreadyImplServicesCheckInfo' definition.
--


--
-- SELECT template for table `orgApacheFelixSystemreadyImplServicesCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheFelixSystemreadyImplServicesCheckInfo` WHERE 1;

--
-- INSERT template for table `orgApacheFelixSystemreadyImplServicesCheckInfo`
--
INSERT INTO `orgApacheFelixSystemreadyImplServicesCheckInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixSystemreadyImplServicesCheckInfo`
--
UPDATE `orgApacheFelixSystemreadyImplServicesCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixSystemreadyImplServicesCheckInfo`
--
DELETE FROM `orgApacheFelixSystemreadyImplServicesCheckInfo` WHERE 0;

