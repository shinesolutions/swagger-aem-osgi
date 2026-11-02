package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties(
  cqAnalyticsSitecatalystServiceDatacenterUrl: Option[ConfigNodePropertyArray],
  devhostnamepatterns: Option[ConfigNodePropertyArray],
  connectionTimeout: Option[ConfigNodePropertyInteger],
  socketTimeout: Option[ConfigNodePropertyInteger]
)

object ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties {
  implicit lazy val comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesJsonFormat: Format[ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties] = Json.format[ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties]
}

