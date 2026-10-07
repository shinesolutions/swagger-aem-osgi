-module(openapi_com_day_cq_dam_indd_process_indd_media_extract_process_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_indd_process_indd_media_extract_process_properties/0]).

-export([openapi_com_day_cq_dam_indd_process_indd_media_extract_process_properties/1]).

-export_type([openapi_com_day_cq_dam_indd_process_indd_media_extract_process_properties/0]).

-type openapi_com_day_cq_dam_indd_process_indd_media_extract_process_properties() ::
  [ {'process_label', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_dam_indd_pages_regex', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'ids_job_decoupled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'ids_job_workflow_model', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_dam_indd_process_indd_media_extract_process_properties() ->
    openapi_com_day_cq_dam_indd_process_indd_media_extract_process_properties([]).

openapi_com_day_cq_dam_indd_process_indd_media_extract_process_properties(Fields) ->
  Default = [ {'process.label', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.dam.indd.pages.regex', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'ids.job.decoupled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'ids.job.workflow.model', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

