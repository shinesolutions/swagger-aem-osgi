

#include "ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties()
{
	contentReferenceConfigresourceTypes = ConfigNodePropertyArray();
}

ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::~ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties()
{

}

void
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *contentReferenceConfigresourceTypesKey = "contentReferenceConfig.resourceTypes";

    if(object.has_key(contentReferenceConfigresourceTypesKey))
    {
        bourne::json value = object[contentReferenceConfigresourceTypesKey];




        ConfigNodePropertyArray* obj = &contentReferenceConfigresourceTypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["contentReferenceConfigresourceTypes"] = getContentReferenceConfigresourceTypes().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::getContentReferenceConfigresourceTypes()
{
	return contentReferenceConfigresourceTypes;
}

void
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::setContentReferenceConfigresourceTypes(ConfigNodePropertyArray contentReferenceConfigresourceTypes)
{
	this->contentReferenceConfigresourceTypes = contentReferenceConfigresourceTypes;
}



