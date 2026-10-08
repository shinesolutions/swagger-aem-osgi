--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeFormsCommonServletTempCleanUpTaskInfo' definition.
--


--
-- SELECT template for table `comAdobeFormsCommonServletTempCleanUpTaskInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeFormsCommonServletTempCleanUpTaskInfo` WHERE 1;

--
-- INSERT template for table `comAdobeFormsCommonServletTempCleanUpTaskInfo`
--
INSERT INTO `comAdobeFormsCommonServletTempCleanUpTaskInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeFormsCommonServletTempCleanUpTaskInfo`
--
UPDATE `comAdobeFormsCommonServletTempCleanUpTaskInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeFormsCommonServletTempCleanUpTaskInfo`
--
DELETE FROM `comAdobeFormsCommonServletTempCleanUpTaskInfo` WHERE 0;

