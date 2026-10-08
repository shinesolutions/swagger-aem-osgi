--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmFoundationFormsImplFormsHandlingServletProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmFoundationFormsImplFormsHandlingServletProperties`
--
SELECT `name.whitelist`, `allow.expressions` FROM `comDayCqWcmFoundationFormsImplFormsHandlingServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmFoundationFormsImplFormsHandlingServletProperties`
--
INSERT INTO `comDayCqWcmFoundationFormsImplFormsHandlingServletProperties`(`name.whitelist`, `allow.expressions`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmFoundationFormsImplFormsHandlingServletProperties`
--
UPDATE `comDayCqWcmFoundationFormsImplFormsHandlingServletProperties` SET `name.whitelist` = ?, `allow.expressions` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmFoundationFormsImplFormsHandlingServletProperties`
--
DELETE FROM `comDayCqWcmFoundationFormsImplFormsHandlingServletProperties` WHERE 0;

