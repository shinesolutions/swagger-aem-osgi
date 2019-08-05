package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo._

case class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties])

object OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoCodecJson: CodecJson[OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo] = CodecJson.derive[OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo]
  implicit val OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoDecoder: EntityDecoder[OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo] = jsonOf[OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo]
  implicit val OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoEncoder: EntityEncoder[OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo] = jsonEncoderOf[OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo]
}
