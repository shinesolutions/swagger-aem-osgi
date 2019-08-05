<?php
/**
 * OrgApacheSlingTracerInternalLogTracerProperties
 */
namespace OpenAPIServer\Model;

/**
 * OrgApacheSlingTracerInternalLogTracerProperties
 */
class OrgApacheSlingTracerInternalLogTracerProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $tracerSets */
    private $tracerSets;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $enabled */
    private $enabled;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $servletEnabled */
    private $servletEnabled;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $recordingCacheSizeInMB */
    private $recordingCacheSizeInMB;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $recordingCacheDurationInSecs */
    private $recordingCacheDurationInSecs;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $recordingCompressionEnabled */
    private $recordingCompressionEnabled;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $gzipResponse */
    private $gzipResponse;

}
