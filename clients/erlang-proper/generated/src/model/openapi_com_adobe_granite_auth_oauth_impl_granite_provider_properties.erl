-module(openapi_com_adobe_granite_auth_oauth_impl_granite_provider_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_oauth_impl_granite_provider_properties/0]).

-export([openapi_com_adobe_granite_auth_oauth_impl_granite_provider_properties/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_impl_granite_provider_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_impl_granite_provider_properties() ::
  [ {'oauth_provider_id', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_granite_authorization_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_granite_token_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_granite_profile_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_granite_extended_details_urls', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_auth_oauth_impl_granite_provider_properties() ->
    openapi_com_adobe_granite_auth_oauth_impl_granite_provider_properties([]).

openapi_com_adobe_granite_auth_oauth_impl_granite_provider_properties(Fields) ->
  Default = [ {'oauth.provider.id', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.granite.authorization.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.granite.token.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.granite.profile.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.granite.extended.details.urls', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

