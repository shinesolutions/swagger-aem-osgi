package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingSecurityImplReferrerFilterProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingSecurityImplReferrerFilterProperties(
  allowEmpty: Option[ConfigNodePropertyBoolean],
  allowHosts: Option[ConfigNodePropertyArray],
  allowHostsRegexp: Option[ConfigNodePropertyArray],
  filterMethods: Option[ConfigNodePropertyArray],
  excludeAgentsRegexp: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingSecurityImplReferrerFilterProperties {
  implicit lazy val orgApacheSlingSecurityImplReferrerFilterPropertiesJsonFormat: Format[OrgApacheSlingSecurityImplReferrerFilterProperties] = Json.format[OrgApacheSlingSecurityImplReferrerFilterProperties]
}

