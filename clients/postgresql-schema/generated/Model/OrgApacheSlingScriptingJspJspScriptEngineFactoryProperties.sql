--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingScriptingJspJspScriptEngineFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_scripting_jsp_jsp_script_engine_factory_proper'
--
SELECT jasper/compiler_target_vm, jasper/compiler_source_vm, jasper/classdebuginfo, jasper/enable_pooling, jasper/ie_class_id, jasper/gen_string_as_char_array, jasper/keepgenerated, jasper/mappedfile, jasper/trim_spaces, jasper/display_source_fragments, default/is/session FROM org_apache_sling_scripting_jsp_jsp_script_engine_factory_proper WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_scripting_jsp_jsp_script_engine_factory_proper'
--
INSERT INTO org_apache_sling_scripting_jsp_jsp_script_engine_factory_proper (jasper/compiler_target_vm, jasper/compiler_source_vm, jasper/classdebuginfo, jasper/enable_pooling, jasper/ie_class_id, jasper/gen_string_as_char_array, jasper/keepgenerated, jasper/mappedfile, jasper/trim_spaces, jasper/display_source_fragments, default/is/session) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_scripting_jsp_jsp_script_engine_factory_proper'
--
UPDATE org_apache_sling_scripting_jsp_jsp_script_engine_factory_proper SET jasper/compiler_target_vm = ?, jasper/compiler_source_vm = ?, jasper/classdebuginfo = ?, jasper/enable_pooling = ?, jasper/ie_class_id = ?, jasper/gen_string_as_char_array = ?, jasper/keepgenerated = ?, jasper/mappedfile = ?, jasper/trim_spaces = ?, jasper/display_source_fragments = ?, default/is/session = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_scripting_jsp_jsp_script_engine_factory_proper'
--
DELETE FROM org_apache_sling_scripting_jsp_jsp_script_engine_factory_proper WHERE 1=2;

