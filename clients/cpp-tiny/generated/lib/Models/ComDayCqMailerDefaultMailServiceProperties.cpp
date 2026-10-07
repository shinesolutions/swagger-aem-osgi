

#include "ComDayCqMailerDefaultMailServiceProperties.h"

using namespace Tiny;

ComDayCqMailerDefaultMailServiceProperties::ComDayCqMailerDefaultMailServiceProperties()
{
	smtphost = ConfigNodePropertyString();
	smtpport = ConfigNodePropertyInteger();
	smtpuser = ConfigNodePropertyString();
	smtppassword = ConfigNodePropertyString();
	fromaddress = ConfigNodePropertyString();
	smtpssl = ConfigNodePropertyBoolean();
	smtpstarttls = ConfigNodePropertyBoolean();
	debugemail = ConfigNodePropertyBoolean();
}

ComDayCqMailerDefaultMailServiceProperties::ComDayCqMailerDefaultMailServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMailerDefaultMailServiceProperties::~ComDayCqMailerDefaultMailServiceProperties()
{

}

void
ComDayCqMailerDefaultMailServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *smtphostKey = "smtp.host";

    if(object.has_key(smtphostKey))
    {
        bourne::json value = object[smtphostKey];




        ConfigNodePropertyString* obj = &smtphost;
		obj->fromJson(value.dump());

    }

    const char *smtpportKey = "smtp.port";

    if(object.has_key(smtpportKey))
    {
        bourne::json value = object[smtpportKey];




        ConfigNodePropertyInteger* obj = &smtpport;
		obj->fromJson(value.dump());

    }

    const char *smtpuserKey = "smtp.user";

    if(object.has_key(smtpuserKey))
    {
        bourne::json value = object[smtpuserKey];




        ConfigNodePropertyString* obj = &smtpuser;
		obj->fromJson(value.dump());

    }

    const char *smtppasswordKey = "smtp.password";

    if(object.has_key(smtppasswordKey))
    {
        bourne::json value = object[smtppasswordKey];




        ConfigNodePropertyString* obj = &smtppassword;
		obj->fromJson(value.dump());

    }

    const char *fromaddressKey = "from.address";

    if(object.has_key(fromaddressKey))
    {
        bourne::json value = object[fromaddressKey];




        ConfigNodePropertyString* obj = &fromaddress;
		obj->fromJson(value.dump());

    }

    const char *smtpsslKey = "smtp.ssl";

    if(object.has_key(smtpsslKey))
    {
        bourne::json value = object[smtpsslKey];




        ConfigNodePropertyBoolean* obj = &smtpssl;
		obj->fromJson(value.dump());

    }

    const char *smtpstarttlsKey = "smtp.starttls";

    if(object.has_key(smtpstarttlsKey))
    {
        bourne::json value = object[smtpstarttlsKey];




        ConfigNodePropertyBoolean* obj = &smtpstarttls;
		obj->fromJson(value.dump());

    }

    const char *debugemailKey = "debug.email";

    if(object.has_key(debugemailKey))
    {
        bourne::json value = object[debugemailKey];




        ConfigNodePropertyBoolean* obj = &debugemail;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMailerDefaultMailServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["smtphost"] = getSmtphost().toJson();






	object["smtpport"] = getSmtpport().toJson();






	object["smtpuser"] = getSmtpuser().toJson();






	object["smtppassword"] = getSmtppassword().toJson();






	object["fromaddress"] = getFromaddress().toJson();






	object["smtpssl"] = getSmtpssl().toJson();






	object["smtpstarttls"] = getSmtpstarttls().toJson();






	object["debugemail"] = getDebugemail().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqMailerDefaultMailServiceProperties::getSmtphost()
{
	return smtphost;
}

void
ComDayCqMailerDefaultMailServiceProperties::setSmtphost(ConfigNodePropertyString smtphost)
{
	this->smtphost = smtphost;
}

ConfigNodePropertyInteger
ComDayCqMailerDefaultMailServiceProperties::getSmtpport()
{
	return smtpport;
}

void
ComDayCqMailerDefaultMailServiceProperties::setSmtpport(ConfigNodePropertyInteger smtpport)
{
	this->smtpport = smtpport;
}

ConfigNodePropertyString
ComDayCqMailerDefaultMailServiceProperties::getSmtpuser()
{
	return smtpuser;
}

void
ComDayCqMailerDefaultMailServiceProperties::setSmtpuser(ConfigNodePropertyString smtpuser)
{
	this->smtpuser = smtpuser;
}

ConfigNodePropertyString
ComDayCqMailerDefaultMailServiceProperties::getSmtppassword()
{
	return smtppassword;
}

void
ComDayCqMailerDefaultMailServiceProperties::setSmtppassword(ConfigNodePropertyString smtppassword)
{
	this->smtppassword = smtppassword;
}

ConfigNodePropertyString
ComDayCqMailerDefaultMailServiceProperties::getFromaddress()
{
	return fromaddress;
}

void
ComDayCqMailerDefaultMailServiceProperties::setFromaddress(ConfigNodePropertyString fromaddress)
{
	this->fromaddress = fromaddress;
}

ConfigNodePropertyBoolean
ComDayCqMailerDefaultMailServiceProperties::getSmtpssl()
{
	return smtpssl;
}

void
ComDayCqMailerDefaultMailServiceProperties::setSmtpssl(ConfigNodePropertyBoolean smtpssl)
{
	this->smtpssl = smtpssl;
}

ConfigNodePropertyBoolean
ComDayCqMailerDefaultMailServiceProperties::getSmtpstarttls()
{
	return smtpstarttls;
}

void
ComDayCqMailerDefaultMailServiceProperties::setSmtpstarttls(ConfigNodePropertyBoolean smtpstarttls)
{
	this->smtpstarttls = smtpstarttls;
}

ConfigNodePropertyBoolean
ComDayCqMailerDefaultMailServiceProperties::getDebugemail()
{
	return debugemail;
}

void
ComDayCqMailerDefaultMailServiceProperties::setDebugemail(ConfigNodePropertyBoolean debugemail)
{
	this->debugemail = debugemail;
}



