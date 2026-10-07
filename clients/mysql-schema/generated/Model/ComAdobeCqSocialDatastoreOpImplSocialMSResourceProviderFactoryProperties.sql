--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPr`
--
SELECT `solr.zk.timeout`, `solr.commit`, `cache.on`, `concurrency.level`, `cache.start.size`, `cache.ttl`, `cache.size` FROM `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPr`
--
INSERT INTO `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPr`(`solr.zk.timeout`, `solr.commit`, `cache.on`, `concurrency.level`, `cache.start.size`, `cache.ttl`, `cache.size`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPr`
--
UPDATE `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPr` SET `solr.zk.timeout` = ?, `solr.commit` = ?, `cache.on` = ?, `concurrency.level` = ?, `cache.start.size` = ?, `cache.ttl` = ?, `cache.size` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPr`
--
DELETE FROM `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPr` WHERE 0;

