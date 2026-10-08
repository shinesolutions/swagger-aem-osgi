

#include "ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties()
{
	legacyCloudUGCPathMapping = ConfigNodePropertyBoolean();
}

ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::~ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties()
{

}

void
ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *legacyCloudUGCPathMappingKey = "legacyCloudUGCPathMapping";

    if(object.has_key(legacyCloudUGCPathMappingKey))
    {
        bourne::json value = object[legacyCloudUGCPathMappingKey];




        ConfigNodePropertyBoolean* obj = &legacyCloudUGCPathMapping;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["legacyCloudUGCPathMapping"] = getLegacyCloudUGCPathMapping().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::getLegacyCloudUGCPathMapping()
{
	return legacyCloudUGCPathMapping;
}

void
ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::setLegacyCloudUGCPathMapping(ConfigNodePropertyBoolean legacyCloudUGCPathMapping)
{
	this->legacyCloudUGCPathMapping = legacyCloudUGCPathMapping;
}



