package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo._

case class OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoCodecJson: CodecJson[OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo] = CodecJson.derive[OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo]
  implicit val OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoDecoder: EntityDecoder[OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo] = jsonOf[OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo]
  implicit val OrgApacheSlingScriptingJspJspScriptEngineFactoryInfoEncoder: EntityEncoder[OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo] = jsonEncoderOf[OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo]
}
