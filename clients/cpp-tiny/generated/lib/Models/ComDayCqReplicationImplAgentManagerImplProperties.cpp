

#include "ComDayCqReplicationImplAgentManagerImplProperties.h"

using namespace Tiny;

ComDayCqReplicationImplAgentManagerImplProperties::ComDayCqReplicationImplAgentManagerImplProperties()
{
	jobtopics = ConfigNodePropertyString();
	serviceUsertarget = ConfigNodePropertyString();
	agentProvidertarget = ConfigNodePropertyString();
}

ComDayCqReplicationImplAgentManagerImplProperties::ComDayCqReplicationImplAgentManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplAgentManagerImplProperties::~ComDayCqReplicationImplAgentManagerImplProperties()
{

}

void
ComDayCqReplicationImplAgentManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *jobtopicsKey = "job.topics";

    if(object.has_key(jobtopicsKey))
    {
        bourne::json value = object[jobtopicsKey];




        ConfigNodePropertyString* obj = &jobtopics;
		obj->fromJson(value.dump());

    }

    const char *serviceUsertargetKey = "serviceUser.target";

    if(object.has_key(serviceUsertargetKey))
    {
        bourne::json value = object[serviceUsertargetKey];




        ConfigNodePropertyString* obj = &serviceUsertarget;
		obj->fromJson(value.dump());

    }

    const char *agentProvidertargetKey = "agentProvider.target";

    if(object.has_key(agentProvidertargetKey))
    {
        bourne::json value = object[agentProvidertargetKey];




        ConfigNodePropertyString* obj = &agentProvidertarget;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplAgentManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["jobtopics"] = getJobtopics().toJson();






	object["serviceUsertarget"] = getServiceUsertarget().toJson();






	object["agentProvidertarget"] = getAgentProvidertarget().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqReplicationImplAgentManagerImplProperties::getJobtopics()
{
	return jobtopics;
}

void
ComDayCqReplicationImplAgentManagerImplProperties::setJobtopics(ConfigNodePropertyString jobtopics)
{
	this->jobtopics = jobtopics;
}

ConfigNodePropertyString
ComDayCqReplicationImplAgentManagerImplProperties::getServiceUsertarget()
{
	return serviceUsertarget;
}

void
ComDayCqReplicationImplAgentManagerImplProperties::setServiceUsertarget(ConfigNodePropertyString serviceUsertarget)
{
	this->serviceUsertarget = serviceUsertarget;
}

ConfigNodePropertyString
ComDayCqReplicationImplAgentManagerImplProperties::getAgentProvidertarget()
{
	return agentProvidertarget;
}

void
ComDayCqReplicationImplAgentManagerImplProperties::setAgentProvidertarget(ConfigNodePropertyString agentProvidertarget)
{
	this->agentProvidertarget = agentProvidertarget;
}



