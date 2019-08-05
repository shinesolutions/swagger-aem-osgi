<?php
/**
 * OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties
 */
namespace OpenAPIServer\Model;

/**
 * OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties
 */
class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgApacheSlingInstallerConfigurationPersist */
    private $orgApacheSlingInstallerConfigurationPersist;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $mode */
    private $mode;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $port */
    private $port;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $primaryHost */
    private $primaryHost;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $interval */
    private $interval;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $primaryAllowedClientIpRanges */
    private $primaryAllowedClientIpRanges;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $secure */
    private $secure;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $standbyReadtimeout */
    private $standbyReadtimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $standbyAutoclean */
    private $standbyAutoclean;

}
