package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingEngineImplLogRequestLoggerServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingEngineImplLogRequestLoggerServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingEngineImplLogRequestLoggerServiceProperties]
                )

object OrgApacheSlingEngineImplLogRequestLoggerServiceInfo {
    /**
     * Creates the codec for converting OrgApacheSlingEngineImplLogRequestLoggerServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEngineImplLogRequestLoggerServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEngineImplLogRequestLoggerServiceInfo] = deriveEncoder
}
