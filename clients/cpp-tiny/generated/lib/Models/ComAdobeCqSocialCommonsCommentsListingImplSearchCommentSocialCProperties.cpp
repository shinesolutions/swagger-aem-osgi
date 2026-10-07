

#include "ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties()
{
	numUserLimit = ConfigNodePropertyInteger();
}

ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::~ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties()
{

}

void
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *numUserLimitKey = "numUserLimit";

    if(object.has_key(numUserLimitKey))
    {
        bourne::json value = object[numUserLimitKey];




        ConfigNodePropertyInteger* obj = &numUserLimit;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["numUserLimit"] = getNumUserLimit().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::getNumUserLimit()
{
	return numUserLimit;
}

void
ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties::setNumUserLimit(ConfigNodePropertyInteger numUserLimit)
{
	this->numUserLimit = numUserLimit;
}



