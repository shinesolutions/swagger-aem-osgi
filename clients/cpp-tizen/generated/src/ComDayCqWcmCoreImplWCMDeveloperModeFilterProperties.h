/*
 * ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties_H_
#define _ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties_H_


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

class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties();
	ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getWcmdevmodefilterenabled();

	/*! \brief Set 
	 */
	void setWcmdevmodefilterenabled(ConfigNodePropertyBoolean  wcmdevmodefilterenabled);

private:
	ConfigNodePropertyBoolean wcmdevmodefilterenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties_H_ */
