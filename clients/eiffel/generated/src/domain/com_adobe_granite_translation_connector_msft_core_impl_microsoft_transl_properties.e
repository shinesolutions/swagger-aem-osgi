note
 description:"[
		Adobe Experience Manager OSGI config (AEM) API
 		Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
  		OpenAPI spec version: 1.0.0-pre.0
 	    Contact: opensource@shinesolutions.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class COM_ADOBE_GRANITE_TRANSLATION_CONNECTOR_MSFT_CORE_IMPL_MICROSOFT_TRANSL_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    translation_factory: detachable CONFIG_NODE_PROPERTY_STRING 
      
    default_connector_label: detachable CONFIG_NODE_PROPERTY_STRING 
      
    default_connector_attribution: detachable CONFIG_NODE_PROPERTY_STRING 
      
    default_connector_workspace_id: detachable CONFIG_NODE_PROPERTY_STRING 
      
    default_connector_subscription_key: detachable CONFIG_NODE_PROPERTY_STRING 
      
    language_map_location: detachable CONFIG_NODE_PROPERTY_STRING 
      
    category_map_location: detachable CONFIG_NODE_PROPERTY_STRING 
      
    retry_attempts: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    timeout_count: detachable CONFIG_NODE_PROPERTY_INTEGER 
      

feature -- Change Element  
 
    set_translation_factory (a_name: like translation_factory)
        -- Set 'translation_factory' with 'a_name'.
      do
        translation_factory := a_name
      ensure
        translation_factory_set: translation_factory = a_name		
      end

    set_default_connector_label (a_name: like default_connector_label)
        -- Set 'default_connector_label' with 'a_name'.
      do
        default_connector_label := a_name
      ensure
        default_connector_label_set: default_connector_label = a_name		
      end

    set_default_connector_attribution (a_name: like default_connector_attribution)
        -- Set 'default_connector_attribution' with 'a_name'.
      do
        default_connector_attribution := a_name
      ensure
        default_connector_attribution_set: default_connector_attribution = a_name		
      end

    set_default_connector_workspace_id (a_name: like default_connector_workspace_id)
        -- Set 'default_connector_workspace_id' with 'a_name'.
      do
        default_connector_workspace_id := a_name
      ensure
        default_connector_workspace_id_set: default_connector_workspace_id = a_name		
      end

    set_default_connector_subscription_key (a_name: like default_connector_subscription_key)
        -- Set 'default_connector_subscription_key' with 'a_name'.
      do
        default_connector_subscription_key := a_name
      ensure
        default_connector_subscription_key_set: default_connector_subscription_key = a_name		
      end

    set_language_map_location (a_name: like language_map_location)
        -- Set 'language_map_location' with 'a_name'.
      do
        language_map_location := a_name
      ensure
        language_map_location_set: language_map_location = a_name		
      end

    set_category_map_location (a_name: like category_map_location)
        -- Set 'category_map_location' with 'a_name'.
      do
        category_map_location := a_name
      ensure
        category_map_location_set: category_map_location = a_name		
      end

    set_retry_attempts (a_name: like retry_attempts)
        -- Set 'retry_attempts' with 'a_name'.
      do
        retry_attempts := a_name
      ensure
        retry_attempts_set: retry_attempts = a_name		
      end

    set_timeout_count (a_name: like timeout_count)
        -- Set 'timeout_count' with 'a_name'.
      do
        timeout_count := a_name
      ensure
        timeout_count_set: timeout_count = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_GRANITE_TRANSLATION_CONNECTOR_MSFT_CORE_IMPL_MICROSOFT_TRANSL_PROPERTIES%N")
        if attached translation_factory as l_translation_factory then
          Result.append ("%Ntranslation_factory:")
          Result.append (l_translation_factory.out)
          Result.append ("%N")    
        end  
        if attached default_connector_label as l_default_connector_label then
          Result.append ("%Ndefault_connector_label:")
          Result.append (l_default_connector_label.out)
          Result.append ("%N")    
        end  
        if attached default_connector_attribution as l_default_connector_attribution then
          Result.append ("%Ndefault_connector_attribution:")
          Result.append (l_default_connector_attribution.out)
          Result.append ("%N")    
        end  
        if attached default_connector_workspace_id as l_default_connector_workspace_id then
          Result.append ("%Ndefault_connector_workspace_id:")
          Result.append (l_default_connector_workspace_id.out)
          Result.append ("%N")    
        end  
        if attached default_connector_subscription_key as l_default_connector_subscription_key then
          Result.append ("%Ndefault_connector_subscription_key:")
          Result.append (l_default_connector_subscription_key.out)
          Result.append ("%N")    
        end  
        if attached language_map_location as l_language_map_location then
          Result.append ("%Nlanguage_map_location:")
          Result.append (l_language_map_location.out)
          Result.append ("%N")    
        end  
        if attached category_map_location as l_category_map_location then
          Result.append ("%Ncategory_map_location:")
          Result.append (l_category_map_location.out)
          Result.append ("%N")    
        end  
        if attached retry_attempts as l_retry_attempts then
          Result.append ("%Nretry_attempts:")
          Result.append (l_retry_attempts.out)
          Result.append ("%N")    
        end  
        if attached timeout_count as l_timeout_count then
          Result.append ("%Ntimeout_count:")
          Result.append (l_timeout_count.out)
          Result.append ("%N")    
        end  
      end
end

