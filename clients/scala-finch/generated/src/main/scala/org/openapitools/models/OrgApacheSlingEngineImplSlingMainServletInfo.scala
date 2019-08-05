package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingEngineImplSlingMainServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingEngineImplSlingMainServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingEngineImplSlingMainServletProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingEngineImplSlingMainServletInfo {
    /**
     * Creates the codec for converting OrgApacheSlingEngineImplSlingMainServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEngineImplSlingMainServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEngineImplSlingMainServletInfo] = deriveEncoder
}
