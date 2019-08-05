<?php
/**
 * OrgApacheSlingTracerInternalLogTracerProperties
 */
namespace app\Models;

/**
 * OrgApacheSlingTracerInternalLogTracerProperties
 */
class OrgApacheSlingTracerInternalLogTracerProperties {

    /** @var \app\Models\ConfigNodePropertyArray $tracer_sets */
    private $tracer_sets;

    /** @var \app\Models\ConfigNodePropertyBoolean $enabled */
    private $enabled;

    /** @var \app\Models\ConfigNodePropertyBoolean $servlet_enabled */
    private $servlet_enabled;

    /** @var \app\Models\ConfigNodePropertyInteger $recording_cache_size_in_mb */
    private $recording_cache_size_in_mb;

    /** @var \app\Models\ConfigNodePropertyInteger $recording_cache_duration_in_secs */
    private $recording_cache_duration_in_secs;

    /** @var \app\Models\ConfigNodePropertyBoolean $recording_compression_enabled */
    private $recording_compression_enabled;

    /** @var \app\Models\ConfigNodePropertyBoolean $gzip_response */
    private $gzip_response;

}
