--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqSearchpromoteImplSearchPromoteServiceImplProperties' definition.
--


--
-- SELECT template for table `comDayCqSearchpromoteImplSearchPromoteServiceImplProperties`
--
SELECT `cq.searchpromote.configuration.server.uri`, `cq.searchpromote.configuration.environment`, `connection.timeout`, `socket.timeout` FROM `comDayCqSearchpromoteImplSearchPromoteServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqSearchpromoteImplSearchPromoteServiceImplProperties`
--
INSERT INTO `comDayCqSearchpromoteImplSearchPromoteServiceImplProperties`(`cq.searchpromote.configuration.server.uri`, `cq.searchpromote.configuration.environment`, `connection.timeout`, `socket.timeout`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqSearchpromoteImplSearchPromoteServiceImplProperties`
--
UPDATE `comDayCqSearchpromoteImplSearchPromoteServiceImplProperties` SET `cq.searchpromote.configuration.server.uri` = ?, `cq.searchpromote.configuration.environment` = ?, `connection.timeout` = ?, `socket.timeout` = ? WHERE 1;

--
-- DELETE template for table `comDayCqSearchpromoteImplSearchPromoteServiceImplProperties`
--
DELETE FROM `comDayCqSearchpromoteImplSearchPromoteServiceImplProperties` WHERE 0;

