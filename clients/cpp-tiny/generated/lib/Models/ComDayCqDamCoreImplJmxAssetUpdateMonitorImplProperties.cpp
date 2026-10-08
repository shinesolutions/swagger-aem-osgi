

#include "ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties()
{
	jmxobjectname = ConfigNodePropertyString();
	active = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::~ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties()
{

}

void
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *jmxobjectnameKey = "jmx.objectname";

    if(object.has_key(jmxobjectnameKey))
    {
        bourne::json value = object[jmxobjectnameKey];




        ConfigNodePropertyString* obj = &jmxobjectname;
		obj->fromJson(value.dump());

    }

    const char *activeKey = "active";

    if(object.has_key(activeKey))
    {
        bourne::json value = object[activeKey];




        ConfigNodePropertyBoolean* obj = &active;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["jmxobjectname"] = getJmxobjectname().toJson();






	object["active"] = getActive().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::getJmxobjectname()
{
	return jmxobjectname;
}

void
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::setJmxobjectname(ConfigNodePropertyString jmxobjectname)
{
	this->jmxobjectname = jmxobjectname;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::getActive()
{
	return active;
}

void
ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties::setActive(ConfigNodePropertyBoolean active)
{
	this->active = active;
}



