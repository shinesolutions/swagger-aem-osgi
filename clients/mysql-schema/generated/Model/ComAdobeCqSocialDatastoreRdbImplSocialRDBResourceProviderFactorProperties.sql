--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorP`
--
SELECT `solr.zk.timeout`, `solr.commit`, `cache.on`, `concurrency.level`, `cache.start.size`, `cache.ttl`, `cache.size` FROM `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorP` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorP`
--
INSERT INTO `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorP`(`solr.zk.timeout`, `solr.commit`, `cache.on`, `concurrency.level`, `cache.start.size`, `cache.ttl`, `cache.size`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorP`
--
UPDATE `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorP` SET `solr.zk.timeout` = ?, `solr.commit` = ?, `cache.on` = ?, `concurrency.level` = ?, `cache.start.size` = ?, `cache.ttl` = ?, `cache.size` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorP`
--
DELETE FROM `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorP` WHERE 0;

