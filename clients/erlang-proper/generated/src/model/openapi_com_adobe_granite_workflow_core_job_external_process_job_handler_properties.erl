-module(openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties/0]).

-export([openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties/1]).

-export_type([openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties/0]).

-type openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties() ::
  [ {'default_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'max_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'default_period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties() ->
    openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties([]).

openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties(Fields) ->
  Default = [ {'default.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'max.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'default.period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

