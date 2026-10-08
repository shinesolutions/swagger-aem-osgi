-module(openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties/0]).

-export([openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties/1]).

-export_type([openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties/0]).

-type openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties() ::
  [ {'oauth_provider_id', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties() ->
    openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties([]).

openapi_com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties(Fields) ->
  Default = [ {'oauth.provider.id', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

