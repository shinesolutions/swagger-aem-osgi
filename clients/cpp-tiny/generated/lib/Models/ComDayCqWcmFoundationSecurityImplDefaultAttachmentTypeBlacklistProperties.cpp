

#include "ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.h"

using namespace Tiny;

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties()
{
	defaultattachmenttypeblacklist = ConfigNodePropertyArray();
	baselineattachmenttypeblacklist = ConfigNodePropertyArray();
}

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::~ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties()
{

}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::fromJson(std::string jsonObj)
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
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["defaultattachmenttypeblacklist"] = getDefaultattachmenttypeblacklist().toJson();






	object["baselineattachmenttypeblacklist"] = getBaselineattachmenttypeblacklist().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::getDefaultattachmenttypeblacklist()
{
	return defaultattachmenttypeblacklist;
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::setDefaultattachmenttypeblacklist(ConfigNodePropertyArray defaultattachmenttypeblacklist)
{
	this->defaultattachmenttypeblacklist = defaultattachmenttypeblacklist;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::getBaselineattachmenttypeblacklist()
{
	return baselineattachmenttypeblacklist;
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::setBaselineattachmenttypeblacklist(ConfigNodePropertyArray baselineattachmenttypeblacklist)
{
	this->baselineattachmenttypeblacklist = baselineattachmenttypeblacklist;
}



