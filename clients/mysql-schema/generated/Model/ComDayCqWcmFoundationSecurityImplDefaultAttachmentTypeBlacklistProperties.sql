--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistP`
--
SELECT `default.attachment.type.blacklist`, `baseline.attachment.type.blacklist` FROM `comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistP` WHERE 1;

--
-- INSERT template for table `comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistP`
--
INSERT INTO `comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistP`(`default.attachment.type.blacklist`, `baseline.attachment.type.blacklist`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistP`
--
UPDATE `comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistP` SET `default.attachment.type.blacklist` = ?, `baseline.attachment.type.blacklist` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistP`
--
DELETE FROM `comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistP` WHERE 0;

