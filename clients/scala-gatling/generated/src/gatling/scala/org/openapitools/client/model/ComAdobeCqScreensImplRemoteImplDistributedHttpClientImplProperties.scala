
package org.openapitools.client.model


case class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties (
    _comAdobeAemScreensImplRemoteRequestTimeout: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties {
    def toStringBody(var_comAdobeAemScreensImplRemoteRequestTimeout: Object) =
        s"""
        | {
        | "comAdobeAemScreensImplRemoteRequestTimeout":$var_comAdobeAemScreensImplRemoteRequestTimeout
        | }
        """.stripMargin
}
