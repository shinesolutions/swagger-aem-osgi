

#include "ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.h"

using namespace Tiny;

ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties()
{
	cqdamscene7assetmimetypeservicemapping = ConfigNodePropertyArray();
}

ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::~ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties()
{

}

void
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamscene7assetmimetypeservicemappingKey = "cq.dam.scene7.assetmimetypeservice.mapping";

    if(object.has_key(cqdamscene7assetmimetypeservicemappingKey))
    {
        bourne::json value = object[cqdamscene7assetmimetypeservicemappingKey];




        ConfigNodePropertyArray* obj = &cqdamscene7assetmimetypeservicemapping;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamscene7assetmimetypeservicemapping"] = getCqdamscene7assetmimetypeservicemapping().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::getCqdamscene7assetmimetypeservicemapping()
{
	return cqdamscene7assetmimetypeservicemapping;
}

void
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::setCqdamscene7assetmimetypeservicemapping(ConfigNodePropertyArray cqdamscene7assetmimetypeservicemapping)
{
	this->cqdamscene7assetmimetypeservicemapping = cqdamscene7assetmimetypeservicemapping;
}



