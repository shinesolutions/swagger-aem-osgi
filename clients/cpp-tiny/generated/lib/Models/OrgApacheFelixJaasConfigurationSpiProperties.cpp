

#include "OrgApacheFelixJaasConfigurationSpiProperties.h"

using namespace Tiny;

OrgApacheFelixJaasConfigurationSpiProperties::OrgApacheFelixJaasConfigurationSpiProperties()
{
	jaasdefaultRealmName = ConfigNodePropertyString();
	jaasconfigProviderName = ConfigNodePropertyString();
	jaasglobalConfigPolicy = ConfigNodePropertyDropDown();
}

OrgApacheFelixJaasConfigurationSpiProperties::OrgApacheFelixJaasConfigurationSpiProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixJaasConfigurationSpiProperties::~OrgApacheFelixJaasConfigurationSpiProperties()
{

}

void
OrgApacheFelixJaasConfigurationSpiProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *jaasdefaultRealmNameKey = "jaas.defaultRealmName";

    if(object.has_key(jaasdefaultRealmNameKey))
    {
        bourne::json value = object[jaasdefaultRealmNameKey];




        ConfigNodePropertyString* obj = &jaasdefaultRealmName;
		obj->fromJson(value.dump());

    }

    const char *jaasconfigProviderNameKey = "jaas.configProviderName";

    if(object.has_key(jaasconfigProviderNameKey))
    {
        bourne::json value = object[jaasconfigProviderNameKey];




        ConfigNodePropertyString* obj = &jaasconfigProviderName;
		obj->fromJson(value.dump());

    }

    const char *jaasglobalConfigPolicyKey = "jaas.globalConfigPolicy";

    if(object.has_key(jaasglobalConfigPolicyKey))
    {
        bourne::json value = object[jaasglobalConfigPolicyKey];




        ConfigNodePropertyDropDown* obj = &jaasglobalConfigPolicy;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixJaasConfigurationSpiProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["jaasdefaultRealmName"] = getJaasdefaultRealmName().toJson();






	object["jaasconfigProviderName"] = getJaasconfigProviderName().toJson();






	object["jaasglobalConfigPolicy"] = getJaasglobalConfigPolicy().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheFelixJaasConfigurationSpiProperties::getJaasdefaultRealmName()
{
	return jaasdefaultRealmName;
}

void
OrgApacheFelixJaasConfigurationSpiProperties::setJaasdefaultRealmName(ConfigNodePropertyString jaasdefaultRealmName)
{
	this->jaasdefaultRealmName = jaasdefaultRealmName;
}

ConfigNodePropertyString
OrgApacheFelixJaasConfigurationSpiProperties::getJaasconfigProviderName()
{
	return jaasconfigProviderName;
}

void
OrgApacheFelixJaasConfigurationSpiProperties::setJaasconfigProviderName(ConfigNodePropertyString jaasconfigProviderName)
{
	this->jaasconfigProviderName = jaasconfigProviderName;
}

ConfigNodePropertyDropDown
OrgApacheFelixJaasConfigurationSpiProperties::getJaasglobalConfigPolicy()
{
	return jaasglobalConfigPolicy;
}

void
OrgApacheFelixJaasConfigurationSpiProperties::setJaasglobalConfigPolicy(ConfigNodePropertyDropDown jaasglobalConfigPolicy)
{
	this->jaasglobalConfigPolicy = jaasglobalConfigPolicy;
}



