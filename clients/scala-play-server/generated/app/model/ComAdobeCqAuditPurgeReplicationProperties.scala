package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqAuditPurgeReplicationProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqAuditPurgeReplicationProperties(
  auditlogRuleName: Option[ConfigNodePropertyString],
  auditlogRuleContentpath: Option[ConfigNodePropertyString],
  auditlogRuleMinimumage: Option[ConfigNodePropertyInteger],
  auditlogRuleTypes: Option[ConfigNodePropertyDropDown]
)

object ComAdobeCqAuditPurgeReplicationProperties {
  implicit lazy val comAdobeCqAuditPurgeReplicationPropertiesJsonFormat: Format[ComAdobeCqAuditPurgeReplicationProperties] = Json.format[ComAdobeCqAuditPurgeReplicationProperties]
}

