package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties {
    ConfigNodePropertyString solrZkTimeout = null

    ConfigNodePropertyString solrCommit = null

    ConfigNodePropertyBoolean cacheOn = null

    ConfigNodePropertyInteger concurrencyLevel = null

    ConfigNodePropertyInteger cacheStartSize = null

    ConfigNodePropertyInteger cacheTtl = null

    ConfigNodePropertyInteger cacheSize = null

}
