--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generat'
--
SELECT cq/commerce/cataloggenerator/bucketsize, cq/commerce/cataloggenerator/bucketname, cq/commerce/cataloggenerator/excludedtemplateproperties FROM com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generat WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generat'
--
INSERT INTO com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generat (cq/commerce/cataloggenerator/bucketsize, cq/commerce/cataloggenerator/bucketname, cq/commerce/cataloggenerator/excludedtemplateproperties) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generat'
--
UPDATE com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generat SET cq/commerce/cataloggenerator/bucketsize = ?, cq/commerce/cataloggenerator/bucketname = ?, cq/commerce/cataloggenerator/excludedtemplateproperties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generat'
--
DELETE FROM com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generat WHERE 1=2;

