package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties {
    ConfigNodePropertyString solrHttpUrl = null

    ConfigNodePropertyString solrZkHost = null

    ConfigNodePropertyString solrCollection = null

    ConfigNodePropertyInteger solrSocketTimeout = null

    ConfigNodePropertyInteger solrConnectionTimeout = null

    ConfigNodePropertyInteger solrShardsNo = null

    ConfigNodePropertyInteger solrReplicationFactor = null

    ConfigNodePropertyString solrConfDir = null

}
