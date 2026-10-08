--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmUndoUndoConfigProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_undo_undo_config_properties'
--
SELECT cq/wcm/undo/enabled, cq/wcm/undo/path, cq/wcm/undo/validity, cq/wcm/undo/steps, cq/wcm/undo/persistence, cq/wcm/undo/persistence/mode, cq/wcm/undo/markermode, cq/wcm/undo/whitelist, cq/wcm/undo/blacklist FROM com_day_cq_wcm_undo_undo_config_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_undo_undo_config_properties'
--
INSERT INTO com_day_cq_wcm_undo_undo_config_properties (cq/wcm/undo/enabled, cq/wcm/undo/path, cq/wcm/undo/validity, cq/wcm/undo/steps, cq/wcm/undo/persistence, cq/wcm/undo/persistence/mode, cq/wcm/undo/markermode, cq/wcm/undo/whitelist, cq/wcm/undo/blacklist) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_undo_undo_config_properties'
--
UPDATE com_day_cq_wcm_undo_undo_config_properties SET cq/wcm/undo/enabled = ?, cq/wcm/undo/path = ?, cq/wcm/undo/validity = ?, cq/wcm/undo/steps = ?, cq/wcm/undo/persistence = ?, cq/wcm/undo/persistence/mode = ?, cq/wcm/undo/markermode = ?, cq/wcm/undo/whitelist = ?, cq/wcm/undo/blacklist = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_undo_undo_config_properties'
--
DELETE FROM com_day_cq_wcm_undo_undo_config_properties WHERE 1=2;

