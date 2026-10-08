--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplEventPagePostProcessorInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplEventPagePostProcessorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqWcmCoreImplEventPagePostProcessorInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplEventPagePostProcessorInfo`
--
INSERT INTO `comDayCqWcmCoreImplEventPagePostProcessorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplEventPagePostProcessorInfo`
--
UPDATE `comDayCqWcmCoreImplEventPagePostProcessorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplEventPagePostProcessorInfo`
--
DELETE FROM `comDayCqWcmCoreImplEventPagePostProcessorInfo` WHERE 0;

