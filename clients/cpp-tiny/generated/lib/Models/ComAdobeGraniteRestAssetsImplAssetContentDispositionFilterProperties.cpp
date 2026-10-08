

#include "ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.h"

using namespace Tiny;

ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties()
{
	mimeallowEmpty = ConfigNodePropertyBoolean();
	mimeallowed = ConfigNodePropertyArray();
}

ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::~ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties()
{

}

void
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mimeallowEmptyKey = "mime.allowEmpty";

    if(object.has_key(mimeallowEmptyKey))
    {
        bourne::json value = object[mimeallowEmptyKey];




        ConfigNodePropertyBoolean* obj = &mimeallowEmpty;
		obj->fromJson(value.dump());

    }

    const char *mimeallowedKey = "mime.allowed";

    if(object.has_key(mimeallowedKey))
    {
        bourne::json value = object[mimeallowedKey];




        ConfigNodePropertyArray* obj = &mimeallowed;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["mimeallowEmpty"] = getMimeallowEmpty().toJson();






	object["mimeallowed"] = getMimeallowed().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::getMimeallowEmpty()
{
	return mimeallowEmpty;
}

void
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::setMimeallowEmpty(ConfigNodePropertyBoolean mimeallowEmpty)
{
	this->mimeallowEmpty = mimeallowEmpty;
}

ConfigNodePropertyArray
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::getMimeallowed()
{
	return mimeallowed;
}

void
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties::setMimeallowed(ConfigNodePropertyArray mimeallowed)
{
	this->mimeallowed = mimeallowed;
}



