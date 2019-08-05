<?php
/**
 * ComDayCqWcmCoreImplVersionManagerImplProperties
 */
namespace app\Models;

/**
 * ComDayCqWcmCoreImplVersionManagerImplProperties
 */
class ComDayCqWcmCoreImplVersionManagerImplProperties {

    /** @var \app\Models\ConfigNodePropertyBoolean $versionmanager_create_version_on_activation */
    private $versionmanager_create_version_on_activation;

    /** @var \app\Models\ConfigNodePropertyBoolean $versionmanager_purging_enabled */
    private $versionmanager_purging_enabled;

    /** @var \app\Models\ConfigNodePropertyArray $versionmanager_purge_paths */
    private $versionmanager_purge_paths;

    /** @var \app\Models\ConfigNodePropertyArray $versionmanager_iv_paths */
    private $versionmanager_iv_paths;

    /** @var \app\Models\ConfigNodePropertyInteger $versionmanager_max_age_days */
    private $versionmanager_max_age_days;

    /** @var \app\Models\ConfigNodePropertyInteger $versionmanager_max_number_versions */
    private $versionmanager_max_number_versions;

    /** @var \app\Models\ConfigNodePropertyInteger $versionmanager_min_number_versions */
    private $versionmanager_min_number_versions;

}
