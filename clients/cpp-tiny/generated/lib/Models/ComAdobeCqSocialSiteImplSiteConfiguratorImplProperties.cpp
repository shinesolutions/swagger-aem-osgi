

#include "ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties()
{
	componentsUsingTags = ConfigNodePropertyArray();
}

ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::~ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties()
{

}

void
ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *componentsUsingTagsKey = "componentsUsingTags";

    if(object.has_key(componentsUsingTagsKey))
    {
        bourne::json value = object[componentsUsingTagsKey];




        ConfigNodePropertyArray* obj = &componentsUsingTags;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["componentsUsingTags"] = getComponentsUsingTags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::getComponentsUsingTags()
{
	return componentsUsingTags;
}

void
ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::setComponentsUsingTags(ConfigNodePropertyArray componentsUsingTags)
{
	this->componentsUsingTags = componentsUsingTags;
}



