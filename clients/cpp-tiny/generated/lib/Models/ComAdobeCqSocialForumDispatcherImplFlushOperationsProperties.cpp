

#include "ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.h"

using namespace Tiny;

ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties()
{
	extensionorder = ConfigNodePropertyInteger();
	flushforumontopic = ConfigNodePropertyBoolean();
}

ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::~ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties()
{

}

void
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *extensionorderKey = "extension.order";

    if(object.has_key(extensionorderKey))
    {
        bourne::json value = object[extensionorderKey];




        ConfigNodePropertyInteger* obj = &extensionorder;
		obj->fromJson(value.dump());

    }

    const char *flushforumontopicKey = "flush.forumontopic";

    if(object.has_key(flushforumontopicKey))
    {
        bourne::json value = object[flushforumontopicKey];




        ConfigNodePropertyBoolean* obj = &flushforumontopic;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["extensionorder"] = getExtensionorder().toJson();






	object["flushforumontopic"] = getFlushforumontopic().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::getExtensionorder()
{
	return extensionorder;
}

void
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::setExtensionorder(ConfigNodePropertyInteger extensionorder)
{
	this->extensionorder = extensionorder;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::getFlushforumontopic()
{
	return flushforumontopic;
}

void
ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties::setFlushforumontopic(ConfigNodePropertyBoolean flushforumontopic)
{
	this->flushforumontopic = flushforumontopic;
}



