--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeFdFpConfigFormsPortalSchedulerServiceInfo' definition.
--


--
-- SELECT template for table `comAdobeFdFpConfigFormsPortalSchedulerServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeFdFpConfigFormsPortalSchedulerServiceInfo` WHERE 1;

--
-- INSERT template for table `comAdobeFdFpConfigFormsPortalSchedulerServiceInfo`
--
INSERT INTO `comAdobeFdFpConfigFormsPortalSchedulerServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeFdFpConfigFormsPortalSchedulerServiceInfo`
--
UPDATE `comAdobeFdFpConfigFormsPortalSchedulerServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeFdFpConfigFormsPortalSchedulerServiceInfo`
--
DELETE FROM `comAdobeFdFpConfigFormsPortalSchedulerServiceInfo` WHERE 0;

