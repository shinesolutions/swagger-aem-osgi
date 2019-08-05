#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties()
{
	//__init();
}

OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::~OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties()
{
	//__cleanup();
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::__init()
{
	//managerroot = new ConfigNodePropertyString();
	//httpservicefilter = new ConfigNodePropertyString();
	//defaultrender = new ConfigNodePropertyString();
	//realm = new ConfigNodePropertyString();
	//username = new ConfigNodePropertyString();
	//password = new ConfigNodePropertyString();
	//category = new ConfigNodePropertyString();
	//locale = new ConfigNodePropertyString();
	//loglevel = new ConfigNodePropertyDropDown();
	//plugins = new ConfigNodePropertyDropDown();
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::__cleanup()
{
	//if(managerroot != NULL) {
	//
	//delete managerroot;
	//managerroot = NULL;
	//}
	//if(httpservicefilter != NULL) {
	//
	//delete httpservicefilter;
	//httpservicefilter = NULL;
	//}
	//if(defaultrender != NULL) {
	//
	//delete defaultrender;
	//defaultrender = NULL;
	//}
	//if(realm != NULL) {
	//
	//delete realm;
	//realm = NULL;
	//}
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//if(password != NULL) {
	//
	//delete password;
	//password = NULL;
	//}
	//if(category != NULL) {
	//
	//delete category;
	//category = NULL;
	//}
	//if(locale != NULL) {
	//
	//delete locale;
	//locale = NULL;
	//}
	//if(loglevel != NULL) {
	//
	//delete loglevel;
	//loglevel = NULL;
	//}
	//if(plugins != NULL) {
	//
	//delete plugins;
	//plugins = NULL;
	//}
	//
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *managerrootKey = "manager.root";
	node = json_object_get_member(pJsonObject, managerrootKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&managerroot, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&managerroot);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpservicefilterKey = "http.service.filter";
	node = json_object_get_member(pJsonObject, httpservicefilterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&httpservicefilter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&httpservicefilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultrenderKey = "default.render";
	node = json_object_get_member(pJsonObject, defaultrenderKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaultrender, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaultrender);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *realmKey = "realm";
	node = json_object_get_member(pJsonObject, realmKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&realm, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&realm);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *usernameKey = "username";
	node = json_object_get_member(pJsonObject, usernameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&username, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&username);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passwordKey = "password";
	node = json_object_get_member(pJsonObject, passwordKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&password, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&password);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *categoryKey = "category";
	node = json_object_get_member(pJsonObject, categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&category, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&category);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *localeKey = "locale";
	node = json_object_get_member(pJsonObject, localeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&locale, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&locale);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *loglevelKey = "loglevel";
	node = json_object_get_member(pJsonObject, loglevelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&loglevel, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&loglevel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pluginsKey = "plugins";
	node = json_object_get_member(pJsonObject, pluginsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&plugins, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&plugins);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getManagerroot();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getManagerroot());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *managerrootKey = "manager.root";
	json_object_set_member(pJsonObject, managerrootKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHttpservicefilter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHttpservicefilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpservicefilterKey = "http.service.filter";
	json_object_set_member(pJsonObject, httpservicefilterKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaultrender();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaultrender());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultrenderKey = "default.render";
	json_object_set_member(pJsonObject, defaultrenderKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRealm();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRealm());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *realmKey = "realm";
	json_object_set_member(pJsonObject, realmKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUsername();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUsername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usernameKey = "username";
	json_object_set_member(pJsonObject, usernameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPassword();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passwordKey = "password";
	json_object_set_member(pJsonObject, passwordKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCategory();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCategory());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *categoryKey = "category";
	json_object_set_member(pJsonObject, categoryKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLocale();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLocale());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *localeKey = "locale";
	json_object_set_member(pJsonObject, localeKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getLoglevel();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getLoglevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *loglevelKey = "loglevel";
	json_object_set_member(pJsonObject, loglevelKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getPlugins();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getPlugins());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pluginsKey = "plugins";
	json_object_set_member(pJsonObject, pluginsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getManagerroot()
{
	return managerroot;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setManagerroot(ConfigNodePropertyString  managerroot)
{
	this->managerroot = managerroot;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getHttpservicefilter()
{
	return httpservicefilter;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setHttpservicefilter(ConfigNodePropertyString  httpservicefilter)
{
	this->httpservicefilter = httpservicefilter;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getDefaultrender()
{
	return defaultrender;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setDefaultrender(ConfigNodePropertyString  defaultrender)
{
	this->defaultrender = defaultrender;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getRealm()
{
	return realm;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setRealm(ConfigNodePropertyString  realm)
{
	this->realm = realm;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getUsername()
{
	return username;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setUsername(ConfigNodePropertyString  username)
{
	this->username = username;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getPassword()
{
	return password;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setPassword(ConfigNodePropertyString  password)
{
	this->password = password;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getCategory()
{
	return category;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setCategory(ConfigNodePropertyString  category)
{
	this->category = category;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getLocale()
{
	return locale;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setLocale(ConfigNodePropertyString  locale)
{
	this->locale = locale;
}

ConfigNodePropertyDropDown
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getLoglevel()
{
	return loglevel;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setLoglevel(ConfigNodePropertyDropDown  loglevel)
{
	this->loglevel = loglevel;
}

ConfigNodePropertyDropDown
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getPlugins()
{
	return plugins;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setPlugins(ConfigNodePropertyDropDown  plugins)
{
	this->plugins = plugins;
}


