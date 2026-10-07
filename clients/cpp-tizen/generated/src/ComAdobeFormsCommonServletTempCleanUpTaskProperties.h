/*
 * ComAdobeFormsCommonServletTempCleanUpTaskProperties.h
 *
 * 
 */

#ifndef _ComAdobeFormsCommonServletTempCleanUpTaskProperties_H_
#define _ComAdobeFormsCommonServletTempCleanUpTaskProperties_H_


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

class ComAdobeFormsCommonServletTempCleanUpTaskProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeFormsCommonServletTempCleanUpTaskProperties();
	ComAdobeFormsCommonServletTempCleanUpTaskProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeFormsCommonServletTempCleanUpTaskProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString  schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDurationforTemporaryStorage();

	/*! \brief Set 
	 */
	void setDurationforTemporaryStorage(ConfigNodePropertyString  durationforTemporaryStorage);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDurationforAnonymousStorage();

	/*! \brief Set 
	 */
	void setDurationforAnonymousStorage(ConfigNodePropertyString  durationforAnonymousStorage);

private:
	ConfigNodePropertyString schedulerexpression;
	ConfigNodePropertyString durationforTemporaryStorage;
	ConfigNodePropertyString durationforAnonymousStorage;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeFormsCommonServletTempCleanUpTaskProperties_H_ */
