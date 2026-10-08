

#include "ComDayCqDamCoreImplServletAssetDownloadServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletAssetDownloadServletProperties::ComDayCqDamCoreImplServletAssetDownloadServletProperties()
{
	enabled = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplServletAssetDownloadServletProperties::ComDayCqDamCoreImplServletAssetDownloadServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletAssetDownloadServletProperties::~ComDayCqDamCoreImplServletAssetDownloadServletProperties()
{

}

void
ComDayCqDamCoreImplServletAssetDownloadServletProperties::fromJson(std::string jsonObj)
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
ComDayCqDamCoreImplServletAssetDownloadServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplServletAssetDownloadServletProperties::getEnabled()
{
	return enabled;
}

void
ComDayCqDamCoreImplServletAssetDownloadServletProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}



