package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param mergePeriodroot 
 * @param mergePeriodreadOnly 
 */
case class OrgApacheSlingResourcemergerPickerOverridingProperties(mergePeriodroot: Option[ConfigNodePropertyString],
                mergePeriodreadOnly: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingResourcemergerPickerOverridingProperties {
    /**
     * Creates the codec for converting OrgApacheSlingResourcemergerPickerOverridingProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingResourcemergerPickerOverridingProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingResourcemergerPickerOverridingProperties] = deriveEncoder
}
