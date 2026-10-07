--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties' definition.
--


--
-- SELECT template for table `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePro`
--
SELECT `portal.outboxes`, `draft.data.service`, `draft.metadata.service`, `submit.data.service`, `submit.metadata.service`, `pendingSign.data.service`, `pendingSign.metadata.service` FROM `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePro` WHERE 1;

--
-- INSERT template for table `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePro`
--
INSERT INTO `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePro`(`portal.outboxes`, `draft.data.service`, `draft.metadata.service`, `submit.data.service`, `submit.metadata.service`, `pendingSign.data.service`, `pendingSign.metadata.service`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePro`
--
UPDATE `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePro` SET `portal.outboxes` = ?, `draft.data.service` = ?, `draft.metadata.service` = ?, `submit.data.service` = ?, `submit.metadata.service` = ?, `pendingSign.data.service` = ?, `pendingSign.metadata.service` = ? WHERE 1;

--
-- DELETE template for table `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePro`
--
DELETE FROM `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePro` WHERE 0;

