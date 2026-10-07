
package org.openapitools.client.model


case class ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties (
    _formportalInterval: Option[ConfigNodePropertyString]
)
object ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties {
    def toStringBody(var_formportalInterval: Object) =
        s"""
        | {
        | "formportalInterval":$var_formportalInterval
        | }
        """.stripMargin
}
