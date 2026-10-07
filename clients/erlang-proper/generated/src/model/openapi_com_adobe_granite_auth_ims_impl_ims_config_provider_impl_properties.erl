-module(openapi_com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties/0]).

-export([openapi_com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties/1]).

-export_type([openapi_com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties/0]).

-type openapi_com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties() ::
  [ {'oauth_configmanager_ims_configid', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'ims_owningEntity', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'aem_instanceId', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'ims_serviceCode', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties() ->
    openapi_com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties([]).

openapi_com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties(Fields) ->
  Default = [ {'oauth.configmanager.ims.configid', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'ims.owningEntity', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'aem.instanceId', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'ims.serviceCode', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

