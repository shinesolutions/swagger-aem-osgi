package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties(
  deleteNameRegexps: Option[ConfigNodePropertyArray]
)

object ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties {
  implicit lazy val comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesJsonFormat: Format[ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties] = Json.format[ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties]
}

