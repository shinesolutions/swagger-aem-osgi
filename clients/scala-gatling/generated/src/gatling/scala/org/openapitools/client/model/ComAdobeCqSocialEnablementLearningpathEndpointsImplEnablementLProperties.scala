
package org.openapitools.client.model


case class ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties (
    _fieldWhitelist: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties {
    def toStringBody(var_fieldWhitelist: Object) =
        s"""
        | {
        | "fieldWhitelist":$var_fieldWhitelist
        | }
        """.stripMargin
}
