package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties._

case class ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties (
  priority: Option[ConfigNodePropertyInteger])

object ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesCodecJson: CodecJson[ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties] = CodecJson.derive[ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties]
  implicit val ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesDecoder: EntityDecoder[ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties] = jsonOf[ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties]
  implicit val ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesEncoder: EntityEncoder[ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties] = jsonEncoderOf[ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties]
}