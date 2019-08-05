/*
 * ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties_H_
#define _ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties();
	ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqstorelisteneradditionalStorePaths();

	/*! \brief Set 
	 */
	void setCqstorelisteneradditionalStorePaths(ConfigNodePropertyArray  cqstorelisteneradditionalStorePaths);

private:
	ConfigNodePropertyArray cqstorelisteneradditionalStorePaths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties_H_ */
