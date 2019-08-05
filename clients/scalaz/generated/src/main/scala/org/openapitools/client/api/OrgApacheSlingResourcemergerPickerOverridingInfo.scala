package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingResourcemergerPickerOverridingInfo._

case class OrgApacheSlingResourcemergerPickerOverridingInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingResourcemergerPickerOverridingProperties],
additionalProperties: Option[String],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingResourcemergerPickerOverridingInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingResourcemergerPickerOverridingInfoCodecJson: CodecJson[OrgApacheSlingResourcemergerPickerOverridingInfo] = CodecJson.derive[OrgApacheSlingResourcemergerPickerOverridingInfo]
  implicit val OrgApacheSlingResourcemergerPickerOverridingInfoDecoder: EntityDecoder[OrgApacheSlingResourcemergerPickerOverridingInfo] = jsonOf[OrgApacheSlingResourcemergerPickerOverridingInfo]
  implicit val OrgApacheSlingResourcemergerPickerOverridingInfoEncoder: EntityEncoder[OrgApacheSlingResourcemergerPickerOverridingInfo] = jsonEncoderOf[OrgApacheSlingResourcemergerPickerOverridingInfo]
}
