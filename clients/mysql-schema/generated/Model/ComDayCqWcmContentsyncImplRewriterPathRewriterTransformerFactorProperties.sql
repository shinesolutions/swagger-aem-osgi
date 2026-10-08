--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorP`
--
SELECT `cq.contentsync.pathrewritertransformer.mapping.links`, `cq.contentsync.pathrewritertransformer.mapping.clientlibs`, `cq.contentsync.pathrewritertransformer.mapping.images`, `cq.contentsync.pathrewritertransformer.attribute.pattern`, `cq.contentsync.pathrewritertransformer.clientlibrary.pattern`, `cq.contentsync.pathrewritertransformer.clientlibrary.replace` FROM `comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorP` WHERE 1;

--
-- INSERT template for table `comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorP`
--
INSERT INTO `comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorP`(`cq.contentsync.pathrewritertransformer.mapping.links`, `cq.contentsync.pathrewritertransformer.mapping.clientlibs`, `cq.contentsync.pathrewritertransformer.mapping.images`, `cq.contentsync.pathrewritertransformer.attribute.pattern`, `cq.contentsync.pathrewritertransformer.clientlibrary.pattern`, `cq.contentsync.pathrewritertransformer.clientlibrary.replace`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorP`
--
UPDATE `comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorP` SET `cq.contentsync.pathrewritertransformer.mapping.links` = ?, `cq.contentsync.pathrewritertransformer.mapping.clientlibs` = ?, `cq.contentsync.pathrewritertransformer.mapping.images` = ?, `cq.contentsync.pathrewritertransformer.attribute.pattern` = ?, `cq.contentsync.pathrewritertransformer.clientlibrary.pattern` = ?, `cq.contentsync.pathrewritertransformer.clientlibrary.replace` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorP`
--
DELETE FROM `comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorP` WHERE 0;

