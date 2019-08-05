package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDtmImplServiceDTMWebServiceImplInfo._

case class ComAdobeCqDtmImplServiceDTMWebServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDtmImplServiceDTMWebServiceImplProperties])

object ComAdobeCqDtmImplServiceDTMWebServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDtmImplServiceDTMWebServiceImplInfoCodecJson: CodecJson[ComAdobeCqDtmImplServiceDTMWebServiceImplInfo] = CodecJson.derive[ComAdobeCqDtmImplServiceDTMWebServiceImplInfo]
  implicit val ComAdobeCqDtmImplServiceDTMWebServiceImplInfoDecoder: EntityDecoder[ComAdobeCqDtmImplServiceDTMWebServiceImplInfo] = jsonOf[ComAdobeCqDtmImplServiceDTMWebServiceImplInfo]
  implicit val ComAdobeCqDtmImplServiceDTMWebServiceImplInfoEncoder: EntityEncoder[ComAdobeCqDtmImplServiceDTMWebServiceImplInfo] = jsonEncoderOf[ComAdobeCqDtmImplServiceDTMWebServiceImplInfo]
}
