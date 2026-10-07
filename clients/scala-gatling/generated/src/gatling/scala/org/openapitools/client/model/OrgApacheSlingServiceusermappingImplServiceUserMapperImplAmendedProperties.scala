
package org.openapitools.client.model


case class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _userMapping: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties {
    def toStringBody(var_serviceRanking: Object, var_userMapping: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking,"userMapping":$var_userMapping
        | }
        """.stripMargin
}
