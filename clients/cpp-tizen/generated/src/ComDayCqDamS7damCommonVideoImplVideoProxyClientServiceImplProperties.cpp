#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties()
{
	//__init();
}

ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::~ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::__init()
{
	//cqdams7damvideoproxyclientservicemultipartuploadminsizename = new ConfigNodePropertyInteger();
	//cqdams7damvideoproxyclientservicemultipartuploadpartsizename = new ConfigNodePropertyInteger();
	//cqdams7damvideoproxyclientservicemultipartuploadnumthreadname = new ConfigNodePropertyInteger();
	//cqdams7damvideoproxyclientservicehttpreadtimeoutname = new ConfigNodePropertyInteger();
	//cqdams7damvideoproxyclientservicehttpconnectiontimeoutname = new ConfigNodePropertyInteger();
	//cqdams7damvideoproxyclientservicehttpmaxretrycountname = new ConfigNodePropertyInteger();
	//cqdams7damvideoproxyclientserviceuploadprogressintervalname = new ConfigNodePropertyInteger();
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::__cleanup()
{
	//if(cqdams7damvideoproxyclientservicemultipartuploadminsizename != NULL) {
	//
	//delete cqdams7damvideoproxyclientservicemultipartuploadminsizename;
	//cqdams7damvideoproxyclientservicemultipartuploadminsizename = NULL;
	//}
	//if(cqdams7damvideoproxyclientservicemultipartuploadpartsizename != NULL) {
	//
	//delete cqdams7damvideoproxyclientservicemultipartuploadpartsizename;
	//cqdams7damvideoproxyclientservicemultipartuploadpartsizename = NULL;
	//}
	//if(cqdams7damvideoproxyclientservicemultipartuploadnumthreadname != NULL) {
	//
	//delete cqdams7damvideoproxyclientservicemultipartuploadnumthreadname;
	//cqdams7damvideoproxyclientservicemultipartuploadnumthreadname = NULL;
	//}
	//if(cqdams7damvideoproxyclientservicehttpreadtimeoutname != NULL) {
	//
	//delete cqdams7damvideoproxyclientservicehttpreadtimeoutname;
	//cqdams7damvideoproxyclientservicehttpreadtimeoutname = NULL;
	//}
	//if(cqdams7damvideoproxyclientservicehttpconnectiontimeoutname != NULL) {
	//
	//delete cqdams7damvideoproxyclientservicehttpconnectiontimeoutname;
	//cqdams7damvideoproxyclientservicehttpconnectiontimeoutname = NULL;
	//}
	//if(cqdams7damvideoproxyclientservicehttpmaxretrycountname != NULL) {
	//
	//delete cqdams7damvideoproxyclientservicehttpmaxretrycountname;
	//cqdams7damvideoproxyclientservicehttpmaxretrycountname = NULL;
	//}
	//if(cqdams7damvideoproxyclientserviceuploadprogressintervalname != NULL) {
	//
	//delete cqdams7damvideoproxyclientserviceuploadprogressintervalname;
	//cqdams7damvideoproxyclientserviceuploadprogressintervalname = NULL;
	//}
	//
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdams7damvideoproxyclientservicemultipartuploadminsizenameKey = "cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name";
	node = json_object_get_member(pJsonObject, cqdams7damvideoproxyclientservicemultipartuploadminsizenameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdams7damvideoproxyclientservicemultipartuploadminsizename, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdams7damvideoproxyclientservicemultipartuploadminsizename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdams7damvideoproxyclientservicemultipartuploadpartsizenameKey = "cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name";
	node = json_object_get_member(pJsonObject, cqdams7damvideoproxyclientservicemultipartuploadpartsizenameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdams7damvideoproxyclientservicemultipartuploadpartsizename, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdams7damvideoproxyclientservicemultipartuploadpartsizename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdams7damvideoproxyclientservicemultipartuploadnumthreadnameKey = "cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name";
	node = json_object_get_member(pJsonObject, cqdams7damvideoproxyclientservicemultipartuploadnumthreadnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdams7damvideoproxyclientservicemultipartuploadnumthreadname, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdams7damvideoproxyclientservicemultipartuploadnumthreadname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdams7damvideoproxyclientservicehttpreadtimeoutnameKey = "cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name";
	node = json_object_get_member(pJsonObject, cqdams7damvideoproxyclientservicehttpreadtimeoutnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdams7damvideoproxyclientservicehttpreadtimeoutname, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdams7damvideoproxyclientservicehttpreadtimeoutname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdams7damvideoproxyclientservicehttpconnectiontimeoutnameKey = "cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name";
	node = json_object_get_member(pJsonObject, cqdams7damvideoproxyclientservicehttpconnectiontimeoutnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdams7damvideoproxyclientservicehttpconnectiontimeoutname, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdams7damvideoproxyclientservicehttpconnectiontimeoutname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdams7damvideoproxyclientservicehttpmaxretrycountnameKey = "cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name";
	node = json_object_get_member(pJsonObject, cqdams7damvideoproxyclientservicehttpmaxretrycountnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdams7damvideoproxyclientservicehttpmaxretrycountname, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdams7damvideoproxyclientservicehttpmaxretrycountname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdams7damvideoproxyclientserviceuploadprogressintervalnameKey = "cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name";
	node = json_object_get_member(pJsonObject, cqdams7damvideoproxyclientserviceuploadprogressintervalnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdams7damvideoproxyclientserviceuploadprogressintervalname, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdams7damvideoproxyclientserviceuploadprogressintervalname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdams7damvideoproxyclientservicemultipartuploadminsizename();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdams7damvideoproxyclientservicemultipartuploadminsizename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdams7damvideoproxyclientservicemultipartuploadminsizenameKey = "cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name";
	json_object_set_member(pJsonObject, cqdams7damvideoproxyclientservicemultipartuploadminsizenameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdams7damvideoproxyclientservicemultipartuploadpartsizename();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdams7damvideoproxyclientservicemultipartuploadpartsizename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdams7damvideoproxyclientservicemultipartuploadpartsizenameKey = "cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name";
	json_object_set_member(pJsonObject, cqdams7damvideoproxyclientservicemultipartuploadpartsizenameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdams7damvideoproxyclientservicemultipartuploadnumthreadname();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdams7damvideoproxyclientservicemultipartuploadnumthreadname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdams7damvideoproxyclientservicemultipartuploadnumthreadnameKey = "cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name";
	json_object_set_member(pJsonObject, cqdams7damvideoproxyclientservicemultipartuploadnumthreadnameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdams7damvideoproxyclientservicehttpreadtimeoutname();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdams7damvideoproxyclientservicehttpreadtimeoutname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdams7damvideoproxyclientservicehttpreadtimeoutnameKey = "cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name";
	json_object_set_member(pJsonObject, cqdams7damvideoproxyclientservicehttpreadtimeoutnameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdams7damvideoproxyclientservicehttpconnectiontimeoutname();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdams7damvideoproxyclientservicehttpconnectiontimeoutname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdams7damvideoproxyclientservicehttpconnectiontimeoutnameKey = "cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name";
	json_object_set_member(pJsonObject, cqdams7damvideoproxyclientservicehttpconnectiontimeoutnameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdams7damvideoproxyclientservicehttpmaxretrycountname();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdams7damvideoproxyclientservicehttpmaxretrycountname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdams7damvideoproxyclientservicehttpmaxretrycountnameKey = "cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name";
	json_object_set_member(pJsonObject, cqdams7damvideoproxyclientservicehttpmaxretrycountnameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdams7damvideoproxyclientserviceuploadprogressintervalname();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdams7damvideoproxyclientserviceuploadprogressintervalname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdams7damvideoproxyclientserviceuploadprogressintervalnameKey = "cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name";
	json_object_set_member(pJsonObject, cqdams7damvideoproxyclientserviceuploadprogressintervalnameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientservicemultipartuploadminsizename()
{
	return cqdams7damvideoproxyclientservicemultipartuploadminsizename;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientservicemultipartuploadminsizename(ConfigNodePropertyInteger  cqdams7damvideoproxyclientservicemultipartuploadminsizename)
{
	this->cqdams7damvideoproxyclientservicemultipartuploadminsizename = cqdams7damvideoproxyclientservicemultipartuploadminsizename;
}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientservicemultipartuploadpartsizename()
{
	return cqdams7damvideoproxyclientservicemultipartuploadpartsizename;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientservicemultipartuploadpartsizename(ConfigNodePropertyInteger  cqdams7damvideoproxyclientservicemultipartuploadpartsizename)
{
	this->cqdams7damvideoproxyclientservicemultipartuploadpartsizename = cqdams7damvideoproxyclientservicemultipartuploadpartsizename;
}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientservicemultipartuploadnumthreadname()
{
	return cqdams7damvideoproxyclientservicemultipartuploadnumthreadname;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientservicemultipartuploadnumthreadname(ConfigNodePropertyInteger  cqdams7damvideoproxyclientservicemultipartuploadnumthreadname)
{
	this->cqdams7damvideoproxyclientservicemultipartuploadnumthreadname = cqdams7damvideoproxyclientservicemultipartuploadnumthreadname;
}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientservicehttpreadtimeoutname()
{
	return cqdams7damvideoproxyclientservicehttpreadtimeoutname;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientservicehttpreadtimeoutname(ConfigNodePropertyInteger  cqdams7damvideoproxyclientservicehttpreadtimeoutname)
{
	this->cqdams7damvideoproxyclientservicehttpreadtimeoutname = cqdams7damvideoproxyclientservicehttpreadtimeoutname;
}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientservicehttpconnectiontimeoutname()
{
	return cqdams7damvideoproxyclientservicehttpconnectiontimeoutname;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientservicehttpconnectiontimeoutname(ConfigNodePropertyInteger  cqdams7damvideoproxyclientservicehttpconnectiontimeoutname)
{
	this->cqdams7damvideoproxyclientservicehttpconnectiontimeoutname = cqdams7damvideoproxyclientservicehttpconnectiontimeoutname;
}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientservicehttpmaxretrycountname()
{
	return cqdams7damvideoproxyclientservicehttpmaxretrycountname;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientservicehttpmaxretrycountname(ConfigNodePropertyInteger  cqdams7damvideoproxyclientservicehttpmaxretrycountname)
{
	this->cqdams7damvideoproxyclientservicehttpmaxretrycountname = cqdams7damvideoproxyclientservicehttpmaxretrycountname;
}

ConfigNodePropertyInteger
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::getCqdams7damvideoproxyclientserviceuploadprogressintervalname()
{
	return cqdams7damvideoproxyclientserviceuploadprogressintervalname;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties::setCqdams7damvideoproxyclientserviceuploadprogressintervalname(ConfigNodePropertyInteger  cqdams7damvideoproxyclientserviceuploadprogressintervalname)
{
	this->cqdams7damvideoproxyclientserviceuploadprogressintervalname = cqdams7damvideoproxyclientserviceuploadprogressintervalname;
}


