

#include "ComDayCqDamCoreImplServletCreateAssetServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletCreateAssetServletProperties::ComDayCqDamCoreImplServletCreateAssetServletProperties()
{
	detect_duplicate = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplServletCreateAssetServletProperties::ComDayCqDamCoreImplServletCreateAssetServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletCreateAssetServletProperties::~ComDayCqDamCoreImplServletCreateAssetServletProperties()
{

}

void
ComDayCqDamCoreImplServletCreateAssetServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *detect_duplicateKey = "detect_duplicate";

    if(object.has_key(detect_duplicateKey))
    {
        bourne::json value = object[detect_duplicateKey];




        ConfigNodePropertyBoolean* obj = &detect_duplicate;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletCreateAssetServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["detect_duplicate"] = getDetectDuplicate().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplServletCreateAssetServletProperties::getDetectDuplicate()
{
	return detect_duplicate;
}

void
ComDayCqDamCoreImplServletCreateAssetServletProperties::setDetectDuplicate(ConfigNodePropertyBoolean detect_duplicate)
{
	this->detect_duplicate = detect_duplicate;
}



