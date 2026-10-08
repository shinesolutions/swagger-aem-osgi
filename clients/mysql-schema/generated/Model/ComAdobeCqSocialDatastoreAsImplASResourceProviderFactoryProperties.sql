--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperti`
--
SELECT `version.id`, `cache.on`, `concurrency.level`, `cache.start.size`, `cache.ttl`, `cache.size`, `time.limit` FROM `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperti` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperti`
--
INSERT INTO `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperti`(`version.id`, `cache.on`, `concurrency.level`, `cache.start.size`, `cache.ttl`, `cache.size`, `time.limit`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperti`
--
UPDATE `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperti` SET `version.id` = ?, `cache.on` = ?, `concurrency.level` = ?, `cache.start.size` = ?, `cache.ttl` = ?, `cache.size` = ?, `time.limit` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperti`
--
DELETE FROM `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperti` WHERE 0;

