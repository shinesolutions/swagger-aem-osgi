-module(openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties/0]).

-export([openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties/1]).

-export_type([openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties/0]).

-type openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties() ::
  [ {'enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'ttl1', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'ttl2', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties() ->
    openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties([]).

openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties(Fields) ->
  Default = [ {'enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'ttl1', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'ttl2', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

