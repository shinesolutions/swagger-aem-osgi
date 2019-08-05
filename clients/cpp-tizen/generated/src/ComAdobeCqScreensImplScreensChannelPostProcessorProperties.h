/*
 * ComAdobeCqScreensImplScreensChannelPostProcessorProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqScreensImplScreensChannelPostProcessorProperties_H_
#define _ComAdobeCqScreensImplScreensChannelPostProcessorProperties_H_


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

class ComAdobeCqScreensImplScreensChannelPostProcessorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqScreensImplScreensChannelPostProcessorProperties();
	ComAdobeCqScreensImplScreensChannelPostProcessorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqScreensImplScreensChannelPostProcessorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getScreenschannelspropertiestoremove();

	/*! \brief Set 
	 */
	void setScreenschannelspropertiestoremove(ConfigNodePropertyArray  screenschannelspropertiestoremove);

private:
	ConfigNodePropertyArray screenschannelspropertiestoremove;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqScreensImplScreensChannelPostProcessorProperties_H_ */
