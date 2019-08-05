package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo._

case class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoCodecJson: CodecJson[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo] = CodecJson.derive[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo]
  implicit val OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoDecoder: EntityDecoder[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo] = jsonOf[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo]
  implicit val OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoEncoder: EntityEncoder[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo] = jsonEncoderOf[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo]
}
