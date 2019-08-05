package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param users 
 * @param groups 
 */
case class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties(users: Option[ConfigNodePropertyArray],
                groups: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties {
    /**
     * Creates the codec for converting OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties] = deriveEncoder
}
