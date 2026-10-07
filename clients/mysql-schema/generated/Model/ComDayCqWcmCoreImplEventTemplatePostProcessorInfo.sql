--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplEventTemplatePostProcessorInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplEventTemplatePostProcessorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqWcmCoreImplEventTemplatePostProcessorInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplEventTemplatePostProcessorInfo`
--
INSERT INTO `comDayCqWcmCoreImplEventTemplatePostProcessorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplEventTemplatePostProcessorInfo`
--
UPDATE `comDayCqWcmCoreImplEventTemplatePostProcessorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplEventTemplatePostProcessorInfo`
--
DELETE FROM `comDayCqWcmCoreImplEventTemplatePostProcessorInfo` WHERE 0;

