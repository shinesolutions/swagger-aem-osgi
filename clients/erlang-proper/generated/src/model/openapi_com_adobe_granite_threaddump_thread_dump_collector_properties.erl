-module(openapi_com_adobe_granite_threaddump_thread_dump_collector_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_threaddump_thread_dump_collector_properties/0]).

-export([openapi_com_adobe_granite_threaddump_thread_dump_collector_properties/1]).

-export_type([openapi_com_adobe_granite_threaddump_thread_dump_collector_properties/0]).

-type openapi_com_adobe_granite_threaddump_thread_dump_collector_properties() ::
  [ {'scheduler_period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'scheduler_runOn', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'granite_threaddump_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'granite_threaddump_dumpsPerFile', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'granite_threaddump_enableGzipCompression', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'granite_threaddump_enableDirectoriesCompression', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'granite_threaddump_enableJStack', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'granite_threaddump_maxBackupDays', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'granite_threaddump_backupCleanTrigger', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_threaddump_thread_dump_collector_properties() ->
    openapi_com_adobe_granite_threaddump_thread_dump_collector_properties([]).

openapi_com_adobe_granite_threaddump_thread_dump_collector_properties(Fields) ->
  Default = [ {'scheduler.period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'scheduler.runOn', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'granite.threaddump.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'granite.threaddump.dumpsPerFile', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'granite.threaddump.enableGzipCompression', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'granite.threaddump.enableDirectoriesCompression', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'granite.threaddump.enableJStack', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'granite.threaddump.maxBackupDays', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'granite.threaddump.backupCleanTrigger', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

