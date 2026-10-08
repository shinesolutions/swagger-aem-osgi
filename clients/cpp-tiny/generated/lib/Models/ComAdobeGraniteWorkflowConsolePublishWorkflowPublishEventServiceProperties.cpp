

#include "ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.h"

using namespace Tiny;

ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties()
{
	graniteworkflowWorkflowPublishEventServiceenabled = ConfigNodePropertyBoolean();
}

ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::~ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties()
{

}

void
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *graniteworkflowWorkflowPublishEventServiceenabledKey = "granite.workflow.WorkflowPublishEventService.enabled";

    if(object.has_key(graniteworkflowWorkflowPublishEventServiceenabledKey))
    {
        bourne::json value = object[graniteworkflowWorkflowPublishEventServiceenabledKey];




        ConfigNodePropertyBoolean* obj = &graniteworkflowWorkflowPublishEventServiceenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["graniteworkflowWorkflowPublishEventServiceenabled"] = getGraniteworkflowWorkflowPublishEventServiceenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::getGraniteworkflowWorkflowPublishEventServiceenabled()
{
	return graniteworkflowWorkflowPublishEventServiceenabled;
}

void
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::setGraniteworkflowWorkflowPublishEventServiceenabled(ConfigNodePropertyBoolean graniteworkflowWorkflowPublishEventServiceenabled)
{
	this->graniteworkflowWorkflowPublishEventServiceenabled = graniteworkflowWorkflowPublishEventServiceenabled;
}



