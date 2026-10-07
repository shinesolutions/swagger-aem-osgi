

#include "OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.h"

using namespace Tiny;

OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties()
{
	jaspercompilerTargetVM = ConfigNodePropertyString();
	jaspercompilerSourceVM = ConfigNodePropertyString();
	jasperclassdebuginfo = ConfigNodePropertyBoolean();
	jasperenablePooling = ConfigNodePropertyBoolean();
	jasperieClassId = ConfigNodePropertyString();
	jaspergenStringAsCharArray = ConfigNodePropertyBoolean();
	jasperkeepgenerated = ConfigNodePropertyBoolean();
	jaspermappedfile = ConfigNodePropertyBoolean();
	jaspertrimSpaces = ConfigNodePropertyBoolean();
	jasperdisplaySourceFragments = ConfigNodePropertyBoolean();
	defaultissession = ConfigNodePropertyBoolean();
}

OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::~OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties()
{

}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *jaspercompilerTargetVMKey = "jasper.compilerTargetVM";

    if(object.has_key(jaspercompilerTargetVMKey))
    {
        bourne::json value = object[jaspercompilerTargetVMKey];




        ConfigNodePropertyString* obj = &jaspercompilerTargetVM;
		obj->fromJson(value.dump());

    }

    const char *jaspercompilerSourceVMKey = "jasper.compilerSourceVM";

    if(object.has_key(jaspercompilerSourceVMKey))
    {
        bourne::json value = object[jaspercompilerSourceVMKey];




        ConfigNodePropertyString* obj = &jaspercompilerSourceVM;
		obj->fromJson(value.dump());

    }

    const char *jasperclassdebuginfoKey = "jasper.classdebuginfo";

    if(object.has_key(jasperclassdebuginfoKey))
    {
        bourne::json value = object[jasperclassdebuginfoKey];




        ConfigNodePropertyBoolean* obj = &jasperclassdebuginfo;
		obj->fromJson(value.dump());

    }

    const char *jasperenablePoolingKey = "jasper.enablePooling";

    if(object.has_key(jasperenablePoolingKey))
    {
        bourne::json value = object[jasperenablePoolingKey];




        ConfigNodePropertyBoolean* obj = &jasperenablePooling;
		obj->fromJson(value.dump());

    }

    const char *jasperieClassIdKey = "jasper.ieClassId";

    if(object.has_key(jasperieClassIdKey))
    {
        bourne::json value = object[jasperieClassIdKey];




        ConfigNodePropertyString* obj = &jasperieClassId;
		obj->fromJson(value.dump());

    }

    const char *jaspergenStringAsCharArrayKey = "jasper.genStringAsCharArray";

    if(object.has_key(jaspergenStringAsCharArrayKey))
    {
        bourne::json value = object[jaspergenStringAsCharArrayKey];




        ConfigNodePropertyBoolean* obj = &jaspergenStringAsCharArray;
		obj->fromJson(value.dump());

    }

    const char *jasperkeepgeneratedKey = "jasper.keepgenerated";

    if(object.has_key(jasperkeepgeneratedKey))
    {
        bourne::json value = object[jasperkeepgeneratedKey];




        ConfigNodePropertyBoolean* obj = &jasperkeepgenerated;
		obj->fromJson(value.dump());

    }

    const char *jaspermappedfileKey = "jasper.mappedfile";

    if(object.has_key(jaspermappedfileKey))
    {
        bourne::json value = object[jaspermappedfileKey];




        ConfigNodePropertyBoolean* obj = &jaspermappedfile;
		obj->fromJson(value.dump());

    }

    const char *jaspertrimSpacesKey = "jasper.trimSpaces";

    if(object.has_key(jaspertrimSpacesKey))
    {
        bourne::json value = object[jaspertrimSpacesKey];




        ConfigNodePropertyBoolean* obj = &jaspertrimSpaces;
		obj->fromJson(value.dump());

    }

    const char *jasperdisplaySourceFragmentsKey = "jasper.displaySourceFragments";

    if(object.has_key(jasperdisplaySourceFragmentsKey))
    {
        bourne::json value = object[jasperdisplaySourceFragmentsKey];




        ConfigNodePropertyBoolean* obj = &jasperdisplaySourceFragments;
		obj->fromJson(value.dump());

    }

    const char *defaultissessionKey = "default.is.session";

    if(object.has_key(defaultissessionKey))
    {
        bourne::json value = object[defaultissessionKey];




        ConfigNodePropertyBoolean* obj = &defaultissession;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["jaspercompilerTargetVM"] = getJaspercompilerTargetVM().toJson();






	object["jaspercompilerSourceVM"] = getJaspercompilerSourceVM().toJson();






	object["jasperclassdebuginfo"] = getJasperclassdebuginfo().toJson();






	object["jasperenablePooling"] = getJasperenablePooling().toJson();






	object["jasperieClassId"] = getJasperieClassId().toJson();






	object["jaspergenStringAsCharArray"] = getJaspergenStringAsCharArray().toJson();






	object["jasperkeepgenerated"] = getJasperkeepgenerated().toJson();






	object["jaspermappedfile"] = getJaspermappedfile().toJson();






	object["jaspertrimSpaces"] = getJaspertrimSpaces().toJson();






	object["jasperdisplaySourceFragments"] = getJasperdisplaySourceFragments().toJson();






	object["defaultissession"] = getDefaultissession().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJaspercompilerTargetVM()
{
	return jaspercompilerTargetVM;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJaspercompilerTargetVM(ConfigNodePropertyString jaspercompilerTargetVM)
{
	this->jaspercompilerTargetVM = jaspercompilerTargetVM;
}

ConfigNodePropertyString
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJaspercompilerSourceVM()
{
	return jaspercompilerSourceVM;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJaspercompilerSourceVM(ConfigNodePropertyString jaspercompilerSourceVM)
{
	this->jaspercompilerSourceVM = jaspercompilerSourceVM;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperclassdebuginfo()
{
	return jasperclassdebuginfo;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperclassdebuginfo(ConfigNodePropertyBoolean jasperclassdebuginfo)
{
	this->jasperclassdebuginfo = jasperclassdebuginfo;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperenablePooling()
{
	return jasperenablePooling;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperenablePooling(ConfigNodePropertyBoolean jasperenablePooling)
{
	this->jasperenablePooling = jasperenablePooling;
}

ConfigNodePropertyString
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperieClassId()
{
	return jasperieClassId;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperieClassId(ConfigNodePropertyString jasperieClassId)
{
	this->jasperieClassId = jasperieClassId;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJaspergenStringAsCharArray()
{
	return jaspergenStringAsCharArray;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJaspergenStringAsCharArray(ConfigNodePropertyBoolean jaspergenStringAsCharArray)
{
	this->jaspergenStringAsCharArray = jaspergenStringAsCharArray;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperkeepgenerated()
{
	return jasperkeepgenerated;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperkeepgenerated(ConfigNodePropertyBoolean jasperkeepgenerated)
{
	this->jasperkeepgenerated = jasperkeepgenerated;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJaspermappedfile()
{
	return jaspermappedfile;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJaspermappedfile(ConfigNodePropertyBoolean jaspermappedfile)
{
	this->jaspermappedfile = jaspermappedfile;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJaspertrimSpaces()
{
	return jaspertrimSpaces;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJaspertrimSpaces(ConfigNodePropertyBoolean jaspertrimSpaces)
{
	this->jaspertrimSpaces = jaspertrimSpaces;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getJasperdisplaySourceFragments()
{
	return jasperdisplaySourceFragments;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setJasperdisplaySourceFragments(ConfigNodePropertyBoolean jasperdisplaySourceFragments)
{
	this->jasperdisplaySourceFragments = jasperdisplaySourceFragments;
}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::getDefaultissession()
{
	return defaultissession;
}

void
OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties::setDefaultissession(ConfigNodePropertyBoolean defaultissession)
{
	this->defaultissession = defaultissession;
}



