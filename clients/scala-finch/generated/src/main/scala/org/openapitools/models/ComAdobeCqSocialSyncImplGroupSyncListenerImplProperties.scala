package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param nodetypes 
 * @param ignorableprops 
 * @param ignorablenodes 
 * @param enabled 
 * @param distfolders 
 */
case class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties(nodetypes: Option[ConfigNodePropertyArray],
                ignorableprops: Option[ConfigNodePropertyArray],
                ignorablenodes: Option[ConfigNodePropertyString],
                enabled: Option[ConfigNodePropertyBoolean],
                distfolders: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties] = deriveEncoder
}
