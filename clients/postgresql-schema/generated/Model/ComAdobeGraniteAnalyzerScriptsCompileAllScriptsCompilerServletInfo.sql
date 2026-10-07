--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler'
--
INSERT INTO com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler'
--
UPDATE com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler'
--
DELETE FROM com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler WHERE 1=2;

