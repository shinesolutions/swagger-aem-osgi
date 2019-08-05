package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheFelixHttpSslfilterSslFilterProperties {
    ConfigNodePropertyString sslForwardHeader = null

    ConfigNodePropertyString sslForwardValue = null

    ConfigNodePropertyString sslForwardCertHeader = null

    ConfigNodePropertyBoolean rewriteAbsoluteUrls = null

}
