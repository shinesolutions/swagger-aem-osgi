--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'guideLocalizationServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'guide_localization_service_properties'
--
SELECT supported_locales, localizable_properties FROM guide_localization_service_properties WHERE 1=1;

--
-- INSERT template for table 'guide_localization_service_properties'
--
INSERT INTO guide_localization_service_properties (supported_locales, localizable_properties) VALUES (?, ?);

--
-- UPDATE template for table 'guide_localization_service_properties'
--
UPDATE guide_localization_service_properties SET supported_locales = ?, localizable_properties = ? WHERE 1=2;

--
-- DELETE template for table 'guide_localization_service_properties'
--
DELETE FROM guide_localization_service_properties WHERE 1=2;

