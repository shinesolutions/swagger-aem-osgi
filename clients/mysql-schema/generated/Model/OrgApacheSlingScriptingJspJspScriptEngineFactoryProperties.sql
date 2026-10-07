--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingScriptingJspJspScriptEngineFactoryProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingScriptingJspJspScriptEngineFactoryProperties`
--
SELECT `jasper.compilerTargetVM`, `jasper.compilerSourceVM`, `jasper.classdebuginfo`, `jasper.enablePooling`, `jasper.ieClassId`, `jasper.genStringAsCharArray`, `jasper.keepgenerated`, `jasper.mappedfile`, `jasper.trimSpaces`, `jasper.displaySourceFragments`, `default.is.session` FROM `orgApacheSlingScriptingJspJspScriptEngineFactoryProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingScriptingJspJspScriptEngineFactoryProperties`
--
INSERT INTO `orgApacheSlingScriptingJspJspScriptEngineFactoryProperties`(`jasper.compilerTargetVM`, `jasper.compilerSourceVM`, `jasper.classdebuginfo`, `jasper.enablePooling`, `jasper.ieClassId`, `jasper.genStringAsCharArray`, `jasper.keepgenerated`, `jasper.mappedfile`, `jasper.trimSpaces`, `jasper.displaySourceFragments`, `default.is.session`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingScriptingJspJspScriptEngineFactoryProperties`
--
UPDATE `orgApacheSlingScriptingJspJspScriptEngineFactoryProperties` SET `jasper.compilerTargetVM` = ?, `jasper.compilerSourceVM` = ?, `jasper.classdebuginfo` = ?, `jasper.enablePooling` = ?, `jasper.ieClassId` = ?, `jasper.genStringAsCharArray` = ?, `jasper.keepgenerated` = ?, `jasper.mappedfile` = ?, `jasper.trimSpaces` = ?, `jasper.displaySourceFragments` = ?, `default.is.session` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingScriptingJspJspScriptEngineFactoryProperties`
--
DELETE FROM `orgApacheSlingScriptingJspJspScriptEngineFactoryProperties` WHERE 0;

