-module(openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties/0]).

-export([openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties/1]).

-export_type([openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties/0]).

-type openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties() ::
  [ {'delete_path_regexps', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'delete_sql2_query', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties() ->
    openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties([]).

openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties(Fields) ->
  Default = [ {'delete.path.regexps', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'delete.sql2.query', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

