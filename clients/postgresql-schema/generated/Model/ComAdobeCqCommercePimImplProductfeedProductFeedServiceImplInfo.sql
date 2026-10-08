--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service'
--
SELECT pid, title, description, properties FROM com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service'
--
INSERT INTO com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service'
--
UPDATE com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service'
--
DELETE FROM com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service WHERE 1=2;

