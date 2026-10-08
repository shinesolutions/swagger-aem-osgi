

#include "OrgApacheSlingServletsGetDefaultGetServletProperties.h"

using namespace Tiny;

OrgApacheSlingServletsGetDefaultGetServletProperties::OrgApacheSlingServletsGetDefaultGetServletProperties()
{
	aliases = ConfigNodePropertyArray();
	index = ConfigNodePropertyBoolean();
	indexfiles = ConfigNodePropertyArray();
	enablehtml = ConfigNodePropertyBoolean();
	enablejson = ConfigNodePropertyBoolean();
	enabletxt = ConfigNodePropertyBoolean();
	enablexml = ConfigNodePropertyBoolean();
	jsonmaximumresults = ConfigNodePropertyInteger();
	ecmaSuport = ConfigNodePropertyBoolean();
}

OrgApacheSlingServletsGetDefaultGetServletProperties::OrgApacheSlingServletsGetDefaultGetServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingServletsGetDefaultGetServletProperties::~OrgApacheSlingServletsGetDefaultGetServletProperties()
{

}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aliasesKey = "aliases";

    if(object.has_key(aliasesKey))
    {
        bourne::json value = object[aliasesKey];




        ConfigNodePropertyArray* obj = &aliases;
		obj->fromJson(value.dump());

    }

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];




        ConfigNodePropertyBoolean* obj = &index;
		obj->fromJson(value.dump());

    }

    const char *indexfilesKey = "index.files";

    if(object.has_key(indexfilesKey))
    {
        bourne::json value = object[indexfilesKey];




        ConfigNodePropertyArray* obj = &indexfiles;
		obj->fromJson(value.dump());

    }

    const char *enablehtmlKey = "enable.html";

    if(object.has_key(enablehtmlKey))
    {
        bourne::json value = object[enablehtmlKey];




        ConfigNodePropertyBoolean* obj = &enablehtml;
		obj->fromJson(value.dump());

    }

    const char *enablejsonKey = "enable.json";

    if(object.has_key(enablejsonKey))
    {
        bourne::json value = object[enablejsonKey];




        ConfigNodePropertyBoolean* obj = &enablejson;
		obj->fromJson(value.dump());

    }

    const char *enabletxtKey = "enable.txt";

    if(object.has_key(enabletxtKey))
    {
        bourne::json value = object[enabletxtKey];




        ConfigNodePropertyBoolean* obj = &enabletxt;
		obj->fromJson(value.dump());

    }

    const char *enablexmlKey = "enable.xml";

    if(object.has_key(enablexmlKey))
    {
        bourne::json value = object[enablexmlKey];




        ConfigNodePropertyBoolean* obj = &enablexml;
		obj->fromJson(value.dump());

    }

    const char *jsonmaximumresultsKey = "json.maximumresults";

    if(object.has_key(jsonmaximumresultsKey))
    {
        bourne::json value = object[jsonmaximumresultsKey];




        ConfigNodePropertyInteger* obj = &jsonmaximumresults;
		obj->fromJson(value.dump());

    }

    const char *ecmaSuportKey = "ecmaSuport";

    if(object.has_key(ecmaSuportKey))
    {
        bourne::json value = object[ecmaSuportKey];




        ConfigNodePropertyBoolean* obj = &ecmaSuport;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingServletsGetDefaultGetServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["aliases"] = getAliases().toJson();






	object["index"] = getIndex().toJson();






	object["indexfiles"] = getIndexfiles().toJson();






	object["enablehtml"] = getEnablehtml().toJson();






	object["enablejson"] = getEnablejson().toJson();






	object["enabletxt"] = getEnabletxt().toJson();






	object["enablexml"] = getEnablexml().toJson();






	object["jsonmaximumresults"] = getJsonmaximumresults().toJson();






	object["ecmaSuport"] = getEcmaSuport().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingServletsGetDefaultGetServletProperties::getAliases()
{
	return aliases;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setAliases(ConfigNodePropertyArray aliases)
{
	this->aliases = aliases;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetDefaultGetServletProperties::getIndex()
{
	return index;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setIndex(ConfigNodePropertyBoolean index)
{
	this->index = index;
}

ConfigNodePropertyArray
OrgApacheSlingServletsGetDefaultGetServletProperties::getIndexfiles()
{
	return indexfiles;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setIndexfiles(ConfigNodePropertyArray indexfiles)
{
	this->indexfiles = indexfiles;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetDefaultGetServletProperties::getEnablehtml()
{
	return enablehtml;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setEnablehtml(ConfigNodePropertyBoolean enablehtml)
{
	this->enablehtml = enablehtml;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetDefaultGetServletProperties::getEnablejson()
{
	return enablejson;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setEnablejson(ConfigNodePropertyBoolean enablejson)
{
	this->enablejson = enablejson;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetDefaultGetServletProperties::getEnabletxt()
{
	return enabletxt;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setEnabletxt(ConfigNodePropertyBoolean enabletxt)
{
	this->enabletxt = enabletxt;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetDefaultGetServletProperties::getEnablexml()
{
	return enablexml;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setEnablexml(ConfigNodePropertyBoolean enablexml)
{
	this->enablexml = enablexml;
}

ConfigNodePropertyInteger
OrgApacheSlingServletsGetDefaultGetServletProperties::getJsonmaximumresults()
{
	return jsonmaximumresults;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setJsonmaximumresults(ConfigNodePropertyInteger jsonmaximumresults)
{
	this->jsonmaximumresults = jsonmaximumresults;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetDefaultGetServletProperties::getEcmaSuport()
{
	return ecmaSuport;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setEcmaSuport(ConfigNodePropertyBoolean ecmaSuport)
{
	this->ecmaSuport = ecmaSuport;
}



