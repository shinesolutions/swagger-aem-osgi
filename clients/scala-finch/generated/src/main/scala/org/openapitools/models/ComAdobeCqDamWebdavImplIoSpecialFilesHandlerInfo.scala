package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties]
                )

object ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo] = deriveEncoder
}
