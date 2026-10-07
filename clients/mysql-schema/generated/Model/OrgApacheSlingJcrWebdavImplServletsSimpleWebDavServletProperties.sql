--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties`
--
SELECT `dav.root`, `dav.create-absolute-uri`, `dav.realm`, `collection.types`, `filter.prefixes`, `filter.types`, `filter.uris`, `type.collections`, `type.noncollections`, `type.content` FROM `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties`
--
INSERT INTO `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties`(`dav.root`, `dav.create-absolute-uri`, `dav.realm`, `collection.types`, `filter.prefixes`, `filter.types`, `filter.uris`, `type.collections`, `type.noncollections`, `type.content`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties`
--
UPDATE `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties` SET `dav.root` = ?, `dav.create-absolute-uri` = ?, `dav.realm` = ?, `collection.types` = ?, `filter.prefixes` = ?, `filter.types` = ?, `filter.uris` = ?, `type.collections` = ?, `type.noncollections` = ?, `type.content` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties`
--
DELETE FROM `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties` WHERE 0;

