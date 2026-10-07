-module(openapi_org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties/0]).

-export([openapi_org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties/1]).

-export_type([openapi_org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties/0]).

-type openapi_org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties() ::
  [ {'users', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'groups', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties() ->
    openapi_org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties([]).

openapi_org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties(Fields) ->
  Default = [ {'users', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'groups', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

