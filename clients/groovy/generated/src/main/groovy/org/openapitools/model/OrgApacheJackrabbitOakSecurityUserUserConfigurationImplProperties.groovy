package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    ConfigNodePropertyString usersPath = null

    ConfigNodePropertyString groupsPath = null

    ConfigNodePropertyString systemRelativePath = null

    ConfigNodePropertyInteger defaultDepth = null

    ConfigNodePropertyDropDown importBehavior = null

    ConfigNodePropertyString passwordHashAlgorithm = null

    ConfigNodePropertyInteger passwordHashIterations = null

    ConfigNodePropertyInteger passwordSaltSize = null

    ConfigNodePropertyBoolean omitAdminPw = null

    ConfigNodePropertyBoolean supportAutoSave = null

    ConfigNodePropertyInteger passwordMaxAge = null

    ConfigNodePropertyBoolean initialPasswordChange = null

    ConfigNodePropertyInteger passwordHistorySize = null

    ConfigNodePropertyBoolean passwordExpiryForAdmin = null

    ConfigNodePropertyInteger cacheExpiration = null

    ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile = null

}
