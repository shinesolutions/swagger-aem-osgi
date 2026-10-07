
package org.openapitools.client.model


case class OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties {
    def toStringBody(var_serviceRanking: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking
        | }
        """.stripMargin
}
