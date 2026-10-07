
package org.openapitools.client.model


case class OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties (
    _osgiHttpWhiteboardServletPattern: Option[ConfigNodePropertyString],
    _osgiHttpWhiteboardContextSelect: Option[ConfigNodePropertyString]
)
object OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties {
    def toStringBody(var_osgiHttpWhiteboardServletPattern: Object, var_osgiHttpWhiteboardContextSelect: Object) =
        s"""
        | {
        | "osgiHttpWhiteboardServletPattern":$var_osgiHttpWhiteboardServletPattern,"osgiHttpWhiteboardContextSelect":$var_osgiHttpWhiteboardContextSelect
        | }
        """.stripMargin
}
