-module(openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties/0]).

-export([openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties/1]).

-export_type([openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties/0]).

-type openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties() ::
  [ {'formsManagerConfig_includeOOTBTemplates', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'formsManagerConfig_includeDeprecatedTemplates', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties() ->
    openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties([]).

openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties(Fields) ->
  Default = [ {'formsManagerConfig.includeOOTBTemplates', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'formsManagerConfig.includeDeprecatedTemplates', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

