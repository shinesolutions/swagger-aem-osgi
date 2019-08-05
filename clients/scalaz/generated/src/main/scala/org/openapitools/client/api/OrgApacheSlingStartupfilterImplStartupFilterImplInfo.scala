package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingStartupfilterImplStartupFilterImplInfo._

case class OrgApacheSlingStartupfilterImplStartupFilterImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingStartupfilterImplStartupFilterImplProperties])

object OrgApacheSlingStartupfilterImplStartupFilterImplInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingStartupfilterImplStartupFilterImplInfoCodecJson: CodecJson[OrgApacheSlingStartupfilterImplStartupFilterImplInfo] = CodecJson.derive[OrgApacheSlingStartupfilterImplStartupFilterImplInfo]
  implicit val OrgApacheSlingStartupfilterImplStartupFilterImplInfoDecoder: EntityDecoder[OrgApacheSlingStartupfilterImplStartupFilterImplInfo] = jsonOf[OrgApacheSlingStartupfilterImplStartupFilterImplInfo]
  implicit val OrgApacheSlingStartupfilterImplStartupFilterImplInfoEncoder: EntityEncoder[OrgApacheSlingStartupfilterImplStartupFilterImplInfo] = jsonEncoderOf[OrgApacheSlingStartupfilterImplStartupFilterImplInfo]
}
