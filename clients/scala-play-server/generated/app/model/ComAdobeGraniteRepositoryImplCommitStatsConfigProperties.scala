package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteRepositoryImplCommitStatsConfigProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties(
  enabled: Option[ConfigNodePropertyBoolean],
  intervalSeconds: Option[ConfigNodePropertyInteger],
  commitsPerIntervalThreshold: Option[ConfigNodePropertyInteger],
  maxLocationLength: Option[ConfigNodePropertyInteger],
  maxDetailsShown: Option[ConfigNodePropertyInteger],
  minDetailsPercentage: Option[ConfigNodePropertyInteger],
  threadMatchers: Option[ConfigNodePropertyArray],
  maxGreedyDepth: Option[ConfigNodePropertyInteger],
  greedyStackMatchers: Option[ConfigNodePropertyString],
  stackFilters: Option[ConfigNodePropertyArray],
  stackMatchers: Option[ConfigNodePropertyArray],
  stackCategorizers: Option[ConfigNodePropertyArray],
  stackShorteners: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteRepositoryImplCommitStatsConfigProperties {
  implicit lazy val comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesJsonFormat: Format[ComAdobeGraniteRepositoryImplCommitStatsConfigProperties] = Json.format[ComAdobeGraniteRepositoryImplCommitStatsConfigProperties]
}

