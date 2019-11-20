package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqAuditPurgeReplicationProperties {
    ConfigNodePropertyString auditlogRuleName = null

    ConfigNodePropertyString auditlogRuleContentpath = null

    ConfigNodePropertyInteger auditlogRuleMinimumage = null

    ConfigNodePropertyDropDown auditlogRuleTypes = null

}