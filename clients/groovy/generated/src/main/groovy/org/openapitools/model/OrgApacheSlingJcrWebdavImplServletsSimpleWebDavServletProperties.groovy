package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties {
    ConfigNodePropertyString davRoot = null

    ConfigNodePropertyBoolean davCreateAbsoluteUri = null

    ConfigNodePropertyString davRealm = null

    ConfigNodePropertyArray collectionTypes = null

    ConfigNodePropertyArray filterPrefixes = null

    ConfigNodePropertyString filterTypes = null

    ConfigNodePropertyString filterUris = null

    ConfigNodePropertyString typeCollections = null

    ConfigNodePropertyString typeNoncollections = null

    ConfigNodePropertyString typeContent = null

}
