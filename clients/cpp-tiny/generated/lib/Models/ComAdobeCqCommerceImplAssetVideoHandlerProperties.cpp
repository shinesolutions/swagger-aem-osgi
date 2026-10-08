

#include "ComAdobeCqCommerceImplAssetVideoHandlerProperties.h"

using namespace Tiny;

ComAdobeCqCommerceImplAssetVideoHandlerProperties::ComAdobeCqCommerceImplAssetVideoHandlerProperties()
{
	cqcommerceassethandleractive = ConfigNodePropertyBoolean();
	cqcommerceassethandlername = ConfigNodePropertyString();
}

ComAdobeCqCommerceImplAssetVideoHandlerProperties::ComAdobeCqCommerceImplAssetVideoHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommerceImplAssetVideoHandlerProperties::~ComAdobeCqCommerceImplAssetVideoHandlerProperties()
{

}

void
ComAdobeCqCommerceImplAssetVideoHandlerProperties::fromJson(std::string jsonObj)
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
ComAdobeCqCommerceImplAssetVideoHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqcommerceassethandleractive"] = getCqcommerceassethandleractive().toJson();






	object["cqcommerceassethandlername"] = getCqcommerceassethandlername().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqCommerceImplAssetVideoHandlerProperties::getCqcommerceassethandleractive()
{
	return cqcommerceassethandleractive;
}

void
ComAdobeCqCommerceImplAssetVideoHandlerProperties::setCqcommerceassethandleractive(ConfigNodePropertyBoolean cqcommerceassethandleractive)
{
	this->cqcommerceassethandleractive = cqcommerceassethandleractive;
}

ConfigNodePropertyString
ComAdobeCqCommerceImplAssetVideoHandlerProperties::getCqcommerceassethandlername()
{
	return cqcommerceassethandlername;
}

void
ComAdobeCqCommerceImplAssetVideoHandlerProperties::setCqcommerceassethandlername(ConfigNodePropertyString cqcommerceassethandlername)
{
	this->cqcommerceassethandlername = cqcommerceassethandlername;
}



