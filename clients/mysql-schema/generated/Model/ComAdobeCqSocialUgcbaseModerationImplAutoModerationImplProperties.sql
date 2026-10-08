--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertie`
--
SELECT `automoderation.sequence`, `automoderation.onfailurestop` FROM `comAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertie` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertie`
--
INSERT INTO `comAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertie`(`automoderation.sequence`, `automoderation.onfailurestop`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertie`
--
UPDATE `comAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertie` SET `automoderation.sequence` = ?, `automoderation.onfailurestop` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertie`
--
DELETE FROM `comAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertie` WHERE 0;

