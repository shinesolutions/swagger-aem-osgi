
package org.openapitools.client.model


case class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties (
    _feedGeneratorAlgorithm: Option[ConfigNodePropertyDropDown]
)
object ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties {
    def toStringBody(var_feedGeneratorAlgorithm: Object) =
        s"""
        | {
        | "feedGeneratorAlgorithm":$var_feedGeneratorAlgorithm
        | }
        """.stripMargin
}
