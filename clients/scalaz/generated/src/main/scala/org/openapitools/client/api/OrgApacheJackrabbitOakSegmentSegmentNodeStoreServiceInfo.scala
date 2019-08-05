package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo._

case class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties],
additionalProperties: Option[String],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo {
  import DateTimeCodecs._

  implicit val OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfoCodecJson: CodecJson[OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo] = CodecJson.derive[OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo]
  implicit val OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfoDecoder: EntityDecoder[OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo] = jsonOf[OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo]
  implicit val OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfoEncoder: EntityEncoder[OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo] = jsonEncoderOf[OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo]
}
