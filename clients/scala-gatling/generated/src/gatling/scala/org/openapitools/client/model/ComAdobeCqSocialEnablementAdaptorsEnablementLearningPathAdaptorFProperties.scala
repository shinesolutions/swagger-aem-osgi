
package org.openapitools.client.model


case class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties (
    _isMemberCheck: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties {
    def toStringBody(var_isMemberCheck: Object) =
        s"""
        | {
        | "isMemberCheck":$var_isMemberCheck
        | }
        """.stripMargin
}
