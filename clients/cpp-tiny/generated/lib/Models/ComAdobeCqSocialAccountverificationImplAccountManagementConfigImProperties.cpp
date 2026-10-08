

#include "ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.h"

using namespace Tiny;

ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties()
{
	enable = ConfigNodePropertyBoolean();
	ttl1 = ConfigNodePropertyInteger();
	ttl2 = ConfigNodePropertyInteger();
}

ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::~ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties()
{

}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enableKey = "enable";

    if(object.has_key(enableKey))
    {
        bourne::json value = object[enableKey];




        ConfigNodePropertyBoolean* obj = &enable;
		obj->fromJson(value.dump());

    }

    const char *ttl1Key = "ttl1";

    if(object.has_key(ttl1Key))
    {
        bourne::json value = object[ttl1Key];




        ConfigNodePropertyInteger* obj = &ttl1;
		obj->fromJson(value.dump());

    }

    const char *ttl2Key = "ttl2";

    if(object.has_key(ttl2Key))
    {
        bourne::json value = object[ttl2Key];




        ConfigNodePropertyInteger* obj = &ttl2;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enable"] = getEnable().toJson();






	object["ttl1"] = getTtl1().toJson();






	object["ttl2"] = getTtl2().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::getEnable()
{
	return enable;
}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::setEnable(ConfigNodePropertyBoolean enable)
{
	this->enable = enable;
}

ConfigNodePropertyInteger
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::getTtl1()
{
	return ttl1;
}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::setTtl1(ConfigNodePropertyInteger ttl1)
{
	this->ttl1 = ttl1;
}

ConfigNodePropertyInteger
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::getTtl2()
{
	return ttl2;
}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::setTtl2(ConfigNodePropertyInteger ttl2)
{
	this->ttl2 = ttl2;
}



