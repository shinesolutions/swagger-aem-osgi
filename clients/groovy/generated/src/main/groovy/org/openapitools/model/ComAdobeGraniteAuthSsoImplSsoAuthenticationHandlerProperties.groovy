package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {
    ConfigNodePropertyString path = null

    ConfigNodePropertyInteger serviceRanking = null

    ConfigNodePropertyString jaasControlFlag = null

    ConfigNodePropertyString jaasRealmName = null

    ConfigNodePropertyInteger jaasRanking = null

    ConfigNodePropertyArray headers = null

    ConfigNodePropertyArray cookies = null

    ConfigNodePropertyArray parameters = null

    ConfigNodePropertyArray usermap = null

    ConfigNodePropertyString format = null

    ConfigNodePropertyString trustedCredentialsAttribute = null

}
