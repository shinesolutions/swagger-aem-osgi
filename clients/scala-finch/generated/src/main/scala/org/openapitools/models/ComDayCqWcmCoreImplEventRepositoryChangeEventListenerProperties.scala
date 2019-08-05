package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param paths 
 * @param excludedPaths 
 */
case class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties(paths: Option[ConfigNodePropertyArray],
                excludedPaths: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties] = deriveEncoder
}
