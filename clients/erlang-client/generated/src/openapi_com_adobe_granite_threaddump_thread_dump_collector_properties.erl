-module(openapi_com_adobe_granite_threaddump_thread_dump_collector_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_threaddump_thread_dump_collector_properties/0]).

-type openapi_com_adobe_granite_threaddump_thread_dump_collector_properties() ::
    #{ 'scheduler_period' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'scheduler_runOn' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'granite_threaddump_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'granite_threaddump_dumpsPerFile' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'granite_threaddump_enableGzipCompression' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'granite_threaddump_enableDirectoriesCompression' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'granite_threaddump_enableJStack' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'granite_threaddump_maxBackupDays' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'granite_threaddump_backupCleanTrigger' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'scheduler_period' := SchedulerPeriod,
          'scheduler_runOn' := SchedulerRunOn,
          'granite_threaddump_enabled' := GraniteThreaddumpEnabled,
          'granite_threaddump_dumpsPerFile' := GraniteThreaddumpDumpsPerFile,
          'granite_threaddump_enableGzipCompression' := GraniteThreaddumpEnableGzipCompression,
          'granite_threaddump_enableDirectoriesCompression' := GraniteThreaddumpEnableDirectoriesCompression,
          'granite_threaddump_enableJStack' := GraniteThreaddumpEnableJStack,
          'granite_threaddump_maxBackupDays' := GraniteThreaddumpMaxBackupDays,
          'granite_threaddump_backupCleanTrigger' := GraniteThreaddumpBackupCleanTrigger
        }) ->
    #{ 'scheduler.period' => SchedulerPeriod,
       'scheduler.runOn' => SchedulerRunOn,
       'granite.threaddump.enabled' => GraniteThreaddumpEnabled,
       'granite.threaddump.dumpsPerFile' => GraniteThreaddumpDumpsPerFile,
       'granite.threaddump.enableGzipCompression' => GraniteThreaddumpEnableGzipCompression,
       'granite.threaddump.enableDirectoriesCompression' => GraniteThreaddumpEnableDirectoriesCompression,
       'granite.threaddump.enableJStack' => GraniteThreaddumpEnableJStack,
       'granite.threaddump.maxBackupDays' => GraniteThreaddumpMaxBackupDays,
       'granite.threaddump.backupCleanTrigger' => GraniteThreaddumpBackupCleanTrigger
     }.
