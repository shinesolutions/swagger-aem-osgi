

#include "ComAdobeCqAccountApiAccountManagementServiceProperties.h"

using namespace Tiny;

ComAdobeCqAccountApiAccountManagementServiceProperties::ComAdobeCqAccountApiAccountManagementServiceProperties()
{
	cqaccountmanagertokenvalidityperiod = ConfigNodePropertyInteger();
	cqaccountmanagerconfigrequestnewaccountmail = ConfigNodePropertyString();
	cqaccountmanagerconfigrequestnewpwdmail = ConfigNodePropertyString();
}

ComAdobeCqAccountApiAccountManagementServiceProperties::ComAdobeCqAccountApiAccountManagementServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqAccountApiAccountManagementServiceProperties::~ComAdobeCqAccountApiAccountManagementServiceProperties()
{

}

void
ComAdobeCqAccountApiAccountManagementServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqaccountmanagertokenvalidityperiodKey = "cq.accountmanager.token.validity.period";

    if(object.has_key(cqaccountmanagertokenvalidityperiodKey))
    {
        bourne::json value = object[cqaccountmanagertokenvalidityperiodKey];




        ConfigNodePropertyInteger* obj = &cqaccountmanagertokenvalidityperiod;
		obj->fromJson(value.dump());

    }

    const char *cqaccountmanagerconfigrequestnewaccountmailKey = "cq.accountmanager.config.requestnewaccount.mail";

    if(object.has_key(cqaccountmanagerconfigrequestnewaccountmailKey))
    {
        bourne::json value = object[cqaccountmanagerconfigrequestnewaccountmailKey];




        ConfigNodePropertyString* obj = &cqaccountmanagerconfigrequestnewaccountmail;
		obj->fromJson(value.dump());

    }

    const char *cqaccountmanagerconfigrequestnewpwdmailKey = "cq.accountmanager.config.requestnewpwd.mail";

    if(object.has_key(cqaccountmanagerconfigrequestnewpwdmailKey))
    {
        bourne::json value = object[cqaccountmanagerconfigrequestnewpwdmailKey];




        ConfigNodePropertyString* obj = &cqaccountmanagerconfigrequestnewpwdmail;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqAccountApiAccountManagementServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqaccountmanagertokenvalidityperiod"] = getCqaccountmanagertokenvalidityperiod().toJson();






	object["cqaccountmanagerconfigrequestnewaccountmail"] = getCqaccountmanagerconfigrequestnewaccountmail().toJson();






	object["cqaccountmanagerconfigrequestnewpwdmail"] = getCqaccountmanagerconfigrequestnewpwdmail().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqAccountApiAccountManagementServiceProperties::getCqaccountmanagertokenvalidityperiod()
{
	return cqaccountmanagertokenvalidityperiod;
}

void
ComAdobeCqAccountApiAccountManagementServiceProperties::setCqaccountmanagertokenvalidityperiod(ConfigNodePropertyInteger cqaccountmanagertokenvalidityperiod)
{
	this->cqaccountmanagertokenvalidityperiod = cqaccountmanagertokenvalidityperiod;
}

ConfigNodePropertyString
ComAdobeCqAccountApiAccountManagementServiceProperties::getCqaccountmanagerconfigrequestnewaccountmail()
{
	return cqaccountmanagerconfigrequestnewaccountmail;
}

void
ComAdobeCqAccountApiAccountManagementServiceProperties::setCqaccountmanagerconfigrequestnewaccountmail(ConfigNodePropertyString cqaccountmanagerconfigrequestnewaccountmail)
{
	this->cqaccountmanagerconfigrequestnewaccountmail = cqaccountmanagerconfigrequestnewaccountmail;
}

ConfigNodePropertyString
ComAdobeCqAccountApiAccountManagementServiceProperties::getCqaccountmanagerconfigrequestnewpwdmail()
{
	return cqaccountmanagerconfigrequestnewpwdmail;
}

void
ComAdobeCqAccountApiAccountManagementServiceProperties::setCqaccountmanagerconfigrequestnewpwdmail(ConfigNodePropertyString cqaccountmanagerconfigrequestnewpwdmail)
{
	this->cqaccountmanagerconfigrequestnewpwdmail = cqaccountmanagerconfigrequestnewpwdmail;
}



