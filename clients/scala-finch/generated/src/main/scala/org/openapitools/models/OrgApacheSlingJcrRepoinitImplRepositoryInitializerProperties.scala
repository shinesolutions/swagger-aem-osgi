package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param references 
 */
case class OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties(references: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties] = deriveEncoder
}
