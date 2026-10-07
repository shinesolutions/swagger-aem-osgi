--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmFoundationFormsImplFormChooserServletProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmFoundationFormsImplFormChooserServletProperties`
--
SELECT `service.name`, `sling.servlet.resourceTypes`, `sling.servlet.selectors`, `sling.servlet.methods`, `forms.formchooserservlet.advansesearch.require` FROM `comDayCqWcmFoundationFormsImplFormChooserServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmFoundationFormsImplFormChooserServletProperties`
--
INSERT INTO `comDayCqWcmFoundationFormsImplFormChooserServletProperties`(`service.name`, `sling.servlet.resourceTypes`, `sling.servlet.selectors`, `sling.servlet.methods`, `forms.formchooserservlet.advansesearch.require`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmFoundationFormsImplFormChooserServletProperties`
--
UPDATE `comDayCqWcmFoundationFormsImplFormChooserServletProperties` SET `service.name` = ?, `sling.servlet.resourceTypes` = ?, `sling.servlet.selectors` = ?, `sling.servlet.methods` = ?, `forms.formchooserservlet.advansesearch.require` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmFoundationFormsImplFormChooserServletProperties`
--
DELETE FROM `comDayCqWcmFoundationFormsImplFormChooserServletProperties` WHERE 0;

