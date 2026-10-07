--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperti`
--
SELECT `forms.formparagraphpostprocessor.enabled`, `forms.formparagraphpostprocessor.formresourcetypes` FROM `comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperti` WHERE 1;

--
-- INSERT template for table `comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperti`
--
INSERT INTO `comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperti`(`forms.formparagraphpostprocessor.enabled`, `forms.formparagraphpostprocessor.formresourcetypes`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperti`
--
UPDATE `comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperti` SET `forms.formparagraphpostprocessor.enabled` = ?, `forms.formparagraphpostprocessor.formresourcetypes` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperti`
--
DELETE FROM `comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperti` WHERE 0;

