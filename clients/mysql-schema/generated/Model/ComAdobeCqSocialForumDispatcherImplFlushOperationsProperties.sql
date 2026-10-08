--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialForumDispatcherImplFlushOperationsProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialForumDispatcherImplFlushOperationsProperties`
--
SELECT `extension.order`, `flush.forumontopic` FROM `comAdobeCqSocialForumDispatcherImplFlushOperationsProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialForumDispatcherImplFlushOperationsProperties`
--
INSERT INTO `comAdobeCqSocialForumDispatcherImplFlushOperationsProperties`(`extension.order`, `flush.forumontopic`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialForumDispatcherImplFlushOperationsProperties`
--
UPDATE `comAdobeCqSocialForumDispatcherImplFlushOperationsProperties` SET `extension.order` = ?, `flush.forumontopic` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialForumDispatcherImplFlushOperationsProperties`
--
DELETE FROM `comAdobeCqSocialForumDispatcherImplFlushOperationsProperties` WHERE 0;

