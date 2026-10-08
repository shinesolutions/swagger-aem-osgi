

#include "ComAdobeCqAccountImplAccountManagementServletProperties.h"

using namespace Tiny;

ComAdobeCqAccountImplAccountManagementServletProperties::ComAdobeCqAccountImplAccountManagementServletProperties()
{
	cqaccountmanagerconfiginformnewaccountmail = ConfigNodePropertyString();
	cqaccountmanagerconfiginformnewpwdmail = ConfigNodePropertyString();
}

ComAdobeCqAccountImplAccountManagementServletProperties::ComAdobeCqAccountImplAccountManagementServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqAccountImplAccountManagementServletProperties::~ComAdobeCqAccountImplAccountManagementServletProperties()
{

}

void
ComAdobeCqAccountImplAccountManagementServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqaccountmanagerconfiginformnewaccountmailKey = "cq.accountmanager.config.informnewaccount.mail";

    if(object.has_key(cqaccountmanagerconfiginformnewaccountmailKey))
    {
        bourne::json value = object[cqaccountmanagerconfiginformnewaccountmailKey];




        ConfigNodePropertyString* obj = &cqaccountmanagerconfiginformnewaccountmail;
		obj->fromJson(value.dump());

    }

    const char *cqaccountmanagerconfiginformnewpwdmailKey = "cq.accountmanager.config.informnewpwd.mail";

    if(object.has_key(cqaccountmanagerconfiginformnewpwdmailKey))
    {
        bourne::json value = object[cqaccountmanagerconfiginformnewpwdmailKey];




        ConfigNodePropertyString* obj = &cqaccountmanagerconfiginformnewpwdmail;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqAccountImplAccountManagementServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqaccountmanagerconfiginformnewaccountmail"] = getCqaccountmanagerconfiginformnewaccountmail().toJson();






	object["cqaccountmanagerconfiginformnewpwdmail"] = getCqaccountmanagerconfiginformnewpwdmail().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqAccountImplAccountManagementServletProperties::getCqaccountmanagerconfiginformnewaccountmail()
{
	return cqaccountmanagerconfiginformnewaccountmail;
}

void
ComAdobeCqAccountImplAccountManagementServletProperties::setCqaccountmanagerconfiginformnewaccountmail(ConfigNodePropertyString cqaccountmanagerconfiginformnewaccountmail)
{
	this->cqaccountmanagerconfiginformnewaccountmail = cqaccountmanagerconfiginformnewaccountmail;
}

ConfigNodePropertyString
ComAdobeCqAccountImplAccountManagementServletProperties::getCqaccountmanagerconfiginformnewpwdmail()
{
	return cqaccountmanagerconfiginformnewpwdmail;
}

void
ComAdobeCqAccountImplAccountManagementServletProperties::setCqaccountmanagerconfiginformnewpwdmail(ConfigNodePropertyString cqaccountmanagerconfiginformnewpwdmail)
{
	this->cqaccountmanagerconfiginformnewpwdmail = cqaccountmanagerconfiginformnewpwdmail;
}



