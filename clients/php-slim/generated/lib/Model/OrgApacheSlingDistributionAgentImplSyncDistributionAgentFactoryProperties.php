<?php
/**
 * OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties
 */
namespace OpenAPIServer\Model;

/**
 * OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties
 */
class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $name */
    private $name;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $title */
    private $title;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $details */
    private $details;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $enabled */
    private $enabled;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $serviceName */
    private $serviceName;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $logLevel */
    private $logLevel;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $queueProcessingEnabled */
    private $queueProcessingEnabled;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $passiveQueues */
    private $passiveQueues;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $packageExporterEndpoints */
    private $packageExporterEndpoints;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $packageImporterEndpoints */
    private $packageImporterEndpoints;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $retryStrategy */
    private $retryStrategy;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $retryAttempts */
    private $retryAttempts;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $pullItems */
    private $pullItems;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $httpConnTimeout */
    private $httpConnTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $requestAuthorizationStrategyTarget */
    private $requestAuthorizationStrategyTarget;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $transportSecretProviderTarget */
    private $transportSecretProviderTarget;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $packageBuilderTarget */
    private $packageBuilderTarget;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $triggersTarget */
    private $triggersTarget;

}
