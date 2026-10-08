--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorI`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorI` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorI`
--
INSERT INTO `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorI`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorI`
--
UPDATE `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorI`
--
DELETE FROM `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorI` WHERE 0;

