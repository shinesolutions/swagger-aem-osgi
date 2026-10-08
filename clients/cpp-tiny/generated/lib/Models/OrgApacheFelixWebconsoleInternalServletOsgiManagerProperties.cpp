

#include "OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.h"

using namespace Tiny;

OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties()
{
	managerroot = ConfigNodePropertyString();
	httpservicefilter = ConfigNodePropertyString();
	defaultrender = ConfigNodePropertyString();
	realm = ConfigNodePropertyString();
	username = ConfigNodePropertyString();
	password = ConfigNodePropertyString();
	category = ConfigNodePropertyString();
	locale = ConfigNodePropertyString();
	loglevel = ConfigNodePropertyDropDown();
	plugins = ConfigNodePropertyDropDown();
}

OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::~OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties()
{

}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *managerrootKey = "manager.root";

    if(object.has_key(managerrootKey))
    {
        bourne::json value = object[managerrootKey];




        ConfigNodePropertyString* obj = &managerroot;
		obj->fromJson(value.dump());

    }

    const char *httpservicefilterKey = "http.service.filter";

    if(object.has_key(httpservicefilterKey))
    {
        bourne::json value = object[httpservicefilterKey];




        ConfigNodePropertyString* obj = &httpservicefilter;
		obj->fromJson(value.dump());

    }

    const char *defaultrenderKey = "default.render";

    if(object.has_key(defaultrenderKey))
    {
        bourne::json value = object[defaultrenderKey];




        ConfigNodePropertyString* obj = &defaultrender;
		obj->fromJson(value.dump());

    }

    const char *realmKey = "realm";

    if(object.has_key(realmKey))
    {
        bourne::json value = object[realmKey];




        ConfigNodePropertyString* obj = &realm;
		obj->fromJson(value.dump());

    }

    const char *usernameKey = "username";

    if(object.has_key(usernameKey))
    {
        bourne::json value = object[usernameKey];




        ConfigNodePropertyString* obj = &username;
		obj->fromJson(value.dump());

    }

    const char *passwordKey = "password";

    if(object.has_key(passwordKey))
    {
        bourne::json value = object[passwordKey];




        ConfigNodePropertyString* obj = &password;
		obj->fromJson(value.dump());

    }

    const char *categoryKey = "category";

    if(object.has_key(categoryKey))
    {
        bourne::json value = object[categoryKey];




        ConfigNodePropertyString* obj = &category;
		obj->fromJson(value.dump());

    }

    const char *localeKey = "locale";

    if(object.has_key(localeKey))
    {
        bourne::json value = object[localeKey];




        ConfigNodePropertyString* obj = &locale;
		obj->fromJson(value.dump());

    }

    const char *loglevelKey = "loglevel";

    if(object.has_key(loglevelKey))
    {
        bourne::json value = object[loglevelKey];




        ConfigNodePropertyDropDown* obj = &loglevel;
		obj->fromJson(value.dump());

    }

    const char *pluginsKey = "plugins";

    if(object.has_key(pluginsKey))
    {
        bourne::json value = object[pluginsKey];




        ConfigNodePropertyDropDown* obj = &plugins;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["managerroot"] = getManagerroot().toJson();






	object["httpservicefilter"] = getHttpservicefilter().toJson();






	object["defaultrender"] = getDefaultrender().toJson();






	object["realm"] = getRealm().toJson();






	object["username"] = getUsername().toJson();






	object["password"] = getPassword().toJson();






	object["category"] = getCategory().toJson();






	object["locale"] = getLocale().toJson();






	object["loglevel"] = getLoglevel().toJson();






	object["plugins"] = getPlugins().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getManagerroot()
{
	return managerroot;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setManagerroot(ConfigNodePropertyString managerroot)
{
	this->managerroot = managerroot;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getHttpservicefilter()
{
	return httpservicefilter;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setHttpservicefilter(ConfigNodePropertyString httpservicefilter)
{
	this->httpservicefilter = httpservicefilter;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getDefaultrender()
{
	return defaultrender;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setDefaultrender(ConfigNodePropertyString defaultrender)
{
	this->defaultrender = defaultrender;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getRealm()
{
	return realm;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setRealm(ConfigNodePropertyString realm)
{
	this->realm = realm;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getUsername()
{
	return username;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setUsername(ConfigNodePropertyString username)
{
	this->username = username;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getPassword()
{
	return password;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setPassword(ConfigNodePropertyString password)
{
	this->password = password;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getCategory()
{
	return category;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setCategory(ConfigNodePropertyString category)
{
	this->category = category;
}

ConfigNodePropertyString
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getLocale()
{
	return locale;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setLocale(ConfigNodePropertyString locale)
{
	this->locale = locale;
}

ConfigNodePropertyDropDown
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getLoglevel()
{
	return loglevel;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setLoglevel(ConfigNodePropertyDropDown loglevel)
{
	this->loglevel = loglevel;
}

ConfigNodePropertyDropDown
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::getPlugins()
{
	return plugins;
}

void
OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties::setPlugins(ConfigNodePropertyDropDown plugins)
{
	this->plugins = plugins;
}



