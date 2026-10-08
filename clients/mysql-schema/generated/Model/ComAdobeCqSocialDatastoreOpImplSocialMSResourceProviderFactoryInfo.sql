--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryIn` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryIn`
--
INSERT INTO `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryIn`
--
UPDATE `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryIn`
--
DELETE FROM `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryIn` WHERE 0;

