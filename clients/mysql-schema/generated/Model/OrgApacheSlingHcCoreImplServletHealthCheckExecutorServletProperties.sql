--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropert`
--
SELECT `servletPath`, `disabled`, `cors.accessControlAllowOrigin` FROM `orgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropert` WHERE 1;

--
-- INSERT template for table `orgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropert`
--
INSERT INTO `orgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropert`(`servletPath`, `disabled`, `cors.accessControlAllowOrigin`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropert`
--
UPDATE `orgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropert` SET `servletPath` = ?, `disabled` = ?, `cors.accessControlAllowOrigin` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropert`
--
DELETE FROM `orgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropert` WHERE 0;

