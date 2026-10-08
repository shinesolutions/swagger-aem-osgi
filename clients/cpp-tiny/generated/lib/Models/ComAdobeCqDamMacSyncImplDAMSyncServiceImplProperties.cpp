

#include "ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties()
{
	comadobecqdammacsyncdamsyncserviceregistered_paths = ConfigNodePropertyArray();
	comadobecqdammacsyncdamsyncservicesyncrenditions = ConfigNodePropertyBoolean();
	comadobecqdammacsyncdamsyncservicereplicatethreadwaitms = ConfigNodePropertyInteger();
	comadobecqdammacsyncdamsyncserviceplatform = ConfigNodePropertyDropDown();
}

ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::~ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties()
{

}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *comadobecqdammacsyncdamsyncserviceregistered_pathsKey = "com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths";

    if(object.has_key(comadobecqdammacsyncdamsyncserviceregistered_pathsKey))
    {
        bourne::json value = object[comadobecqdammacsyncdamsyncserviceregistered_pathsKey];




        ConfigNodePropertyArray* obj = &comadobecqdammacsyncdamsyncserviceregistered_paths;
		obj->fromJson(value.dump());

    }

    const char *comadobecqdammacsyncdamsyncservicesyncrenditionsKey = "com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions";

    if(object.has_key(comadobecqdammacsyncdamsyncservicesyncrenditionsKey))
    {
        bourne::json value = object[comadobecqdammacsyncdamsyncservicesyncrenditionsKey];




        ConfigNodePropertyBoolean* obj = &comadobecqdammacsyncdamsyncservicesyncrenditions;
		obj->fromJson(value.dump());

    }

    const char *comadobecqdammacsyncdamsyncservicereplicatethreadwaitmsKey = "com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms";

    if(object.has_key(comadobecqdammacsyncdamsyncservicereplicatethreadwaitmsKey))
    {
        bourne::json value = object[comadobecqdammacsyncdamsyncservicereplicatethreadwaitmsKey];




        ConfigNodePropertyInteger* obj = &comadobecqdammacsyncdamsyncservicereplicatethreadwaitms;
		obj->fromJson(value.dump());

    }

    const char *comadobecqdammacsyncdamsyncserviceplatformKey = "com.adobe.cq.dam.mac.sync.damsyncservice.platform";

    if(object.has_key(comadobecqdammacsyncdamsyncserviceplatformKey))
    {
        bourne::json value = object[comadobecqdammacsyncdamsyncserviceplatformKey];




        ConfigNodePropertyDropDown* obj = &comadobecqdammacsyncdamsyncserviceplatform;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["comadobecqdammacsyncdamsyncserviceregistered_paths"] = getComadobecqdammacsyncdamsyncserviceregisteredPaths().toJson();






	object["comadobecqdammacsyncdamsyncservicesyncrenditions"] = getComadobecqdammacsyncdamsyncservicesyncrenditions().toJson();






	object["comadobecqdammacsyncdamsyncservicereplicatethreadwaitms"] = getComadobecqdammacsyncdamsyncservicereplicatethreadwaitms().toJson();






	object["comadobecqdammacsyncdamsyncserviceplatform"] = getComadobecqdammacsyncdamsyncserviceplatform().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::getComadobecqdammacsyncdamsyncserviceregisteredPaths()
{
	return comadobecqdammacsyncdamsyncserviceregistered_paths;
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::setComadobecqdammacsyncdamsyncserviceregisteredPaths(ConfigNodePropertyArray comadobecqdammacsyncdamsyncserviceregistered_paths)
{
	this->comadobecqdammacsyncdamsyncserviceregistered_paths = comadobecqdammacsyncdamsyncserviceregistered_paths;
}

ConfigNodePropertyBoolean
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::getComadobecqdammacsyncdamsyncservicesyncrenditions()
{
	return comadobecqdammacsyncdamsyncservicesyncrenditions;
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::setComadobecqdammacsyncdamsyncservicesyncrenditions(ConfigNodePropertyBoolean comadobecqdammacsyncdamsyncservicesyncrenditions)
{
	this->comadobecqdammacsyncdamsyncservicesyncrenditions = comadobecqdammacsyncdamsyncservicesyncrenditions;
}

ConfigNodePropertyInteger
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::getComadobecqdammacsyncdamsyncservicereplicatethreadwaitms()
{
	return comadobecqdammacsyncdamsyncservicereplicatethreadwaitms;
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::setComadobecqdammacsyncdamsyncservicereplicatethreadwaitms(ConfigNodePropertyInteger comadobecqdammacsyncdamsyncservicereplicatethreadwaitms)
{
	this->comadobecqdammacsyncdamsyncservicereplicatethreadwaitms = comadobecqdammacsyncdamsyncservicereplicatethreadwaitms;
}

ConfigNodePropertyDropDown
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::getComadobecqdammacsyncdamsyncserviceplatform()
{
	return comadobecqdammacsyncdamsyncserviceplatform;
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties::setComadobecqdammacsyncdamsyncserviceplatform(ConfigNodePropertyDropDown comadobecqdammacsyncdamsyncserviceplatform)
{
	this->comadobecqdammacsyncdamsyncserviceplatform = comadobecqdammacsyncdamsyncserviceplatform;
}



