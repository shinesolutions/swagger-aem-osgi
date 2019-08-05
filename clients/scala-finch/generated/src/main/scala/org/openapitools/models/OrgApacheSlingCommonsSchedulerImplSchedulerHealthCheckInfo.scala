package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties]
                )

object OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo] = deriveEncoder
}
