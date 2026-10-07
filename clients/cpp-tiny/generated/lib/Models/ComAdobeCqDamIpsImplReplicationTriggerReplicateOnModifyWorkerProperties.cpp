

#include "ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.h"

using namespace Tiny;

ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties()
{
	dmreplicateonmodifyenabled = ConfigNodePropertyBoolean();
	dmreplicateonmodifyforcesyncdeletes = ConfigNodePropertyBoolean();
}

ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::~ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties()
{

}

void
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dmreplicateonmodifyenabledKey = "dmreplicateonmodify.enabled";

    if(object.has_key(dmreplicateonmodifyenabledKey))
    {
        bourne::json value = object[dmreplicateonmodifyenabledKey];




        ConfigNodePropertyBoolean* obj = &dmreplicateonmodifyenabled;
		obj->fromJson(value.dump());

    }

    const char *dmreplicateonmodifyforcesyncdeletesKey = "dmreplicateonmodify.forcesyncdeletes";

    if(object.has_key(dmreplicateonmodifyforcesyncdeletesKey))
    {
        bourne::json value = object[dmreplicateonmodifyforcesyncdeletesKey];




        ConfigNodePropertyBoolean* obj = &dmreplicateonmodifyforcesyncdeletes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["dmreplicateonmodifyenabled"] = getDmreplicateonmodifyenabled().toJson();






	object["dmreplicateonmodifyforcesyncdeletes"] = getDmreplicateonmodifyforcesyncdeletes().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::getDmreplicateonmodifyenabled()
{
	return dmreplicateonmodifyenabled;
}

void
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::setDmreplicateonmodifyenabled(ConfigNodePropertyBoolean dmreplicateonmodifyenabled)
{
	this->dmreplicateonmodifyenabled = dmreplicateonmodifyenabled;
}

ConfigNodePropertyBoolean
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::getDmreplicateonmodifyforcesyncdeletes()
{
	return dmreplicateonmodifyforcesyncdeletes;
}

void
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties::setDmreplicateonmodifyforcesyncdeletes(ConfigNodePropertyBoolean dmreplicateonmodifyforcesyncdeletes)
{
	this->dmreplicateonmodifyforcesyncdeletes = dmreplicateonmodifyforcesyncdeletes;
}



