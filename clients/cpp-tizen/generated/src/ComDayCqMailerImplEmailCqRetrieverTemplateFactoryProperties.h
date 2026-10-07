/*
 * ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.h
 *
 * 
 */

#ifndef _ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties_H_
#define _ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties();
	ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getMaileremailembed();

	/*! \brief Set 
	 */
	void setMaileremailembed(ConfigNodePropertyBoolean  maileremailembed);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaileremailcharset();

	/*! \brief Set 
	 */
	void setMaileremailcharset(ConfigNodePropertyString  maileremailcharset);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaileremailretrieverUserID();

	/*! \brief Set 
	 */
	void setMaileremailretrieverUserID(ConfigNodePropertyString  maileremailretrieverUserID);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaileremailretrieverUserPWD();

	/*! \brief Set 
	 */
	void setMaileremailretrieverUserPWD(ConfigNodePropertyString  maileremailretrieverUserPWD);

private:
	ConfigNodePropertyBoolean maileremailembed;
	ConfigNodePropertyString maileremailcharset;
	ConfigNodePropertyString maileremailretrieverUserID;
	ConfigNodePropertyString maileremailretrieverUserPWD;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties_H_ */
