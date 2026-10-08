

#include "ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.h"

using namespace Tiny;

ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::ComAdobeCqDtmImplServletsDTMDeployHookServletProperties()
{
	dtmstagingipwhitelist = ConfigNodePropertyArray();
	dtmproductionipwhitelist = ConfigNodePropertyArray();
}

ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::ComAdobeCqDtmImplServletsDTMDeployHookServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::~ComAdobeCqDtmImplServletsDTMDeployHookServletProperties()
{

}

void
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dtmstagingipwhitelistKey = "dtm.staging.ip.whitelist";

    if(object.has_key(dtmstagingipwhitelistKey))
    {
        bourne::json value = object[dtmstagingipwhitelistKey];




        ConfigNodePropertyArray* obj = &dtmstagingipwhitelist;
		obj->fromJson(value.dump());

    }

    const char *dtmproductionipwhitelistKey = "dtm.production.ip.whitelist";

    if(object.has_key(dtmproductionipwhitelistKey))
    {
        bourne::json value = object[dtmproductionipwhitelistKey];




        ConfigNodePropertyArray* obj = &dtmproductionipwhitelist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["dtmstagingipwhitelist"] = getDtmstagingipwhitelist().toJson();






	object["dtmproductionipwhitelist"] = getDtmproductionipwhitelist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::getDtmstagingipwhitelist()
{
	return dtmstagingipwhitelist;
}

void
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::setDtmstagingipwhitelist(ConfigNodePropertyArray dtmstagingipwhitelist)
{
	this->dtmstagingipwhitelist = dtmstagingipwhitelist;
}

ConfigNodePropertyArray
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::getDtmproductionipwhitelist()
{
	return dtmproductionipwhitelist;
}

void
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties::setDtmproductionipwhitelist(ConfigNodePropertyArray dtmproductionipwhitelist)
{
	this->dtmproductionipwhitelist = dtmproductionipwhitelist;
}



