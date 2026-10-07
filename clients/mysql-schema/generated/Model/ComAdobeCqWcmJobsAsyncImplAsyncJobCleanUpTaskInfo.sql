--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo' definition.
--


--
-- SELECT template for table `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo`
--
INSERT INTO `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo`
--
UPDATE `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo`
--
DELETE FROM `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo` WHERE 0;

