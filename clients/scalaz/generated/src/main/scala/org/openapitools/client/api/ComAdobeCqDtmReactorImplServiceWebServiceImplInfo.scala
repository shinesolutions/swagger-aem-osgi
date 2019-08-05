package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDtmReactorImplServiceWebServiceImplInfo._

case class ComAdobeCqDtmReactorImplServiceWebServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDtmReactorImplServiceWebServiceImplProperties])

object ComAdobeCqDtmReactorImplServiceWebServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDtmReactorImplServiceWebServiceImplInfoCodecJson: CodecJson[ComAdobeCqDtmReactorImplServiceWebServiceImplInfo] = CodecJson.derive[ComAdobeCqDtmReactorImplServiceWebServiceImplInfo]
  implicit val ComAdobeCqDtmReactorImplServiceWebServiceImplInfoDecoder: EntityDecoder[ComAdobeCqDtmReactorImplServiceWebServiceImplInfo] = jsonOf[ComAdobeCqDtmReactorImplServiceWebServiceImplInfo]
  implicit val ComAdobeCqDtmReactorImplServiceWebServiceImplInfoEncoder: EntityEncoder[ComAdobeCqDtmReactorImplServiceWebServiceImplInfo] = jsonEncoderOf[ComAdobeCqDtmReactorImplServiceWebServiceImplInfo]
}
