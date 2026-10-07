--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertie`
--
SELECT `service.ranking`, `type.collections`, `type.noncollections`, `type.content` FROM `orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertie` WHERE 1;

--
-- INSERT template for table `orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertie`
--
INSERT INTO `orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertie`(`service.ranking`, `type.collections`, `type.noncollections`, `type.content`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertie`
--
UPDATE `orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertie` SET `service.ranking` = ?, `type.collections` = ?, `type.noncollections` = ?, `type.content` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertie`
--
DELETE FROM `orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertie` WHERE 0;

