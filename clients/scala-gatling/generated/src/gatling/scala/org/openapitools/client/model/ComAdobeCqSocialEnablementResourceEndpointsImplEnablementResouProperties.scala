
package org.openapitools.client.model


case class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties (
    _fieldWhitelist: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties {
    def toStringBody(var_fieldWhitelist: Object) =
        s"""
        | {
        | "fieldWhitelist":$var_fieldWhitelist
        | }
        """.stripMargin
}
