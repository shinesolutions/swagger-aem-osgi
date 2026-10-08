-module(openapi_com_adobe_granite_auth_oauth_impl_github_provider_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_oauth_impl_github_provider_impl_properties/0]).

-export([openapi_com_adobe_granite_auth_oauth_impl_github_provider_impl_properties/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_impl_github_provider_impl_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_impl_github_provider_impl_properties() ::
  [ {'oauth_provider_id', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_github_authorization_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_github_token_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_github_profile_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_auth_oauth_impl_github_provider_impl_properties() ->
    openapi_com_adobe_granite_auth_oauth_impl_github_provider_impl_properties([]).

openapi_com_adobe_granite_auth_oauth_impl_github_provider_impl_properties(Fields) ->
  Default = [ {'oauth.provider.id', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.github.authorization.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.github.token.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.github.profile.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

