-module(openapi_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties/0]).

-export([openapi_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties/1]).

-export_type([openapi_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties/0]).

-type openapi_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties() ::
  [ {'tempStorageConfig', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties() ->
    openapi_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties([]).

openapi_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties(Fields) ->
  Default = [ {'tempStorageConfig', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

