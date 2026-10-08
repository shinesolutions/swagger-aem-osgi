-module(openapi_com_day_cq_dam_ids_impl_ids_job_processor_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_ids_impl_ids_job_processor_properties/0]).

-export([openapi_com_day_cq_dam_ids_impl_ids_job_processor_properties/1]).

-export_type([openapi_com_day_cq_dam_ids_impl_ids_job_processor_properties/0]).

-type openapi_com_day_cq_dam_ids_impl_ids_job_processor_properties() ::
  [ {'enable_multisession', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'ids_cc_enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'enable_retry', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'enable_retry_scripterror', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'externalizer_domain_cqhost', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'externalizer_domain_http', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_dam_ids_impl_ids_job_processor_properties() ->
    openapi_com_day_cq_dam_ids_impl_ids_job_processor_properties([]).

openapi_com_day_cq_dam_ids_impl_ids_job_processor_properties(Fields) ->
  Default = [ {'enable.multisession', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'ids.cc.enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'enable.retry', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'enable.retry.scripterror', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'externalizer.domain.cqhost', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'externalizer.domain.http', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

