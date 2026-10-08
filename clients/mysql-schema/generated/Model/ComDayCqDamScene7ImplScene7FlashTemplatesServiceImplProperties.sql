--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties' definition.
--


--
-- SELECT template for table `comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties`
--
SELECT `scene7FlashTemplates.rti`, `scene7FlashTemplates.rsi`, `scene7FlashTemplates.rb`, `scene7FlashTemplates.rurl`, `scene7FlashTemplate.urlFormatParameter` FROM `comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties`
--
INSERT INTO `comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties`(`scene7FlashTemplates.rti`, `scene7FlashTemplates.rsi`, `scene7FlashTemplates.rb`, `scene7FlashTemplates.rurl`, `scene7FlashTemplate.urlFormatParameter`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties`
--
UPDATE `comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties` SET `scene7FlashTemplates.rti` = ?, `scene7FlashTemplates.rsi` = ?, `scene7FlashTemplates.rb` = ?, `scene7FlashTemplates.rurl` = ?, `scene7FlashTemplate.urlFormatParameter` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties`
--
DELETE FROM `comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties` WHERE 0;

