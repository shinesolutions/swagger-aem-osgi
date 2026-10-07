--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAuthImplLoginSelectorHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_auth_impl_login_selector_handler_properties'
--
SELECT "path", service/ranking, auth/loginselector/mappings, auth/loginselector/changepw/mappings, auth/loginselector/defaultloginpage, auth/loginselector/defaultchangepwpage, auth/loginselector/handle, auth/loginselector/handle/all/extensions FROM com_day_cq_auth_impl_login_selector_handler_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_auth_impl_login_selector_handler_properties'
--
INSERT INTO com_day_cq_auth_impl_login_selector_handler_properties ("path", service/ranking, auth/loginselector/mappings, auth/loginselector/changepw/mappings, auth/loginselector/defaultloginpage, auth/loginselector/defaultchangepwpage, auth/loginselector/handle, auth/loginselector/handle/all/extensions) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_auth_impl_login_selector_handler_properties'
--
UPDATE com_day_cq_auth_impl_login_selector_handler_properties SET "path" = ?, service/ranking = ?, auth/loginselector/mappings = ?, auth/loginselector/changepw/mappings = ?, auth/loginselector/defaultloginpage = ?, auth/loginselector/defaultchangepwpage = ?, auth/loginselector/handle = ?, auth/loginselector/handle/all/extensions = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_auth_impl_login_selector_handler_properties'
--
DELETE FROM com_day_cq_auth_impl_login_selector_handler_properties WHERE 1=2;

