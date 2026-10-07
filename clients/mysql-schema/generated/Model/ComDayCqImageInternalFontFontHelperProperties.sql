--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqImageInternalFontFontHelperProperties' definition.
--


--
-- SELECT template for table `comDayCqImageInternalFontFontHelperProperties`
--
SELECT `fontpath`, `oversamplingFactor` FROM `comDayCqImageInternalFontFontHelperProperties` WHERE 1;

--
-- INSERT template for table `comDayCqImageInternalFontFontHelperProperties`
--
INSERT INTO `comDayCqImageInternalFontFontHelperProperties`(`fontpath`, `oversamplingFactor`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqImageInternalFontFontHelperProperties`
--
UPDATE `comDayCqImageInternalFontFontHelperProperties` SET `fontpath` = ?, `oversamplingFactor` = ? WHERE 1;

--
-- DELETE template for table `comDayCqImageInternalFontFontHelperProperties`
--
DELETE FROM `comDayCqImageInternalFontFontHelperProperties` WHERE 0;

