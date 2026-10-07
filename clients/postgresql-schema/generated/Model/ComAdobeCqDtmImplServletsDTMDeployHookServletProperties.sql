--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDtmImplServletsDTMDeployHookServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properti'
--
SELECT dtm/staging/ip/whitelist, dtm/production/ip/whitelist FROM com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properti WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properti'
--
INSERT INTO com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properti (dtm/staging/ip/whitelist, dtm/production/ip/whitelist) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properti'
--
UPDATE com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properti SET dtm/staging/ip/whitelist = ?, dtm/production/ip/whitelist = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properti'
--
DELETE FROM com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properti WHERE 1=2;

