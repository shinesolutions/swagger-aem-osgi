--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo' definition.
--


--
-- SELECT template for table `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo`
--
INSERT INTO `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo`
--
UPDATE `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo`
--
DELETE FROM `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo` WHERE 0;

