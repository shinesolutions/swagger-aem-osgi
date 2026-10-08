--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenP`
--
SELECT `group.listing.pagination.enable`, `group.listing.lazyloading.enable`, `page.size`, `priority` FROM `comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenP` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenP`
--
INSERT INTO `comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenP`(`group.listing.pagination.enable`, `group.listing.lazyloading.enable`, `page.size`, `priority`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenP`
--
UPDATE `comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenP` SET `group.listing.pagination.enable` = ?, `group.listing.lazyloading.enable` = ?, `page.size` = ?, `priority` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenP`
--
DELETE FROM `comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenP` WHERE 0;

