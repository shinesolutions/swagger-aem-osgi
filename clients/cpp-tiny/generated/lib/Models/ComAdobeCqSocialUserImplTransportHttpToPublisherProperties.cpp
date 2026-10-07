

#include "ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.h"

using namespace Tiny;

ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::ComAdobeCqSocialUserImplTransportHttpToPublisherProperties()
{
	enable = ConfigNodePropertyBoolean();
	agentconfiguration = ConfigNodePropertyArray();
	contextpath = ConfigNodePropertyString();
	disabledciphersuites = ConfigNodePropertyArray();
	enabledciphersuites = ConfigNodePropertyArray();
}

ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::ComAdobeCqSocialUserImplTransportHttpToPublisherProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::~ComAdobeCqSocialUserImplTransportHttpToPublisherProperties()
{

}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enableKey = "enable";

    if(object.has_key(enableKey))
    {
        bourne::json value = object[enableKey];




        ConfigNodePropertyBoolean* obj = &enable;
		obj->fromJson(value.dump());

    }

    const char *agentconfigurationKey = "agent.configuration";

    if(object.has_key(agentconfigurationKey))
    {
        bourne::json value = object[agentconfigurationKey];




        ConfigNodePropertyArray* obj = &agentconfiguration;
		obj->fromJson(value.dump());

    }

    const char *contextpathKey = "context.path";

    if(object.has_key(contextpathKey))
    {
        bourne::json value = object[contextpathKey];




        ConfigNodePropertyString* obj = &contextpath;
		obj->fromJson(value.dump());

    }

    const char *disabledciphersuitesKey = "disabled.cipher.suites";

    if(object.has_key(disabledciphersuitesKey))
    {
        bourne::json value = object[disabledciphersuitesKey];




        ConfigNodePropertyArray* obj = &disabledciphersuites;
		obj->fromJson(value.dump());

    }

    const char *enabledciphersuitesKey = "enabled.cipher.suites";

    if(object.has_key(enabledciphersuitesKey))
    {
        bourne::json value = object[enabledciphersuitesKey];




        ConfigNodePropertyArray* obj = &enabledciphersuites;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enable"] = getEnable().toJson();






	object["agentconfiguration"] = getAgentconfiguration().toJson();






	object["contextpath"] = getContextpath().toJson();






	object["disabledciphersuites"] = getDisabledciphersuites().toJson();






	object["enabledciphersuites"] = getEnabledciphersuites().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::getEnable()
{
	return enable;
}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::setEnable(ConfigNodePropertyBoolean enable)
{
	this->enable = enable;
}

ConfigNodePropertyArray
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::getAgentconfiguration()
{
	return agentconfiguration;
}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::setAgentconfiguration(ConfigNodePropertyArray agentconfiguration)
{
	this->agentconfiguration = agentconfiguration;
}

ConfigNodePropertyString
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::getContextpath()
{
	return contextpath;
}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::setContextpath(ConfigNodePropertyString contextpath)
{
	this->contextpath = contextpath;
}

ConfigNodePropertyArray
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::getDisabledciphersuites()
{
	return disabledciphersuites;
}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::setDisabledciphersuites(ConfigNodePropertyArray disabledciphersuites)
{
	this->disabledciphersuites = disabledciphersuites;
}

ConfigNodePropertyArray
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::getEnabledciphersuites()
{
	return enabledciphersuites;
}

void
ComAdobeCqSocialUserImplTransportHttpToPublisherProperties::setEnabledciphersuites(ConfigNodePropertyArray enabledciphersuites)
{
	this->enabledciphersuites = enabledciphersuites;
}



