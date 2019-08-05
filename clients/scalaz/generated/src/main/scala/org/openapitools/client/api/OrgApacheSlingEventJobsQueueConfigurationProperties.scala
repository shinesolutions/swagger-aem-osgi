package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingEventJobsQueueConfigurationProperties._

case class OrgApacheSlingEventJobsQueueConfigurationProperties (
  queueName: Option[ConfigNodePropertyString],
queueTopics: Option[ConfigNodePropertyArray],
queueType: Option[ConfigNodePropertyDropDown],
queuePriority: Option[ConfigNodePropertyDropDown],
queueRetries: Option[ConfigNodePropertyInteger],
queueRetrydelay: Option[ConfigNodePropertyInteger],
queueMaxparallel: Option[ConfigNodePropertyFloat],
queueKeepJobs: Option[ConfigNodePropertyBoolean],
queuePreferRunOnCreationInstance: Option[ConfigNodePropertyBoolean],
queueThreadPoolSize: Option[ConfigNodePropertyInteger],
serviceRanking: Option[ConfigNodePropertyInteger])

object OrgApacheSlingEventJobsQueueConfigurationProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingEventJobsQueueConfigurationPropertiesCodecJson: CodecJson[OrgApacheSlingEventJobsQueueConfigurationProperties] = CodecJson.derive[OrgApacheSlingEventJobsQueueConfigurationProperties]
  implicit val OrgApacheSlingEventJobsQueueConfigurationPropertiesDecoder: EntityDecoder[OrgApacheSlingEventJobsQueueConfigurationProperties] = jsonOf[OrgApacheSlingEventJobsQueueConfigurationProperties]
  implicit val OrgApacheSlingEventJobsQueueConfigurationPropertiesEncoder: EntityEncoder[OrgApacheSlingEventJobsQueueConfigurationProperties] = jsonEncoderOf[OrgApacheSlingEventJobsQueueConfigurationProperties]
}
