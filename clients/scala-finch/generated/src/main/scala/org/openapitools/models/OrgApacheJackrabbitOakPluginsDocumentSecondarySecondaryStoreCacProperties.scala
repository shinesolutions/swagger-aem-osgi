package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param includedPaths 
 * @param enableAsyncObserver 
 * @param observerQueueSize 
 */
case class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties(includedPaths: Option[ConfigNodePropertyArray],
                enableAsyncObserver: Option[ConfigNodePropertyBoolean],
                observerQueueSize: Option[ConfigNodePropertyInteger]
                )

object OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties] = deriveEncoder
}
