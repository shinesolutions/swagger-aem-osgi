--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo' definition.
--


--
-- SELECT template for table `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInf`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInf` WHERE 1;

--
-- INSERT template for table `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInf`
--
INSERT INTO `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInf`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInf`
--
UPDATE `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInf` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInf`
--
DELETE FROM `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInf` WHERE 0;

