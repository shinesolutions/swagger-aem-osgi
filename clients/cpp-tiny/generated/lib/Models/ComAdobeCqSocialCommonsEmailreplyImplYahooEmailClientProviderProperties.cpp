

#include "ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties()
{
	priorityOrder = ConfigNodePropertyInteger();
	replyEmailPatterns = ConfigNodePropertyArray();
}

ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::~ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["priorityOrder"] = getPriorityOrder().toJson();






	object["replyEmailPatterns"] = getReplyEmailPatterns().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::getPriorityOrder()
{
	return priorityOrder;
}

void
ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::setPriorityOrder(ConfigNodePropertyInteger priorityOrder)
{
	this->priorityOrder = priorityOrder;
}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::getReplyEmailPatterns()
{
	return replyEmailPatterns;
}

void
ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns)
{
	this->replyEmailPatterns = replyEmailPatterns;
}



