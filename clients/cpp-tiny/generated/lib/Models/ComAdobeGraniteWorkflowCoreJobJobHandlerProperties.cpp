

#include "ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::ComAdobeGraniteWorkflowCoreJobJobHandlerProperties()
{
	jobtopics = ConfigNodePropertyArray();
	allowselfprocesstermination = ConfigNodePropertyBoolean();
}

ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::ComAdobeGraniteWorkflowCoreJobJobHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::~ComAdobeGraniteWorkflowCoreJobJobHandlerProperties()
{

}

void
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *jobtopicsKey = "job.topics";

    if(object.has_key(jobtopicsKey))
    {
        bourne::json value = object[jobtopicsKey];




        ConfigNodePropertyArray* obj = &jobtopics;
		obj->fromJson(value.dump());

    }

    const char *allowselfprocessterminationKey = "allow.self.process.termination";

    if(object.has_key(allowselfprocessterminationKey))
    {
        bourne::json value = object[allowselfprocessterminationKey];




        ConfigNodePropertyBoolean* obj = &allowselfprocesstermination;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["jobtopics"] = getJobtopics().toJson();






	object["allowselfprocesstermination"] = getAllowselfprocesstermination().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::getJobtopics()
{
	return jobtopics;
}

void
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::setJobtopics(ConfigNodePropertyArray jobtopics)
{
	this->jobtopics = jobtopics;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::getAllowselfprocesstermination()
{
	return allowselfprocesstermination;
}

void
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::setAllowselfprocesstermination(ConfigNodePropertyBoolean allowselfprocesstermination)
{
	this->allowselfprocesstermination = allowselfprocesstermination;
}



