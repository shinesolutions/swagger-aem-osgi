--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_screens_impl_handler_channels_update_handler_prope'
--
SELECT cq/pagesupdatehandler/imageresourcetypes, cq/pagesupdatehandler/productresourcetypes, cq/pagesupdatehandler/videoresourcetypes, cq/pagesupdatehandler/dynamicsequenceresourcetypes, cq/pagesupdatehandler/previewmodepaths FROM com_adobe_cq_screens_impl_handler_channels_update_handler_prope WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_screens_impl_handler_channels_update_handler_prope'
--
INSERT INTO com_adobe_cq_screens_impl_handler_channels_update_handler_prope (cq/pagesupdatehandler/imageresourcetypes, cq/pagesupdatehandler/productresourcetypes, cq/pagesupdatehandler/videoresourcetypes, cq/pagesupdatehandler/dynamicsequenceresourcetypes, cq/pagesupdatehandler/previewmodepaths) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_screens_impl_handler_channels_update_handler_prope'
--
UPDATE com_adobe_cq_screens_impl_handler_channels_update_handler_prope SET cq/pagesupdatehandler/imageresourcetypes = ?, cq/pagesupdatehandler/productresourcetypes = ?, cq/pagesupdatehandler/videoresourcetypes = ?, cq/pagesupdatehandler/dynamicsequenceresourcetypes = ?, cq/pagesupdatehandler/previewmodepaths = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_screens_impl_handler_channels_update_handler_prope'
--
DELETE FROM com_adobe_cq_screens_impl_handler_channels_update_handler_prope WHERE 1=2;

