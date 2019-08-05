package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingSecurityImplReferrerFilterInfo._

case class OrgApacheSlingSecurityImplReferrerFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingSecurityImplReferrerFilterProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingSecurityImplReferrerFilterInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingSecurityImplReferrerFilterInfoCodecJson: CodecJson[OrgApacheSlingSecurityImplReferrerFilterInfo] = CodecJson.derive[OrgApacheSlingSecurityImplReferrerFilterInfo]
  implicit val OrgApacheSlingSecurityImplReferrerFilterInfoDecoder: EntityDecoder[OrgApacheSlingSecurityImplReferrerFilterInfo] = jsonOf[OrgApacheSlingSecurityImplReferrerFilterInfo]
  implicit val OrgApacheSlingSecurityImplReferrerFilterInfoEncoder: EntityEncoder[OrgApacheSlingSecurityImplReferrerFilterInfo] = jsonEncoderOf[OrgApacheSlingSecurityImplReferrerFilterInfo]
}
