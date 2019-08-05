<?php
/**
 * ComAdobeGraniteThreaddumpThreadDumpCollectorProperties
 */
namespace app\Models;

/**
 * ComAdobeGraniteThreaddumpThreadDumpCollectorProperties
 */
class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties {

    /** @var \app\Models\ConfigNodePropertyInteger $scheduler_period */
    private $scheduler_period;

    /** @var \app\Models\ConfigNodePropertyDropDown $scheduler_run_on */
    private $scheduler_run_on;

    /** @var \app\Models\ConfigNodePropertyBoolean $granite_threaddump_enabled */
    private $granite_threaddump_enabled;

    /** @var \app\Models\ConfigNodePropertyInteger $granite_threaddump_dumps_per_file */
    private $granite_threaddump_dumps_per_file;

    /** @var \app\Models\ConfigNodePropertyBoolean $granite_threaddump_enable_gzip_compression */
    private $granite_threaddump_enable_gzip_compression;

    /** @var \app\Models\ConfigNodePropertyBoolean $granite_threaddump_enable_directories_compression */
    private $granite_threaddump_enable_directories_compression;

    /** @var \app\Models\ConfigNodePropertyBoolean $granite_threaddump_enable_j_stack */
    private $granite_threaddump_enable_j_stack;

    /** @var \app\Models\ConfigNodePropertyInteger $granite_threaddump_max_backup_days */
    private $granite_threaddump_max_backup_days;

    /** @var \app\Models\ConfigNodePropertyString $granite_threaddump_backup_clean_trigger */
    private $granite_threaddump_backup_clean_trigger;

}
