--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_testandtarget_impl_testandtarget_http_clie'
--
SELECT cq/analytics/testandtarget/api/url, cq/analytics/testandtarget/timeout, cq/analytics/testandtarget/sockettimeout, cq/analytics/testandtarget/recommendations/url/replace, cq/analytics/testandtarget/recommendations/url/replacewith FROM com_day_cq_analytics_testandtarget_impl_testandtarget_http_clie WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_testandtarget_impl_testandtarget_http_clie'
--
INSERT INTO com_day_cq_analytics_testandtarget_impl_testandtarget_http_clie (cq/analytics/testandtarget/api/url, cq/analytics/testandtarget/timeout, cq/analytics/testandtarget/sockettimeout, cq/analytics/testandtarget/recommendations/url/replace, cq/analytics/testandtarget/recommendations/url/replacewith) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_analytics_testandtarget_impl_testandtarget_http_clie'
--
UPDATE com_day_cq_analytics_testandtarget_impl_testandtarget_http_clie SET cq/analytics/testandtarget/api/url = ?, cq/analytics/testandtarget/timeout = ?, cq/analytics/testandtarget/sockettimeout = ?, cq/analytics/testandtarget/recommendations/url/replace = ?, cq/analytics/testandtarget/recommendations/url/replacewith = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_testandtarget_impl_testandtarget_http_clie'
--
DELETE FROM com_day_cq_analytics_testandtarget_impl_testandtarget_http_clie WHERE 1=2;

