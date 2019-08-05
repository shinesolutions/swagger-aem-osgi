/*
 * ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties_H_
#define _ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties_H_


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

class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties();
	ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqanalyticstestandtargetaccountoptionsupdaterenabled();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetaccountoptionsupdaterenabled(ConfigNodePropertyBoolean  cqanalyticstestandtargetaccountoptionsupdaterenabled);

private:
	ConfigNodePropertyBoolean cqanalyticstestandtargetaccountoptionsupdaterenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties_H_ */
