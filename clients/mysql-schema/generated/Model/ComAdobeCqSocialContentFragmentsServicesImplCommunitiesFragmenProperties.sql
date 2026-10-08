--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPr`
--
SELECT `cq.social.content.fragments.services.enabled`, `cq.social.content.fragments.services.waitTimeSeconds` FROM `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPr`
--
INSERT INTO `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPr`(`cq.social.content.fragments.services.enabled`, `cq.social.content.fragments.services.waitTimeSeconds`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPr`
--
UPDATE `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPr` SET `cq.social.content.fragments.services.enabled` = ?, `cq.social.content.fragments.services.waitTimeSeconds` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPr`
--
DELETE FROM `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPr` WHERE 0;

