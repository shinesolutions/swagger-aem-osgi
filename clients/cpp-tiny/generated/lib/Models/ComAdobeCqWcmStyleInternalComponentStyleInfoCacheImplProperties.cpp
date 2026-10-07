

#include "ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.h"

using namespace Tiny;

ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties()
{
	size = ConfigNodePropertyInteger();
}

ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::~ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties()
{

}

void
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *sizeKey = "size";

    if(object.has_key(sizeKey))
    {
        bourne::json value = object[sizeKey];




        ConfigNodePropertyInteger* obj = &size;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["size"] = getSize().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::getSize()
{
	return size;
}

void
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties::setSize(ConfigNodePropertyInteger size)
{
	this->size = size;
}



