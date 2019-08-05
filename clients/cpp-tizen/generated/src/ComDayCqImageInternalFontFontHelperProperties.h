/*
 * ComDayCqImageInternalFontFontHelperProperties.h
 *
 * 
 */

#ifndef _ComDayCqImageInternalFontFontHelperProperties_H_
#define _ComDayCqImageInternalFontFontHelperProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
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

class ComDayCqImageInternalFontFontHelperProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqImageInternalFontFontHelperProperties();
	ComDayCqImageInternalFontFontHelperProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqImageInternalFontFontHelperProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFontpath();

	/*! \brief Set 
	 */
	void setFontpath(ConfigNodePropertyArray  fontpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOversamplingFactor();

	/*! \brief Set 
	 */
	void setOversamplingFactor(ConfigNodePropertyInteger  oversamplingFactor);

private:
	ConfigNodePropertyArray fontpath;
	ConfigNodePropertyInteger oversamplingFactor;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqImageInternalFontFontHelperProperties_H_ */
