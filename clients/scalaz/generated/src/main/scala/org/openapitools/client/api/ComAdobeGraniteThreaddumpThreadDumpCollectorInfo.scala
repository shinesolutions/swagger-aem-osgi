package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteThreaddumpThreadDumpCollectorInfo._

case class ComAdobeGraniteThreaddumpThreadDumpCollectorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteThreaddumpThreadDumpCollectorProperties])

object ComAdobeGraniteThreaddumpThreadDumpCollectorInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteThreaddumpThreadDumpCollectorInfoCodecJson: CodecJson[ComAdobeGraniteThreaddumpThreadDumpCollectorInfo] = CodecJson.derive[ComAdobeGraniteThreaddumpThreadDumpCollectorInfo]
  implicit val ComAdobeGraniteThreaddumpThreadDumpCollectorInfoDecoder: EntityDecoder[ComAdobeGraniteThreaddumpThreadDumpCollectorInfo] = jsonOf[ComAdobeGraniteThreaddumpThreadDumpCollectorInfo]
  implicit val ComAdobeGraniteThreaddumpThreadDumpCollectorInfoEncoder: EntityEncoder[ComAdobeGraniteThreaddumpThreadDumpCollectorInfo] = jsonEncoderOf[ComAdobeGraniteThreaddumpThreadDumpCollectorInfo]
}
