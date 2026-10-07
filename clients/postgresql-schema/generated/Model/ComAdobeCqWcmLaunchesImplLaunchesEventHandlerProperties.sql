--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_wcm_launches_impl_launches_event_handler_propertie'
--
SELECT event/filter, launches/eventhandler/threadpool/maxsize, launches/eventhandler/threadpool/priority, launches/eventhandler/updatelastmodification FROM com_adobe_cq_wcm_launches_impl_launches_event_handler_propertie WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_wcm_launches_impl_launches_event_handler_propertie'
--
INSERT INTO com_adobe_cq_wcm_launches_impl_launches_event_handler_propertie (event/filter, launches/eventhandler/threadpool/maxsize, launches/eventhandler/threadpool/priority, launches/eventhandler/updatelastmodification) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_wcm_launches_impl_launches_event_handler_propertie'
--
UPDATE com_adobe_cq_wcm_launches_impl_launches_event_handler_propertie SET event/filter = ?, launches/eventhandler/threadpool/maxsize = ?, launches/eventhandler/threadpool/priority = ?, launches/eventhandler/updatelastmodification = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_wcm_launches_impl_launches_event_handler_propertie'
--
DELETE FROM com_adobe_cq_wcm_launches_impl_launches_event_handler_propertie WHERE 1=2;

