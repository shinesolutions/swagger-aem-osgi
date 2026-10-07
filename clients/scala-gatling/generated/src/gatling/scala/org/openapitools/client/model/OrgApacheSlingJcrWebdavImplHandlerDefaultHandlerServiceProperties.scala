
package org.openapitools.client.model


case class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _typeCollections: Option[ConfigNodePropertyString],
    _typeNoncollections: Option[ConfigNodePropertyString],
    _typeContent: Option[ConfigNodePropertyString]
)
object OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties {
    def toStringBody(var_serviceRanking: Object, var_typeCollections: Object, var_typeNoncollections: Object, var_typeContent: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking,"typeCollections":$var_typeCollections,"typeNoncollections":$var_typeNoncollections,"typeContent":$var_typeContent
        | }
        """.stripMargin
}
