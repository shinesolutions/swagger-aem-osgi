

#include "OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.h"

using namespace Tiny;

OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties()
{
	javaclassdebuginfo = ConfigNodePropertyBoolean();
	javajavaEncoding = ConfigNodePropertyString();
	javacompilerSourceVM = ConfigNodePropertyString();
	javacompilerTargetVM = ConfigNodePropertyString();
}

OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::~OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties()
{

}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *javaclassdebuginfoKey = "java.classdebuginfo";

    if(object.has_key(javaclassdebuginfoKey))
    {
        bourne::json value = object[javaclassdebuginfoKey];




        ConfigNodePropertyBoolean* obj = &javaclassdebuginfo;
		obj->fromJson(value.dump());

    }

    const char *javajavaEncodingKey = "java.javaEncoding";

    if(object.has_key(javajavaEncodingKey))
    {
        bourne::json value = object[javajavaEncodingKey];




        ConfigNodePropertyString* obj = &javajavaEncoding;
		obj->fromJson(value.dump());

    }

    const char *javacompilerSourceVMKey = "java.compilerSourceVM";

    if(object.has_key(javacompilerSourceVMKey))
    {
        bourne::json value = object[javacompilerSourceVMKey];




        ConfigNodePropertyString* obj = &javacompilerSourceVM;
		obj->fromJson(value.dump());

    }

    const char *javacompilerTargetVMKey = "java.compilerTargetVM";

    if(object.has_key(javacompilerTargetVMKey))
    {
        bourne::json value = object[javacompilerTargetVMKey];




        ConfigNodePropertyString* obj = &javacompilerTargetVM;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["javaclassdebuginfo"] = getJavaclassdebuginfo().toJson();






	object["javajavaEncoding"] = getJavajavaEncoding().toJson();






	object["javacompilerSourceVM"] = getJavacompilerSourceVM().toJson();






	object["javacompilerTargetVM"] = getJavacompilerTargetVM().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::getJavaclassdebuginfo()
{
	return javaclassdebuginfo;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::setJavaclassdebuginfo(ConfigNodePropertyBoolean javaclassdebuginfo)
{
	this->javaclassdebuginfo = javaclassdebuginfo;
}

ConfigNodePropertyString
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::getJavajavaEncoding()
{
	return javajavaEncoding;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::setJavajavaEncoding(ConfigNodePropertyString javajavaEncoding)
{
	this->javajavaEncoding = javajavaEncoding;
}

ConfigNodePropertyString
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::getJavacompilerSourceVM()
{
	return javacompilerSourceVM;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::setJavacompilerSourceVM(ConfigNodePropertyString javacompilerSourceVM)
{
	this->javacompilerSourceVM = javacompilerSourceVM;
}

ConfigNodePropertyString
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::getJavacompilerTargetVM()
{
	return javacompilerTargetVM;
}

void
OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties::setJavacompilerTargetVM(ConfigNodePropertyString javacompilerTargetVM)
{
	this->javacompilerTargetVM = javacompilerTargetVM;
}



