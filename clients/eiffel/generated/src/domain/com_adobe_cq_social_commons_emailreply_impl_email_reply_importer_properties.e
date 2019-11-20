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
class COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_EMAIL_REPLY_IMPORTER_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    connect_protocol: detachable CONFIG_NODE_PROPERTY_DROP_DOWN 
      

feature -- Change Element  
 
    set_connect_protocol (a_name: like connect_protocol)
        -- Set 'connect_protocol' with 'a_name'.
      do
        connect_protocol := a_name
      ensure
        connect_protocol_set: connect_protocol = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_CQ_SOCIAL_COMMONS_EMAILREPLY_IMPL_EMAIL_REPLY_IMPORTER_PROPERTIES%N")
        if attached connect_protocol as l_connect_protocol then
          Result.append ("%Nconnect_protocol:")
          Result.append (l_connect_protocol.out)
          Result.append ("%N")    
        end  
      end
end

