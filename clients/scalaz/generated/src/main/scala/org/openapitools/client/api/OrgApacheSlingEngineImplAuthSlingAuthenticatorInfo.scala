package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo._

case class OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoCodecJson: CodecJson[OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo] = CodecJson.derive[OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo]
  implicit val OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoDecoder: EntityDecoder[OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo] = jsonOf[OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo]
  implicit val OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoEncoder: EntityEncoder[OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo] = jsonEncoderOf[OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo]
}
