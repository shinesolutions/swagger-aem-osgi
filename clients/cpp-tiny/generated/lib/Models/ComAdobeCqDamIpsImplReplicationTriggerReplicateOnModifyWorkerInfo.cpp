

#include "ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo.h"

using namespace Tiny;

ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo::ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties();
}

ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo::ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo::~ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo()
{

}

void
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pidKey = "pid";

    if(object.has_key(pidKey))
    {
        bourne::json value = object[pidKey];



        jsonToValue(&pid, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];




        ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo::setProperties(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties properties)
{
	this->properties = properties;
}



