package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqCommonsServletsRootMappingServletInfo._

case class ComDayCqCommonsServletsRootMappingServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqCommonsServletsRootMappingServletProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqCommonsServletsRootMappingServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqCommonsServletsRootMappingServletInfoCodecJson: CodecJson[ComDayCqCommonsServletsRootMappingServletInfo] = CodecJson.derive[ComDayCqCommonsServletsRootMappingServletInfo]
  implicit val ComDayCqCommonsServletsRootMappingServletInfoDecoder: EntityDecoder[ComDayCqCommonsServletsRootMappingServletInfo] = jsonOf[ComDayCqCommonsServletsRootMappingServletInfo]
  implicit val ComDayCqCommonsServletsRootMappingServletInfoEncoder: EntityEncoder[ComDayCqCommonsServletsRootMappingServletInfo] = jsonEncoderOf[ComDayCqCommonsServletsRootMappingServletInfo]
}
