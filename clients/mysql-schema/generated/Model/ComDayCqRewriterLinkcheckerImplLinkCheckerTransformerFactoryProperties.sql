--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties' definition.
--


--
-- SELECT template for table `comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProp`
--
SELECT `linkcheckertransformer.disableRewriting`, `linkcheckertransformer.disableChecking`, `linkcheckertransformer.mapCacheSize`, `linkcheckertransformer.strictExtensionCheck`, `linkcheckertransformer.stripHtmltExtension`, `linkcheckertransformer.rewriteElements`, `linkcheckertransformer.stripExtensionPathBlacklist` FROM `comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProp` WHERE 1;

--
-- INSERT template for table `comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProp`
--
INSERT INTO `comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProp`(`linkcheckertransformer.disableRewriting`, `linkcheckertransformer.disableChecking`, `linkcheckertransformer.mapCacheSize`, `linkcheckertransformer.strictExtensionCheck`, `linkcheckertransformer.stripHtmltExtension`, `linkcheckertransformer.rewriteElements`, `linkcheckertransformer.stripExtensionPathBlacklist`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProp`
--
UPDATE `comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProp` SET `linkcheckertransformer.disableRewriting` = ?, `linkcheckertransformer.disableChecking` = ?, `linkcheckertransformer.mapCacheSize` = ?, `linkcheckertransformer.strictExtensionCheck` = ?, `linkcheckertransformer.stripHtmltExtension` = ?, `linkcheckertransformer.rewriteElements` = ?, `linkcheckertransformer.stripExtensionPathBlacklist` = ? WHERE 1;

--
-- DELETE template for table `comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProp`
--
DELETE FROM `comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProp` WHERE 0;

