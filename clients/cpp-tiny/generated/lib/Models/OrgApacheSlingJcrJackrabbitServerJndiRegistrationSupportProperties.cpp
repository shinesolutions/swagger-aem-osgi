

#include "OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.h"

using namespace Tiny;

OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties()
{
	javanamingfactoryinitial = ConfigNodePropertyString();
	javanamingproviderurl = ConfigNodePropertyString();
}

OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::~OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties()
{

}

void
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *javanamingfactoryinitialKey = "java.naming.factory.initial";

    if(object.has_key(javanamingfactoryinitialKey))
    {
        bourne::json value = object[javanamingfactoryinitialKey];




        ConfigNodePropertyString* obj = &javanamingfactoryinitial;
		obj->fromJson(value.dump());

    }

    const char *javanamingproviderurlKey = "java.naming.provider.url";

    if(object.has_key(javanamingproviderurlKey))
    {
        bourne::json value = object[javanamingproviderurlKey];




        ConfigNodePropertyString* obj = &javanamingproviderurl;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["javanamingfactoryinitial"] = getJavanamingfactoryinitial().toJson();






	object["javanamingproviderurl"] = getJavanamingproviderurl().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::getJavanamingfactoryinitial()
{
	return javanamingfactoryinitial;
}

void
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::setJavanamingfactoryinitial(ConfigNodePropertyString javanamingfactoryinitial)
{
	this->javanamingfactoryinitial = javanamingfactoryinitial;
}

ConfigNodePropertyString
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::getJavanamingproviderurl()
{
	return javanamingproviderurl;
}

void
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::setJavanamingproviderurl(ConfigNodePropertyString javanamingproviderurl)
{
	this->javanamingproviderurl = javanamingproviderurl;
}



