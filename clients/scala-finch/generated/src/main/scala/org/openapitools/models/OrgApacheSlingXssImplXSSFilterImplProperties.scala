package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param policyPath 
 */
case class OrgApacheSlingXssImplXSSFilterImplProperties(policyPath: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingXssImplXSSFilterImplProperties {
    /**
     * Creates the codec for converting OrgApacheSlingXssImplXSSFilterImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingXssImplXSSFilterImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingXssImplXSSFilterImplProperties] = deriveEncoder
}
