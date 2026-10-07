

#include "ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.h"

using namespace Tiny;

ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties::ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties()
{
	schedulerexpression = ConfigNodePropertyString();
}

ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties::ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties::~ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties()
{

}

void
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerexpressionKey = "scheduler.expression";

    if(object.has_key(schedulerexpressionKey))
    {
        bourne::json value = object[schedulerexpressionKey];




        ConfigNodePropertyString* obj = &schedulerexpression;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerexpression"] = getSchedulerexpression().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties::setSchedulerexpression(ConfigNodePropertyString schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}



