package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingStartupfilterImplStartupFilterImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingStartupfilterImplStartupFilterImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingStartupfilterImplStartupFilterImplProperties]
                )

object OrgApacheSlingStartupfilterImplStartupFilterImplInfo {
    /**
     * Creates the codec for converting OrgApacheSlingStartupfilterImplStartupFilterImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingStartupfilterImplStartupFilterImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingStartupfilterImplStartupFilterImplInfo] = deriveEncoder
}
