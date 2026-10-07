--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_fac'
--
SELECT cq/analytics/adapterfactory/contextstores FROM com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_fac WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_fac'
--
INSERT INTO com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_fac (cq/analytics/adapterfactory/contextstores) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_fac'
--
UPDATE com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_fac SET cq/analytics/adapterfactory/contextstores = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_fac'
--
DELETE FROM com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_fac WHERE 1=2;

