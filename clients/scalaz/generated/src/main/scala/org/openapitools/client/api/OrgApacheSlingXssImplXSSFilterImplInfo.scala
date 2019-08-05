package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingXssImplXSSFilterImplInfo._

case class OrgApacheSlingXssImplXSSFilterImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingXssImplXSSFilterImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingXssImplXSSFilterImplInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingXssImplXSSFilterImplInfoCodecJson: CodecJson[OrgApacheSlingXssImplXSSFilterImplInfo] = CodecJson.derive[OrgApacheSlingXssImplXSSFilterImplInfo]
  implicit val OrgApacheSlingXssImplXSSFilterImplInfoDecoder: EntityDecoder[OrgApacheSlingXssImplXSSFilterImplInfo] = jsonOf[OrgApacheSlingXssImplXSSFilterImplInfo]
  implicit val OrgApacheSlingXssImplXSSFilterImplInfoEncoder: EntityEncoder[OrgApacheSlingXssImplXSSFilterImplInfo] = jsonEncoderOf[OrgApacheSlingXssImplXSSFilterImplInfo]
}
