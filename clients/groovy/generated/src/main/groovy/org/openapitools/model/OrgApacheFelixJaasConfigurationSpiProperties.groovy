package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheFelixJaasConfigurationSpiProperties {
    ConfigNodePropertyString jaasDefaultRealmName = null

    ConfigNodePropertyString jaasConfigProviderName = null

    ConfigNodePropertyDropDown jaasGlobalConfigPolicy = null

}
