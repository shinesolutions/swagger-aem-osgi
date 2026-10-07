

#include "ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties()
{
	isEnabled = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::~ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties()
{

}

void
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *isEnabledKey = "isEnabled";

    if(object.has_key(isEnabledKey))
    {
        bourne::json value = object[isEnabledKey];




        ConfigNodePropertyBoolean* obj = &isEnabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["isEnabled"] = getIsEnabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::getIsEnabled()
{
	return isEnabled;
}

void
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::setIsEnabled(ConfigNodePropertyBoolean isEnabled)
{
	this->isEnabled = isEnabled;
}



