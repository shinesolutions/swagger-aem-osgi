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
class COM_ADOBE_CQ_WCM_JOBS_ASYNC_IMPL_ASYNC_MOVE_CONFIG_PROVIDER_SERVICE_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    threshold: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    job_topic_name: detachable CONFIG_NODE_PROPERTY_STRING 
      
    email_enabled: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      

feature -- Change Element  
 
    set_threshold (a_name: like threshold)
        -- Set 'threshold' with 'a_name'.
      do
        threshold := a_name
      ensure
        threshold_set: threshold = a_name		
      end

    set_job_topic_name (a_name: like job_topic_name)
        -- Set 'job_topic_name' with 'a_name'.
      do
        job_topic_name := a_name
      ensure
        job_topic_name_set: job_topic_name = a_name		
      end

    set_email_enabled (a_name: like email_enabled)
        -- Set 'email_enabled' with 'a_name'.
      do
        email_enabled := a_name
      ensure
        email_enabled_set: email_enabled = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_CQ_WCM_JOBS_ASYNC_IMPL_ASYNC_MOVE_CONFIG_PROVIDER_SERVICE_PROPERTIES%N")
        if attached threshold as l_threshold then
          Result.append ("%Nthreshold:")
          Result.append (l_threshold.out)
          Result.append ("%N")    
        end  
        if attached job_topic_name as l_job_topic_name then
          Result.append ("%Njob_topic_name:")
          Result.append (l_job_topic_name.out)
          Result.append ("%N")    
        end  
        if attached email_enabled as l_email_enabled then
          Result.append ("%Nemail_enabled:")
          Result.append (l_email_enabled.out)
          Result.append ("%N")    
        end  
      end
end

