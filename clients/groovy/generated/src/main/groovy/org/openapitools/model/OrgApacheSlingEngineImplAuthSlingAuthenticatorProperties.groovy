package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties {
    ConfigNodePropertyString osgiHttpWhiteboardContextSelect = null

    ConfigNodePropertyString osgiHttpWhiteboardListener = null

    ConfigNodePropertyString authSudoCookie = null

    ConfigNodePropertyString authSudoParameter = null

    ConfigNodePropertyBoolean authAnnonymous = null

    ConfigNodePropertyArray slingAuthRequirements = null

    ConfigNodePropertyString slingAuthAnonymousUser = null

    ConfigNodePropertyString slingAuthAnonymousPassword = null

    ConfigNodePropertyDropDown authHttp = null

    ConfigNodePropertyString authHttpRealm = null

    ConfigNodePropertyArray authUriSuffix = null

}
