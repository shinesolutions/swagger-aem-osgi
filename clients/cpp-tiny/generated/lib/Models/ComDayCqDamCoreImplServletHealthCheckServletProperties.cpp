

#include "ComDayCqDamCoreImplServletHealthCheckServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletHealthCheckServletProperties::ComDayCqDamCoreImplServletHealthCheckServletProperties()
{
	cqdamsyncworkflowid = ConfigNodePropertyString();
	cqdamsyncfoldertypes = ConfigNodePropertyArray();
}

ComDayCqDamCoreImplServletHealthCheckServletProperties::ComDayCqDamCoreImplServletHealthCheckServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletHealthCheckServletProperties::~ComDayCqDamCoreImplServletHealthCheckServletProperties()
{

}

void
ComDayCqDamCoreImplServletHealthCheckServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamsyncworkflowidKey = "cq.dam.sync.workflow.id";

    if(object.has_key(cqdamsyncworkflowidKey))
    {
        bourne::json value = object[cqdamsyncworkflowidKey];




        ConfigNodePropertyString* obj = &cqdamsyncworkflowid;
		obj->fromJson(value.dump());

    }

    const char *cqdamsyncfoldertypesKey = "cq.dam.sync.folder.types";

    if(object.has_key(cqdamsyncfoldertypesKey))
    {
        bourne::json value = object[cqdamsyncfoldertypesKey];




        ConfigNodePropertyArray* obj = &cqdamsyncfoldertypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletHealthCheckServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamsyncworkflowid"] = getCqdamsyncworkflowid().toJson();






	object["cqdamsyncfoldertypes"] = getCqdamsyncfoldertypes().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplServletHealthCheckServletProperties::getCqdamsyncworkflowid()
{
	return cqdamsyncworkflowid;
}

void
ComDayCqDamCoreImplServletHealthCheckServletProperties::setCqdamsyncworkflowid(ConfigNodePropertyString cqdamsyncworkflowid)
{
	this->cqdamsyncworkflowid = cqdamsyncworkflowid;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletHealthCheckServletProperties::getCqdamsyncfoldertypes()
{
	return cqdamsyncfoldertypes;
}

void
ComDayCqDamCoreImplServletHealthCheckServletProperties::setCqdamsyncfoldertypes(ConfigNodePropertyArray cqdamsyncfoldertypes)
{
	this->cqdamsyncfoldertypes = cqdamsyncfoldertypes;
}



