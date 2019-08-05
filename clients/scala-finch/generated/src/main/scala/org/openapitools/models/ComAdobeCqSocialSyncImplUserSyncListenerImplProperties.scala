package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param nodetypes 
 * @param ignorableprops 
 * @param ignorablenodes 
 * @param enabled 
 * @param distfolders 
 */
case class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties(nodetypes: Option[ConfigNodePropertyArray],
                ignorableprops: Option[ConfigNodePropertyArray],
                ignorablenodes: Option[ConfigNodePropertyArray],
                enabled: Option[ConfigNodePropertyBoolean],
                distfolders: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialSyncImplUserSyncListenerImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialSyncImplUserSyncListenerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSyncImplUserSyncListenerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSyncImplUserSyncListenerImplProperties] = deriveEncoder
}
