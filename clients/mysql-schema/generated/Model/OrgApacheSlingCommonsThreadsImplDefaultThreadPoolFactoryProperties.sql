--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperti`
--
SELECT `name`, `minPoolSize`, `maxPoolSize`, `queueSize`, `maxThreadAge`, `keepAliveTime`, `blockPolicy`, `shutdownGraceful`, `daemon`, `shutdownWaitTime`, `priority` FROM `orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperti` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperti`
--
INSERT INTO `orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperti`(`name`, `minPoolSize`, `maxPoolSize`, `queueSize`, `maxThreadAge`, `keepAliveTime`, `blockPolicy`, `shutdownGraceful`, `daemon`, `shutdownWaitTime`, `priority`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperti`
--
UPDATE `orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperti` SET `name` = ?, `minPoolSize` = ?, `maxPoolSize` = ?, `queueSize` = ?, `maxThreadAge` = ?, `keepAliveTime` = ?, `blockPolicy` = ?, `shutdownGraceful` = ?, `daemon` = ?, `shutdownWaitTime` = ?, `priority` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperti`
--
DELETE FROM `orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperti` WHERE 0;

