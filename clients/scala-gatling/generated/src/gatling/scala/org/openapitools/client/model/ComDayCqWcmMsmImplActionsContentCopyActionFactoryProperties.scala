
package org.openapitools.client.model


case class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties (
    _cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray],
    _cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray],
    _cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray],
    _contentcopyactionOrderStyle: Option[ConfigNodePropertyDropDown]
)
object ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties {
    def toStringBody(var_cqWcmMsmActionExcludednodetypes: Object, var_cqWcmMsmActionExcludedparagraphitems: Object, var_cqWcmMsmActionExcludedprops: Object, var_contentcopyactionOrderStyle: Object) =
        s"""
        | {
        | "cqWcmMsmActionExcludednodetypes":$var_cqWcmMsmActionExcludednodetypes,"cqWcmMsmActionExcludedparagraphitems":$var_cqWcmMsmActionExcludedparagraphitems,"cqWcmMsmActionExcludedprops":$var_cqWcmMsmActionExcludedprops,"contentcopyactionOrderStyle":$var_contentcopyactionOrderStyle
        | }
        """.stripMargin
}
