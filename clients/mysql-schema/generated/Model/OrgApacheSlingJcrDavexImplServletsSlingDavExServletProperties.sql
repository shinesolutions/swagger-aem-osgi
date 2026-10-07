--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties`
--
SELECT `alias`, `dav.create-absolute-uri`, `dav.protectedhandlers` FROM `orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties`
--
INSERT INTO `orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties`(`alias`, `dav.create-absolute-uri`, `dav.protectedhandlers`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties`
--
UPDATE `orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties` SET `alias` = ?, `dav.create-absolute-uri` = ?, `dav.protectedhandlers` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties`
--
DELETE FROM `orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties` WHERE 0;

