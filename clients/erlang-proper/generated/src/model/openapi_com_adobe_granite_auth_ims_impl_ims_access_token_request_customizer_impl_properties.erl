-module(openapi_com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties/0]).

-export([openapi_com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties/1]).

-export_type([openapi_com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties/0]).

-type openapi_com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties() ::
  [ {'auth_ims_client_secret', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'customizer_type', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties() ->
    openapi_com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties([]).

openapi_com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties(Fields) ->
  Default = [ {'auth.ims.client.secret', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'customizer.type', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

