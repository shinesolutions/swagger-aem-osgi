
package org.openapitools.client.model


case class OrgApacheSlingStartupfilterImplStartupFilterImplProperties (
    _activeByDefault: Option[ConfigNodePropertyBoolean],
    _defaultMessage: Option[ConfigNodePropertyString]
)
object OrgApacheSlingStartupfilterImplStartupFilterImplProperties {
    def toStringBody(var_activeByDefault: Object, var_defaultMessage: Object) =
        s"""
        | {
        | "activeByDefault":$var_activeByDefault,"defaultMessage":$var_defaultMessage
        | }
        """.stripMargin
}
