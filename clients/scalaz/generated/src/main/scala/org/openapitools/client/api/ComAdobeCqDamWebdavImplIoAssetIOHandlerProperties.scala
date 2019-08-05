package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties._

case class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties (
  serviceRanking: Option[ConfigNodePropertyInteger],
pathPrefix: Option[ConfigNodePropertyString],
createVersion: Option[ConfigNodePropertyBoolean])

object ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesCodecJson: CodecJson[ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties] = CodecJson.derive[ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties]
  implicit val ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesDecoder: EntityDecoder[ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties] = jsonOf[ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties]
  implicit val ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesEncoder: EntityEncoder[ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties] = jsonEncoderOf[ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties]
}
