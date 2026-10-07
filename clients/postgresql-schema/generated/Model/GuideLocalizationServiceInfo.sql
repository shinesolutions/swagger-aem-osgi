--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'guideLocalizationServiceInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'guide_localization_service_info'
--
SELECT pid, title, description, properties FROM guide_localization_service_info WHERE 1=1;

--
-- INSERT template for table 'guide_localization_service_info'
--
INSERT INTO guide_localization_service_info (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'guide_localization_service_info'
--
UPDATE guide_localization_service_info SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'guide_localization_service_info'
--
DELETE FROM guide_localization_service_info WHERE 1=2;

