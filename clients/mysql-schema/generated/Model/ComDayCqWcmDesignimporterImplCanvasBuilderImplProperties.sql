--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmDesignimporterImplCanvasBuilderImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmDesignimporterImplCanvasBuilderImplProperties`
--
SELECT `filepattern`, `build.page.nodes`, `build.client.libs`, `build.canvas.component` FROM `comDayCqWcmDesignimporterImplCanvasBuilderImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmDesignimporterImplCanvasBuilderImplProperties`
--
INSERT INTO `comDayCqWcmDesignimporterImplCanvasBuilderImplProperties`(`filepattern`, `build.page.nodes`, `build.client.libs`, `build.canvas.component`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmDesignimporterImplCanvasBuilderImplProperties`
--
UPDATE `comDayCqWcmDesignimporterImplCanvasBuilderImplProperties` SET `filepattern` = ?, `build.page.nodes` = ?, `build.client.libs` = ?, `build.canvas.component` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmDesignimporterImplCanvasBuilderImplProperties`
--
DELETE FROM `comDayCqWcmDesignimporterImplCanvasBuilderImplProperties` WHERE 0;

