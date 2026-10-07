--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialSyncImplPublisherSyncServiceImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialSyncImplPublisherSyncServiceImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialSyncImplPublisherSyncServiceImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialSyncImplPublisherSyncServiceImplInfo`
--
INSERT INTO `comAdobeCqSocialSyncImplPublisherSyncServiceImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialSyncImplPublisherSyncServiceImplInfo`
--
UPDATE `comAdobeCqSocialSyncImplPublisherSyncServiceImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialSyncImplPublisherSyncServiceImplInfo`
--
DELETE FROM `comAdobeCqSocialSyncImplPublisherSyncServiceImplInfo` WHERE 0;

