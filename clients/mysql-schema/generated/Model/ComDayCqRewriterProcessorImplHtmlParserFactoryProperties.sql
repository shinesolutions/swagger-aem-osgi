--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqRewriterProcessorImplHtmlParserFactoryProperties' definition.
--


--
-- SELECT template for table `comDayCqRewriterProcessorImplHtmlParserFactoryProperties`
--
SELECT `htmlparser.processTags`, `htmlparser.preserveCamelCase` FROM `comDayCqRewriterProcessorImplHtmlParserFactoryProperties` WHERE 1;

--
-- INSERT template for table `comDayCqRewriterProcessorImplHtmlParserFactoryProperties`
--
INSERT INTO `comDayCqRewriterProcessorImplHtmlParserFactoryProperties`(`htmlparser.processTags`, `htmlparser.preserveCamelCase`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqRewriterProcessorImplHtmlParserFactoryProperties`
--
UPDATE `comDayCqRewriterProcessorImplHtmlParserFactoryProperties` SET `htmlparser.processTags` = ?, `htmlparser.preserveCamelCase` = ? WHERE 1;

--
-- DELETE template for table `comDayCqRewriterProcessorImplHtmlParserFactoryProperties`
--
DELETE FROM `comDayCqRewriterProcessorImplHtmlParserFactoryProperties` WHERE 0;

