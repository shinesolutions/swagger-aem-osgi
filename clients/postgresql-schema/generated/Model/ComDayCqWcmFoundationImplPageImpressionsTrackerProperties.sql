--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmFoundationImplPageImpressionsTrackerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_foundation_impl_page_impressions_tracker_propert'
--
SELECT sling/auth/requirements FROM com_day_cq_wcm_foundation_impl_page_impressions_tracker_propert WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_foundation_impl_page_impressions_tracker_propert'
--
INSERT INTO com_day_cq_wcm_foundation_impl_page_impressions_tracker_propert (sling/auth/requirements) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_wcm_foundation_impl_page_impressions_tracker_propert'
--
UPDATE com_day_cq_wcm_foundation_impl_page_impressions_tracker_propert SET sling/auth/requirements = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_foundation_impl_page_impressions_tracker_propert'
--
DELETE FROM com_day_cq_wcm_foundation_impl_page_impressions_tracker_propert WHERE 1=2;

