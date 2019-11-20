package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo._

case class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties],
additionalProperties: Option[String],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo {
  import DateTimeCodecs._

  implicit val OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoCodecJson: CodecJson[OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo] = CodecJson.derive[OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo]
  implicit val OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoDecoder: EntityDecoder[OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo] = jsonOf[OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo]
  implicit val OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoEncoder: EntityEncoder[OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo] = jsonEncoderOf[OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo]
}