--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOI`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOI` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOI`
--
INSERT INTO `comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOI`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOI`
--
UPDATE `comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOI`
--
DELETE FROM `comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOI` WHERE 0;

