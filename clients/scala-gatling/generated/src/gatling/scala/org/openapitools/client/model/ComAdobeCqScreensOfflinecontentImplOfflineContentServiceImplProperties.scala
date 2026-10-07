
package org.openapitools.client.model


case class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties (
    _disableSmartSync: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties {
    def toStringBody(var_disableSmartSync: Object) =
        s"""
        | {
        | "disableSmartSync":$var_disableSmartSync
        | }
        """.stripMargin
}
