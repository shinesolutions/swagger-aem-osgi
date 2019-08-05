package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties {
    ConfigNodePropertyString name = null

    ConfigNodePropertyArray endpoints = null

    ConfigNodePropertyInteger pullItems = null

    ConfigNodePropertyString packageBuilderTarget = null

    ConfigNodePropertyString transportSecretProviderTarget = null

}
