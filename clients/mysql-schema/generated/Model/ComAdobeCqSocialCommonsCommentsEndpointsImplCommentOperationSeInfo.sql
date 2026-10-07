--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeIn` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeIn`
--
INSERT INTO `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeIn`
--
UPDATE `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeIn`
--
DELETE FROM `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeIn` WHERE 0;

