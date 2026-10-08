--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended`
--
SELECT `service.ranking`, `user.mapping` FROM `orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended` WHERE 1;

--
-- INSERT template for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended`
--
INSERT INTO `orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended`(`service.ranking`, `user.mapping`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended`
--
UPDATE `orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended` SET `service.ranking` = ?, `user.mapping` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended`
--
DELETE FROM `orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended` WHERE 0;

