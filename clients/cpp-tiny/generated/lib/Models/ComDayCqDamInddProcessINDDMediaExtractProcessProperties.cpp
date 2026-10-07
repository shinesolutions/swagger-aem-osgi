

#include "ComDayCqDamInddProcessINDDMediaExtractProcessProperties.h"

using namespace Tiny;

ComDayCqDamInddProcessINDDMediaExtractProcessProperties::ComDayCqDamInddProcessINDDMediaExtractProcessProperties()
{
	processlabel = ConfigNodePropertyString();
	cqdaminddpagesregex = ConfigNodePropertyString();
	idsjobdecoupled = ConfigNodePropertyBoolean();
	idsjobworkflowmodel = ConfigNodePropertyString();
}

ComDayCqDamInddProcessINDDMediaExtractProcessProperties::ComDayCqDamInddProcessINDDMediaExtractProcessProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamInddProcessINDDMediaExtractProcessProperties::~ComDayCqDamInddProcessINDDMediaExtractProcessProperties()
{

}

void
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *processlabelKey = "process.label";

    if(object.has_key(processlabelKey))
    {
        bourne::json value = object[processlabelKey];




        ConfigNodePropertyString* obj = &processlabel;
		obj->fromJson(value.dump());

    }

    const char *cqdaminddpagesregexKey = "cq.dam.indd.pages.regex";

    if(object.has_key(cqdaminddpagesregexKey))
    {
        bourne::json value = object[cqdaminddpagesregexKey];




        ConfigNodePropertyString* obj = &cqdaminddpagesregex;
		obj->fromJson(value.dump());

    }

    const char *idsjobdecoupledKey = "ids.job.decoupled";

    if(object.has_key(idsjobdecoupledKey))
    {
        bourne::json value = object[idsjobdecoupledKey];




        ConfigNodePropertyBoolean* obj = &idsjobdecoupled;
		obj->fromJson(value.dump());

    }

    const char *idsjobworkflowmodelKey = "ids.job.workflow.model";

    if(object.has_key(idsjobworkflowmodelKey))
    {
        bourne::json value = object[idsjobworkflowmodelKey];




        ConfigNodePropertyString* obj = &idsjobworkflowmodel;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["processlabel"] = getProcesslabel().toJson();






	object["cqdaminddpagesregex"] = getCqdaminddpagesregex().toJson();






	object["idsjobdecoupled"] = getIdsjobdecoupled().toJson();






	object["idsjobworkflowmodel"] = getIdsjobworkflowmodel().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::setProcesslabel(ConfigNodePropertyString processlabel)
{
	this->processlabel = processlabel;
}

ConfigNodePropertyString
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::getCqdaminddpagesregex()
{
	return cqdaminddpagesregex;
}

void
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::setCqdaminddpagesregex(ConfigNodePropertyString cqdaminddpagesregex)
{
	this->cqdaminddpagesregex = cqdaminddpagesregex;
}

ConfigNodePropertyBoolean
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::getIdsjobdecoupled()
{
	return idsjobdecoupled;
}

void
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::setIdsjobdecoupled(ConfigNodePropertyBoolean idsjobdecoupled)
{
	this->idsjobdecoupled = idsjobdecoupled;
}

ConfigNodePropertyString
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::getIdsjobworkflowmodel()
{
	return idsjobworkflowmodel;
}

void
ComDayCqDamInddProcessINDDMediaExtractProcessProperties::setIdsjobworkflowmodel(ConfigNodePropertyString idsjobworkflowmodel)
{
	this->idsjobworkflowmodel = idsjobworkflowmodel;
}



