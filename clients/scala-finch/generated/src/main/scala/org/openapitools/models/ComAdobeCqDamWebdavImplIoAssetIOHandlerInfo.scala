package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties]
                )

object ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo] = deriveEncoder
}
