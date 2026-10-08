--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenP`
--
SELECT `attachmentTypeBlacklist`, `extension.order` FROM `comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenP` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenP`
--
INSERT INTO `comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenP`(`attachmentTypeBlacklist`, `extension.order`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenP`
--
UPDATE `comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenP` SET `attachmentTypeBlacklist` = ?, `extension.order` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenP`
--
DELETE FROM `comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenP` WHERE 0;

