

#include "ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties.h"

using namespace Tiny;

ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties::ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties()
{
	fieldWhitelist = ConfigNodePropertyArray();
}

ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties::ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties::~ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties()
{

}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fieldWhitelistKey = "fieldWhitelist";

    if(object.has_key(fieldWhitelistKey))
    {
        bourne::json value = object[fieldWhitelistKey];




        ConfigNodePropertyArray* obj = &fieldWhitelist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}



