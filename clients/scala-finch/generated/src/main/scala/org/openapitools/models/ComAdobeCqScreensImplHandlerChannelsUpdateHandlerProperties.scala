package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param cqPeriodpagesupdatehandlerPeriodimageresourcetypes 
 * @param cqPeriodpagesupdatehandlerPeriodproductresourcetypes 
 * @param cqPeriodpagesupdatehandlerPeriodvideoresourcetypes 
 * @param cqPeriodpagesupdatehandlerPerioddynamicsequenceresourcetypes 
 * @param cqPeriodpagesupdatehandlerPeriodpreviewmodepaths 
 */
case class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties(cqPeriodpagesupdatehandlerPeriodimageresourcetypes: Option[ConfigNodePropertyArray],
                cqPeriodpagesupdatehandlerPeriodproductresourcetypes: Option[ConfigNodePropertyArray],
                cqPeriodpagesupdatehandlerPeriodvideoresourcetypes: Option[ConfigNodePropertyArray],
                cqPeriodpagesupdatehandlerPerioddynamicsequenceresourcetypes: Option[ConfigNodePropertyArray],
                cqPeriodpagesupdatehandlerPeriodpreviewmodepaths: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties] = deriveEncoder
}
