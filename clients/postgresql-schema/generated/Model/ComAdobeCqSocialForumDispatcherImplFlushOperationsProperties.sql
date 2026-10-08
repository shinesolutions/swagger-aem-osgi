--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialForumDispatcherImplFlushOperationsProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_forum_dispatcher_impl_flush_operations_prop'
--
SELECT extension/order, flush/forumontopic FROM com_adobe_cq_social_forum_dispatcher_impl_flush_operations_prop WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_forum_dispatcher_impl_flush_operations_prop'
--
INSERT INTO com_adobe_cq_social_forum_dispatcher_impl_flush_operations_prop (extension/order, flush/forumontopic) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_forum_dispatcher_impl_flush_operations_prop'
--
UPDATE com_adobe_cq_social_forum_dispatcher_impl_flush_operations_prop SET extension/order = ?, flush/forumontopic = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_forum_dispatcher_impl_flush_operations_prop'
--
DELETE FROM com_adobe_cq_social_forum_dispatcher_impl_flush_operations_prop WHERE 1=2;

