--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialSrpImplSocialSolrConnectorInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialSrpImplSocialSolrConnectorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialSrpImplSocialSolrConnectorInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialSrpImplSocialSolrConnectorInfo`
--
INSERT INTO `comAdobeCqSocialSrpImplSocialSolrConnectorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialSrpImplSocialSolrConnectorInfo`
--
UPDATE `comAdobeCqSocialSrpImplSocialSolrConnectorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialSrpImplSocialSolrConnectorInfo`
--
DELETE FROM `comAdobeCqSocialSrpImplSocialSolrConnectorInfo` WHERE 0;

