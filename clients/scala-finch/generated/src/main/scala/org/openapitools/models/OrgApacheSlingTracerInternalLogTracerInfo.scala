package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingTracerInternalLogTracerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingTracerInternalLogTracerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingTracerInternalLogTracerProperties]
                )

object OrgApacheSlingTracerInternalLogTracerInfo {
    /**
     * Creates the codec for converting OrgApacheSlingTracerInternalLogTracerInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingTracerInternalLogTracerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingTracerInternalLogTracerInfo] = deriveEncoder
}
