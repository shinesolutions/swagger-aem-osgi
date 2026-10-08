-module(openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties/0]).

-export([openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties/1]).

-export_type([openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties/0]).

-type openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties() ::
  [ {'bucketSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties() ->
    openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties([]).

openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties(Fields) ->
  Default = [ {'bucketSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

