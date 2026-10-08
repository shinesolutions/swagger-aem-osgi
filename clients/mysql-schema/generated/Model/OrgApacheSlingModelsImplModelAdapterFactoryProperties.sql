--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingModelsImplModelAdapterFactoryProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingModelsImplModelAdapterFactoryProperties`
--
SELECT `osgi.http.whiteboard.listener`, `osgi.http.whiteboard.context.select`, `max.recursion.depth`, `cleanup.job.period` FROM `orgApacheSlingModelsImplModelAdapterFactoryProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingModelsImplModelAdapterFactoryProperties`
--
INSERT INTO `orgApacheSlingModelsImplModelAdapterFactoryProperties`(`osgi.http.whiteboard.listener`, `osgi.http.whiteboard.context.select`, `max.recursion.depth`, `cleanup.job.period`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingModelsImplModelAdapterFactoryProperties`
--
UPDATE `orgApacheSlingModelsImplModelAdapterFactoryProperties` SET `osgi.http.whiteboard.listener` = ?, `osgi.http.whiteboard.context.select` = ?, `max.recursion.depth` = ?, `cleanup.job.period` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingModelsImplModelAdapterFactoryProperties`
--
DELETE FROM `orgApacheSlingModelsImplModelAdapterFactoryProperties` WHERE 0;

