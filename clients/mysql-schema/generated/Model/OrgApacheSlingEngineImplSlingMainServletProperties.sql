--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEngineImplSlingMainServletProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingEngineImplSlingMainServletProperties`
--
SELECT `sling.max.calls`, `sling.max.inclusions`, `sling.trace.allow`, `sling.max.record.requests`, `sling.store.pattern.requests`, `sling.serverinfo`, `sling.additional.response.headers` FROM `orgApacheSlingEngineImplSlingMainServletProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEngineImplSlingMainServletProperties`
--
INSERT INTO `orgApacheSlingEngineImplSlingMainServletProperties`(`sling.max.calls`, `sling.max.inclusions`, `sling.trace.allow`, `sling.max.record.requests`, `sling.store.pattern.requests`, `sling.serverinfo`, `sling.additional.response.headers`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEngineImplSlingMainServletProperties`
--
UPDATE `orgApacheSlingEngineImplSlingMainServletProperties` SET `sling.max.calls` = ?, `sling.max.inclusions` = ?, `sling.trace.allow` = ?, `sling.max.record.requests` = ?, `sling.store.pattern.requests` = ?, `sling.serverinfo` = ?, `sling.additional.response.headers` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEngineImplSlingMainServletProperties`
--
DELETE FROM `orgApacheSlingEngineImplSlingMainServletProperties` WHERE 0;

