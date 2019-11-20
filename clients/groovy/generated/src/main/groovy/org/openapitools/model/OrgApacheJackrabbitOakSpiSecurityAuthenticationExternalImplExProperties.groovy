package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties {
    ConfigNodePropertyInteger jaasRanking = null

    ConfigNodePropertyString jaasControlFlag = null

    ConfigNodePropertyString jaasRealmName = null

    ConfigNodePropertyString idpName = null

    ConfigNodePropertyString syncHandlerName = null

}