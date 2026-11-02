package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties(
  jasperCompilerTargetVM: Option[ConfigNodePropertyString],
  jasperCompilerSourceVM: Option[ConfigNodePropertyString],
  jasperClassdebuginfo: Option[ConfigNodePropertyBoolean],
  jasperEnablePooling: Option[ConfigNodePropertyBoolean],
  jasperIeClassId: Option[ConfigNodePropertyString],
  jasperGenStringAsCharArray: Option[ConfigNodePropertyBoolean],
  jasperKeepgenerated: Option[ConfigNodePropertyBoolean],
  jasperMappedfile: Option[ConfigNodePropertyBoolean],
  jasperTrimSpaces: Option[ConfigNodePropertyBoolean],
  jasperDisplaySourceFragments: Option[ConfigNodePropertyBoolean],
  defaultIsSession: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties {
  implicit lazy val orgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesJsonFormat: Format[OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties] = Json.format[OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties]
}

