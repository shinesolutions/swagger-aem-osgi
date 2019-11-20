package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamCfmImplConfFeatureConfigImplProperties._

case class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties (
  damCfmResourceTypes: Option[ConfigNodePropertyArray],
damCfmReferenceProperties: Option[ConfigNodePropertyArray])

object ComAdobeCqDamCfmImplConfFeatureConfigImplProperties {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamCfmImplConfFeatureConfigImplPropertiesCodecJson: CodecJson[ComAdobeCqDamCfmImplConfFeatureConfigImplProperties] = CodecJson.derive[ComAdobeCqDamCfmImplConfFeatureConfigImplProperties]
  implicit val ComAdobeCqDamCfmImplConfFeatureConfigImplPropertiesDecoder: EntityDecoder[ComAdobeCqDamCfmImplConfFeatureConfigImplProperties] = jsonOf[ComAdobeCqDamCfmImplConfFeatureConfigImplProperties]
  implicit val ComAdobeCqDamCfmImplConfFeatureConfigImplPropertiesEncoder: EntityEncoder[ComAdobeCqDamCfmImplConfFeatureConfigImplProperties] = jsonEncoderOf[ComAdobeCqDamCfmImplConfFeatureConfigImplProperties]
}