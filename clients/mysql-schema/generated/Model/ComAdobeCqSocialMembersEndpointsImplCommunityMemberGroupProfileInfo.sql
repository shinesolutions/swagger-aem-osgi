--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileI`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileI` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileI`
--
INSERT INTO `comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileI`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileI`
--
UPDATE `comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileI`
--
DELETE FROM `comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileI` WHERE 0;

