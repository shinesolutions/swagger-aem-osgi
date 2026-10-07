

#include "ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.h"

using namespace Tiny;

ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties()
{
	adaptercondition = ConfigNodePropertyString();
}

ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::~ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties()
{

}

void
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *adapterconditionKey = "adapter.condition";

    if(object.has_key(adapterconditionKey))
    {
        bourne::json value = object[adapterconditionKey];




        ConfigNodePropertyString* obj = &adaptercondition;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["adaptercondition"] = getAdaptercondition().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::getAdaptercondition()
{
	return adaptercondition;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::setAdaptercondition(ConfigNodePropertyString adaptercondition)
{
	this->adaptercondition = adaptercondition;
}



