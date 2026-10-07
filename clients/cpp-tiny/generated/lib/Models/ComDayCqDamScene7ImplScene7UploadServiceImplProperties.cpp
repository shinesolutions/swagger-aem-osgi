

#include "ComDayCqDamScene7ImplScene7UploadServiceImplProperties.h"

using namespace Tiny;

ComDayCqDamScene7ImplScene7UploadServiceImplProperties::ComDayCqDamScene7ImplScene7UploadServiceImplProperties()
{
	cqdamscene7uploadserviceactivejobtimeoutlabel = ConfigNodePropertyInteger();
	cqdamscene7uploadserviceconnectionmaxperroutelabel = ConfigNodePropertyInteger();
}

ComDayCqDamScene7ImplScene7UploadServiceImplProperties::ComDayCqDamScene7ImplScene7UploadServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamScene7ImplScene7UploadServiceImplProperties::~ComDayCqDamScene7ImplScene7UploadServiceImplProperties()
{

}

void
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamscene7uploadserviceactivejobtimeoutlabelKey = "cq.dam.scene7.uploadservice.activejobtimeout.label";

    if(object.has_key(cqdamscene7uploadserviceactivejobtimeoutlabelKey))
    {
        bourne::json value = object[cqdamscene7uploadserviceactivejobtimeoutlabelKey];




        ConfigNodePropertyInteger* obj = &cqdamscene7uploadserviceactivejobtimeoutlabel;
		obj->fromJson(value.dump());

    }

    const char *cqdamscene7uploadserviceconnectionmaxperroutelabelKey = "cq.dam.scene7.uploadservice.connectionmaxperroute.label";

    if(object.has_key(cqdamscene7uploadserviceconnectionmaxperroutelabelKey))
    {
        bourne::json value = object[cqdamscene7uploadserviceconnectionmaxperroutelabelKey];




        ConfigNodePropertyInteger* obj = &cqdamscene7uploadserviceconnectionmaxperroutelabel;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamscene7uploadserviceactivejobtimeoutlabel"] = getCqdamscene7uploadserviceactivejobtimeoutlabel().toJson();






	object["cqdamscene7uploadserviceconnectionmaxperroutelabel"] = getCqdamscene7uploadserviceconnectionmaxperroutelabel().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::getCqdamscene7uploadserviceactivejobtimeoutlabel()
{
	return cqdamscene7uploadserviceactivejobtimeoutlabel;
}

void
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::setCqdamscene7uploadserviceactivejobtimeoutlabel(ConfigNodePropertyInteger cqdamscene7uploadserviceactivejobtimeoutlabel)
{
	this->cqdamscene7uploadserviceactivejobtimeoutlabel = cqdamscene7uploadserviceactivejobtimeoutlabel;
}

ConfigNodePropertyInteger
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::getCqdamscene7uploadserviceconnectionmaxperroutelabel()
{
	return cqdamscene7uploadserviceconnectionmaxperroutelabel;
}

void
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::setCqdamscene7uploadserviceconnectionmaxperroutelabel(ConfigNodePropertyInteger cqdamscene7uploadserviceconnectionmaxperroutelabel)
{
	this->cqdamscene7uploadserviceconnectionmaxperroutelabel = cqdamscene7uploadserviceconnectionmaxperroutelabel;
}



