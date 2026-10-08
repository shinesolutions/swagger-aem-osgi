--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixJaasConfigurationSpiProperties' definition.
--


--
-- SELECT template for table `orgApacheFelixJaasConfigurationSpiProperties`
--
SELECT `jaas.defaultRealmName`, `jaas.configProviderName`, `jaas.globalConfigPolicy` FROM `orgApacheFelixJaasConfigurationSpiProperties` WHERE 1;

--
-- INSERT template for table `orgApacheFelixJaasConfigurationSpiProperties`
--
INSERT INTO `orgApacheFelixJaasConfigurationSpiProperties`(`jaas.defaultRealmName`, `jaas.configProviderName`, `jaas.globalConfigPolicy`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixJaasConfigurationSpiProperties`
--
UPDATE `orgApacheFelixJaasConfigurationSpiProperties` SET `jaas.defaultRealmName` = ?, `jaas.configProviderName` = ?, `jaas.globalConfigPolicy` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixJaasConfigurationSpiProperties`
--
DELETE FROM `orgApacheFelixJaasConfigurationSpiProperties` WHERE 0;

