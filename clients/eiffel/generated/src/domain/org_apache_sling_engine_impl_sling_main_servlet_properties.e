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
class ORG_APACHE_SLING_ENGINE_IMPL_SLING_MAIN_SERVLET_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    sling_max_calls: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    sling_max_inclusions: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    sling_trace_allow: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    sling_max_record_requests: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    sling_store_pattern_requests: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    sling_serverinfo: detachable CONFIG_NODE_PROPERTY_STRING 
      
    sling_additional_response_headers: detachable CONFIG_NODE_PROPERTY_ARRAY 
      

feature -- Change Element  
 
    set_sling_max_calls (a_name: like sling_max_calls)
        -- Set 'sling_max_calls' with 'a_name'.
      do
        sling_max_calls := a_name
      ensure
        sling_max_calls_set: sling_max_calls = a_name		
      end

    set_sling_max_inclusions (a_name: like sling_max_inclusions)
        -- Set 'sling_max_inclusions' with 'a_name'.
      do
        sling_max_inclusions := a_name
      ensure
        sling_max_inclusions_set: sling_max_inclusions = a_name		
      end

    set_sling_trace_allow (a_name: like sling_trace_allow)
        -- Set 'sling_trace_allow' with 'a_name'.
      do
        sling_trace_allow := a_name
      ensure
        sling_trace_allow_set: sling_trace_allow = a_name		
      end

    set_sling_max_record_requests (a_name: like sling_max_record_requests)
        -- Set 'sling_max_record_requests' with 'a_name'.
      do
        sling_max_record_requests := a_name
      ensure
        sling_max_record_requests_set: sling_max_record_requests = a_name		
      end

    set_sling_store_pattern_requests (a_name: like sling_store_pattern_requests)
        -- Set 'sling_store_pattern_requests' with 'a_name'.
      do
        sling_store_pattern_requests := a_name
      ensure
        sling_store_pattern_requests_set: sling_store_pattern_requests = a_name		
      end

    set_sling_serverinfo (a_name: like sling_serverinfo)
        -- Set 'sling_serverinfo' with 'a_name'.
      do
        sling_serverinfo := a_name
      ensure
        sling_serverinfo_set: sling_serverinfo = a_name		
      end

    set_sling_additional_response_headers (a_name: like sling_additional_response_headers)
        -- Set 'sling_additional_response_headers' with 'a_name'.
      do
        sling_additional_response_headers := a_name
      ensure
        sling_additional_response_headers_set: sling_additional_response_headers = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ORG_APACHE_SLING_ENGINE_IMPL_SLING_MAIN_SERVLET_PROPERTIES%N")
        if attached sling_max_calls as l_sling_max_calls then
          Result.append ("%Nsling_max_calls:")
          Result.append (l_sling_max_calls.out)
          Result.append ("%N")    
        end  
        if attached sling_max_inclusions as l_sling_max_inclusions then
          Result.append ("%Nsling_max_inclusions:")
          Result.append (l_sling_max_inclusions.out)
          Result.append ("%N")    
        end  
        if attached sling_trace_allow as l_sling_trace_allow then
          Result.append ("%Nsling_trace_allow:")
          Result.append (l_sling_trace_allow.out)
          Result.append ("%N")    
        end  
        if attached sling_max_record_requests as l_sling_max_record_requests then
          Result.append ("%Nsling_max_record_requests:")
          Result.append (l_sling_max_record_requests.out)
          Result.append ("%N")    
        end  
        if attached sling_store_pattern_requests as l_sling_store_pattern_requests then
          Result.append ("%Nsling_store_pattern_requests:")
          Result.append (l_sling_store_pattern_requests.out)
          Result.append ("%N")    
        end  
        if attached sling_serverinfo as l_sling_serverinfo then
          Result.append ("%Nsling_serverinfo:")
          Result.append (l_sling_serverinfo.out)
          Result.append ("%N")    
        end  
        if attached sling_additional_response_headers as l_sling_additional_response_headers then
          Result.append ("%Nsling_additional_response_headers:")
          Result.append (l_sling_additional_response_headers.out)
          Result.append ("%N")    
        end  
      end
end

