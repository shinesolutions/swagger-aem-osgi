--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo`
--
INSERT INTO `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo`
--
UPDATE `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo`
--
DELETE FROM `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo` WHERE 0;

