package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingEngineImplSlingMainServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingEngineImplSlingMainServletProperties(
  slingMaxCalls: Option[ConfigNodePropertyInteger],
  slingMaxInclusions: Option[ConfigNodePropertyInteger],
  slingTraceAllow: Option[ConfigNodePropertyBoolean],
  slingMaxRecordRequests: Option[ConfigNodePropertyInteger],
  slingStorePatternRequests: Option[ConfigNodePropertyArray],
  slingServerinfo: Option[ConfigNodePropertyString],
  slingAdditionalResponseHeaders: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingEngineImplSlingMainServletProperties {
  implicit lazy val orgApacheSlingEngineImplSlingMainServletPropertiesJsonFormat: Format[OrgApacheSlingEngineImplSlingMainServletProperties] = Json.format[OrgApacheSlingEngineImplSlingMainServletProperties]
}

