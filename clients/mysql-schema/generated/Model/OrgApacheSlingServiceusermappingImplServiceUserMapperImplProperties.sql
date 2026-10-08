--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplPropert`
--
SELECT `user.mapping`, `user.default`, `user.enable.default.mapping`, `require.validation` FROM `orgApacheSlingServiceusermappingImplServiceUserMapperImplPropert` WHERE 1;

--
-- INSERT template for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplPropert`
--
INSERT INTO `orgApacheSlingServiceusermappingImplServiceUserMapperImplPropert`(`user.mapping`, `user.default`, `user.enable.default.mapping`, `require.validation`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplPropert`
--
UPDATE `orgApacheSlingServiceusermappingImplServiceUserMapperImplPropert` SET `user.mapping` = ?, `user.default` = ?, `user.enable.default.mapping` = ?, `require.validation` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplPropert`
--
DELETE FROM `orgApacheSlingServiceusermappingImplServiceUserMapperImplPropert` WHERE 0;

