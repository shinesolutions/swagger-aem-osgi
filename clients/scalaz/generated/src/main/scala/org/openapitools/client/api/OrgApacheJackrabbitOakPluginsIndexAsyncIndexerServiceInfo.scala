package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo._

case class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo {
  import DateTimeCodecs._

  implicit val OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoCodecJson: CodecJson[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo] = CodecJson.derive[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo]
  implicit val OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoDecoder: EntityDecoder[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo] = jsonOf[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo]
  implicit val OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoEncoder: EntityEncoder[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo] = jsonEncoderOf[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo]
}
