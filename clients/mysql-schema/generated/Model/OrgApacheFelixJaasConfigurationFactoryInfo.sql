--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixJaasConfigurationFactoryInfo' definition.
--


--
-- SELECT template for table `orgApacheFelixJaasConfigurationFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheFelixJaasConfigurationFactoryInfo` WHERE 1;

--
-- INSERT template for table `orgApacheFelixJaasConfigurationFactoryInfo`
--
INSERT INTO `orgApacheFelixJaasConfigurationFactoryInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixJaasConfigurationFactoryInfo`
--
UPDATE `orgApacheFelixJaasConfigurationFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixJaasConfigurationFactoryInfo`
--
DELETE FROM `orgApacheFelixJaasConfigurationFactoryInfo` WHERE 0;

