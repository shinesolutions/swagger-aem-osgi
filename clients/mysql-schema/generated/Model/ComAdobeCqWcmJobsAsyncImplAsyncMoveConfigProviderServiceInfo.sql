--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo' definition.
--


--
-- SELECT template for table `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo`
--
INSERT INTO `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo`
--
UPDATE `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo`
--
DELETE FROM `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo` WHERE 0;

