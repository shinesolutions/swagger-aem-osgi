package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param inboxPeriodimplPeriodtypeproviderPeriodregistrypaths 
 * @param inboxPeriodimplPeriodtypeproviderPeriodlegacypaths 
 * @param inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodfailureitem 
 * @param inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodworkitem 
 * @param inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodtask 
 */
case class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(inboxPeriodimplPeriodtypeproviderPeriodregistrypaths: Option[ConfigNodePropertyArray],
                inboxPeriodimplPeriodtypeproviderPeriodlegacypaths: Option[ConfigNodePropertyArray],
                inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodfailureitem: Option[ConfigNodePropertyString],
                inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodworkitem: Option[ConfigNodePropertyString],
                inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodtask: Option[ConfigNodePropertyString]
                )

object ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties {
    /**
     * Creates the codec for converting ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties] = deriveEncoder
}
