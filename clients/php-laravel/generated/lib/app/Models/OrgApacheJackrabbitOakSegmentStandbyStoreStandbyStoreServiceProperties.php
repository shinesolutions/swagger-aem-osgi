<?php
/**
 * OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties
 */
namespace app\Models;

/**
 * OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties
 */
class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties {

    /** @var \app\Models\ConfigNodePropertyBoolean $org_apache_sling_installer_configuration_persist */
    private $org_apache_sling_installer_configuration_persist;

    /** @var \app\Models\ConfigNodePropertyDropDown $mode */
    private $mode;

    /** @var \app\Models\ConfigNodePropertyInteger $port */
    private $port;

    /** @var \app\Models\ConfigNodePropertyString $primary_host */
    private $primary_host;

    /** @var \app\Models\ConfigNodePropertyInteger $interval */
    private $interval;

    /** @var \app\Models\ConfigNodePropertyArray $primary_allowed_client_ip_ranges */
    private $primary_allowed_client_ip_ranges;

    /** @var \app\Models\ConfigNodePropertyBoolean $secure */
    private $secure;

    /** @var \app\Models\ConfigNodePropertyInteger $standby_readtimeout */
    private $standby_readtimeout;

    /** @var \app\Models\ConfigNodePropertyBoolean $standby_autoclean */
    private $standby_autoclean;

}
