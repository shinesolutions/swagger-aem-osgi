package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialSrpImplSocialSolrConnectorInfo._

case class ComAdobeCqSocialSrpImplSocialSolrConnectorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialSrpImplSocialSolrConnectorProperties])

object ComAdobeCqSocialSrpImplSocialSolrConnectorInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialSrpImplSocialSolrConnectorInfoCodecJson: CodecJson[ComAdobeCqSocialSrpImplSocialSolrConnectorInfo] = CodecJson.derive[ComAdobeCqSocialSrpImplSocialSolrConnectorInfo]
  implicit val ComAdobeCqSocialSrpImplSocialSolrConnectorInfoDecoder: EntityDecoder[ComAdobeCqSocialSrpImplSocialSolrConnectorInfo] = jsonOf[ComAdobeCqSocialSrpImplSocialSolrConnectorInfo]
  implicit val ComAdobeCqSocialSrpImplSocialSolrConnectorInfoEncoder: EntityEncoder[ComAdobeCqSocialSrpImplSocialSolrConnectorInfo] = jsonEncoderOf[ComAdobeCqSocialSrpImplSocialSolrConnectorInfo]
}
