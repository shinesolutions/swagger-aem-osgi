--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties' definition.
--


--
-- SELECT template for table `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties`
--
SELECT `service.max_links_per_host`, `service.save_external_link_references` FROM `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties`
--
INSERT INTO `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties`(`service.max_links_per_host`, `service.save_external_link_references`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties`
--
UPDATE `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties` SET `service.max_links_per_host` = ?, `service.save_external_link_references` = ? WHERE 1;

--
-- DELETE template for table `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties`
--
DELETE FROM `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties` WHERE 0;

