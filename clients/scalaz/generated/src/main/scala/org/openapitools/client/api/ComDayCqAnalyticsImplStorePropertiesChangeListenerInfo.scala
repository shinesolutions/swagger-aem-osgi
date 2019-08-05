package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo._

case class ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties])

object ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoCodecJson: CodecJson[ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo] = CodecJson.derive[ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo]
  implicit val ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoDecoder: EntityDecoder[ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo] = jsonOf[ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo]
  implicit val ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoEncoder: EntityEncoder[ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo] = jsonEncoderOf[ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo]
}
