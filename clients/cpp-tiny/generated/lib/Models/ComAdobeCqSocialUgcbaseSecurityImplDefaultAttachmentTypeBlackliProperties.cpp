

#include "ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties::ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties()
{
	defaultattachmenttypeblacklist = ConfigNodePropertyArray();
	baselineattachmenttypeblacklist = ConfigNodePropertyArray();
}

ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties::ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties::~ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties()
{

}

void
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *defaultattachmenttypeblacklistKey = "default.attachment.type.blacklist";

    if(object.has_key(defaultattachmenttypeblacklistKey))
    {
        bourne::json value = object[defaultattachmenttypeblacklistKey];




        ConfigNodePropertyArray* obj = &defaultattachmenttypeblacklist;
		obj->fromJson(value.dump());

    }

    const char *baselineattachmenttypeblacklistKey = "baseline.attachment.type.blacklist";

    if(object.has_key(baselineattachmenttypeblacklistKey))
    {
        bourne::json value = object[baselineattachmenttypeblacklistKey];




        ConfigNodePropertyArray* obj = &baselineattachmenttypeblacklist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["defaultattachmenttypeblacklist"] = getDefaultattachmenttypeblacklist().toJson();






	object["baselineattachmenttypeblacklist"] = getBaselineattachmenttypeblacklist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties::getDefaultattachmenttypeblacklist()
{
	return defaultattachmenttypeblacklist;
}

void
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties::setDefaultattachmenttypeblacklist(ConfigNodePropertyArray defaultattachmenttypeblacklist)
{
	this->defaultattachmenttypeblacklist = defaultattachmenttypeblacklist;
}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties::getBaselineattachmenttypeblacklist()
{
	return baselineattachmenttypeblacklist;
}

void
ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties::setBaselineattachmenttypeblacklist(ConfigNodePropertyArray baselineattachmenttypeblacklist)
{
	this->baselineattachmenttypeblacklist = baselineattachmenttypeblacklist;
}



