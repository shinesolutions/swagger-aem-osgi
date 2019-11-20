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
class COM_DAY_CQ_COMMONS_IMPL_EXTERNALIZER_IMPL_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    externalizer_domains: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    externalizer_host: detachable CONFIG_NODE_PROPERTY_STRING 
      
    externalizer_contextpath: detachable CONFIG_NODE_PROPERTY_STRING 
      
    externalizer_encodedpath: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      

feature -- Change Element  
 
    set_externalizer_domains (a_name: like externalizer_domains)
        -- Set 'externalizer_domains' with 'a_name'.
      do
        externalizer_domains := a_name
      ensure
        externalizer_domains_set: externalizer_domains = a_name		
      end

    set_externalizer_host (a_name: like externalizer_host)
        -- Set 'externalizer_host' with 'a_name'.
      do
        externalizer_host := a_name
      ensure
        externalizer_host_set: externalizer_host = a_name		
      end

    set_externalizer_contextpath (a_name: like externalizer_contextpath)
        -- Set 'externalizer_contextpath' with 'a_name'.
      do
        externalizer_contextpath := a_name
      ensure
        externalizer_contextpath_set: externalizer_contextpath = a_name		
      end

    set_externalizer_encodedpath (a_name: like externalizer_encodedpath)
        -- Set 'externalizer_encodedpath' with 'a_name'.
      do
        externalizer_encodedpath := a_name
      ensure
        externalizer_encodedpath_set: externalizer_encodedpath = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_DAY_CQ_COMMONS_IMPL_EXTERNALIZER_IMPL_PROPERTIES%N")
        if attached externalizer_domains as l_externalizer_domains then
          Result.append ("%Nexternalizer_domains:")
          Result.append (l_externalizer_domains.out)
          Result.append ("%N")    
        end  
        if attached externalizer_host as l_externalizer_host then
          Result.append ("%Nexternalizer_host:")
          Result.append (l_externalizer_host.out)
          Result.append ("%N")    
        end  
        if attached externalizer_contextpath as l_externalizer_contextpath then
          Result.append ("%Nexternalizer_contextpath:")
          Result.append (l_externalizer_contextpath.out)
          Result.append ("%N")    
        end  
        if attached externalizer_encodedpath as l_externalizer_encodedpath then
          Result.append ("%Nexternalizer_encodedpath:")
          Result.append (l_externalizer_encodedpath.out)
          Result.append ("%N")    
        end  
      end
end

