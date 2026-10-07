--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti`
--
SELECT `ignorePropertyNameRegex`, `configCollectionPropertiesResourceNames` FROM `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti`
--
INSERT INTO `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti`(`ignorePropertyNameRegex`, `configCollectionPropertiesResourceNames`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti`
--
UPDATE `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti` SET `ignorePropertyNameRegex` = ?, `configCollectionPropertiesResourceNames` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti`
--
DELETE FROM `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti` WHERE 0;

