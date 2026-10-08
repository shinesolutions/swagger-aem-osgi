--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteLoggingImplLogAnalyserImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_logging_impl_log_analyser_impl_properties'
--
SELECT messages/queue/size, logger/config, messages/size FROM com_adobe_granite_logging_impl_log_analyser_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_logging_impl_log_analyser_impl_properties'
--
INSERT INTO com_adobe_granite_logging_impl_log_analyser_impl_properties (messages/queue/size, logger/config, messages/size) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_logging_impl_log_analyser_impl_properties'
--
UPDATE com_adobe_granite_logging_impl_log_analyser_impl_properties SET messages/queue/size = ?, logger/config = ?, messages/size = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_logging_impl_log_analyser_impl_properties'
--
DELETE FROM com_adobe_granite_logging_impl_log_analyser_impl_properties WHERE 1=2;

