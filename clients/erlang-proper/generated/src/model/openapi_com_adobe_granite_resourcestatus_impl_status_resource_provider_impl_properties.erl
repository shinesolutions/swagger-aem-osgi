-module(openapi_com_adobe_granite_resourcestatus_impl_status_resource_provider_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_resourcestatus_impl_status_resource_provider_impl_properties/0]).

-export([openapi_com_adobe_granite_resourcestatus_impl_status_resource_provider_impl_properties/1]).

-export_type([openapi_com_adobe_granite_resourcestatus_impl_status_resource_provider_impl_properties/0]).

-type openapi_com_adobe_granite_resourcestatus_impl_status_resource_provider_impl_properties() ::
  [ {'provider_root', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_resourcestatus_impl_status_resource_provider_impl_properties() ->
    openapi_com_adobe_granite_resourcestatus_impl_status_resource_provider_impl_properties([]).

openapi_com_adobe_granite_resourcestatus_impl_status_resource_provider_impl_properties(Fields) ->
  Default = [ {'provider.root', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

