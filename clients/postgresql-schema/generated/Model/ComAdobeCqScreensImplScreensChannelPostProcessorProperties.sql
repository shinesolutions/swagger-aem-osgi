--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqScreensImplScreensChannelPostProcessorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_screens_impl_screens_channel_post_processor_proper'
--
SELECT screens/channels/properties/to/remove FROM com_adobe_cq_screens_impl_screens_channel_post_processor_proper WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_screens_impl_screens_channel_post_processor_proper'
--
INSERT INTO com_adobe_cq_screens_impl_screens_channel_post_processor_proper (screens/channels/properties/to/remove) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_screens_impl_screens_channel_post_processor_proper'
--
UPDATE com_adobe_cq_screens_impl_screens_channel_post_processor_proper SET screens/channels/properties/to/remove = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_screens_impl_screens_channel_post_processor_proper'
--
DELETE FROM com_adobe_cq_screens_impl_screens_channel_post_processor_proper WHERE 1=2;

