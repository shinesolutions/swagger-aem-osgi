package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties(
  poolName: Option[ConfigNodePropertyString],
  allowedPoolNames: Option[ConfigNodePropertyArray],
  schedulerUseleaderforsingle: Option[ConfigNodePropertyBoolean],
  metricsFilters: Option[ConfigNodePropertyArray],
  slowThresholdMillis: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties {
  implicit lazy val orgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesJsonFormat: Format[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties] = Json.format[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties]
}

