--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_searchpromote_impl_publish_search_promote_config_han'
--
SELECT cq/searchpromote/confighandler/enabled FROM com_day_cq_searchpromote_impl_publish_search_promote_config_han WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_searchpromote_impl_publish_search_promote_config_han'
--
INSERT INTO com_day_cq_searchpromote_impl_publish_search_promote_config_han (cq/searchpromote/confighandler/enabled) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_searchpromote_impl_publish_search_promote_config_han'
--
UPDATE com_day_cq_searchpromote_impl_publish_search_promote_config_han SET cq/searchpromote/confighandler/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_searchpromote_impl_publish_search_promote_config_han'
--
DELETE FROM com_day_cq_searchpromote_impl_publish_search_promote_config_han WHERE 1=2;

