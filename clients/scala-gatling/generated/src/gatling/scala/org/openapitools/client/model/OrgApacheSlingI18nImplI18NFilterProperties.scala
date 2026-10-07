
package org.openapitools.client.model


case class OrgApacheSlingI18nImplI18NFilterProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _slingFilterScope: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingI18nImplI18NFilterProperties {
    def toStringBody(var_serviceRanking: Object, var_slingFilterScope: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking,"slingFilterScope":$var_slingFilterScope
        | }
        """.stripMargin
}
