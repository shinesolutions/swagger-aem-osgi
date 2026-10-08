--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventIn` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventIn`
--
INSERT INTO `comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventIn`
--
UPDATE `comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventIn`
--
DELETE FROM `comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventIn` WHERE 0;

