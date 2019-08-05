package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo] = deriveEncoder
}
