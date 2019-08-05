package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param ignorePropertyNameRegex 
 * @param configCollectionPropertiesResourceNames 
 */
case class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties(ignorePropertyNameRegex: Option[ConfigNodePropertyArray],
                configCollectionPropertiesResourceNames: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties] = deriveEncoder
}
