package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplLightboxLightboxServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplLightboxLightboxServletProperties(
  slingServletPaths: Option[ConfigNodePropertyString],
  slingServletMethods: Option[ConfigNodePropertyArray],
  cqDamEnableAnonymous: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamCoreImplLightboxLightboxServletProperties {
  implicit lazy val comDayCqDamCoreImplLightboxLightboxServletPropertiesJsonFormat: Format[ComDayCqDamCoreImplLightboxLightboxServletProperties] = Json.format[ComDayCqDamCoreImplLightboxLightboxServletProperties]
}

