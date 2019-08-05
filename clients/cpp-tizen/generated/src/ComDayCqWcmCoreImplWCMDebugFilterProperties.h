/*
 * ComDayCqWcmCoreImplWCMDebugFilterProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplWCMDebugFilterProperties_H_
#define _ComDayCqWcmCoreImplWCMDebugFilterProperties_H_


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

class ComDayCqWcmCoreImplWCMDebugFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplWCMDebugFilterProperties();
	ComDayCqWcmCoreImplWCMDebugFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplWCMDebugFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getWcmdbgfilterenabled();

	/*! \brief Set 
	 */
	void setWcmdbgfilterenabled(ConfigNodePropertyBoolean  wcmdbgfilterenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getWcmdbgfilterjspDebug();

	/*! \brief Set 
	 */
	void setWcmdbgfilterjspDebug(ConfigNodePropertyBoolean  wcmdbgfilterjspDebug);

private:
	ConfigNodePropertyBoolean wcmdbgfilterenabled;
	ConfigNodePropertyBoolean wcmdbgfilterjspDebug;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplWCMDebugFilterProperties_H_ */
