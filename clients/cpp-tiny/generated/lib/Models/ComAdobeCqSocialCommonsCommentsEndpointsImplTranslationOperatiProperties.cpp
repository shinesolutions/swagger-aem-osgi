

#include "ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties::ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties()
{
	fieldWhitelist = ConfigNodePropertyArray();
	attachmentTypeBlacklist = ConfigNodePropertyArray();
}

ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties::ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties::~ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties()
{

}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();






	object["attachmentTypeBlacklist"] = getAttachmentTypeBlacklist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties::setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}



