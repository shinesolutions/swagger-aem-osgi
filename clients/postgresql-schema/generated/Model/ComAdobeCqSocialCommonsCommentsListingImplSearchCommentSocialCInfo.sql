--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_comments_listing_impl_search_commen'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_commons_comments_listing_impl_search_commen WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_comments_listing_impl_search_commen'
--
INSERT INTO com_adobe_cq_social_commons_comments_listing_impl_search_commen (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_comments_listing_impl_search_commen'
--
UPDATE com_adobe_cq_social_commons_comments_listing_impl_search_commen SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_comments_listing_impl_search_commen'
--
DELETE FROM com_adobe_cq_social_commons_comments_listing_impl_search_commen WHERE 1=2;

