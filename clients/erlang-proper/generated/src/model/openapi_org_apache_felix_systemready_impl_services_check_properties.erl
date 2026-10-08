-module(openapi_org_apache_felix_systemready_impl_services_check_properties).

-include("openapi.hrl").

-export([openapi_org_apache_felix_systemready_impl_services_check_properties/0]).

-export([openapi_org_apache_felix_systemready_impl_services_check_properties/1]).

-export_type([openapi_org_apache_felix_systemready_impl_services_check_properties/0]).

-type openapi_org_apache_felix_systemready_impl_services_check_properties() ::
  [ {'services_list', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'type', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_org_apache_felix_systemready_impl_services_check_properties() ->
    openapi_org_apache_felix_systemready_impl_services_check_properties([]).

openapi_org_apache_felix_systemready_impl_services_check_properties(Fields) ->
  Default = [ {'services.list', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'type', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

