package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class OrgApacheFelixEventadminImplEventAdminProperties {
    ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize = null

    ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio = null

    ConfigNodePropertyInteger orgApacheFelixEventadminTimeout = null

    ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic = null

    ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout = null

    ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic = null

}
