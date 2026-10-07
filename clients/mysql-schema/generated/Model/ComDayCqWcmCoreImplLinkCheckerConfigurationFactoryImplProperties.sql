--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties`
--
SELECT `link.expired.prefix`, `link.expired.remove`, `link.expired.suffix`, `link.invalid.prefix`, `link.invalid.remove`, `link.invalid.suffix`, `link.predated.prefix`, `link.predated.remove`, `link.predated.suffix`, `link.wcmmodes` FROM `comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties`
--
INSERT INTO `comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties`(`link.expired.prefix`, `link.expired.remove`, `link.expired.suffix`, `link.invalid.prefix`, `link.invalid.remove`, `link.invalid.suffix`, `link.predated.prefix`, `link.predated.remove`, `link.predated.suffix`, `link.wcmmodes`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties`
--
UPDATE `comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties` SET `link.expired.prefix` = ?, `link.expired.remove` = ?, `link.expired.suffix` = ?, `link.invalid.prefix` = ?, `link.invalid.remove` = ?, `link.invalid.suffix` = ?, `link.predated.prefix` = ?, `link.predated.remove` = ?, `link.predated.suffix` = ?, `link.wcmmodes` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties`
--
DELETE FROM `comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties` WHERE 0;

