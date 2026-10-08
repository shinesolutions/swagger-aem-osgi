--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixEventadminImplEventAdminProperties' definition.
--


--
-- SELECT template for table `orgApacheFelixEventadminImplEventAdminProperties`
--
SELECT `org.apache.felix.eventadmin.ThreadPoolSize`, `org.apache.felix.eventadmin.AsyncToSyncThreadRatio`, `org.apache.felix.eventadmin.Timeout`, `org.apache.felix.eventadmin.RequireTopic`, `org.apache.felix.eventadmin.IgnoreTimeout`, `org.apache.felix.eventadmin.IgnoreTopic` FROM `orgApacheFelixEventadminImplEventAdminProperties` WHERE 1;

--
-- INSERT template for table `orgApacheFelixEventadminImplEventAdminProperties`
--
INSERT INTO `orgApacheFelixEventadminImplEventAdminProperties`(`org.apache.felix.eventadmin.ThreadPoolSize`, `org.apache.felix.eventadmin.AsyncToSyncThreadRatio`, `org.apache.felix.eventadmin.Timeout`, `org.apache.felix.eventadmin.RequireTopic`, `org.apache.felix.eventadmin.IgnoreTimeout`, `org.apache.felix.eventadmin.IgnoreTopic`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixEventadminImplEventAdminProperties`
--
UPDATE `orgApacheFelixEventadminImplEventAdminProperties` SET `org.apache.felix.eventadmin.ThreadPoolSize` = ?, `org.apache.felix.eventadmin.AsyncToSyncThreadRatio` = ?, `org.apache.felix.eventadmin.Timeout` = ?, `org.apache.felix.eventadmin.RequireTopic` = ?, `org.apache.felix.eventadmin.IgnoreTimeout` = ?, `org.apache.felix.eventadmin.IgnoreTopic` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixEventadminImplEventAdminProperties`
--
DELETE FROM `orgApacheFelixEventadminImplEventAdminProperties` WHERE 0;

