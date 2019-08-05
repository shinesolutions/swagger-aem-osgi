/*
 * ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.h
 *
 * 
 */

#ifndef _ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties_H_
#define _ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties_H_


#include <string>
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties();
	ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaileremailcharset();

	/*! \brief Set 
	 */
	void setMaileremailcharset(ConfigNodePropertyString  maileremailcharset);

private:
	ConfigNodePropertyString maileremailcharset;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties_H_ */
