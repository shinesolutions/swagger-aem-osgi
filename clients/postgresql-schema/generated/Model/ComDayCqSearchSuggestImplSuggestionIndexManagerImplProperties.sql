--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_search_suggest_impl_suggestion_index_manager_impl_pr'
--
SELECT path_builder/target, suggest/basepath FROM com_day_cq_search_suggest_impl_suggestion_index_manager_impl_pr WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_search_suggest_impl_suggestion_index_manager_impl_pr'
--
INSERT INTO com_day_cq_search_suggest_impl_suggestion_index_manager_impl_pr (path_builder/target, suggest/basepath) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_search_suggest_impl_suggestion_index_manager_impl_pr'
--
UPDATE com_day_cq_search_suggest_impl_suggestion_index_manager_impl_pr SET path_builder/target = ?, suggest/basepath = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_search_suggest_impl_suggestion_index_manager_impl_pr'
--
DELETE FROM com_day_cq_search_suggest_impl_suggestion_index_manager_impl_pr WHERE 1=2;

