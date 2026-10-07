

#include "ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.h"

using namespace Tiny;

ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties()
{
	fieldWhitelist = ConfigNodePropertyArray();
	sitePathFilters = ConfigNodePropertyArray();
	sitePackageGroup = ConfigNodePropertyString();
}

ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::~ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties()
{

}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fieldWhitelistKey = "fieldWhitelist";

    if(object.has_key(fieldWhitelistKey))
    {
        bourne::json value = object[fieldWhitelistKey];




        ConfigNodePropertyArray* obj = &fieldWhitelist;
		obj->fromJson(value.dump());

    }

    const char *sitePathFiltersKey = "sitePathFilters";

    if(object.has_key(sitePathFiltersKey))
    {
        bourne::json value = object[sitePathFiltersKey];




        ConfigNodePropertyArray* obj = &sitePathFilters;
		obj->fromJson(value.dump());

    }

    const char *sitePackageGroupKey = "sitePackageGroup";

    if(object.has_key(sitePackageGroupKey))
    {
        bourne::json value = object[sitePackageGroupKey];




        ConfigNodePropertyString* obj = &sitePackageGroup;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();






	object["sitePathFilters"] = getSitePathFilters().toJson();






	object["sitePackageGroup"] = getSitePackageGroup().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::getSitePathFilters()
{
	return sitePathFilters;
}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::setSitePathFilters(ConfigNodePropertyArray sitePathFilters)
{
	this->sitePathFilters = sitePathFilters;
}

ConfigNodePropertyString
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::getSitePackageGroup()
{
	return sitePackageGroup;
}

void
ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties::setSitePackageGroup(ConfigNodePropertyString sitePackageGroup)
{
	this->sitePackageGroup = sitePackageGroup;
}



