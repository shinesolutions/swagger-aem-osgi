/*
 * ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties_H_
#define _ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties_H_


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

class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties();
	ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqanalyticstestandtargetdeleteauthoractivitylistenerenabled();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetdeleteauthoractivitylistenerenabled(ConfigNodePropertyBoolean  cqanalyticstestandtargetdeleteauthoractivitylistenerenabled);

private:
	ConfigNodePropertyBoolean cqanalyticstestandtargetdeleteauthoractivitylistenerenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties_H_ */
