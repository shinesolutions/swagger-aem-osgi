--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_group_client_impl_community_group_collectio'
--
SELECT group/listing/pagination/enable, group/listing/lazyloading/enable, page/size, priority FROM com_adobe_cq_social_group_client_impl_community_group_collectio WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_group_client_impl_community_group_collectio'
--
INSERT INTO com_adobe_cq_social_group_client_impl_community_group_collectio (group/listing/pagination/enable, group/listing/lazyloading/enable, page/size, priority) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_group_client_impl_community_group_collectio'
--
UPDATE com_adobe_cq_social_group_client_impl_community_group_collectio SET group/listing/pagination/enable = ?, group/listing/lazyloading/enable = ?, page/size = ?, priority = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_group_client_impl_community_group_collectio'
--
DELETE FROM com_adobe_cq_social_group_client_impl_community_group_collectio WHERE 1=2;

