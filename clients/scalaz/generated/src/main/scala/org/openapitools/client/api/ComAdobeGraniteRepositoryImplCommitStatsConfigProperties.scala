package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteRepositoryImplCommitStatsConfigProperties._

case class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties (
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
stackShorteners: Option[ConfigNodePropertyArray])

object ComAdobeGraniteRepositoryImplCommitStatsConfigProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesCodecJson: CodecJson[ComAdobeGraniteRepositoryImplCommitStatsConfigProperties] = CodecJson.derive[ComAdobeGraniteRepositoryImplCommitStatsConfigProperties]
  implicit val ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesDecoder: EntityDecoder[ComAdobeGraniteRepositoryImplCommitStatsConfigProperties] = jsonOf[ComAdobeGraniteRepositoryImplCommitStatsConfigProperties]
  implicit val ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesEncoder: EntityEncoder[ComAdobeGraniteRepositoryImplCommitStatsConfigProperties] = jsonEncoderOf[ComAdobeGraniteRepositoryImplCommitStatsConfigProperties]
}
