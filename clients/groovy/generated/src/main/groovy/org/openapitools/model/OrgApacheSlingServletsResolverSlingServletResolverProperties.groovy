package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingServletsResolverSlingServletResolverProperties {
    ConfigNodePropertyString servletresolverServletRoot = null

    ConfigNodePropertyInteger servletresolverCacheSize = null

    ConfigNodePropertyArray servletresolverPaths = null

    ConfigNodePropertyArray servletresolverDefaultExtensions = null

}
