
package org.openapitools.client.model


case class MessagingUserComponentFactoryProperties (
    _priority: Option[ConfigNodePropertyInteger]
)
object MessagingUserComponentFactoryProperties {
    def toStringBody(var_priority: Object) =
        s"""
        | {
        | "priority":$var_priority
        | }
        """.stripMargin
}
