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
class ORG_APACHE_JACKRABBIT_OAK_PLUGINS_DOCUMENT_SECONDARY_SECONDARY_STORE_CAC_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    included_paths: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    enable_async_observer: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    observer_queue_size: detachable CONFIG_NODE_PROPERTY_INTEGER 
      

feature -- Change Element  
 
    set_included_paths (a_name: like included_paths)
        -- Set 'included_paths' with 'a_name'.
      do
        included_paths := a_name
      ensure
        included_paths_set: included_paths = a_name		
      end

    set_enable_async_observer (a_name: like enable_async_observer)
        -- Set 'enable_async_observer' with 'a_name'.
      do
        enable_async_observer := a_name
      ensure
        enable_async_observer_set: enable_async_observer = a_name		
      end

    set_observer_queue_size (a_name: like observer_queue_size)
        -- Set 'observer_queue_size' with 'a_name'.
      do
        observer_queue_size := a_name
      ensure
        observer_queue_size_set: observer_queue_size = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ORG_APACHE_JACKRABBIT_OAK_PLUGINS_DOCUMENT_SECONDARY_SECONDARY_STORE_CAC_PROPERTIES%N")
        if attached included_paths as l_included_paths then
          Result.append ("%Nincluded_paths:")
          Result.append (l_included_paths.out)
          Result.append ("%N")    
        end  
        if attached enable_async_observer as l_enable_async_observer then
          Result.append ("%Nenable_async_observer:")
          Result.append (l_enable_async_observer.out)
          Result.append ("%N")    
        end  
        if attached observer_queue_size as l_observer_queue_size then
          Result.append ("%Nobserver_queue_size:")
          Result.append (l_observer_queue_size.out)
          Result.append ("%N")    
        end  
      end
end

