--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliP`
--
SELECT `default.attachment.type.blacklist`, `baseline.attachment.type.blacklist` FROM `comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliP` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliP`
--
INSERT INTO `comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliP`(`default.attachment.type.blacklist`, `baseline.attachment.type.blacklist`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliP`
--
UPDATE `comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliP` SET `default.attachment.type.blacklist` = ?, `baseline.attachment.type.blacklist` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliP`
--
DELETE FROM `comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliP` WHERE 0;

