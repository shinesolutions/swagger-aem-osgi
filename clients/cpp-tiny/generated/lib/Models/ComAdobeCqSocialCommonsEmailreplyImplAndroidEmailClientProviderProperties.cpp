

#include "ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties()
{
	priorityOrder = ConfigNodePropertyInteger();
	replyEmailPatterns = ConfigNodePropertyArray();
}

ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties::~ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *priorityOrderKey = "priorityOrder";

    if(object.has_key(priorityOrderKey))
    {
        bourne::json value = object[priorityOrderKey];




        ConfigNodePropertyInteger* obj = &priorityOrder;
		obj->fromJson(value.dump());

    }

    const char *replyEmailPatternsKey = "replyEmailPatterns";

    if(object.has_key(replyEmailPatternsKey))
    {
        bourne::json value = object[replyEmailPatternsKey];




        ConfigNodePropertyArray* obj = &replyEmailPatterns;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["priorityOrder"] = getPriorityOrder().toJson();






	object["replyEmailPatterns"] = getReplyEmailPatterns().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties::getPriorityOrder()
{
	return priorityOrder;
}

void
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties::setPriorityOrder(ConfigNodePropertyInteger priorityOrder)
{
	this->priorityOrder = priorityOrder;
}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties::getReplyEmailPatterns()
{
	return replyEmailPatterns;
}

void
ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties::setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns)
{
	this->replyEmailPatterns = replyEmailPatterns;
}



