--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePr`
--
SELECT `fieldWhitelist`, `attachmentTypeBlacklist` FROM `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePr`
--
INSERT INTO `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePr`(`fieldWhitelist`, `attachmentTypeBlacklist`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePr`
--
UPDATE `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePr` SET `fieldWhitelist` = ?, `attachmentTypeBlacklist` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePr`
--
DELETE FROM `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePr` WHERE 0;

