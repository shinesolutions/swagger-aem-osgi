package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties {
    ConfigNodePropertyBoolean enabled = null

    ConfigNodePropertyInteger intervalSeconds = null

    ConfigNodePropertyInteger commitsPerIntervalThreshold = null

    ConfigNodePropertyInteger maxLocationLength = null

    ConfigNodePropertyInteger maxDetailsShown = null

    ConfigNodePropertyInteger minDetailsPercentage = null

    ConfigNodePropertyArray threadMatchers = null

    ConfigNodePropertyInteger maxGreedyDepth = null

    ConfigNodePropertyString greedyStackMatchers = null

    ConfigNodePropertyArray stackFilters = null

    ConfigNodePropertyArray stackMatchers = null

    ConfigNodePropertyArray stackCategorizers = null

    ConfigNodePropertyArray stackShorteners = null

}
