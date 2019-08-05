package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties {
    ConfigNodePropertyArray handlerSchemes = null

    ConfigNodePropertyString slingJcrinstallFolderNameRegexp = null

    ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth = null

    ConfigNodePropertyArray slingJcrinstallSearchPath = null

    ConfigNodePropertyString slingJcrinstallNewConfigPath = null

    ConfigNodePropertyString slingJcrinstallSignalPath = null

    ConfigNodePropertyBoolean slingJcrinstallEnableWriteback = null

}
