<?php
/**
 * ComAdobeGraniteThreaddumpThreadDumpCollectorProperties
 */
namespace OpenAPIServer\Model;

/**
 * ComAdobeGraniteThreaddumpThreadDumpCollectorProperties
 */
class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $schedulerPeriod */
    private $schedulerPeriod;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $schedulerRunOn */
    private $schedulerRunOn;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $graniteThreaddumpEnabled */
    private $graniteThreaddumpEnabled;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $graniteThreaddumpDumpsPerFile */
    private $graniteThreaddumpDumpsPerFile;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $graniteThreaddumpEnableGzipCompression */
    private $graniteThreaddumpEnableGzipCompression;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $graniteThreaddumpEnableDirectoriesCompression */
    private $graniteThreaddumpEnableDirectoriesCompression;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $graniteThreaddumpEnableJStack */
    private $graniteThreaddumpEnableJStack;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $graniteThreaddumpMaxBackupDays */
    private $graniteThreaddumpMaxBackupDays;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $graniteThreaddumpBackupCleanTrigger */
    private $graniteThreaddumpBackupCleanTrigger;

}
