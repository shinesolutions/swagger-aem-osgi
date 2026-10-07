-module(openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info/0]).

-type openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties:openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties(),
       'additionalProperties' => binary(),
       'bundle_location' => binary(),
       'service_location' => binary()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties,
          'additionalProperties' := AdditionalProperties,
          'bundle_location' := BundleLocation,
          'service_location' := ServiceLocation
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties,
       'additionalProperties' => AdditionalProperties,
       'bundle_location' => BundleLocation,
       'service_location' => ServiceLocation
     }.
