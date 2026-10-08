

#include "ComDayCqDamScene7ImplScene7APIClientImplProperties.h"

using namespace Tiny;

ComDayCqDamScene7ImplScene7APIClientImplProperties::ComDayCqDamScene7ImplScene7APIClientImplProperties()
{
	cqdamscene7apiclientrecordsperpagenofiltername = ConfigNodePropertyInteger();
	cqdamscene7apiclientrecordsperpagewithfiltername = ConfigNodePropertyInteger();
}

ComDayCqDamScene7ImplScene7APIClientImplProperties::ComDayCqDamScene7ImplScene7APIClientImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamScene7ImplScene7APIClientImplProperties::~ComDayCqDamScene7ImplScene7APIClientImplProperties()
{

}

void
ComDayCqDamScene7ImplScene7APIClientImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamscene7apiclientrecordsperpagenofilternameKey = "cq.dam.scene7.apiclient.recordsperpage.nofilter.name";

    if(object.has_key(cqdamscene7apiclientrecordsperpagenofilternameKey))
    {
        bourne::json value = object[cqdamscene7apiclientrecordsperpagenofilternameKey];




        ConfigNodePropertyInteger* obj = &cqdamscene7apiclientrecordsperpagenofiltername;
		obj->fromJson(value.dump());

    }

    const char *cqdamscene7apiclientrecordsperpagewithfilternameKey = "cq.dam.scene7.apiclient.recordsperpage.withfilter.name";

    if(object.has_key(cqdamscene7apiclientrecordsperpagewithfilternameKey))
    {
        bourne::json value = object[cqdamscene7apiclientrecordsperpagewithfilternameKey];




        ConfigNodePropertyInteger* obj = &cqdamscene7apiclientrecordsperpagewithfiltername;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamScene7ImplScene7APIClientImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamscene7apiclientrecordsperpagenofiltername"] = getCqdamscene7apiclientrecordsperpagenofiltername().toJson();






	object["cqdamscene7apiclientrecordsperpagewithfiltername"] = getCqdamscene7apiclientrecordsperpagewithfiltername().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamScene7ImplScene7APIClientImplProperties::getCqdamscene7apiclientrecordsperpagenofiltername()
{
	return cqdamscene7apiclientrecordsperpagenofiltername;
}

void
ComDayCqDamScene7ImplScene7APIClientImplProperties::setCqdamscene7apiclientrecordsperpagenofiltername(ConfigNodePropertyInteger cqdamscene7apiclientrecordsperpagenofiltername)
{
	this->cqdamscene7apiclientrecordsperpagenofiltername = cqdamscene7apiclientrecordsperpagenofiltername;
}

ConfigNodePropertyInteger
ComDayCqDamScene7ImplScene7APIClientImplProperties::getCqdamscene7apiclientrecordsperpagewithfiltername()
{
	return cqdamscene7apiclientrecordsperpagewithfiltername;
}

void
ComDayCqDamScene7ImplScene7APIClientImplProperties::setCqdamscene7apiclientrecordsperpagewithfiltername(ConfigNodePropertyInteger cqdamscene7apiclientrecordsperpagewithfiltername)
{
	this->cqdamscene7apiclientrecordsperpagewithfiltername = cqdamscene7apiclientrecordsperpagewithfiltername;
}



