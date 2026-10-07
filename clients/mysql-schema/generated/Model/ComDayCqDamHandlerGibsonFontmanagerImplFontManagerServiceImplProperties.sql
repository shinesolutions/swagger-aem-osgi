--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties' definition.
--


--
-- SELECT template for table `comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPro`
--
SELECT `event.filter`, `fontmgr.system.font.dir`, `fontmgr.adobe.font.dir`, `fontmgr.customer.font.dir` FROM `comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPro` WHERE 1;

--
-- INSERT template for table `comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPro`
--
INSERT INTO `comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPro`(`event.filter`, `fontmgr.system.font.dir`, `fontmgr.adobe.font.dir`, `fontmgr.customer.font.dir`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPro`
--
UPDATE `comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPro` SET `event.filter` = ?, `fontmgr.system.font.dir` = ?, `fontmgr.adobe.font.dir` = ?, `fontmgr.customer.font.dir` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPro`
--
DELETE FROM `comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPro` WHERE 0;

