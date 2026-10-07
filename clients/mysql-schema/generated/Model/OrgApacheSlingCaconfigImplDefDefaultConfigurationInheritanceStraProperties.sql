--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra`
--
SELECT `enabled`, `configPropertyInheritancePropertyNames` FROM `orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra`
--
INSERT INTO `orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra`(`enabled`, `configPropertyInheritancePropertyNames`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra`
--
UPDATE `orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra` SET `enabled` = ?, `configPropertyInheritancePropertyNames` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra`
--
DELETE FROM `orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra` WHERE 0;

