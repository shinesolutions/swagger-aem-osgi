-module(openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties/0]).

-export([openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties/1]).

-export_type([openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties/0]).

-type openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties() ::
  [ {'fieldWhitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'attachmentTypeBlacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties() ->
    openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties([]).

openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties(Fields) ->
  Default = [ {'fieldWhitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'attachmentTypeBlacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

