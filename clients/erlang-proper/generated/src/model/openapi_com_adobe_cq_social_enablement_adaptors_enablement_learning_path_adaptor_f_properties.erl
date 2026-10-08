-module(openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties/0]).

-export([openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties/1]).

-export_type([openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties/0]).

-type openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties() ::
  [ {'isMemberCheck', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties() ->
    openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties([]).

openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties(Fields) ->
  Default = [ {'isMemberCheck', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

