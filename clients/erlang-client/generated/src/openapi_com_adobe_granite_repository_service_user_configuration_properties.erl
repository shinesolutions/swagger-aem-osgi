-module(openapi_com_adobe_granite_repository_service_user_configuration_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_repository_service_user_configuration_properties/0]).

-type openapi_com_adobe_granite_repository_service_user_configuration_properties() ::
    #{ 'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'serviceusers_simpleSubjectPopulation' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'serviceusers_list' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'service_ranking' := ServiceRanking,
          'serviceusers_simpleSubjectPopulation' := ServiceusersSimpleSubjectPopulation,
          'serviceusers_list' := ServiceusersList
        }) ->
    #{ 'service.ranking' => ServiceRanking,
       'serviceusers.simpleSubjectPopulation' => ServiceusersSimpleSubjectPopulation,
       'serviceusers.list' => ServiceusersList
     }.
