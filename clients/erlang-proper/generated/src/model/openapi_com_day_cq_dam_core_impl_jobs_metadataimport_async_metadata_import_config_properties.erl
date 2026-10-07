-module(openapi_com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties/0]).

-type openapi_com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties() ::
  [ {'operation', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'operationIcon', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'topicName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'emailEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties() ->
    openapi_com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties([]).

openapi_com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties(Fields) ->
  Default = [ {'operation', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'operationIcon', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'topicName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'emailEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

