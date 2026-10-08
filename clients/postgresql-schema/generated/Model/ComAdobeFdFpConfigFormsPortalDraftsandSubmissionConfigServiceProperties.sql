--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_fd_fp_config_forms_portal_draftsand_submission_config'
--
SELECT portal/outboxes, draft/data/service, draft/metadata/service, submit/data/service, submit/metadata/service, pending_sign/data/service, pending_sign/metadata/service FROM com_adobe_fd_fp_config_forms_portal_draftsand_submission_config WHERE 1=1;

--
-- INSERT template for table 'com_adobe_fd_fp_config_forms_portal_draftsand_submission_config'
--
INSERT INTO com_adobe_fd_fp_config_forms_portal_draftsand_submission_config (portal/outboxes, draft/data/service, draft/metadata/service, submit/data/service, submit/metadata/service, pending_sign/data/service, pending_sign/metadata/service) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_fd_fp_config_forms_portal_draftsand_submission_config'
--
UPDATE com_adobe_fd_fp_config_forms_portal_draftsand_submission_config SET portal/outboxes = ?, draft/data/service = ?, draft/metadata/service = ?, submit/data/service = ?, submit/metadata/service = ?, pending_sign/data/service = ?, pending_sign/metadata/service = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_fd_fp_config_forms_portal_draftsand_submission_config'
--
DELETE FROM com_adobe_fd_fp_config_forms_portal_draftsand_submission_config WHERE 1=2;

