-module(openapi_com_adobe_cq_address_impl_location_location_list_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_address_impl_location_location_list_servlet_properties/0]).

-export([openapi_com_adobe_cq_address_impl_location_location_list_servlet_properties/1]).

-export_type([openapi_com_adobe_cq_address_impl_location_location_list_servlet_properties/0]).

-type openapi_com_adobe_cq_address_impl_location_location_list_servlet_properties() ::
  [ {'cq_address_location_default_maxResults', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_address_impl_location_location_list_servlet_properties() ->
    openapi_com_adobe_cq_address_impl_location_location_list_servlet_properties([]).

openapi_com_adobe_cq_address_impl_location_location_list_servlet_properties(Fields) ->
  Default = [ {'cq.address.location.default.maxResults', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

