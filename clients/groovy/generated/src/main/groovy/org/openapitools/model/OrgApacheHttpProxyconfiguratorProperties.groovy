package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheHttpProxyconfiguratorProperties {
    ConfigNodePropertyBoolean proxyEnabled = null

    ConfigNodePropertyString proxyHost = null

    ConfigNodePropertyInteger proxyPort = null

    ConfigNodePropertyString proxyUser = null

    ConfigNodePropertyString proxyPassword = null

    ConfigNodePropertyArray proxyExceptions = null

}
