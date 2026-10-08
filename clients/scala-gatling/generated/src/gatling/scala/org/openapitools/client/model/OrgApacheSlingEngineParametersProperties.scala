
package org.openapitools.client.model


case class OrgApacheSlingEngineParametersProperties (
    _slingDefaultParameterEncoding: Option[ConfigNodePropertyString],
    _slingDefaultMaxParameters: Option[ConfigNodePropertyInteger],
    _fileLocation: Option[ConfigNodePropertyString],
    _fileThreshold: Option[ConfigNodePropertyInteger],
    _fileMax: Option[ConfigNodePropertyInteger],
    _requestMax: Option[ConfigNodePropertyInteger],
    _slingDefaultParameterCheckForAdditionalContainerParameters: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingEngineParametersProperties {
    def toStringBody(var_slingDefaultParameterEncoding: Object, var_slingDefaultMaxParameters: Object, var_fileLocation: Object, var_fileThreshold: Object, var_fileMax: Object, var_requestMax: Object, var_slingDefaultParameterCheckForAdditionalContainerParameters: Object) =
        s"""
        | {
        | "slingDefaultParameterEncoding":$var_slingDefaultParameterEncoding,"slingDefaultMaxParameters":$var_slingDefaultMaxParameters,"fileLocation":$var_fileLocation,"fileThreshold":$var_fileThreshold,"fileMax":$var_fileMax,"requestMax":$var_requestMax,"slingDefaultParameterCheckForAdditionalContainerParameters":$var_slingDefaultParameterCheckForAdditionalContainerParameters
        | }
        """.stripMargin
}
