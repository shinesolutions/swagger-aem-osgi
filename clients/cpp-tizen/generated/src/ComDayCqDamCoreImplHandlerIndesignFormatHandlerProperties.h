/*
 * ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties_H_
#define _ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties_H_


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

class ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties();
	ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getMimetype();

	/*! \brief Set 
	 */
	void setMimetype(ConfigNodePropertyArray  mimetype);

private:
	ConfigNodePropertyArray mimetype;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties_H_ */
