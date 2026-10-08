
package org.openapitools.client.model


case class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties (
    _cqPagesupdatehandlerImageresourcetypes: Option[ConfigNodePropertyArray],
    _cqPagesupdatehandlerProductresourcetypes: Option[ConfigNodePropertyArray],
    _cqPagesupdatehandlerVideoresourcetypes: Option[ConfigNodePropertyArray],
    _cqPagesupdatehandlerDynamicsequenceresourcetypes: Option[ConfigNodePropertyArray],
    _cqPagesupdatehandlerPreviewmodepaths: Option[ConfigNodePropertyArray]
)
object ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {
    def toStringBody(var_cqPagesupdatehandlerImageresourcetypes: Object, var_cqPagesupdatehandlerProductresourcetypes: Object, var_cqPagesupdatehandlerVideoresourcetypes: Object, var_cqPagesupdatehandlerDynamicsequenceresourcetypes: Object, var_cqPagesupdatehandlerPreviewmodepaths: Object) =
        s"""
        | {
        | "cqPagesupdatehandlerImageresourcetypes":$var_cqPagesupdatehandlerImageresourcetypes,"cqPagesupdatehandlerProductresourcetypes":$var_cqPagesupdatehandlerProductresourcetypes,"cqPagesupdatehandlerVideoresourcetypes":$var_cqPagesupdatehandlerVideoresourcetypes,"cqPagesupdatehandlerDynamicsequenceresourcetypes":$var_cqPagesupdatehandlerDynamicsequenceresourcetypes,"cqPagesupdatehandlerPreviewmodepaths":$var_cqPagesupdatehandlerPreviewmodepaths
        | }
        """.stripMargin
}
