package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param enabled 
 * @param intervalSeconds 
 * @param commitsPerIntervalThreshold 
 * @param maxLocationLength 
 * @param maxDetailsShown 
 * @param minDetailsPercentage 
 * @param threadMatchers 
 * @param maxGreedyDepth 
 * @param greedyStackMatchers 
 * @param stackFilters 
 * @param stackMatchers 
 * @param stackCategorizers 
 * @param stackShorteners 
 */
case class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties(enabled: Option[ConfigNodePropertyBoolean],
                intervalSeconds: Option[ConfigNodePropertyInteger],
                commitsPerIntervalThreshold: Option[ConfigNodePropertyInteger],
                maxLocationLength: Option[ConfigNodePropertyInteger],
                maxDetailsShown: Option[ConfigNodePropertyInteger],
                minDetailsPercentage: Option[ConfigNodePropertyInteger],
                threadMatchers: Option[ConfigNodePropertyArray],
                maxGreedyDepth: Option[ConfigNodePropertyInteger],
                greedyStackMatchers: Option[ConfigNodePropertyString],
                stackFilters: Option[ConfigNodePropertyArray],
                stackMatchers: Option[ConfigNodePropertyArray],
                stackCategorizers: Option[ConfigNodePropertyArray],
                stackShorteners: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteRepositoryImplCommitStatsConfigProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryImplCommitStatsConfigProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryImplCommitStatsConfigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryImplCommitStatsConfigProperties] = deriveEncoder
}
