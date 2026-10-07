--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler'
--
SELECT disabled FROM com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler'
--
INSERT INTO com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler (disabled) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler'
--
UPDATE com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler SET disabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler'
--
DELETE FROM com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler WHERE 1=2;

