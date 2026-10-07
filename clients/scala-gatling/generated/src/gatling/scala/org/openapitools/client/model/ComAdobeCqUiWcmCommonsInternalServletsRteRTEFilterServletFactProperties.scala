
package org.openapitools.client.model


case class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties (
    _resourceTypes: Option[ConfigNodePropertyArray]
)
object ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties {
    def toStringBody(var_resourceTypes: Object) =
        s"""
        | {
        | "resourceTypes":$var_resourceTypes
        | }
        """.stripMargin
}
