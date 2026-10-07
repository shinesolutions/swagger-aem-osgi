--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF`
--
SELECT `everyoneLimit`, `priority` FROM `comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF`
--
INSERT INTO `comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF`(`everyoneLimit`, `priority`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF`
--
UPDATE `comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF` SET `everyoneLimit` = ?, `priority` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF`
--
DELETE FROM `comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF` WHERE 0;

