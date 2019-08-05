package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqProjectsPurgeSchedulerProperties._

case class ComAdobeCqProjectsPurgeSchedulerProperties (
  scheduledpurgeName: Option[ConfigNodePropertyString],
scheduledpurgePurgeActive: Option[ConfigNodePropertyBoolean],
scheduledpurgeTemplates: Option[ConfigNodePropertyArray],
scheduledpurgePurgeGroups: Option[ConfigNodePropertyBoolean],
scheduledpurgePurgeAssets: Option[ConfigNodePropertyBoolean],
scheduledpurgeTerminateRunningWorkflows: Option[ConfigNodePropertyBoolean],
scheduledpurgeDaysold: Option[ConfigNodePropertyInteger],
scheduledpurgeSaveThreshold: Option[ConfigNodePropertyInteger])

object ComAdobeCqProjectsPurgeSchedulerProperties {
  import DateTimeCodecs._

  implicit val ComAdobeCqProjectsPurgeSchedulerPropertiesCodecJson: CodecJson[ComAdobeCqProjectsPurgeSchedulerProperties] = CodecJson.derive[ComAdobeCqProjectsPurgeSchedulerProperties]
  implicit val ComAdobeCqProjectsPurgeSchedulerPropertiesDecoder: EntityDecoder[ComAdobeCqProjectsPurgeSchedulerProperties] = jsonOf[ComAdobeCqProjectsPurgeSchedulerProperties]
  implicit val ComAdobeCqProjectsPurgeSchedulerPropertiesEncoder: EntityEncoder[ComAdobeCqProjectsPurgeSchedulerProperties] = jsonEncoderOf[ComAdobeCqProjectsPurgeSchedulerProperties]
}
