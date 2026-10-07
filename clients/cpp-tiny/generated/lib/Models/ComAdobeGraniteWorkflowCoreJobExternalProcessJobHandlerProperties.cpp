

#include "ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties()
{
	defaulttimeout = ConfigNodePropertyInteger();
	maxtimeout = ConfigNodePropertyInteger();
	defaultperiod = ConfigNodePropertyInteger();
}

ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::~ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties()
{

}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *defaulttimeoutKey = "default.timeout";

    if(object.has_key(defaulttimeoutKey))
    {
        bourne::json value = object[defaulttimeoutKey];




        ConfigNodePropertyInteger* obj = &defaulttimeout;
		obj->fromJson(value.dump());

    }

    const char *maxtimeoutKey = "max.timeout";

    if(object.has_key(maxtimeoutKey))
    {
        bourne::json value = object[maxtimeoutKey];




        ConfigNodePropertyInteger* obj = &maxtimeout;
		obj->fromJson(value.dump());

    }

    const char *defaultperiodKey = "default.period";

    if(object.has_key(defaultperiodKey))
    {
        bourne::json value = object[defaultperiodKey];




        ConfigNodePropertyInteger* obj = &defaultperiod;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["defaulttimeout"] = getDefaulttimeout().toJson();






	object["maxtimeout"] = getMaxtimeout().toJson();






	object["defaultperiod"] = getDefaultperiod().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::getDefaulttimeout()
{
	return defaulttimeout;
}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::setDefaulttimeout(ConfigNodePropertyInteger defaulttimeout)
{
	this->defaulttimeout = defaulttimeout;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::getMaxtimeout()
{
	return maxtimeout;
}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::setMaxtimeout(ConfigNodePropertyInteger maxtimeout)
{
	this->maxtimeout = maxtimeout;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::getDefaultperiod()
{
	return defaultperiod;
}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::setDefaultperiod(ConfigNodePropertyInteger defaultperiod)
{
	this->defaultperiod = defaultperiod;
}



