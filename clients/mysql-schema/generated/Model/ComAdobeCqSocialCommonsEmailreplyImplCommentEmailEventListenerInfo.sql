--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerIn` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerIn`
--
INSERT INTO `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerIn`
--
UPDATE `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerIn`
--
DELETE FROM `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerIn` WHERE 0;

