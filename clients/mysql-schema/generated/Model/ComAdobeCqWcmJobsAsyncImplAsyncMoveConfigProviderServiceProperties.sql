--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties' definition.
--


--
-- SELECT template for table `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperti`
--
SELECT `threshold`, `jobTopicName`, `emailEnabled` FROM `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperti` WHERE 1;

--
-- INSERT template for table `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperti`
--
INSERT INTO `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperti`(`threshold`, `jobTopicName`, `emailEnabled`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperti`
--
UPDATE `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperti` SET `threshold` = ?, `jobTopicName` = ?, `emailEnabled` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperti`
--
DELETE FROM `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperti` WHERE 0;

