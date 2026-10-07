--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties`
--
SELECT `redirect.enabled`, `redirect.stats.enabled`, `redirect.extensions`, `redirect.paths` FROM `comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties`
--
INSERT INTO `comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties`(`redirect.enabled`, `redirect.stats.enabled`, `redirect.extensions`, `redirect.paths`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties`
--
UPDATE `comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties` SET `redirect.enabled` = ?, `redirect.stats.enabled` = ?, `redirect.extensions` = ?, `redirect.paths` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties`
--
DELETE FROM `comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties` WHERE 0;

