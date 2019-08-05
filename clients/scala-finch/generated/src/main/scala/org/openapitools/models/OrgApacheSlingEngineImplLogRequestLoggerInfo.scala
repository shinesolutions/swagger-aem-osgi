package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingEngineImplLogRequestLoggerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingEngineImplLogRequestLoggerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingEngineImplLogRequestLoggerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingEngineImplLogRequestLoggerInfo {
    /**
     * Creates the codec for converting OrgApacheSlingEngineImplLogRequestLoggerInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEngineImplLogRequestLoggerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEngineImplLogRequestLoggerInfo] = deriveEncoder
}
