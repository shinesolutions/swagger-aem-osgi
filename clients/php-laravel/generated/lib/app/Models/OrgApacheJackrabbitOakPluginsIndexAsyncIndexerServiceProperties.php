<?php
/**
 * OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties
 */
namespace app\Models;

/**
 * OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties
 */
class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties {

    /** @var \app\Models\ConfigNodePropertyArray $async_configs */
    private $async_configs;

    /** @var \app\Models\ConfigNodePropertyInteger $lease_time_out_minutes */
    private $lease_time_out_minutes;

    /** @var \app\Models\ConfigNodePropertyInteger $failing_index_timeout_seconds */
    private $failing_index_timeout_seconds;

    /** @var \app\Models\ConfigNodePropertyInteger $error_warn_interval_seconds */
    private $error_warn_interval_seconds;

}
