--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_proper'
--
SELECT redirect/enabled, redirect/stats/enabled, redirect/extensions, redirect/paths FROM com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_proper WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_proper'
--
INSERT INTO com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_proper (redirect/enabled, redirect/stats/enabled, redirect/extensions, redirect/paths) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_proper'
--
UPDATE com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_proper SET redirect/enabled = ?, redirect/stats/enabled = ?, redirect/extensions = ?, redirect/paths = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_proper'
--
DELETE FROM com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_proper WHERE 1=2;

