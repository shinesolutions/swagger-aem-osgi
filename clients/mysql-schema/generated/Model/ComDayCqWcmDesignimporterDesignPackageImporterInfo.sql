--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmDesignimporterDesignPackageImporterInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmDesignimporterDesignPackageImporterInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqWcmDesignimporterDesignPackageImporterInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmDesignimporterDesignPackageImporterInfo`
--
INSERT INTO `comDayCqWcmDesignimporterDesignPackageImporterInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmDesignimporterDesignPackageImporterInfo`
--
UPDATE `comDayCqWcmDesignimporterDesignPackageImporterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmDesignimporterDesignPackageImporterInfo`
--
DELETE FROM `comDayCqWcmDesignimporterDesignPackageImporterInfo` WHERE 0;

