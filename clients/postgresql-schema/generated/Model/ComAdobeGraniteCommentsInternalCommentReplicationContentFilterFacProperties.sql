--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_comments_internal_comment_replication_content'
--
SELECT replicate/comment/resource_types FROM com_adobe_granite_comments_internal_comment_replication_content WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_comments_internal_comment_replication_content'
--
INSERT INTO com_adobe_granite_comments_internal_comment_replication_content (replicate/comment/resource_types) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_comments_internal_comment_replication_content'
--
UPDATE com_adobe_granite_comments_internal_comment_replication_content SET replicate/comment/resource_types = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_comments_internal_comment_replication_content'
--
DELETE FROM com_adobe_granite_comments_internal_comment_replication_content WHERE 1=2;

