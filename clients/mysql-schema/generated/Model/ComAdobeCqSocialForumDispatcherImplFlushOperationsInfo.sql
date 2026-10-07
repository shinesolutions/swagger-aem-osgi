--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialForumDispatcherImplFlushOperationsInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialForumDispatcherImplFlushOperationsInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialForumDispatcherImplFlushOperationsInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialForumDispatcherImplFlushOperationsInfo`
--
INSERT INTO `comAdobeCqSocialForumDispatcherImplFlushOperationsInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialForumDispatcherImplFlushOperationsInfo`
--
UPDATE `comAdobeCqSocialForumDispatcherImplFlushOperationsInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialForumDispatcherImplFlushOperationsInfo`
--
DELETE FROM `comAdobeCqSocialForumDispatcherImplFlushOperationsInfo` WHERE 0;

