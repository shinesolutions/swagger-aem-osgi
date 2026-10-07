--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqInboxImplTypeproviderItemTypeProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propert'
--
SELECT inbox/impl/typeprovider/registrypaths, inbox/impl/typeprovider/legacypaths, inbox/impl/typeprovider/defaulturl/failureitem, inbox/impl/typeprovider/defaulturl/workitem, inbox/impl/typeprovider/defaulturl/task FROM com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propert WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propert'
--
INSERT INTO com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propert (inbox/impl/typeprovider/registrypaths, inbox/impl/typeprovider/legacypaths, inbox/impl/typeprovider/defaulturl/failureitem, inbox/impl/typeprovider/defaulturl/workitem, inbox/impl/typeprovider/defaulturl/task) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propert'
--
UPDATE com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propert SET inbox/impl/typeprovider/registrypaths = ?, inbox/impl/typeprovider/legacypaths = ?, inbox/impl/typeprovider/defaulturl/failureitem = ?, inbox/impl/typeprovider/defaulturl/workitem = ?, inbox/impl/typeprovider/defaulturl/task = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propert'
--
DELETE FROM com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propert WHERE 1=2;

