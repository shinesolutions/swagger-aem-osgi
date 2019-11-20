package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo._

case class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoCodecJson: CodecJson[ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo] = CodecJson.derive[ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo]
  implicit val ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoDecoder: EntityDecoder[ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo] = jsonOf[ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo]
  implicit val ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoEncoder: EntityEncoder[ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo] = jsonEncoderOf[ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo]
}