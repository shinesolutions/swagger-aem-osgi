
package org.openapitools.client.model


case class ComAdobeCqHistoryImplHistoryServiceImplProperties (
    _historyServiceResourceTypes: Option[ConfigNodePropertyArray],
    _historyServicePathFilter: Option[ConfigNodePropertyArray]
)
object ComAdobeCqHistoryImplHistoryServiceImplProperties {
    def toStringBody(var_historyServiceResourceTypes: Object, var_historyServicePathFilter: Object) =
        s"""
        | {
        | "historyServiceResourceTypes":$var_historyServiceResourceTypes,"historyServicePathFilter":$var_historyServicePathFilter
        | }
        """.stripMargin
}
