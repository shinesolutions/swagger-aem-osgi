-module(openapi_com_day_cq_wcm_undo_undo_config_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_undo_undo_config_properties/0]).

-export([openapi_com_day_cq_wcm_undo_undo_config_properties/1]).

-export_type([openapi_com_day_cq_wcm_undo_undo_config_properties/0]).

-type openapi_com_day_cq_wcm_undo_undo_config_properties() ::
  [ {'cq_wcm_undo_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cq_wcm_undo_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_wcm_undo_validity', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_wcm_undo_steps', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_wcm_undo_persistence', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_wcm_undo_persistence_mode', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cq_wcm_undo_markermode', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_wcm_undo_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_wcm_undo_blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_undo_undo_config_properties() ->
    openapi_com_day_cq_wcm_undo_undo_config_properties([]).

openapi_com_day_cq_wcm_undo_undo_config_properties(Fields) ->
  Default = [ {'cq.wcm.undo.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cq.wcm.undo.path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.wcm.undo.validity', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.wcm.undo.steps', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.wcm.undo.persistence', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.wcm.undo.persistence.mode', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cq.wcm.undo.markermode', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.wcm.undo.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.wcm.undo.blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

