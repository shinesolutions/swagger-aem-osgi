--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqSearchpromoteImplSearchPromoteServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_searchpromote_impl_search_promote_service_impl_prope'
--
SELECT cq/searchpromote/configuration/server/uri, cq/searchpromote/configuration/environment, connection/timeout, socket/timeout FROM com_day_cq_searchpromote_impl_search_promote_service_impl_prope WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_searchpromote_impl_search_promote_service_impl_prope'
--
INSERT INTO com_day_cq_searchpromote_impl_search_promote_service_impl_prope (cq/searchpromote/configuration/server/uri, cq/searchpromote/configuration/environment, connection/timeout, socket/timeout) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_searchpromote_impl_search_promote_service_impl_prope'
--
UPDATE com_day_cq_searchpromote_impl_search_promote_service_impl_prope SET cq/searchpromote/configuration/server/uri = ?, cq/searchpromote/configuration/environment = ?, connection/timeout = ?, socket/timeout = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_searchpromote_impl_search_promote_service_impl_prope'
--
DELETE FROM com_day_cq_searchpromote_impl_search_promote_service_impl_prope WHERE 1=2;

