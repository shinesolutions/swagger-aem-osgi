package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties(
  javaClassdebuginfo: Option[ConfigNodePropertyBoolean],
  javaJavaEncoding: Option[ConfigNodePropertyString],
  javaCompilerSourceVM: Option[ConfigNodePropertyString],
  javaCompilerTargetVM: Option[ConfigNodePropertyString]
)

object OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties {
  implicit lazy val orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesJsonFormat: Format[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties] = Json.format[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties]
}

