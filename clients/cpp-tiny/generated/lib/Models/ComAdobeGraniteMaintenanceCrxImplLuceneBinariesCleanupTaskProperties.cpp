

#include "ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties.h"

using namespace Tiny;

ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties::ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties()
{
	jobtopics = ConfigNodePropertyString();
}

ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties::ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties::~ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties()
{

}

void
ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *jobtopicsKey = "job.topics";

    if(object.has_key(jobtopicsKey))
    {
        bourne::json value = object[jobtopicsKey];




        ConfigNodePropertyString* obj = &jobtopics;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["jobtopics"] = getJobtopics().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties::getJobtopics()
{
	return jobtopics;
}

void
ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties::setJobtopics(ConfigNodePropertyString jobtopics)
{
	this->jobtopics = jobtopics;
}



