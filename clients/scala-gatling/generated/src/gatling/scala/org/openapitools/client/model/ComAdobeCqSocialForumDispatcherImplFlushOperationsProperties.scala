
package org.openapitools.client.model


case class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties (
    _extensionOrder: Option[ConfigNodePropertyInteger],
    _flushForumontopic: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties {
    def toStringBody(var_extensionOrder: Object, var_flushForumontopic: Object) =
        s"""
        | {
        | "extensionOrder":$var_extensionOrder,"flushForumontopic":$var_flushForumontopic
        | }
        """.stripMargin
}
