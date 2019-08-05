package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param servicePeriodranking 
 * @param pathPrefix 
 * @param createVersion 
 */
case class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                pathPrefix: Option[ConfigNodePropertyString],
                createVersion: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties] = deriveEncoder
}
