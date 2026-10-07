
package org.openapitools.client.model


case class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties (
    _includePaths: Option[ConfigNodePropertyArray],
    _exporterUser: Option[ConfigNodePropertyString]
)
object ComAdobeCqScheduledExporterImplScheduledExporterImplProperties {
    def toStringBody(var_includePaths: Object, var_exporterUser: Object) =
        s"""
        | {
        | "includePaths":$var_includePaths,"exporterUser":$var_exporterUser
        | }
        """.stripMargin
}
