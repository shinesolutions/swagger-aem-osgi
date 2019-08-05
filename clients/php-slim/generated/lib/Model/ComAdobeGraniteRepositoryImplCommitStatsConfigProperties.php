<?php
/**
 * ComAdobeGraniteRepositoryImplCommitStatsConfigProperties
 */
namespace OpenAPIServer\Model;

/**
 * ComAdobeGraniteRepositoryImplCommitStatsConfigProperties
 */
class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $enabled */
    private $enabled;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $intervalSeconds */
    private $intervalSeconds;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $commitsPerIntervalThreshold */
    private $commitsPerIntervalThreshold;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $maxLocationLength */
    private $maxLocationLength;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $maxDetailsShown */
    private $maxDetailsShown;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $minDetailsPercentage */
    private $minDetailsPercentage;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $threadMatchers */
    private $threadMatchers;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $maxGreedyDepth */
    private $maxGreedyDepth;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $greedyStackMatchers */
    private $greedyStackMatchers;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $stackFilters */
    private $stackFilters;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $stackMatchers */
    private $stackMatchers;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $stackCategorizers */
    private $stackCategorizers;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $stackShorteners */
    private $stackShorteners;

}
