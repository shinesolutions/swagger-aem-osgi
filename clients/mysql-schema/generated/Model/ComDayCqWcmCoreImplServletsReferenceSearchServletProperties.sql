--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplServletsReferenceSearchServletProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplServletsReferenceSearchServletProperties`
--
SELECT `referencesearchservlet.maxReferencesPerPage`, `referencesearchservlet.maxPages` FROM `comDayCqWcmCoreImplServletsReferenceSearchServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplServletsReferenceSearchServletProperties`
--
INSERT INTO `comDayCqWcmCoreImplServletsReferenceSearchServletProperties`(`referencesearchservlet.maxReferencesPerPage`, `referencesearchservlet.maxPages`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplServletsReferenceSearchServletProperties`
--
UPDATE `comDayCqWcmCoreImplServletsReferenceSearchServletProperties` SET `referencesearchservlet.maxReferencesPerPage` = ?, `referencesearchservlet.maxPages` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplServletsReferenceSearchServletProperties`
--
DELETE FROM `comDayCqWcmCoreImplServletsReferenceSearchServletProperties` WHERE 0;

