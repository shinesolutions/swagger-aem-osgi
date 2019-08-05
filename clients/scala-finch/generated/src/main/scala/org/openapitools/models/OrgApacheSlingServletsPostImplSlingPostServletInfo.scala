package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingServletsPostImplSlingPostServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingServletsPostImplSlingPostServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingServletsPostImplSlingPostServletProperties]
                )

object OrgApacheSlingServletsPostImplSlingPostServletInfo {
    /**
     * Creates the codec for converting OrgApacheSlingServletsPostImplSlingPostServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingServletsPostImplSlingPostServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingServletsPostImplSlingPostServletInfo] = deriveEncoder
}
