
package org.openapitools.client.model


case class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties (
    _graniteMaintenanceMandatory: Option[ConfigNodePropertyBoolean],
    _jobTopics: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties {
    def toStringBody(var_graniteMaintenanceMandatory: Object, var_jobTopics: Object) =
        s"""
        | {
        | "graniteMaintenanceMandatory":$var_graniteMaintenanceMandatory,"jobTopics":$var_jobTopics
        | }
        """.stripMargin
}
