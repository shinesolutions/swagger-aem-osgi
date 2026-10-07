--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo' definition.
--


--
-- SELECT template for table `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle` WHERE 1;

--
-- INSERT template for table `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle`
--
INSERT INTO `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle`
--
UPDATE `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle`
--
DELETE FROM `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle` WHERE 0;

