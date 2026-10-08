--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqCommercePimImplPageEventListenerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_commerce_pim_impl_page_event_listener_properties'
--
SELECT cq/commerce/pageeventlistener/enabled FROM com_adobe_cq_commerce_pim_impl_page_event_listener_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_commerce_pim_impl_page_event_listener_properties'
--
INSERT INTO com_adobe_cq_commerce_pim_impl_page_event_listener_properties (cq/commerce/pageeventlistener/enabled) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_commerce_pim_impl_page_event_listener_properties'
--
UPDATE com_adobe_cq_commerce_pim_impl_page_event_listener_properties SET cq/commerce/pageeventlistener/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_commerce_pim_impl_page_event_listener_properties'
--
DELETE FROM com_adobe_cq_commerce_pim_impl_page_event_listener_properties WHERE 1=2;

