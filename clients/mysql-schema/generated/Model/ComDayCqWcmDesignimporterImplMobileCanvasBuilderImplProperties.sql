--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties`
--
SELECT `filepattern`, `device.groups`, `build.page.nodes`, `build.client.libs`, `build.canvas.component` FROM `comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties`
--
INSERT INTO `comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties`(`filepattern`, `device.groups`, `build.page.nodes`, `build.client.libs`, `build.canvas.component`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties`
--
UPDATE `comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties` SET `filepattern` = ?, `device.groups` = ?, `build.page.nodes` = ?, `build.client.libs` = ?, `build.canvas.component` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties`
--
DELETE FROM `comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties` WHERE 0;

