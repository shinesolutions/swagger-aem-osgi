

#include "ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties.h"

using namespace Tiny;

ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties::ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties()
{
	cqcommerceassethandleractive = ConfigNodePropertyBoolean();
	cqcommerceassethandlername = ConfigNodePropertyString();
}

ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties::ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties::~ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties()
{

}

void
ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqcommerceassethandleractiveKey = "cq.commerce.asset.handler.active";

    if(object.has_key(cqcommerceassethandleractiveKey))
    {
        bourne::json value = object[cqcommerceassethandleractiveKey];




        ConfigNodePropertyBoolean* obj = &cqcommerceassethandleractive;
		obj->fromJson(value.dump());

    }

    const char *cqcommerceassethandlernameKey = "cq.commerce.asset.handler.name";

    if(object.has_key(cqcommerceassethandlernameKey))
    {
        bourne::json value = object[cqcommerceassethandlernameKey];




        ConfigNodePropertyString* obj = &cqcommerceassethandlername;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqcommerceassethandleractive"] = getCqcommerceassethandleractive().toJson();






	object["cqcommerceassethandlername"] = getCqcommerceassethandlername().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties::getCqcommerceassethandleractive()
{
	return cqcommerceassethandleractive;
}

void
ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties::setCqcommerceassethandleractive(ConfigNodePropertyBoolean cqcommerceassethandleractive)
{
	this->cqcommerceassethandleractive = cqcommerceassethandleractive;
}

ConfigNodePropertyString
ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties::getCqcommerceassethandlername()
{
	return cqcommerceassethandlername;
}

void
ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties::setCqcommerceassethandlername(ConfigNodePropertyString cqcommerceassethandlername)
{
	this->cqcommerceassethandlername = cqcommerceassethandlername;
}



