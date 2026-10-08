--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixWebconsoleInternalServletOsgiManagerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_webconsole_internal_servlet_osgi_manager_prope'
--
SELECT manager/root, http/service/filter, default/render, realm, username, "password", category, locale, loglevel, plugins FROM org_apache_felix_webconsole_internal_servlet_osgi_manager_prope WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_webconsole_internal_servlet_osgi_manager_prope'
--
INSERT INTO org_apache_felix_webconsole_internal_servlet_osgi_manager_prope (manager/root, http/service/filter, default/render, realm, username, "password", category, locale, loglevel, plugins) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_felix_webconsole_internal_servlet_osgi_manager_prope'
--
UPDATE org_apache_felix_webconsole_internal_servlet_osgi_manager_prope SET manager/root = ?, http/service/filter = ?, default/render = ?, realm = ?, username = ?, "password" = ?, category = ?, locale = ?, loglevel = ?, plugins = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_webconsole_internal_servlet_osgi_manager_prope'
--
DELETE FROM org_apache_felix_webconsole_internal_servlet_osgi_manager_prope WHERE 1=2;

