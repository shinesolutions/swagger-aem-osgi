package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo._

case class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfoCodecJson: CodecJson[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo] = CodecJson.derive[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo]
  implicit val OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfoDecoder: EntityDecoder[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo] = jsonOf[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo]
  implicit val OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfoEncoder: EntityEncoder[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo] = jsonEncoderOf[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo]
}
