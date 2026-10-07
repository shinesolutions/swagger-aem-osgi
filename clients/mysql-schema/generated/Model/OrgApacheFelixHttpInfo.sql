--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixHttpInfo' definition.
--


--
-- SELECT template for table `orgApacheFelixHttpInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheFelixHttpInfo` WHERE 1;

--
-- INSERT template for table `orgApacheFelixHttpInfo`
--
INSERT INTO `orgApacheFelixHttpInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixHttpInfo`
--
UPDATE `orgApacheFelixHttpInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixHttpInfo`
--
DELETE FROM `orgApacheFelixHttpInfo` WHERE 0;

