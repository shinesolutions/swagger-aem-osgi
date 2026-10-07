/*
 * ComDayCqDamHandlerStandardPdfPdfHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamHandlerStandardPdfPdfHandlerProperties_H_
#define _ComDayCqDamHandlerStandardPdfPdfHandlerProperties_H_


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

class ComDayCqDamHandlerStandardPdfPdfHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamHandlerStandardPdfPdfHandlerProperties();
	ComDayCqDamHandlerStandardPdfPdfHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamHandlerStandardPdfPdfHandlerProperties();

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

#endif /* _ComDayCqDamHandlerStandardPdfPdfHandlerProperties_H_ */
