--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixJaasConfigurationSpiInfo' definition.
--


--
-- SELECT template for table `orgApacheFelixJaasConfigurationSpiInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheFelixJaasConfigurationSpiInfo` WHERE 1;

--
-- INSERT template for table `orgApacheFelixJaasConfigurationSpiInfo`
--
INSERT INTO `orgApacheFelixJaasConfigurationSpiInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixJaasConfigurationSpiInfo`
--
UPDATE `orgApacheFelixJaasConfigurationSpiInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixJaasConfigurationSpiInfo`
--
DELETE FROM `orgApacheFelixJaasConfigurationSpiInfo` WHERE 0;

