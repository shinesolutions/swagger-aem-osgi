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
case class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties(mergePeriodroot: Option[ConfigNodePropertyString],
                mergePeriodreadOnly: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties {
    /**
     * Creates the codec for converting OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties] = deriveEncoder
}
