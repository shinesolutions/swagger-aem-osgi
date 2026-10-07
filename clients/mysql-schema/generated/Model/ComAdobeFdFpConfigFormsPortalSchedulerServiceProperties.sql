--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeFdFpConfigFormsPortalSchedulerServiceProperties' definition.
--


--
-- SELECT template for table `comAdobeFdFpConfigFormsPortalSchedulerServiceProperties`
--
SELECT `formportal.interval` FROM `comAdobeFdFpConfigFormsPortalSchedulerServiceProperties` WHERE 1;

--
-- INSERT template for table `comAdobeFdFpConfigFormsPortalSchedulerServiceProperties`
--
INSERT INTO `comAdobeFdFpConfigFormsPortalSchedulerServiceProperties`(`formportal.interval`) VALUES (?);

--
-- UPDATE template for table `comAdobeFdFpConfigFormsPortalSchedulerServiceProperties`
--
UPDATE `comAdobeFdFpConfigFormsPortalSchedulerServiceProperties` SET `formportal.interval` = ? WHERE 1;

--
-- DELETE template for table `comAdobeFdFpConfigFormsPortalSchedulerServiceProperties`
--
DELETE FROM `comAdobeFdFpConfigFormsPortalSchedulerServiceProperties` WHERE 0;

