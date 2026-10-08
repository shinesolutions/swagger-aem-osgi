package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqCommonsImplExternalizerImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqCommonsImplExternalizerImplProperties(
  externalizerDomains: Option[ConfigNodePropertyArray],
  externalizerHost: Option[ConfigNodePropertyString],
  externalizerContextpath: Option[ConfigNodePropertyString],
  externalizerEncodedpath: Option[ConfigNodePropertyBoolean]
)

object ComDayCqCommonsImplExternalizerImplProperties {
  implicit lazy val comDayCqCommonsImplExternalizerImplPropertiesJsonFormat: Format[ComDayCqCommonsImplExternalizerImplProperties] = Json.format[ComDayCqCommonsImplExternalizerImplProperties]
}

