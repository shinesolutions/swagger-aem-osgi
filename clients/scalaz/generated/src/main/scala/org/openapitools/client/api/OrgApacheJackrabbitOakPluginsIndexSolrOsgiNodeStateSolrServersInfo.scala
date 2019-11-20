package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo._

case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties])

object OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo {
  import DateTimeCodecs._

  implicit val OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoCodecJson: CodecJson[OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo] = CodecJson.derive[OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo]
  implicit val OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoDecoder: EntityDecoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo] = jsonOf[OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo]
  implicit val OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoEncoder: EntityEncoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo] = jsonEncoderOf[OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo]
}