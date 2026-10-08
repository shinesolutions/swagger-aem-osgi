
package org.openapitools.client.model


case class ComAdobeGraniteRepositoryServiceUserConfigurationProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _serviceusersSimpleSubjectPopulation: Option[ConfigNodePropertyBoolean],
    _serviceusersList: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteRepositoryServiceUserConfigurationProperties {
    def toStringBody(var_serviceRanking: Object, var_serviceusersSimpleSubjectPopulation: Object, var_serviceusersList: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking,"serviceusersSimpleSubjectPopulation":$var_serviceusersSimpleSubjectPopulation,"serviceusersList":$var_serviceusersList
        | }
        """.stripMargin
}
