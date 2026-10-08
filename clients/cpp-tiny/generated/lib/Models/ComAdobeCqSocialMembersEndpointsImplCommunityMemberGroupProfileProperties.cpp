

#include "ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties.h"

using namespace Tiny;

ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties()
{
	fieldWhitelist = ConfigNodePropertyArray();
}

ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::~ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties()
{

}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}



