
package org.openapitools.client.model


case class ComAdobeGraniteCsrfImplCSRFServletProperties (
    _csrfTokenExpiresIn: Option[ConfigNodePropertyInteger],
    _slingAuthRequirements: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteCsrfImplCSRFServletProperties {
    def toStringBody(var_csrfTokenExpiresIn: Object, var_slingAuthRequirements: Object) =
        s"""
        | {
        | "csrfTokenExpiresIn":$var_csrfTokenExpiresIn,"slingAuthRequirements":$var_slingAuthRequirements
        | }
        """.stripMargin
}
