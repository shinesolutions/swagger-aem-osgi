package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param comPeriodadobePeriodaemPeriodscreensPeriodimplPeriodremotePeriodrequestUnderscoretimeout 
 */
case class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties(comPeriodadobePeriodaemPeriodscreensPeriodimplPeriodremotePeriodrequestUnderscoretimeout: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties] = deriveEncoder
}
