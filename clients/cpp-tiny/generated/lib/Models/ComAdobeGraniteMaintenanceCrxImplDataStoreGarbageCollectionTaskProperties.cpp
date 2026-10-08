

#include "ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.h"

using namespace Tiny;

ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties()
{
	granitemaintenancemandatory = ConfigNodePropertyBoolean();
	jobtopics = ConfigNodePropertyString();
}

ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::~ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties()
{

}

void
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *granitemaintenancemandatoryKey = "granite.maintenance.mandatory";

    if(object.has_key(granitemaintenancemandatoryKey))
    {
        bourne::json value = object[granitemaintenancemandatoryKey];




        ConfigNodePropertyBoolean* obj = &granitemaintenancemandatory;
		obj->fromJson(value.dump());

    }

    const char *jobtopicsKey = "job.topics";

    if(object.has_key(jobtopicsKey))
    {
        bourne::json value = object[jobtopicsKey];




        ConfigNodePropertyString* obj = &jobtopics;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["granitemaintenancemandatory"] = getGranitemaintenancemandatory().toJson();






	object["jobtopics"] = getJobtopics().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::getGranitemaintenancemandatory()
{
	return granitemaintenancemandatory;
}

void
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::setGranitemaintenancemandatory(ConfigNodePropertyBoolean granitemaintenancemandatory)
{
	this->granitemaintenancemandatory = granitemaintenancemandatory;
}

ConfigNodePropertyString
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::getJobtopics()
{
	return jobtopics;
}

void
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::setJobtopics(ConfigNodePropertyString jobtopics)
{
	this->jobtopics = jobtopics;
}



