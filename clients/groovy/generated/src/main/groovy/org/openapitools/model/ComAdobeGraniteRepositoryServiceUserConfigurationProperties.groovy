package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComAdobeGraniteRepositoryServiceUserConfigurationProperties {
    ConfigNodePropertyInteger serviceRanking = null

    ConfigNodePropertyBoolean serviceusersSimpleSubjectPopulation = null

    ConfigNodePropertyArray serviceusersList = null

}
