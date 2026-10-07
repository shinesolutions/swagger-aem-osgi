

#include "ComDayCqWcmCoreImplWCMDebugFilterProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplWCMDebugFilterProperties::ComDayCqWcmCoreImplWCMDebugFilterProperties()
{
	wcmdbgfilterenabled = ConfigNodePropertyBoolean();
	wcmdbgfilterjspDebug = ConfigNodePropertyBoolean();
}

ComDayCqWcmCoreImplWCMDebugFilterProperties::ComDayCqWcmCoreImplWCMDebugFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplWCMDebugFilterProperties::~ComDayCqWcmCoreImplWCMDebugFilterProperties()
{

}

void
ComDayCqWcmCoreImplWCMDebugFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *wcmdbgfilterenabledKey = "wcmdbgfilter.enabled";

    if(object.has_key(wcmdbgfilterenabledKey))
    {
        bourne::json value = object[wcmdbgfilterenabledKey];




        ConfigNodePropertyBoolean* obj = &wcmdbgfilterenabled;
		obj->fromJson(value.dump());

    }

    const char *wcmdbgfilterjspDebugKey = "wcmdbgfilter.jspDebug";

    if(object.has_key(wcmdbgfilterjspDebugKey))
    {
        bourne::json value = object[wcmdbgfilterjspDebugKey];




        ConfigNodePropertyBoolean* obj = &wcmdbgfilterjspDebug;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplWCMDebugFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["wcmdbgfilterenabled"] = getWcmdbgfilterenabled().toJson();






	object["wcmdbgfilterjspDebug"] = getWcmdbgfilterjspDebug().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplWCMDebugFilterProperties::getWcmdbgfilterenabled()
{
	return wcmdbgfilterenabled;
}

void
ComDayCqWcmCoreImplWCMDebugFilterProperties::setWcmdbgfilterenabled(ConfigNodePropertyBoolean wcmdbgfilterenabled)
{
	this->wcmdbgfilterenabled = wcmdbgfilterenabled;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplWCMDebugFilterProperties::getWcmdbgfilterjspDebug()
{
	return wcmdbgfilterjspDebug;
}

void
ComDayCqWcmCoreImplWCMDebugFilterProperties::setWcmdbgfilterjspDebug(ConfigNodePropertyBoolean wcmdbgfilterjspDebug)
{
	this->wcmdbgfilterjspDebug = wcmdbgfilterjspDebug;
}



