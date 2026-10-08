--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties`
--
SELECT `handler.schemes`, `sling.jcrinstall.folder.name.regexp`, `sling.jcrinstall.folder.max.depth`, `sling.jcrinstall.search.path`, `sling.jcrinstall.new.config.path`, `sling.jcrinstall.signal.path`, `sling.jcrinstall.enable.writeback` FROM `orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties`
--
INSERT INTO `orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties`(`handler.schemes`, `sling.jcrinstall.folder.name.regexp`, `sling.jcrinstall.folder.max.depth`, `sling.jcrinstall.search.path`, `sling.jcrinstall.new.config.path`, `sling.jcrinstall.signal.path`, `sling.jcrinstall.enable.writeback`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties`
--
UPDATE `orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties` SET `handler.schemes` = ?, `sling.jcrinstall.folder.name.regexp` = ?, `sling.jcrinstall.folder.max.depth` = ?, `sling.jcrinstall.search.path` = ?, `sling.jcrinstall.new.config.path` = ?, `sling.jcrinstall.signal.path` = ?, `sling.jcrinstall.enable.writeback` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties`
--
DELETE FROM `orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties` WHERE 0;

