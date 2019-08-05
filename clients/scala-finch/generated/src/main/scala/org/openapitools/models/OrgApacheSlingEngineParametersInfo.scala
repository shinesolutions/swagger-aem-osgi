package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingEngineParametersProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingEngineParametersInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingEngineParametersProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingEngineParametersInfo {
    /**
     * Creates the codec for converting OrgApacheSlingEngineParametersInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEngineParametersInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEngineParametersInfo] = deriveEncoder
}
