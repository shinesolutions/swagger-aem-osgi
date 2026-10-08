

#include "ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.h"

using namespace Tiny;

ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties()
{
	cqdams7damvideoproxyclientservicemultipartuploadminsizename = ConfigNodePropertyInteger();
	cqdams7damvideoproxyclientservicemultipartuploadpartsizename = ConfigNodePropertyInteger();
	cqdams7damvideoproxyclientservicemultipartuploadnumthreadname = ConfigNodePropertyInteger();
	cqdams7damvideoproxyclientservicehttpreadtimeoutname = ConfigNodePropertyInteger();
	cqdams7damvideoproxyclientservicehttpconnectiontimeoutname = ConfigNodePropertyInteger();
	cqdams7damvideoproxyclientservicehttpmaxretrycountname = ConfigNodePropertyInteger();
	cqdams7damvideoproxyclientserviceuploadprogressintervalname = ConfigNodePropertyInteger();
}

ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::~ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties()
{

}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdams7damvideoproxyclientservicemultipartuploadminsizenameKey = "cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name";

    if(object.has_key(cqdams7damvideoproxyclientservicemultipartuploadminsizenameKey))
    {
        bourne::json value = object[cqdams7damvideoproxyclientservicemultipartuploadminsizenameKey];




        ConfigNodePropertyInteger* obj = &cqdams7damvideoproxyclientservicemultipartuploadminsizename;
		obj->fromJson(value.dump());

    }

    const char *cqdams7damvideoproxyclientservicemultipartuploadpartsizenameKey = "cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name";

    if(object.has_key(cqdams7damvideoproxyclientservicemultipartuploadpartsizenameKey))
    {
        bourne::json value = object[cqdams7damvideoproxyclientservicemultipartuploadpartsizenameKey];




        ConfigNodePropertyInteger* obj = &cqdams7damvideoproxyclientservicemultipartuploadpartsizename;
		obj->fromJson(value.dump());

    }

    const char *cqdams7damvideoproxyclientservicemultipartuploadnumthreadnameKey = "cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name";

    if(object.has_key(cqdams7damvideoproxyclientservicemultipartuploadnumthreadnameKey))
    {
        bourne::json value = object[cqdams7damvideoproxyclientservicemultipartuploadnumthreadnameKey];




        ConfigNodePropertyInteger* obj = &cqdams7damvideoproxyclientservicemultipartuploadnumthreadname;
		obj->fromJson(value.dump());

    }

    const char *cqdams7damvideoproxyclientservicehttpreadtimeoutnameKey = "cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name";

    if(object.has_key(cqdams7damvideoproxyclientservicehttpreadtimeoutnameKey))
    {
        bourne::json value = object[cqdams7damvideoproxyclientservicehttpreadtimeoutnameKey];




        ConfigNodePropertyInteger* obj = &cqdams7damvideoproxyclientservicehttpreadtimeoutname;
		obj->fromJson(value.dump());

    }

    const char *cqdams7damvideoproxyclientservicehttpconnectiontimeoutnameKey = "cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name";

    if(object.has_key(cqdams7damvideoproxyclientservicehttpconnectiontimeoutnameKey))
    {
        bourne::json value = object[cqdams7damvideoproxyclientservicehttpconnectiontimeoutnameKey];




        ConfigNodePropertyInteger* obj = &cqdams7damvideoproxyclientservicehttpconnectiontimeoutname;
		obj->fromJson(value.dump());

    }

    const char *cqdams7damvideoproxyclientservicehttpmaxretrycountnameKey = "cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name";

    if(object.has_key(cqdams7damvideoproxyclientservicehttpmaxretrycountnameKey))
    {
        bourne::json value = object[cqdams7damvideoproxyclientservicehttpmaxretrycountnameKey];




        ConfigNodePropertyInteger* obj = &cqdams7damvideoproxyclientservicehttpmaxretrycountname;
		obj->fromJson(value.dump());

    }

    const char *cqdams7damvideoproxyclientserviceuploadprogressintervalnameKey = "cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name";

    if(object.has_key(cqdams7damvideoproxyclientserviceuploadprogressintervalnameKey))
    {
        bourne::json value = object[cqdams7damvideoproxyclientserviceuploadprogressintervalnameKey];




        ConfigNodePropertyInteger* obj = &cqdams7damvideoproxyclientserviceuploadprogressintervalname;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdams7damvideoproxyclientservicemultipartuploadminsizename"] = getCqdams7damvideoproxyclientservicemultipartuploadminsizename().toJson();






	object["cqdams7damvideoproxyclientservicemultipartuploadpartsizename"] = getCqdams7damvideoproxyclientservicemultipartuploadpartsizename().toJson();






	object["cqdams7damvideoproxyclientservicemultipartuploadnumthreadname"] = getCqdams7damvideoproxyclientservicemultipartuploadnumthreadname().toJson();






	object["cqdams7damvideoproxyclientservicehttpreadtimeoutname"] = getCqdams7damvideoproxyclientservicehttpreadtimeoutname().toJson();






	object["cqdams7damvideoproxyclientservicehttpconnectiontimeoutname"] = getCqdams7damvideoproxyclientservicehttpconnectiontimeoutname().toJson();






	object["cqdams7damvideoproxyclientservicehttpmaxretrycountname"] = getCqdams7damvideoproxyclientservicehttpmaxretrycountname().toJson();






	object["cqdams7damvideoproxyclientserviceuploadprogressintervalname"] = getCqdams7damvideoproxyclientserviceuploadprogressintervalname().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientservicemultipartuploadminsizename()
{
	return cqdams7damvideoproxyclientservicemultipartuploadminsizename;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientservicemultipartuploadminsizename(ConfigNodePropertyInteger cqdams7damvideoproxyclientservicemultipartuploadminsizename)
{
	this->cqdams7damvideoproxyclientservicemultipartuploadminsizename = cqdams7damvideoproxyclientservicemultipartuploadminsizename;
}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientservicemultipartuploadpartsizename()
{
	return cqdams7damvideoproxyclientservicemultipartuploadpartsizename;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientservicemultipartuploadpartsizename(ConfigNodePropertyInteger cqdams7damvideoproxyclientservicemultipartuploadpartsizename)
{
	this->cqdams7damvideoproxyclientservicemultipartuploadpartsizename = cqdams7damvideoproxyclientservicemultipartuploadpartsizename;
}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientservicemultipartuploadnumthreadname()
{
	return cqdams7damvideoproxyclientservicemultipartuploadnumthreadname;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientservicemultipartuploadnumthreadname(ConfigNodePropertyInteger cqdams7damvideoproxyclientservicemultipartuploadnumthreadname)
{
	this->cqdams7damvideoproxyclientservicemultipartuploadnumthreadname = cqdams7damvideoproxyclientservicemultipartuploadnumthreadname;
}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientservicehttpreadtimeoutname()
{
	return cqdams7damvideoproxyclientservicehttpreadtimeoutname;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientservicehttpreadtimeoutname(ConfigNodePropertyInteger cqdams7damvideoproxyclientservicehttpreadtimeoutname)
{
	this->cqdams7damvideoproxyclientservicehttpreadtimeoutname = cqdams7damvideoproxyclientservicehttpreadtimeoutname;
}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientservicehttpconnectiontimeoutname()
{
	return cqdams7damvideoproxyclientservicehttpconnectiontimeoutname;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientservicehttpconnectiontimeoutname(ConfigNodePropertyInteger cqdams7damvideoproxyclientservicehttpconnectiontimeoutname)
{
	this->cqdams7damvideoproxyclientservicehttpconnectiontimeoutname = cqdams7damvideoproxyclientservicehttpconnectiontimeoutname;
}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientservicehttpmaxretrycountname()
{
	return cqdams7damvideoproxyclientservicehttpmaxretrycountname;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientservicehttpmaxretrycountname(ConfigNodePropertyInteger cqdams7damvideoproxyclientservicehttpmaxretrycountname)
{
	this->cqdams7damvideoproxyclientservicehttpmaxretrycountname = cqdams7damvideoproxyclientservicehttpmaxretrycountname;
}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientserviceuploadprogressintervalname()
{
	return cqdams7damvideoproxyclientserviceuploadprogressintervalname;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientserviceuploadprogressintervalname(ConfigNodePropertyInteger cqdams7damvideoproxyclientserviceuploadprogressintervalname)
{
	this->cqdams7damvideoproxyclientserviceuploadprogressintervalname = cqdams7damvideoproxyclientserviceuploadprogressintervalname;
}



