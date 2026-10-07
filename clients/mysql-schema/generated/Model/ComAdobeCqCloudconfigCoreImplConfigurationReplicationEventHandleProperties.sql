--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties' definition.
--


--
-- SELECT template for table `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle`
--
SELECT `flush.agents` FROM `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle` WHERE 1;

--
-- INSERT template for table `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle`
--
INSERT INTO `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle`(`flush.agents`) VALUES (?);

--
-- UPDATE template for table `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle`
--
UPDATE `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle` SET `flush.agents` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle`
--
DELETE FROM `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle` WHERE 0;

