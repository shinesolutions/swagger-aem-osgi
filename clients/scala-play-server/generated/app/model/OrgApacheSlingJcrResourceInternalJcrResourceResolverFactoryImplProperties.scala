package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties(
  resourceResolverSearchpath: Option[ConfigNodePropertyArray],
  resourceResolverManglenamespaces: Option[ConfigNodePropertyBoolean],
  resourceResolverAllowDirect: Option[ConfigNodePropertyBoolean],
  resourceResolverRequiredProviders: Option[ConfigNodePropertyArray],
  resourceResolverRequiredProvidernames: Option[ConfigNodePropertyArray],
  resourceResolverVirtual: Option[ConfigNodePropertyArray],
  resourceResolverMapping: Option[ConfigNodePropertyArray],
  resourceResolverMapLocation: Option[ConfigNodePropertyString],
  resourceResolverMapObservation: Option[ConfigNodePropertyArray],
  resourceResolverDefaultVanityRedirectStatus: Option[ConfigNodePropertyInteger],
  resourceResolverEnableVanitypath: Option[ConfigNodePropertyBoolean],
  resourceResolverVanitypathMaxEntries: Option[ConfigNodePropertyInteger],
  resourceResolverVanitypathMaxEntriesStartup: Option[ConfigNodePropertyBoolean],
  resourceResolverVanitypathBloomfilterMaxBytes: Option[ConfigNodePropertyInteger],
  resourceResolverOptimizeAliasResolution: Option[ConfigNodePropertyBoolean],
  resourceResolverVanitypathWhitelist: Option[ConfigNodePropertyArray],
  resourceResolverVanitypathBlacklist: Option[ConfigNodePropertyArray],
  resourceResolverVanityPrecedence: Option[ConfigNodePropertyBoolean],
  resourceResolverProviderhandlingParanoid: Option[ConfigNodePropertyBoolean],
  resourceResolverLogClosing: Option[ConfigNodePropertyBoolean],
  resourceResolverLogUnclosed: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties {
  implicit lazy val orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesJsonFormat: Format[OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties] = Json.format[OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties]
}

