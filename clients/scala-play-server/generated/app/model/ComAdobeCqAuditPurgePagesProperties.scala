package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqAuditPurgePagesProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqAuditPurgePagesProperties(
  auditlogRuleName: Option[ConfigNodePropertyString],
  auditlogRuleContentpath: Option[ConfigNodePropertyString],
  auditlogRuleMinimumage: Option[ConfigNodePropertyInteger],
  auditlogRuleTypes: Option[ConfigNodePropertyDropDown]
)

object ComAdobeCqAuditPurgePagesProperties {
  implicit lazy val comAdobeCqAuditPurgePagesPropertiesJsonFormat: Format[ComAdobeCqAuditPurgePagesProperties] = Json.format[ComAdobeCqAuditPurgePagesProperties]
}

