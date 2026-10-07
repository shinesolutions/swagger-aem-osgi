-module(openapi_org_apache_sling_engine_parameters_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_engine_parameters_properties/0]).

-type openapi_org_apache_sling_engine_parameters_properties() ::
    #{ 'sling_default_parameter_encoding' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_default_max_parameters' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'file_location' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'file_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'file_max' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'request_max' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'sling_default_parameter_checkForAdditionalContainerParameters' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'sling_default_parameter_encoding' := SlingDefaultParameterEncoding,
          'sling_default_max_parameters' := SlingDefaultMaxParameters,
          'file_location' := FileLocation,
          'file_threshold' := FileThreshold,
          'file_max' := FileMax,
          'request_max' := RequestMax,
          'sling_default_parameter_checkForAdditionalContainerParameters' := SlingDefaultParameterCheckForAdditionalContainerParameters
        }) ->
    #{ 'sling.default.parameter.encoding' => SlingDefaultParameterEncoding,
       'sling.default.max.parameters' => SlingDefaultMaxParameters,
       'file.location' => FileLocation,
       'file.threshold' => FileThreshold,
       'file.max' => FileMax,
       'request.max' => RequestMax,
       'sling.default.parameter.checkForAdditionalContainerParameters' => SlingDefaultParameterCheckForAdditionalContainerParameters
     }.
