<?php
/**
 * OrgApacheFelixScrScrServiceProperties
 */
namespace app\Models;

/**
 * OrgApacheFelixScrScrServiceProperties
 */
class OrgApacheFelixScrScrServiceProperties {

    /** @var \app\Models\ConfigNodePropertyDropDown $ds_loglevel */
    private $ds_loglevel;

    /** @var \app\Models\ConfigNodePropertyBoolean $ds_factory_enabled */
    private $ds_factory_enabled;

    /** @var \app\Models\ConfigNodePropertyBoolean $ds_delayed_keep_instances */
    private $ds_delayed_keep_instances;

    /** @var \app\Models\ConfigNodePropertyInteger $ds_lock_timeout_milliseconds */
    private $ds_lock_timeout_milliseconds;

    /** @var \app\Models\ConfigNodePropertyInteger $ds_stop_timeout_milliseconds */
    private $ds_stop_timeout_milliseconds;

    /** @var \app\Models\ConfigNodePropertyBoolean $ds_global_extender */
    private $ds_global_extender;

}
