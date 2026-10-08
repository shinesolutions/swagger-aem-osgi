
package org.openapitools.client.model


case class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties (
    _serviceMaxLinksPerHost: Option[ConfigNodePropertyInteger],
    _serviceSaveExternalLinkReferences: Option[ConfigNodePropertyBoolean]
)
object ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties {
    def toStringBody(var_serviceMaxLinksPerHost: Object, var_serviceSaveExternalLinkReferences: Object) =
        s"""
        | {
        | "serviceMaxLinksPerHost":$var_serviceMaxLinksPerHost,"serviceSaveExternalLinkReferences":$var_serviceSaveExternalLinkReferences
        | }
        """.stripMargin
}
