--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingServletsPostImplSlingPostServletProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingServletsPostImplSlingPostServletProperties`
--
SELECT `servlet.post.dateFormats`, `servlet.post.nodeNameHints`, `servlet.post.nodeNameMaxLength`, `servlet.post.checkinNewVersionableNodes`, `servlet.post.autoCheckout`, `servlet.post.autoCheckin`, `servlet.post.ignorePattern` FROM `orgApacheSlingServletsPostImplSlingPostServletProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingServletsPostImplSlingPostServletProperties`
--
INSERT INTO `orgApacheSlingServletsPostImplSlingPostServletProperties`(`servlet.post.dateFormats`, `servlet.post.nodeNameHints`, `servlet.post.nodeNameMaxLength`, `servlet.post.checkinNewVersionableNodes`, `servlet.post.autoCheckout`, `servlet.post.autoCheckin`, `servlet.post.ignorePattern`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingServletsPostImplSlingPostServletProperties`
--
UPDATE `orgApacheSlingServletsPostImplSlingPostServletProperties` SET `servlet.post.dateFormats` = ?, `servlet.post.nodeNameHints` = ?, `servlet.post.nodeNameMaxLength` = ?, `servlet.post.checkinNewVersionableNodes` = ?, `servlet.post.autoCheckout` = ?, `servlet.post.autoCheckin` = ?, `servlet.post.ignorePattern` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingServletsPostImplSlingPostServletProperties`
--
DELETE FROM `orgApacheSlingServletsPostImplSlingPostServletProperties` WHERE 0;

