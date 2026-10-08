--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingEngineImplSlingMainServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_engine_impl_sling_main_servlet_properties'
--
SELECT sling/max/calls, sling/max/inclusions, sling/trace/allow, sling/max/record/requests, sling/store/pattern/requests, sling/serverinfo, sling/additional/response/headers FROM org_apache_sling_engine_impl_sling_main_servlet_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_engine_impl_sling_main_servlet_properties'
--
INSERT INTO org_apache_sling_engine_impl_sling_main_servlet_properties (sling/max/calls, sling/max/inclusions, sling/trace/allow, sling/max/record/requests, sling/store/pattern/requests, sling/serverinfo, sling/additional/response/headers) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_engine_impl_sling_main_servlet_properties'
--
UPDATE org_apache_sling_engine_impl_sling_main_servlet_properties SET sling/max/calls = ?, sling/max/inclusions = ?, sling/trace/allow = ?, sling/max/record/requests = ?, sling/store/pattern/requests = ?, sling/serverinfo = ?, sling/additional/response/headers = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_engine_impl_sling_main_servlet_properties'
--
DELETE FROM org_apache_sling_engine_impl_sling_main_servlet_properties WHERE 1=2;

