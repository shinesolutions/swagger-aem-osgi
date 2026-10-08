--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_security_user_user_configuration_impl'
--
SELECT users_path, groups_path, system_relative_path, default_depth, import_behavior, password_hash_algorithm, password_hash_iterations, password_salt_size, omit_admin_pw, support_auto_save, password_max_age, initial_password_change, password_history_size, password_expiry_for_admin, cache_expiration, enable_rfc7613_usercase_mapped_profile FROM org_apache_jackrabbit_oak_security_user_user_configuration_impl WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_security_user_user_configuration_impl'
--
INSERT INTO org_apache_jackrabbit_oak_security_user_user_configuration_impl (users_path, groups_path, system_relative_path, default_depth, import_behavior, password_hash_algorithm, password_hash_iterations, password_salt_size, omit_admin_pw, support_auto_save, password_max_age, initial_password_change, password_history_size, password_expiry_for_admin, cache_expiration, enable_rfc7613_usercase_mapped_profile) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_security_user_user_configuration_impl'
--
UPDATE org_apache_jackrabbit_oak_security_user_user_configuration_impl SET users_path = ?, groups_path = ?, system_relative_path = ?, default_depth = ?, import_behavior = ?, password_hash_algorithm = ?, password_hash_iterations = ?, password_salt_size = ?, omit_admin_pw = ?, support_auto_save = ?, password_max_age = ?, initial_password_change = ?, password_history_size = ?, password_expiry_for_admin = ?, cache_expiration = ?, enable_rfc7613_usercase_mapped_profile = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_security_user_user_configuration_impl'
--
DELETE FROM org_apache_jackrabbit_oak_security_user_user_configuration_impl WHERE 1=2;

