

#include "ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties()
{
	cqdamdetectassetmimefromcontent = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::~ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties()
{

}

void
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamdetectassetmimefromcontentKey = "cq.dam.detect.asset.mime.from.content";

    if(object.has_key(cqdamdetectassetmimefromcontentKey))
    {
        bourne::json value = object[cqdamdetectassetmimefromcontentKey];




        ConfigNodePropertyBoolean* obj = &cqdamdetectassetmimefromcontent;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamdetectassetmimefromcontent"] = getCqdamdetectassetmimefromcontent().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::getCqdamdetectassetmimefromcontent()
{
	return cqdamdetectassetmimefromcontent;
}

void
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::setCqdamdetectassetmimefromcontent(ConfigNodePropertyBoolean cqdamdetectassetmimefromcontent)
{
	this->cqdamdetectassetmimefromcontent = cqdamdetectassetmimefromcontent;
}



