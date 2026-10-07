
package org.openapitools.client.model


case class ComAdobeCqHistoryImplHistoryRequestFilterProperties (
    _historyRequestFilterExcludedSelectors: Option[ConfigNodePropertyArray],
    _historyRequestFilterExcludedExtensions: Option[ConfigNodePropertyArray]
)
object ComAdobeCqHistoryImplHistoryRequestFilterProperties {
    def toStringBody(var_historyRequestFilterExcludedSelectors: Object, var_historyRequestFilterExcludedExtensions: Object) =
        s"""
        | {
        | "historyRequestFilterExcludedSelectors":$var_historyRequestFilterExcludedSelectors,"historyRequestFilterExcludedExtensions":$var_historyRequestFilterExcludedExtensions
        | }
        """.stripMargin
}
