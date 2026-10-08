--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixJaasConfigurationFactoryProperties' definition.
--


--
-- SELECT template for table `orgApacheFelixJaasConfigurationFactoryProperties`
--
SELECT `jaas.controlFlag`, `jaas.ranking`, `jaas.realmName`, `jaas.classname`, `jaas.options` FROM `orgApacheFelixJaasConfigurationFactoryProperties` WHERE 1;

--
-- INSERT template for table `orgApacheFelixJaasConfigurationFactoryProperties`
--
INSERT INTO `orgApacheFelixJaasConfigurationFactoryProperties`(`jaas.controlFlag`, `jaas.ranking`, `jaas.realmName`, `jaas.classname`, `jaas.options`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixJaasConfigurationFactoryProperties`
--
UPDATE `orgApacheFelixJaasConfigurationFactoryProperties` SET `jaas.controlFlag` = ?, `jaas.ranking` = ?, `jaas.realmName` = ?, `jaas.classname` = ?, `jaas.options` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixJaasConfigurationFactoryProperties`
--
DELETE FROM `orgApacheFelixJaasConfigurationFactoryProperties` WHERE 0;

