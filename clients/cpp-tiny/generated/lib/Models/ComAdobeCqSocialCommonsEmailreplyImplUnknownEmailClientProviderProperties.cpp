

#include "ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties()
{
	replyEmailPatterns = ConfigNodePropertyArray();
	priorityOrder = ConfigNodePropertyInteger();
}

ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties::~ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *replyEmailPatternsKey = "replyEmailPatterns";

    if(object.has_key(replyEmailPatternsKey))
    {
        bourne::json value = object[replyEmailPatternsKey];




        ConfigNodePropertyArray* obj = &replyEmailPatterns;
		obj->fromJson(value.dump());

    }

    const char *priorityOrderKey = "priorityOrder";

    if(object.has_key(priorityOrderKey))
    {
        bourne::json value = object[priorityOrderKey];




        ConfigNodePropertyInteger* obj = &priorityOrder;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["replyEmailPatterns"] = getReplyEmailPatterns().toJson();






	object["priorityOrder"] = getPriorityOrder().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties::getReplyEmailPatterns()
{
	return replyEmailPatterns;
}

void
ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties::setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns)
{
	this->replyEmailPatterns = replyEmailPatterns;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties::getPriorityOrder()
{
	return priorityOrder;
}

void
ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties::setPriorityOrder(ConfigNodePropertyInteger priorityOrder)
{
	this->priorityOrder = priorityOrder;
}



