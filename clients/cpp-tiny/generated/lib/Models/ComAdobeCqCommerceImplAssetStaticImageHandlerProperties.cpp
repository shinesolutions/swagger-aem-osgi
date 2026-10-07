

#include "ComAdobeCqCommerceImplAssetStaticImageHandlerProperties.h"

using namespace Tiny;

ComAdobeCqCommerceImplAssetStaticImageHandlerProperties::ComAdobeCqCommerceImplAssetStaticImageHandlerProperties()
{
	cqcommerceassethandleractive = ConfigNodePropertyBoolean();
	cqcommerceassethandlername = ConfigNodePropertyString();
}

ComAdobeCqCommerceImplAssetStaticImageHandlerProperties::ComAdobeCqCommerceImplAssetStaticImageHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommerceImplAssetStaticImageHandlerProperties::~ComAdobeCqCommerceImplAssetStaticImageHandlerProperties()
{

}

void
ComAdobeCqCommerceImplAssetStaticImageHandlerProperties::fromJson(std::string jsonObj)
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
ComAdobeCqCommerceImplAssetStaticImageHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqcommerceassethandleractive"] = getCqcommerceassethandleractive().toJson();






	object["cqcommerceassethandlername"] = getCqcommerceassethandlername().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqCommerceImplAssetStaticImageHandlerProperties::getCqcommerceassethandleractive()
{
	return cqcommerceassethandleractive;
}

void
ComAdobeCqCommerceImplAssetStaticImageHandlerProperties::setCqcommerceassethandleractive(ConfigNodePropertyBoolean cqcommerceassethandleractive)
{
	this->cqcommerceassethandleractive = cqcommerceassethandleractive;
}

ConfigNodePropertyString
ComAdobeCqCommerceImplAssetStaticImageHandlerProperties::getCqcommerceassethandlername()
{
	return cqcommerceassethandlername;
}

void
ComAdobeCqCommerceImplAssetStaticImageHandlerProperties::setCqcommerceassethandlername(ConfigNodePropertyString cqcommerceassethandlername)
{
	this->cqcommerceassethandlername = cqcommerceassethandlername;
}



