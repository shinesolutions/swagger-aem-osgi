
package org.openapitools.client.model


case class ComAdobeCqAddressImplLocationLocationListServletProperties (
    _cqAddressLocationDefaultMaxResults: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqAddressImplLocationLocationListServletProperties {
    def toStringBody(var_cqAddressLocationDefaultMaxResults: Object) =
        s"""
        | {
        | "cqAddressLocationDefaultMaxResults":$var_cqAddressLocationDefaultMaxResults
        | }
        """.stripMargin
}
