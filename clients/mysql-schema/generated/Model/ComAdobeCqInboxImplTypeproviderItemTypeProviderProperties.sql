--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqInboxImplTypeproviderItemTypeProviderProperties' definition.
--


--
-- SELECT template for table `comAdobeCqInboxImplTypeproviderItemTypeProviderProperties`
--
SELECT `inbox.impl.typeprovider.registrypaths`, `inbox.impl.typeprovider.legacypaths`, `inbox.impl.typeprovider.defaulturl.failureitem`, `inbox.impl.typeprovider.defaulturl.workitem`, `inbox.impl.typeprovider.defaulturl.task` FROM `comAdobeCqInboxImplTypeproviderItemTypeProviderProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqInboxImplTypeproviderItemTypeProviderProperties`
--
INSERT INTO `comAdobeCqInboxImplTypeproviderItemTypeProviderProperties`(`inbox.impl.typeprovider.registrypaths`, `inbox.impl.typeprovider.legacypaths`, `inbox.impl.typeprovider.defaulturl.failureitem`, `inbox.impl.typeprovider.defaulturl.workitem`, `inbox.impl.typeprovider.defaulturl.task`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqInboxImplTypeproviderItemTypeProviderProperties`
--
UPDATE `comAdobeCqInboxImplTypeproviderItemTypeProviderProperties` SET `inbox.impl.typeprovider.registrypaths` = ?, `inbox.impl.typeprovider.legacypaths` = ?, `inbox.impl.typeprovider.defaulturl.failureitem` = ?, `inbox.impl.typeprovider.defaulturl.workitem` = ?, `inbox.impl.typeprovider.defaulturl.task` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqInboxImplTypeproviderItemTypeProviderProperties`
--
DELETE FROM `comAdobeCqInboxImplTypeproviderItemTypeProviderProperties` WHERE 0;

