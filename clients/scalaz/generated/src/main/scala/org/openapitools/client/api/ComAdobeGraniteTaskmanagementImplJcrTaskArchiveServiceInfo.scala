package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo._

case class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties])

object ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoCodecJson: CodecJson[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo] = CodecJson.derive[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo]
  implicit val ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoDecoder: EntityDecoder[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo] = jsonOf[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo]
  implicit val ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoEncoder: EntityEncoder[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo] = jsonEncoderOf[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo]
}