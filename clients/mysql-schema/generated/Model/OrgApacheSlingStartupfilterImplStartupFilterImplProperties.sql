--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingStartupfilterImplStartupFilterImplProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingStartupfilterImplStartupFilterImplProperties`
--
SELECT `active.by.default`, `default.message` FROM `orgApacheSlingStartupfilterImplStartupFilterImplProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingStartupfilterImplStartupFilterImplProperties`
--
INSERT INTO `orgApacheSlingStartupfilterImplStartupFilterImplProperties`(`active.by.default`, `default.message`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingStartupfilterImplStartupFilterImplProperties`
--
UPDATE `orgApacheSlingStartupfilterImplStartupFilterImplProperties` SET `active.by.default` = ?, `default.message` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingStartupfilterImplStartupFilterImplProperties`
--
DELETE FROM `orgApacheSlingStartupfilterImplStartupFilterImplProperties` WHERE 0;

