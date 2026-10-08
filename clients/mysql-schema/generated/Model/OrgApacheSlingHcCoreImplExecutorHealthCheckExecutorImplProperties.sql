--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertie`
--
SELECT `timeoutInMs`, `longRunningFutureThresholdForCriticalMs`, `resultCacheTtlInMs` FROM `orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertie` WHERE 1;

--
-- INSERT template for table `orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertie`
--
INSERT INTO `orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertie`(`timeoutInMs`, `longRunningFutureThresholdForCriticalMs`, `resultCacheTtlInMs`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertie`
--
UPDATE `orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertie` SET `timeoutInMs` = ?, `longRunningFutureThresholdForCriticalMs` = ?, `resultCacheTtlInMs` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertie`
--
DELETE FROM `orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertie` WHERE 0;

