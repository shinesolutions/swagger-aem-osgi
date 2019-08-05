package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamIdsImplIDSJobProcessorProperties._

case class ComDayCqDamIdsImplIDSJobProcessorProperties (
  enableMultisession: Option[ConfigNodePropertyBoolean],
idsCcEnable: Option[ConfigNodePropertyBoolean],
enableRetry: Option[ConfigNodePropertyBoolean],
enableRetryScripterror: Option[ConfigNodePropertyBoolean],
externalizerDomainCqhost: Option[ConfigNodePropertyString],
externalizerDomainHttp: Option[ConfigNodePropertyString])

object ComDayCqDamIdsImplIDSJobProcessorProperties {
  import DateTimeCodecs._

  implicit val ComDayCqDamIdsImplIDSJobProcessorPropertiesCodecJson: CodecJson[ComDayCqDamIdsImplIDSJobProcessorProperties] = CodecJson.derive[ComDayCqDamIdsImplIDSJobProcessorProperties]
  implicit val ComDayCqDamIdsImplIDSJobProcessorPropertiesDecoder: EntityDecoder[ComDayCqDamIdsImplIDSJobProcessorProperties] = jsonOf[ComDayCqDamIdsImplIDSJobProcessorProperties]
  implicit val ComDayCqDamIdsImplIDSJobProcessorPropertiesEncoder: EntityEncoder[ComDayCqDamIdsImplIDSJobProcessorProperties] = jsonEncoderOf[ComDayCqDamIdsImplIDSJobProcessorProperties]
}
