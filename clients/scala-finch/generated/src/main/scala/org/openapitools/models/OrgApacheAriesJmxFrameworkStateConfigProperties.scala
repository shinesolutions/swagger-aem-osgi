package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param attributeChangeNotificationEnabled 
 */
case class OrgApacheAriesJmxFrameworkStateConfigProperties(attributeChangeNotificationEnabled: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheAriesJmxFrameworkStateConfigProperties {
    /**
     * Creates the codec for converting OrgApacheAriesJmxFrameworkStateConfigProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheAriesJmxFrameworkStateConfigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheAriesJmxFrameworkStateConfigProperties] = deriveEncoder
}
