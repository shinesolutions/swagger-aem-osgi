--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqInboxImplTypeproviderItemTypeProviderInfo' definition.
--


--
-- SELECT template for table `comAdobeCqInboxImplTypeproviderItemTypeProviderInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqInboxImplTypeproviderItemTypeProviderInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqInboxImplTypeproviderItemTypeProviderInfo`
--
INSERT INTO `comAdobeCqInboxImplTypeproviderItemTypeProviderInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqInboxImplTypeproviderItemTypeProviderInfo`
--
UPDATE `comAdobeCqInboxImplTypeproviderItemTypeProviderInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqInboxImplTypeproviderItemTypeProviderInfo`
--
DELETE FROM `comAdobeCqInboxImplTypeproviderItemTypeProviderInfo` WHERE 0;

