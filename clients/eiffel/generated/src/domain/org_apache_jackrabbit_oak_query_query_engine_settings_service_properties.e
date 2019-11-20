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
class ORG_APACHE_JACKRABBIT_OAK_QUERY_QUERY_ENGINE_SETTINGS_SERVICE_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    query_limit_in_memory: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    query_limit_reads: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    query_fail_traversal: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    fast_query_size: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      

feature -- Change Element  
 
    set_query_limit_in_memory (a_name: like query_limit_in_memory)
        -- Set 'query_limit_in_memory' with 'a_name'.
      do
        query_limit_in_memory := a_name
      ensure
        query_limit_in_memory_set: query_limit_in_memory = a_name		
      end

    set_query_limit_reads (a_name: like query_limit_reads)
        -- Set 'query_limit_reads' with 'a_name'.
      do
        query_limit_reads := a_name
      ensure
        query_limit_reads_set: query_limit_reads = a_name		
      end

    set_query_fail_traversal (a_name: like query_fail_traversal)
        -- Set 'query_fail_traversal' with 'a_name'.
      do
        query_fail_traversal := a_name
      ensure
        query_fail_traversal_set: query_fail_traversal = a_name		
      end

    set_fast_query_size (a_name: like fast_query_size)
        -- Set 'fast_query_size' with 'a_name'.
      do
        fast_query_size := a_name
      ensure
        fast_query_size_set: fast_query_size = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ORG_APACHE_JACKRABBIT_OAK_QUERY_QUERY_ENGINE_SETTINGS_SERVICE_PROPERTIES%N")
        if attached query_limit_in_memory as l_query_limit_in_memory then
          Result.append ("%Nquery_limit_in_memory:")
          Result.append (l_query_limit_in_memory.out)
          Result.append ("%N")    
        end  
        if attached query_limit_reads as l_query_limit_reads then
          Result.append ("%Nquery_limit_reads:")
          Result.append (l_query_limit_reads.out)
          Result.append ("%N")    
        end  
        if attached query_fail_traversal as l_query_fail_traversal then
          Result.append ("%Nquery_fail_traversal:")
          Result.append (l_query_fail_traversal.out)
          Result.append ("%N")    
        end  
        if attached fast_query_size as l_fast_query_size then
          Result.append ("%Nfast_query_size:")
          Result.append (l_fast_query_size.out)
          Result.append ("%N")    
        end  
      end
end

