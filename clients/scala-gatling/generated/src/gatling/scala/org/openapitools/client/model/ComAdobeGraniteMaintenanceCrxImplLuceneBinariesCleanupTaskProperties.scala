
package org.openapitools.client.model


case class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties (
    _jobTopics: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties {
    def toStringBody(var_jobTopics: Object) =
        s"""
        | {
        | "jobTopics":$var_jobTopics
        | }
        """.stripMargin
}
