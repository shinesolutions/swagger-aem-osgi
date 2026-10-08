--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPr`
--
SELECT `message.properties`, `messageBoxSizeLimit`, `messageCountLimit`, `notifyFailure`, `failureMessageFrom`, `failureTemplatePath`, `maxRetries`, `minWaitBetweenRetries`, `countUpdatePoolSize`, `inbox.path`, `sentitems.path`, `supportAttachments`, `supportGroupMessaging`, `maxTotalRecipients`, `batchSize`, `maxTotalAttachmentSize`, `attachmentTypeBlacklist`, `allowedAttachmentTypes`, `serviceSelector`, `fieldWhitelist` FROM `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPr`
--
INSERT INTO `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPr`(`message.properties`, `messageBoxSizeLimit`, `messageCountLimit`, `notifyFailure`, `failureMessageFrom`, `failureTemplatePath`, `maxRetries`, `minWaitBetweenRetries`, `countUpdatePoolSize`, `inbox.path`, `sentitems.path`, `supportAttachments`, `supportGroupMessaging`, `maxTotalRecipients`, `batchSize`, `maxTotalAttachmentSize`, `attachmentTypeBlacklist`, `allowedAttachmentTypes`, `serviceSelector`, `fieldWhitelist`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPr`
--
UPDATE `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPr` SET `message.properties` = ?, `messageBoxSizeLimit` = ?, `messageCountLimit` = ?, `notifyFailure` = ?, `failureMessageFrom` = ?, `failureTemplatePath` = ?, `maxRetries` = ?, `minWaitBetweenRetries` = ?, `countUpdatePoolSize` = ?, `inbox.path` = ?, `sentitems.path` = ?, `supportAttachments` = ?, `supportGroupMessaging` = ?, `maxTotalRecipients` = ?, `batchSize` = ?, `maxTotalAttachmentSize` = ?, `attachmentTypeBlacklist` = ?, `allowedAttachmentTypes` = ?, `serviceSelector` = ?, `fieldWhitelist` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPr`
--
DELETE FROM `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPr` WHERE 0;

