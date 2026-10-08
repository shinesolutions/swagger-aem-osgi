

#include "ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.h"

using namespace Tiny;

ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties()
{
	adaptercondition = ConfigNodePropertyString();
	taskmanageradmingroups = ConfigNodePropertyArray();
}

ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::~ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties()
{

}

void
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *adapterconditionKey = "adapter.condition";

    if(object.has_key(adapterconditionKey))
    {
        bourne::json value = object[adapterconditionKey];




        ConfigNodePropertyString* obj = &adaptercondition;
		obj->fromJson(value.dump());

    }

    const char *taskmanageradmingroupsKey = "taskmanager.admingroups";

    if(object.has_key(taskmanageradmingroupsKey))
    {
        bourne::json value = object[taskmanageradmingroupsKey];




        ConfigNodePropertyArray* obj = &taskmanageradmingroups;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["adaptercondition"] = getAdaptercondition().toJson();






	object["taskmanageradmingroups"] = getTaskmanageradmingroups().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::getAdaptercondition()
{
	return adaptercondition;
}

void
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::setAdaptercondition(ConfigNodePropertyString adaptercondition)
{
	this->adaptercondition = adaptercondition;
}

ConfigNodePropertyArray
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::getTaskmanageradmingroups()
{
	return taskmanageradmingroups;
}

void
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::setTaskmanageradmingroups(ConfigNodePropertyArray taskmanageradmingroups)
{
	this->taskmanageradmingroups = taskmanageradmingroups;
}



