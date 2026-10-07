/*
 * ComDayCqExtwidgetServletsImageSpriteServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqExtwidgetServletsImageSpriteServletProperties_H_
#define _ComDayCqExtwidgetServletsImageSpriteServletProperties_H_


#include <string>
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

class ComDayCqExtwidgetServletsImageSpriteServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqExtwidgetServletsImageSpriteServletProperties();
	ComDayCqExtwidgetServletsImageSpriteServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqExtwidgetServletsImageSpriteServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxWidth();

	/*! \brief Set 
	 */
	void setMaxWidth(ConfigNodePropertyInteger  maxWidth);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxHeight();

	/*! \brief Set 
	 */
	void setMaxHeight(ConfigNodePropertyInteger  maxHeight);

private:
	ConfigNodePropertyInteger maxWidth;
	ConfigNodePropertyInteger maxHeight;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqExtwidgetServletsImageSpriteServletProperties_H_ */
