--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties' definition.
--


--
-- SELECT template for table `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties`
--
SELECT `scheduler.expression`, `job.purge.threshold`, `job.purge.max.jobs` FROM `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties`
--
INSERT INTO `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties`(`scheduler.expression`, `job.purge.threshold`, `job.purge.max.jobs`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties`
--
UPDATE `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties` SET `scheduler.expression` = ?, `job.purge.threshold` = ?, `job.purge.max.jobs` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties`
--
DELETE FROM `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties` WHERE 0;

