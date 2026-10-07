/*
 * ComDayCqDamHandlerStandardPsPostScriptHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamHandlerStandardPsPostScriptHandlerProperties_H_
#define _ComDayCqDamHandlerStandardPsPostScriptHandlerProperties_H_


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

class ComDayCqDamHandlerStandardPsPostScriptHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamHandlerStandardPsPostScriptHandlerProperties();
	ComDayCqDamHandlerStandardPsPostScriptHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamHandlerStandardPsPostScriptHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRasterannotation();

	/*! \brief Set 
	 */
	void setRasterannotation(ConfigNodePropertyBoolean  rasterannotation);

private:
	ConfigNodePropertyBoolean rasterannotation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamHandlerStandardPsPostScriptHandlerProperties_H_ */
