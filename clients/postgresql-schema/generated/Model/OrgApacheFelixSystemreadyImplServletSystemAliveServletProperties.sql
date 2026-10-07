--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheFelixSystemreadyImplServletSystemAliveServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_felix_systemready_impl_servlet_system_alive_servlet_'
--
SELECT osgi/http/whiteboard/servlet/pattern, osgi/http/whiteboard/context/select FROM org_apache_felix_systemready_impl_servlet_system_alive_servlet_ WHERE 1=1;

--
-- INSERT template for table 'org_apache_felix_systemready_impl_servlet_system_alive_servlet_'
--
INSERT INTO org_apache_felix_systemready_impl_servlet_system_alive_servlet_ (osgi/http/whiteboard/servlet/pattern, osgi/http/whiteboard/context/select) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_felix_systemready_impl_servlet_system_alive_servlet_'
--
UPDATE org_apache_felix_systemready_impl_servlet_system_alive_servlet_ SET osgi/http/whiteboard/servlet/pattern = ?, osgi/http/whiteboard/context/select = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_felix_systemready_impl_servlet_system_alive_servlet_'
--
DELETE FROM org_apache_felix_systemready_impl_servlet_system_alive_servlet_ WHERE 1=2;

