package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamIdsImplIDSPoolManagerImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamIdsImplIDSPoolManagerImplProperties(
  maxErrorsToBlacklist: Option[ConfigNodePropertyInteger],
  retryIntervalToWhitelist: Option[ConfigNodePropertyInteger],
  connectTimeout: Option[ConfigNodePropertyInteger],
  socketTimeout: Option[ConfigNodePropertyInteger],
  processLabel: Option[ConfigNodePropertyString],
  connectionUseMax: Option[ConfigNodePropertyInteger]
)

object ComDayCqDamIdsImplIDSPoolManagerImplProperties {
  implicit lazy val comDayCqDamIdsImplIDSPoolManagerImplPropertiesJsonFormat: Format[ComDayCqDamIdsImplIDSPoolManagerImplProperties] = Json.format[ComDayCqDamIdsImplIDSPoolManagerImplProperties]
}

