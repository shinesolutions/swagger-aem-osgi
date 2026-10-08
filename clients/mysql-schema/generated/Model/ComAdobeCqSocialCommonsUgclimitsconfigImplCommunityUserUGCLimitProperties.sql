--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitP`
--
SELECT `enable`, `UGCLimit`, `ugcLimitDuration`, `domains`, `toList` FROM `comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitP` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitP`
--
INSERT INTO `comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitP`(`enable`, `UGCLimit`, `ugcLimitDuration`, `domains`, `toList`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitP`
--
UPDATE `comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitP` SET `enable` = ?, `UGCLimit` = ?, `ugcLimitDuration` = ?, `domains` = ?, `toList` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitP`
--
DELETE FROM `comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitP` WHERE 0;

