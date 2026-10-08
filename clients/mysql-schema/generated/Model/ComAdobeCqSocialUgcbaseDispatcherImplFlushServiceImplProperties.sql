--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties`
--
SELECT `threadPoolSize`, `delayTime`, `workerSleepTime` FROM `comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties`
--
INSERT INTO `comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties`(`threadPoolSize`, `delayTime`, `workerSleepTime`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties`
--
UPDATE `comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties` SET `threadPoolSize` = ?, `delayTime` = ?, `workerSleepTime` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties`
--
DELETE FROM `comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties` WHERE 0;

