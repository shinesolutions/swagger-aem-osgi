--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertie`
--
SELECT `allow.only.system.user` FROM `orgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertie` WHERE 1;

--
-- INSERT template for table `orgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertie`
--
INSERT INTO `orgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertie`(`allow.only.system.user`) VALUES (?);

--
-- UPDATE template for table `orgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertie`
--
UPDATE `orgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertie` SET `allow.only.system.user` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertie`
--
DELETE FROM `orgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertie` WHERE 0;

