package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties._

case class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties (
  activeRunModes: Option[ConfigNodePropertyArray])

object ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesCodecJson: CodecJson[ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties] = CodecJson.derive[ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties]
  implicit val ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesDecoder: EntityDecoder[ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties] = jsonOf[ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties]
  implicit val ComAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesEncoder: EntityEncoder[ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties] = jsonEncoderOf[ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties]
}