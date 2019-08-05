package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingEventImplJobsDefaultJobManagerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingEventImplJobsDefaultJobManagerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingEventImplJobsDefaultJobManagerProperties]
                )

object OrgApacheSlingEventImplJobsDefaultJobManagerInfo {
    /**
     * Creates the codec for converting OrgApacheSlingEventImplJobsDefaultJobManagerInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEventImplJobsDefaultJobManagerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEventImplJobsDefaultJobManagerInfo] = deriveEncoder
}
