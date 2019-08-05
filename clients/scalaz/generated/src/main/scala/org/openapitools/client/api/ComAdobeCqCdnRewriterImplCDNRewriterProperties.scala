package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqCdnRewriterImplCDNRewriterProperties._

case class ComAdobeCqCdnRewriterImplCDNRewriterProperties (
  serviceRanking: Option[ConfigNodePropertyInteger],
cdnrewriterAttributes: Option[ConfigNodePropertyArray],
cdnRewriterDistributionDomain: Option[ConfigNodePropertyString])

object ComAdobeCqCdnRewriterImplCDNRewriterProperties {
  import DateTimeCodecs._

  implicit val ComAdobeCqCdnRewriterImplCDNRewriterPropertiesCodecJson: CodecJson[ComAdobeCqCdnRewriterImplCDNRewriterProperties] = CodecJson.derive[ComAdobeCqCdnRewriterImplCDNRewriterProperties]
  implicit val ComAdobeCqCdnRewriterImplCDNRewriterPropertiesDecoder: EntityDecoder[ComAdobeCqCdnRewriterImplCDNRewriterProperties] = jsonOf[ComAdobeCqCdnRewriterImplCDNRewriterProperties]
  implicit val ComAdobeCqCdnRewriterImplCDNRewriterPropertiesEncoder: EntityEncoder[ComAdobeCqCdnRewriterImplCDNRewriterProperties] = jsonEncoderOf[ComAdobeCqCdnRewriterImplCDNRewriterProperties]
}
