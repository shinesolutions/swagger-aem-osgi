package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param handlerPeriodschemes 
 * @param slingPeriodjcrinstallPeriodfolderPeriodnamePeriodregexp 
 * @param slingPeriodjcrinstallPeriodfolderPeriodmaxPerioddepth 
 * @param slingPeriodjcrinstallPeriodsearchPeriodpath 
 * @param slingPeriodjcrinstallPeriodnewPeriodconfigPeriodpath 
 * @param slingPeriodjcrinstallPeriodsignalPeriodpath 
 * @param slingPeriodjcrinstallPeriodenablePeriodwriteback 
 */
case class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties(handlerPeriodschemes: Option[ConfigNodePropertyArray],
                slingPeriodjcrinstallPeriodfolderPeriodnamePeriodregexp: Option[ConfigNodePropertyString],
                slingPeriodjcrinstallPeriodfolderPeriodmaxPerioddepth: Option[ConfigNodePropertyInteger],
                slingPeriodjcrinstallPeriodsearchPeriodpath: Option[ConfigNodePropertyArray],
                slingPeriodjcrinstallPeriodnewPeriodconfigPeriodpath: Option[ConfigNodePropertyString],
                slingPeriodjcrinstallPeriodsignalPeriodpath: Option[ConfigNodePropertyString],
                slingPeriodjcrinstallPeriodenablePeriodwriteback: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties {
    /**
     * Creates the codec for converting OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties] = deriveEncoder
}
