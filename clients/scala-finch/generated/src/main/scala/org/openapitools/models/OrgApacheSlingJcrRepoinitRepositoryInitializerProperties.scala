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
 * @param scripts 
 */
case class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties(references: Option[ConfigNodePropertyArray],
                scripts: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingJcrRepoinitRepositoryInitializerProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJcrRepoinitRepositoryInitializerProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrRepoinitRepositoryInitializerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrRepoinitRepositoryInitializerProperties] = deriveEncoder
}
