package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo {
    /**
     * Creates the codec for converting OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo] = deriveEncoder
}
