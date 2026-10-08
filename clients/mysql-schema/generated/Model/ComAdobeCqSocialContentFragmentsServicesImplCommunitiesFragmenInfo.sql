--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenIn` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenIn`
--
INSERT INTO `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenIn`
--
UPDATE `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenIn`
--
DELETE FROM `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenIn` WHERE 0;

