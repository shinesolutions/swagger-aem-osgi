

#include "ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties()
{
	jobtopics = ConfigNodePropertyString();
}

ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::~ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties()
{

}

void
ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *jobtopicsKey = "job.topics";

    if(object.has_key(jobtopicsKey))
    {
        bourne::json value = object[jobtopicsKey];




        ConfigNodePropertyString* obj = &jobtopics;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["jobtopics"] = getJobtopics().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::getJobtopics()
{
	return jobtopics;
}

void
ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::setJobtopics(ConfigNodePropertyString jobtopics)
{
	this->jobtopics = jobtopics;
}



