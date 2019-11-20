package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingSecurityImplContentDispositionFilterInfo._

case class OrgApacheSlingSecurityImplContentDispositionFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingSecurityImplContentDispositionFilterProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingSecurityImplContentDispositionFilterInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingSecurityImplContentDispositionFilterInfoCodecJson: CodecJson[OrgApacheSlingSecurityImplContentDispositionFilterInfo] = CodecJson.derive[OrgApacheSlingSecurityImplContentDispositionFilterInfo]
  implicit val OrgApacheSlingSecurityImplContentDispositionFilterInfoDecoder: EntityDecoder[OrgApacheSlingSecurityImplContentDispositionFilterInfo] = jsonOf[OrgApacheSlingSecurityImplContentDispositionFilterInfo]
  implicit val OrgApacheSlingSecurityImplContentDispositionFilterInfoEncoder: EntityEncoder[OrgApacheSlingSecurityImplContentDispositionFilterInfo] = jsonEncoderOf[OrgApacheSlingSecurityImplContentDispositionFilterInfo]
}