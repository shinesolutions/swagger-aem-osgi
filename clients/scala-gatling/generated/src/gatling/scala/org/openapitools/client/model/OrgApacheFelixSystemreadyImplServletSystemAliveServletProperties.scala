
package org.openapitools.client.model


case class OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties (
    _osgiHttpWhiteboardServletPattern: Option[ConfigNodePropertyString],
    _osgiHttpWhiteboardContextSelect: Option[ConfigNodePropertyString]
)
object OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties {
    def toStringBody(var_osgiHttpWhiteboardServletPattern: Object, var_osgiHttpWhiteboardContextSelect: Object) =
        s"""
        | {
        | "osgiHttpWhiteboardServletPattern":$var_osgiHttpWhiteboardServletPattern,"osgiHttpWhiteboardContextSelect":$var_osgiHttpWhiteboardContextSelect
        | }
        """.stripMargin
}
