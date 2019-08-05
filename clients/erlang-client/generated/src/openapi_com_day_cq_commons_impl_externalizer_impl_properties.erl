-module(openapi_com_day_cq_commons_impl_externalizer_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_commons_impl_externalizer_impl_properties/0]).

-type openapi_com_day_cq_commons_impl_externalizer_impl_properties() ::
    #{ 'externalizer_domains' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'externalizer_host' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'externalizer_contextpath' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'externalizer_encodedpath' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'externalizer_domains' := ExternalizerDomains,
          'externalizer_host' := ExternalizerHost,
          'externalizer_contextpath' := ExternalizerContextpath,
          'externalizer_encodedpath' := ExternalizerEncodedpath
        }) ->
    #{ 'externalizer.domains' => ExternalizerDomains,
       'externalizer.host' => ExternalizerHost,
       'externalizer.contextpath' => ExternalizerContextpath,
       'externalizer.encodedpath' => ExternalizerEncodedpath
     }.
