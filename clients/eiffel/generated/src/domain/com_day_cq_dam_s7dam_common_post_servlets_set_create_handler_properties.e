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
class COM_DAY_CQ_DAM_S7DAM_COMMON_POST_SERVLETS_SET_CREATE_HANDLER_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    sling_post_operation: detachable CONFIG_NODE_PROPERTY_STRING 
      
    sling_servlet_methods: detachable CONFIG_NODE_PROPERTY_STRING 
      

feature -- Change Element  
 
    set_sling_post_operation (a_name: like sling_post_operation)
        -- Set 'sling_post_operation' with 'a_name'.
      do
        sling_post_operation := a_name
      ensure
        sling_post_operation_set: sling_post_operation = a_name		
      end

    set_sling_servlet_methods (a_name: like sling_servlet_methods)
        -- Set 'sling_servlet_methods' with 'a_name'.
      do
        sling_servlet_methods := a_name
      ensure
        sling_servlet_methods_set: sling_servlet_methods = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_DAY_CQ_DAM_S7DAM_COMMON_POST_SERVLETS_SET_CREATE_HANDLER_PROPERTIES%N")
        if attached sling_post_operation as l_sling_post_operation then
          Result.append ("%Nsling_post_operation:")
          Result.append (l_sling_post_operation.out)
          Result.append ("%N")    
        end  
        if attached sling_servlet_methods as l_sling_servlet_methods then
          Result.append ("%Nsling_servlet_methods:")
          Result.append (l_sling_servlet_methods.out)
          Result.append ("%N")    
        end  
      end
end

