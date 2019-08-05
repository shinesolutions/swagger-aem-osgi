package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties {
    ConfigNodePropertyString providerName = null

    ConfigNodePropertyString hostName = null

    ConfigNodePropertyInteger hostPort = null

    ConfigNodePropertyBoolean hostSsl = null

    ConfigNodePropertyBoolean hostTls = null

    ConfigNodePropertyBoolean hostNoCertCheck = null

    ConfigNodePropertyString bindDn = null

    ConfigNodePropertyString bindPassword = null

    ConfigNodePropertyString searchTimeout = null

    ConfigNodePropertyInteger adminPoolMaxActive = null

    ConfigNodePropertyBoolean adminPoolLookupOnValidate = null

    ConfigNodePropertyInteger userPoolMaxActive = null

    ConfigNodePropertyBoolean userPoolLookupOnValidate = null

    ConfigNodePropertyString userBaseDN = null

    ConfigNodePropertyArray userObjectclass = null

    ConfigNodePropertyString userIdAttribute = null

    ConfigNodePropertyString userExtraFilter = null

    ConfigNodePropertyBoolean userMakeDnPath = null

    ConfigNodePropertyString groupBaseDN = null

    ConfigNodePropertyArray groupObjectclass = null

    ConfigNodePropertyString groupNameAttribute = null

    ConfigNodePropertyString groupExtraFilter = null

    ConfigNodePropertyBoolean groupMakeDnPath = null

    ConfigNodePropertyString groupMemberAttribute = null

    ConfigNodePropertyBoolean useUidForExtId = null

    ConfigNodePropertyArray customattributes = null

}
