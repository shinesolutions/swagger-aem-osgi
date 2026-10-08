

#include "ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties.h"

using namespace Tiny;

ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties::ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties()
{
	fieldWhitelist = ConfigNodePropertyArray();
	attachmentTypeBlacklist = ConfigNodePropertyArray();
}

ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties::ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties::~ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties()
{

}

void
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fieldWhitelistKey = "fieldWhitelist";

    if(object.has_key(fieldWhitelistKey))
    {
        bourne::json value = object[fieldWhitelistKey];




        ConfigNodePropertyArray* obj = &fieldWhitelist;
		obj->fromJson(value.dump());

    }

    const char *attachmentTypeBlacklistKey = "attachmentTypeBlacklist";

    if(object.has_key(attachmentTypeBlacklistKey))
    {
        bourne::json value = object[attachmentTypeBlacklistKey];




        ConfigNodePropertyArray* obj = &attachmentTypeBlacklist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();






	object["attachmentTypeBlacklist"] = getAttachmentTypeBlacklist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties::setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}



