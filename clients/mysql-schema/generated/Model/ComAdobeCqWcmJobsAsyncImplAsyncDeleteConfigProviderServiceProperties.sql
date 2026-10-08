--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties' definition.
--


--
-- SELECT template for table `comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProper`
--
SELECT `threshold`, `jobTopicName`, `emailEnabled` FROM `comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProper` WHERE 1;

--
-- INSERT template for table `comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProper`
--
INSERT INTO `comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProper`(`threshold`, `jobTopicName`, `emailEnabled`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProper`
--
UPDATE `comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProper` SET `threshold` = ?, `jobTopicName` = ?, `emailEnabled` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProper`
--
DELETE FROM `comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProper` WHERE 0;

