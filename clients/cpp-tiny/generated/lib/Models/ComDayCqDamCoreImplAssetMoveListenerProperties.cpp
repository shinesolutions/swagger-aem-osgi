

#include "ComDayCqDamCoreImplAssetMoveListenerProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplAssetMoveListenerProperties::ComDayCqDamCoreImplAssetMoveListenerProperties()
{
	enabled = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplAssetMoveListenerProperties::ComDayCqDamCoreImplAssetMoveListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplAssetMoveListenerProperties::~ComDayCqDamCoreImplAssetMoveListenerProperties()
{

}

void
ComDayCqDamCoreImplAssetMoveListenerProperties::fromJson(std::string jsonObj)
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
ComDayCqDamCoreImplAssetMoveListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplAssetMoveListenerProperties::getEnabled()
{
	return enabled;
}

void
ComDayCqDamCoreImplAssetMoveListenerProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}



