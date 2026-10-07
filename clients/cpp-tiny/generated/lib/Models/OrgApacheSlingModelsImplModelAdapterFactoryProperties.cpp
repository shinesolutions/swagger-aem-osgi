

#include "OrgApacheSlingModelsImplModelAdapterFactoryProperties.h"

using namespace Tiny;

OrgApacheSlingModelsImplModelAdapterFactoryProperties::OrgApacheSlingModelsImplModelAdapterFactoryProperties()
{
	osgihttpwhiteboardlistener = ConfigNodePropertyString();
	osgihttpwhiteboardcontextselect = ConfigNodePropertyString();
	maxrecursiondepth = ConfigNodePropertyInteger();
	cleanupjobperiod = ConfigNodePropertyInteger();
}

OrgApacheSlingModelsImplModelAdapterFactoryProperties::OrgApacheSlingModelsImplModelAdapterFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingModelsImplModelAdapterFactoryProperties::~OrgApacheSlingModelsImplModelAdapterFactoryProperties()
{

}

void
OrgApacheSlingModelsImplModelAdapterFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *osgihttpwhiteboardlistenerKey = "osgi.http.whiteboard.listener";

    if(object.has_key(osgihttpwhiteboardlistenerKey))
    {
        bourne::json value = object[osgihttpwhiteboardlistenerKey];




        ConfigNodePropertyString* obj = &osgihttpwhiteboardlistener;
		obj->fromJson(value.dump());

    }

    const char *osgihttpwhiteboardcontextselectKey = "osgi.http.whiteboard.context.select";

    if(object.has_key(osgihttpwhiteboardcontextselectKey))
    {
        bourne::json value = object[osgihttpwhiteboardcontextselectKey];




        ConfigNodePropertyString* obj = &osgihttpwhiteboardcontextselect;
		obj->fromJson(value.dump());

    }

    const char *maxrecursiondepthKey = "max.recursion.depth";

    if(object.has_key(maxrecursiondepthKey))
    {
        bourne::json value = object[maxrecursiondepthKey];




        ConfigNodePropertyInteger* obj = &maxrecursiondepth;
		obj->fromJson(value.dump());

    }

    const char *cleanupjobperiodKey = "cleanup.job.period";

    if(object.has_key(cleanupjobperiodKey))
    {
        bourne::json value = object[cleanupjobperiodKey];




        ConfigNodePropertyInteger* obj = &cleanupjobperiod;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingModelsImplModelAdapterFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["osgihttpwhiteboardlistener"] = getOsgihttpwhiteboardlistener().toJson();






	object["osgihttpwhiteboardcontextselect"] = getOsgihttpwhiteboardcontextselect().toJson();






	object["maxrecursiondepth"] = getMaxrecursiondepth().toJson();






	object["cleanupjobperiod"] = getCleanupjobperiod().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingModelsImplModelAdapterFactoryProperties::getOsgihttpwhiteboardlistener()
{
	return osgihttpwhiteboardlistener;
}

void
OrgApacheSlingModelsImplModelAdapterFactoryProperties::setOsgihttpwhiteboardlistener(ConfigNodePropertyString osgihttpwhiteboardlistener)
{
	this->osgihttpwhiteboardlistener = osgihttpwhiteboardlistener;
}

ConfigNodePropertyString
OrgApacheSlingModelsImplModelAdapterFactoryProperties::getOsgihttpwhiteboardcontextselect()
{
	return osgihttpwhiteboardcontextselect;
}

void
OrgApacheSlingModelsImplModelAdapterFactoryProperties::setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString osgihttpwhiteboardcontextselect)
{
	this->osgihttpwhiteboardcontextselect = osgihttpwhiteboardcontextselect;
}

ConfigNodePropertyInteger
OrgApacheSlingModelsImplModelAdapterFactoryProperties::getMaxrecursiondepth()
{
	return maxrecursiondepth;
}

void
OrgApacheSlingModelsImplModelAdapterFactoryProperties::setMaxrecursiondepth(ConfigNodePropertyInteger maxrecursiondepth)
{
	this->maxrecursiondepth = maxrecursiondepth;
}

ConfigNodePropertyInteger
OrgApacheSlingModelsImplModelAdapterFactoryProperties::getCleanupjobperiod()
{
	return cleanupjobperiod;
}

void
OrgApacheSlingModelsImplModelAdapterFactoryProperties::setCleanupjobperiod(ConfigNodePropertyInteger cleanupjobperiod)
{
	this->cleanupjobperiod = cleanupjobperiod;
}



