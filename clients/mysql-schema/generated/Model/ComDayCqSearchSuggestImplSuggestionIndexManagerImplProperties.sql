--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties' definition.
--


--
-- SELECT template for table `comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties`
--
SELECT `pathBuilder.target`, `suggest.basepath` FROM `comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties`
--
INSERT INTO `comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties`(`pathBuilder.target`, `suggest.basepath`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties`
--
UPDATE `comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties` SET `pathBuilder.target` = ?, `suggest.basepath` = ? WHERE 1;

--
-- DELETE template for table `comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties`
--
DELETE FROM `comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties` WHERE 0;

