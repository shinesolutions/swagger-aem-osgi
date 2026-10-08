

#include "ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties.h"

using namespace Tiny;

ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties()
{
	fieldWhitelist = ConfigNodePropertyArray();
	attachmentTypeBlacklist = ConfigNodePropertyArray();
}

ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::~ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties()
{

}

void
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();






	object["attachmentTypeBlacklist"] = getAttachmentTypeBlacklist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties::setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}



