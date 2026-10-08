--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties' definition.
--


--
-- SELECT template for table `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProp`
--
SELECT `threshold`, `jobTopicName`, `emailEnabled` FROM `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProp` WHERE 1;

--
-- INSERT template for table `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProp`
--
INSERT INTO `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProp`(`threshold`, `jobTopicName`, `emailEnabled`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProp`
--
UPDATE `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProp` SET `threshold` = ?, `jobTopicName` = ?, `emailEnabled` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProp`
--
DELETE FROM `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProp` WHERE 0;

