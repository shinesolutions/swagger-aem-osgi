<?php
/**
 * ComDayCqWcmCoreImplVersionPurgeTaskProperties
 */
namespace app\Models;

/**
 * ComDayCqWcmCoreImplVersionPurgeTaskProperties
 */
class ComDayCqWcmCoreImplVersionPurgeTaskProperties {

    /** @var \app\Models\ConfigNodePropertyArray $versionpurge_paths */
    private $versionpurge_paths;

    /** @var \app\Models\ConfigNodePropertyBoolean $versionpurge_recursive */
    private $versionpurge_recursive;

    /** @var \app\Models\ConfigNodePropertyInteger $versionpurge_max_versions */
    private $versionpurge_max_versions;

    /** @var \app\Models\ConfigNodePropertyInteger $versionpurge_min_versions */
    private $versionpurge_min_versions;

    /** @var \app\Models\ConfigNodePropertyInteger $versionpurge_max_age_days */
    private $versionpurge_max_age_days;

}
