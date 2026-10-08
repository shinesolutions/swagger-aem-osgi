package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingTenantInternalTenantProviderImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingTenantInternalTenantProviderImplProperties(
  tenantRoot: Option[ConfigNodePropertyString],
  tenantPathMatcher: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingTenantInternalTenantProviderImplProperties {
  implicit lazy val orgApacheSlingTenantInternalTenantProviderImplPropertiesJsonFormat: Format[OrgApacheSlingTenantInternalTenantProviderImplProperties] = Json.format[OrgApacheSlingTenantInternalTenantProviderImplProperties]
}

