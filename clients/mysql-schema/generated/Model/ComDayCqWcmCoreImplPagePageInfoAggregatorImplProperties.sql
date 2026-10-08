--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties`
--
SELECT `page.info.provider.property.regex.default`, `page.info.provider.property.name` FROM `comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties`
--
INSERT INTO `comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties`(`page.info.provider.property.regex.default`, `page.info.provider.property.name`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties`
--
UPDATE `comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties` SET `page.info.provider.property.regex.default` = ?, `page.info.provider.property.name` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties`
--
DELETE FROM `comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties` WHERE 0;

