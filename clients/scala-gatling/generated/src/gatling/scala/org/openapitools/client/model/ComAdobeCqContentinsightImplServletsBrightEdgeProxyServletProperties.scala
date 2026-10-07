
package org.openapitools.client.model


case class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties (
    _brightedgeUrl: Option[ConfigNodePropertyString]
)
object ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties {
    def toStringBody(var_brightedgeUrl: Object) =
        s"""
        | {
        | "brightedgeUrl":$var_brightedgeUrl
        | }
        """.stripMargin
}
