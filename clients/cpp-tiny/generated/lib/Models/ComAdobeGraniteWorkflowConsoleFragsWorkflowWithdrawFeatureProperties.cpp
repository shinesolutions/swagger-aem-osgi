

#include "ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties.h"

using namespace Tiny;

ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties::ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties()
{
	enabled = ConfigNodePropertyBoolean();
}

ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties::ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties::~ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties()
{

}

void
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}



