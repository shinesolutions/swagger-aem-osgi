
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties (
    _corsEnabling: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties {
    def toStringBody(var_corsEnabling: Object) =
        s"""
        | {
        | "corsEnabling":$var_corsEnabling
        | }
        """.stripMargin
}
