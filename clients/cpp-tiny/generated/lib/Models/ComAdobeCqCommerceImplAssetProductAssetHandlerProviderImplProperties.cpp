

#include "ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.h"

using namespace Tiny;

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties()
{
	cqcommerceassethandlerfallback = ConfigNodePropertyString();
}

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::~ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties()
{

}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqcommerceassethandlerfallbackKey = "cq.commerce.asset.handler.fallback";

    if(object.has_key(cqcommerceassethandlerfallbackKey))
    {
        bourne::json value = object[cqcommerceassethandlerfallbackKey];




        ConfigNodePropertyString* obj = &cqcommerceassethandlerfallback;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqcommerceassethandlerfallback"] = getCqcommerceassethandlerfallback().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::getCqcommerceassethandlerfallback()
{
	return cqcommerceassethandlerfallback;
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::setCqcommerceassethandlerfallback(ConfigNodePropertyString cqcommerceassethandlerfallback)
{
	this->cqcommerceassethandlerfallback = cqcommerceassethandlerfallback;
}



