<?php
/**
 * ComDayCqAuthImplLoginSelectorHandlerProperties
 */
namespace app\Models;

/**
 * ComDayCqAuthImplLoginSelectorHandlerProperties
 */
class ComDayCqAuthImplLoginSelectorHandlerProperties {

    /** @var \app\Models\ConfigNodePropertyString $path */
    private $path;

    /** @var \app\Models\ConfigNodePropertyInteger $service_ranking */
    private $service_ranking;

    /** @var \app\Models\ConfigNodePropertyArray $auth_loginselector_mappings */
    private $auth_loginselector_mappings;

    /** @var \app\Models\ConfigNodePropertyArray $auth_loginselector_changepw_mappings */
    private $auth_loginselector_changepw_mappings;

    /** @var \app\Models\ConfigNodePropertyString $auth_loginselector_defaultloginpage */
    private $auth_loginselector_defaultloginpage;

    /** @var \app\Models\ConfigNodePropertyString $auth_loginselector_defaultchangepwpage */
    private $auth_loginselector_defaultchangepwpage;

    /** @var \app\Models\ConfigNodePropertyArray $auth_loginselector_handle */
    private $auth_loginselector_handle;

    /** @var \app\Models\ConfigNodePropertyBoolean $auth_loginselector_handle_all_extensions */
    private $auth_loginselector_handle_all_extensions;

}
