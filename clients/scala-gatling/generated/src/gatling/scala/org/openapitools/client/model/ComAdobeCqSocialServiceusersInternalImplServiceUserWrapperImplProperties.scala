
package org.openapitools.client.model


case class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties (
    _enableFallback: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties {
    def toStringBody(var_enableFallback: Object) =
        s"""
        | {
        | "enableFallback":$var_enableFallback
        | }
        """.stripMargin
}
