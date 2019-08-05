package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param flushPeriodagents 
 */
case class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties(flushPeriodagents: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties {
    /**
     * Creates the codec for converting ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties] = deriveEncoder
}
