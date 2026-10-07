--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPr`
--
SELECT `event.topics` FROM `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPr`
--
INSERT INTO `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPr`(`event.topics`) VALUES (?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPr`
--
UPDATE `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPr` SET `event.topics` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPr`
--
DELETE FROM `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPr` WHERE 0;

