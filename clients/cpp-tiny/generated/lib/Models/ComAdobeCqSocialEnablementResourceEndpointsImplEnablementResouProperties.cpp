

#include "ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties.h"

using namespace Tiny;

ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties::ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties()
{
	fieldWhitelist = ConfigNodePropertyArray();
}

ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties::ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties::~ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties()
{

}

void
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fieldWhitelistKey = "fieldWhitelist";

    if(object.has_key(fieldWhitelistKey))
    {
        bourne::json value = object[fieldWhitelistKey];




        ConfigNodePropertyArray* obj = &fieldWhitelist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}



