package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteWorkflowPurgeSchedulerProperties._

case class ComAdobeGraniteWorkflowPurgeSchedulerProperties (
  scheduledpurgeName: Option[ConfigNodePropertyString],
scheduledpurgeWorkflowStatus: Option[ConfigNodePropertyDropDown],
scheduledpurgeModelIds: Option[ConfigNodePropertyArray],
scheduledpurgeDaysold: Option[ConfigNodePropertyInteger])

object ComAdobeGraniteWorkflowPurgeSchedulerProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteWorkflowPurgeSchedulerPropertiesCodecJson: CodecJson[ComAdobeGraniteWorkflowPurgeSchedulerProperties] = CodecJson.derive[ComAdobeGraniteWorkflowPurgeSchedulerProperties]
  implicit val ComAdobeGraniteWorkflowPurgeSchedulerPropertiesDecoder: EntityDecoder[ComAdobeGraniteWorkflowPurgeSchedulerProperties] = jsonOf[ComAdobeGraniteWorkflowPurgeSchedulerProperties]
  implicit val ComAdobeGraniteWorkflowPurgeSchedulerPropertiesEncoder: EntityEncoder[ComAdobeGraniteWorkflowPurgeSchedulerProperties] = jsonEncoderOf[ComAdobeGraniteWorkflowPurgeSchedulerProperties]
}
