package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties {
    ConfigNodePropertyInteger comAdobeGraniteJettySslPort = null

    ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser = null

    ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword = null

    ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded = null

    ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded = null

    ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate = null

}
