

#include "ComDayCqDamInddImplServletSnippetCreationServletProperties.h"

using namespace Tiny;

ComDayCqDamInddImplServletSnippetCreationServletProperties::ComDayCqDamInddImplServletSnippetCreationServletProperties()
{
	snippetcreationmaxcollections = ConfigNodePropertyInteger();
}

ComDayCqDamInddImplServletSnippetCreationServletProperties::ComDayCqDamInddImplServletSnippetCreationServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamInddImplServletSnippetCreationServletProperties::~ComDayCqDamInddImplServletSnippetCreationServletProperties()
{

}

void
ComDayCqDamInddImplServletSnippetCreationServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *snippetcreationmaxcollectionsKey = "snippetcreation.maxcollections";

    if(object.has_key(snippetcreationmaxcollectionsKey))
    {
        bourne::json value = object[snippetcreationmaxcollectionsKey];




        ConfigNodePropertyInteger* obj = &snippetcreationmaxcollections;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamInddImplServletSnippetCreationServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["snippetcreationmaxcollections"] = getSnippetcreationmaxcollections().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamInddImplServletSnippetCreationServletProperties::getSnippetcreationmaxcollections()
{
	return snippetcreationmaxcollections;
}

void
ComDayCqDamInddImplServletSnippetCreationServletProperties::setSnippetcreationmaxcollections(ConfigNodePropertyInteger snippetcreationmaxcollections)
{
	this->snippetcreationmaxcollections = snippetcreationmaxcollections;
}



