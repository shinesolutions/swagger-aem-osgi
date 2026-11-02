package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties(
  handlerSchemes: Option[ConfigNodePropertyArray],
  slingJcrinstallFolderNameRegexp: Option[ConfigNodePropertyString],
  slingJcrinstallFolderMaxDepth: Option[ConfigNodePropertyInteger],
  slingJcrinstallSearchPath: Option[ConfigNodePropertyArray],
  slingJcrinstallNewConfigPath: Option[ConfigNodePropertyString],
  slingJcrinstallSignalPath: Option[ConfigNodePropertyString],
  slingJcrinstallEnableWriteback: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties {
  implicit lazy val orgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesJsonFormat: Format[OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties] = Json.format[OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties]
}

