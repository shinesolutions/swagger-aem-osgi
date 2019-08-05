/*
 * ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties_H_
#define _ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties();
	ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString  eventfilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFontmgrsystemfontdir();

	/*! \brief Set 
	 */
	void setFontmgrsystemfontdir(ConfigNodePropertyArray  fontmgrsystemfontdir);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFontmgradobefontdir();

	/*! \brief Set 
	 */
	void setFontmgradobefontdir(ConfigNodePropertyString  fontmgradobefontdir);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFontmgrcustomerfontdir();

	/*! \brief Set 
	 */
	void setFontmgrcustomerfontdir(ConfigNodePropertyString  fontmgrcustomerfontdir);

private:
	ConfigNodePropertyString eventfilter;
	ConfigNodePropertyArray fontmgrsystemfontdir;
	ConfigNodePropertyString fontmgradobefontdir;
	ConfigNodePropertyString fontmgrcustomerfontdir;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties_H_ */
