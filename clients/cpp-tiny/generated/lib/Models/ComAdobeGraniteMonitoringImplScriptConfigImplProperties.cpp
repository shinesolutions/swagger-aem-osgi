

#include "ComAdobeGraniteMonitoringImplScriptConfigImplProperties.h"

using namespace Tiny;

ComAdobeGraniteMonitoringImplScriptConfigImplProperties::ComAdobeGraniteMonitoringImplScriptConfigImplProperties()
{
	scriptfilename = ConfigNodePropertyString();
	scriptdisplay = ConfigNodePropertyString();
	scriptpath = ConfigNodePropertyString();
	scriptplatform = ConfigNodePropertyArray();
	interval = ConfigNodePropertyInteger();
	jmxdomain = ConfigNodePropertyString();
}

ComAdobeGraniteMonitoringImplScriptConfigImplProperties::ComAdobeGraniteMonitoringImplScriptConfigImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteMonitoringImplScriptConfigImplProperties::~ComAdobeGraniteMonitoringImplScriptConfigImplProperties()
{

}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *scriptfilenameKey = "script.filename";

    if(object.has_key(scriptfilenameKey))
    {
        bourne::json value = object[scriptfilenameKey];




        ConfigNodePropertyString* obj = &scriptfilename;
		obj->fromJson(value.dump());

    }

    const char *scriptdisplayKey = "script.display";

    if(object.has_key(scriptdisplayKey))
    {
        bourne::json value = object[scriptdisplayKey];




        ConfigNodePropertyString* obj = &scriptdisplay;
		obj->fromJson(value.dump());

    }

    const char *scriptpathKey = "script.path";

    if(object.has_key(scriptpathKey))
    {
        bourne::json value = object[scriptpathKey];




        ConfigNodePropertyString* obj = &scriptpath;
		obj->fromJson(value.dump());

    }

    const char *scriptplatformKey = "script.platform";

    if(object.has_key(scriptplatformKey))
    {
        bourne::json value = object[scriptplatformKey];




        ConfigNodePropertyArray* obj = &scriptplatform;
		obj->fromJson(value.dump());

    }

    const char *intervalKey = "interval";

    if(object.has_key(intervalKey))
    {
        bourne::json value = object[intervalKey];




        ConfigNodePropertyInteger* obj = &interval;
		obj->fromJson(value.dump());

    }

    const char *jmxdomainKey = "jmxdomain";

    if(object.has_key(jmxdomainKey))
    {
        bourne::json value = object[jmxdomainKey];




        ConfigNodePropertyString* obj = &jmxdomain;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["scriptfilename"] = getScriptfilename().toJson();






	object["scriptdisplay"] = getScriptdisplay().toJson();






	object["scriptpath"] = getScriptpath().toJson();






	object["scriptplatform"] = getScriptplatform().toJson();






	object["interval"] = getInterval().toJson();






	object["jmxdomain"] = getJmxdomain().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::getScriptfilename()
{
	return scriptfilename;
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::setScriptfilename(ConfigNodePropertyString scriptfilename)
{
	this->scriptfilename = scriptfilename;
}

ConfigNodePropertyString
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::getScriptdisplay()
{
	return scriptdisplay;
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::setScriptdisplay(ConfigNodePropertyString scriptdisplay)
{
	this->scriptdisplay = scriptdisplay;
}

ConfigNodePropertyString
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::getScriptpath()
{
	return scriptpath;
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::setScriptpath(ConfigNodePropertyString scriptpath)
{
	this->scriptpath = scriptpath;
}

ConfigNodePropertyArray
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::getScriptplatform()
{
	return scriptplatform;
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::setScriptplatform(ConfigNodePropertyArray scriptplatform)
{
	this->scriptplatform = scriptplatform;
}

ConfigNodePropertyInteger
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::getInterval()
{
	return interval;
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::setInterval(ConfigNodePropertyInteger interval)
{
	this->interval = interval;
}

ConfigNodePropertyString
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::getJmxdomain()
{
	return jmxdomain;
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::setJmxdomain(ConfigNodePropertyString jmxdomain)
{
	this->jmxdomain = jmxdomain;
}



