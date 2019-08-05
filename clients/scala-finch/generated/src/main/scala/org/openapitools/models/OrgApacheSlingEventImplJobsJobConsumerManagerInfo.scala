package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingEventImplJobsJobConsumerManagerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingEventImplJobsJobConsumerManagerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingEventImplJobsJobConsumerManagerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingEventImplJobsJobConsumerManagerInfo {
    /**
     * Creates the codec for converting OrgApacheSlingEventImplJobsJobConsumerManagerInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEventImplJobsJobConsumerManagerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEventImplJobsJobConsumerManagerInfo] = deriveEncoder
}
