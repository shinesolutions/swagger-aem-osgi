package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties(
  deletePathRegexps: Option[ConfigNodePropertyArray],
  deleteSql2Query: Option[ConfigNodePropertyString]
)

object ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties {
  implicit lazy val comAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesJsonFormat: Format[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties] = Json.format[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties]
}

