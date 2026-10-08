

#include "ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties()
{
	enable = ConfigNodePropertyBoolean();
	uGCLimit = ConfigNodePropertyInteger();
	ugcLimitDuration = ConfigNodePropertyInteger();
	domains = ConfigNodePropertyArray();
	toList = ConfigNodePropertyArray();
}

ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::~ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties()
{

}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enableKey = "enable";

    if(object.has_key(enableKey))
    {
        bourne::json value = object[enableKey];




        ConfigNodePropertyBoolean* obj = &enable;
		obj->fromJson(value.dump());

    }

    const char *uGCLimitKey = "UGCLimit";

    if(object.has_key(uGCLimitKey))
    {
        bourne::json value = object[uGCLimitKey];




        ConfigNodePropertyInteger* obj = &uGCLimit;
		obj->fromJson(value.dump());

    }

    const char *ugcLimitDurationKey = "ugcLimitDuration";

    if(object.has_key(ugcLimitDurationKey))
    {
        bourne::json value = object[ugcLimitDurationKey];




        ConfigNodePropertyInteger* obj = &ugcLimitDuration;
		obj->fromJson(value.dump());

    }

    const char *domainsKey = "domains";

    if(object.has_key(domainsKey))
    {
        bourne::json value = object[domainsKey];




        ConfigNodePropertyArray* obj = &domains;
		obj->fromJson(value.dump());

    }

    const char *toListKey = "toList";

    if(object.has_key(toListKey))
    {
        bourne::json value = object[toListKey];




        ConfigNodePropertyArray* obj = &toList;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enable"] = getEnable().toJson();






	object["uGCLimit"] = getUGCLimit().toJson();






	object["ugcLimitDuration"] = getUgcLimitDuration().toJson();






	object["domains"] = getDomains().toJson();






	object["toList"] = getToList().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::getEnable()
{
	return enable;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::setEnable(ConfigNodePropertyBoolean enable)
{
	this->enable = enable;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::getUGCLimit()
{
	return uGCLimit;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::setUGCLimit(ConfigNodePropertyInteger uGCLimit)
{
	this->uGCLimit = uGCLimit;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::getUgcLimitDuration()
{
	return ugcLimitDuration;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::setUgcLimitDuration(ConfigNodePropertyInteger ugcLimitDuration)
{
	this->ugcLimitDuration = ugcLimitDuration;
}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::getDomains()
{
	return domains;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::setDomains(ConfigNodePropertyArray domains)
{
	this->domains = domains;
}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::getToList()
{
	return toList;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::setToList(ConfigNodePropertyArray toList)
{
	this->toList = toList;
}



