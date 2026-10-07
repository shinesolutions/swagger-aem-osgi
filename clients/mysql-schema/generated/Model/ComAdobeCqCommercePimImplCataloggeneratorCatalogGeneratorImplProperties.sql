--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPro`
--
SELECT `cq.commerce.cataloggenerator.bucketsize`, `cq.commerce.cataloggenerator.bucketname`, `cq.commerce.cataloggenerator.excludedtemplateproperties` FROM `comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPro` WHERE 1;

--
-- INSERT template for table `comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPro`
--
INSERT INTO `comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPro`(`cq.commerce.cataloggenerator.bucketsize`, `cq.commerce.cataloggenerator.bucketname`, `cq.commerce.cataloggenerator.excludedtemplateproperties`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPro`
--
UPDATE `comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPro` SET `cq.commerce.cataloggenerator.bucketsize` = ?, `cq.commerce.cataloggenerator.bucketname` = ?, `cq.commerce.cataloggenerator.excludedtemplateproperties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPro`
--
DELETE FROM `comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPro` WHERE 0;

