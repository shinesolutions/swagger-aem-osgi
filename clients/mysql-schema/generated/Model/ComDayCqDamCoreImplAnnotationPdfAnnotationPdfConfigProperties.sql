--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties`
--
SELECT `cq.dam.config.annotation.pdf.document.width`, `cq.dam.config.annotation.pdf.document.height`, `cq.dam.config.annotation.pdf.document.padding.horizontal`, `cq.dam.config.annotation.pdf.document.padding.vertical`, `cq.dam.config.annotation.pdf.font.size`, `cq.dam.config.annotation.pdf.font.color`, `cq.dam.config.annotation.pdf.font.family`, `cq.dam.config.annotation.pdf.font.light`, `cq.dam.config.annotation.pdf.marginTextImage`, `cq.dam.config.annotation.pdf.minImageHeight`, `cq.dam.config.annotation.pdf.reviewStatus.width`, `cq.dam.config.annotation.pdf.reviewStatus.color.approved`, `cq.dam.config.annotation.pdf.reviewStatus.color.rejected`, `cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested`, `cq.dam.config.annotation.pdf.annotationMarker.width`, `cq.dam.config.annotation.pdf.asset.minheight` FROM `comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties`
--
INSERT INTO `comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties`(`cq.dam.config.annotation.pdf.document.width`, `cq.dam.config.annotation.pdf.document.height`, `cq.dam.config.annotation.pdf.document.padding.horizontal`, `cq.dam.config.annotation.pdf.document.padding.vertical`, `cq.dam.config.annotation.pdf.font.size`, `cq.dam.config.annotation.pdf.font.color`, `cq.dam.config.annotation.pdf.font.family`, `cq.dam.config.annotation.pdf.font.light`, `cq.dam.config.annotation.pdf.marginTextImage`, `cq.dam.config.annotation.pdf.minImageHeight`, `cq.dam.config.annotation.pdf.reviewStatus.width`, `cq.dam.config.annotation.pdf.reviewStatus.color.approved`, `cq.dam.config.annotation.pdf.reviewStatus.color.rejected`, `cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested`, `cq.dam.config.annotation.pdf.annotationMarker.width`, `cq.dam.config.annotation.pdf.asset.minheight`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties`
--
UPDATE `comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties` SET `cq.dam.config.annotation.pdf.document.width` = ?, `cq.dam.config.annotation.pdf.document.height` = ?, `cq.dam.config.annotation.pdf.document.padding.horizontal` = ?, `cq.dam.config.annotation.pdf.document.padding.vertical` = ?, `cq.dam.config.annotation.pdf.font.size` = ?, `cq.dam.config.annotation.pdf.font.color` = ?, `cq.dam.config.annotation.pdf.font.family` = ?, `cq.dam.config.annotation.pdf.font.light` = ?, `cq.dam.config.annotation.pdf.marginTextImage` = ?, `cq.dam.config.annotation.pdf.minImageHeight` = ?, `cq.dam.config.annotation.pdf.reviewStatus.width` = ?, `cq.dam.config.annotation.pdf.reviewStatus.color.approved` = ?, `cq.dam.config.annotation.pdf.reviewStatus.color.rejected` = ?, `cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested` = ?, `cq.dam.config.annotation.pdf.annotationMarker.width` = ?, `cq.dam.config.annotation.pdf.asset.minheight` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties`
--
DELETE FROM `comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties` WHERE 0;

