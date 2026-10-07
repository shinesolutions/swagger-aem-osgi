/*
 * ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties_H_
#define _ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties();
	ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdams7damdynamicmediaconfigeventlistenerenabled();

	/*! \brief Set 
	 */
	void setCqdams7damdynamicmediaconfigeventlistenerenabled(ConfigNodePropertyBoolean  cqdams7damdynamicmediaconfigeventlistenerenabled);

private:
	ConfigNodePropertyBoolean cqdams7damdynamicmediaconfigeventlistenerenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties_H_ */
