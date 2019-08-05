/*
 * ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties_H_
#define _ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties_H_


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

class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties();
	ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMimetype();

	/*! \brief Set 
	 */
	void setMimetype(ConfigNodePropertyString  mimetype);

private:
	ConfigNodePropertyString mimetype;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties_H_ */
