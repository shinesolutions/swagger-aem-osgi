-module(openapi_com_adobe_granite_auth_ims_impl_ims_provider_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_ims_impl_ims_provider_impl_properties/0]).

-export([openapi_com_adobe_granite_auth_ims_impl_ims_provider_impl_properties/1]).

-export_type([openapi_com_adobe_granite_auth_ims_impl_ims_provider_impl_properties/0]).

-type openapi_com_adobe_granite_auth_ims_impl_ims_provider_impl_properties() ::
  [ {'oauth_provider_id', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_ims_authorization_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_ims_token_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_ims_profile_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_ims_extended_details_urls', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'oauth_provider_ims_validate_token_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_ims_session_property', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_ims_service_token_client_id', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_ims_service_token_client_secret', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_provider_ims_service_token', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'ims_org_ref', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'ims_group_mapping', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'oauth_provider_ims_only_license_group', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_auth_ims_impl_ims_provider_impl_properties() ->
    openapi_com_adobe_granite_auth_ims_impl_ims_provider_impl_properties([]).

openapi_com_adobe_granite_auth_ims_impl_ims_provider_impl_properties(Fields) ->
  Default = [ {'oauth.provider.id', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.ims.authorization.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.ims.token.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.ims.profile.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.ims.extended.details.urls', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'oauth.provider.ims.validate.token.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.ims.session.property', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.ims.service.token.client.id', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.ims.service.token.client.secret', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.provider.ims.service.token', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'ims.org.ref', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'ims.group.mapping', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'oauth.provider.ims.only.license.group', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

