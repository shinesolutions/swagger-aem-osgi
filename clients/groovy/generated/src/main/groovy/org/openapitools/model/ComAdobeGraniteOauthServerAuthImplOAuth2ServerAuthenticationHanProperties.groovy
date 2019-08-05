package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties {
    ConfigNodePropertyString path = null

    ConfigNodePropertyString jaasControlFlag = null

    ConfigNodePropertyString jaasRealmName = null

    ConfigNodePropertyInteger jaasRanking = null

    ConfigNodePropertyBoolean oauthOfflineValidation = null

}
