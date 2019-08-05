/*
 * ComDayCqDamCoreImplServletCompanionServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletCompanionServletProperties_H_
#define _ComDayCqDamCoreImplServletCompanionServletProperties_H_


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

class ComDayCqDamCoreImplServletCompanionServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletCompanionServletProperties();
	ComDayCqDamCoreImplServletCompanionServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletCompanionServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMoreInfo();

	/*! \brief Set 
	 */
	void setMoreInfo(ConfigNodePropertyString  moreInfo);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMntoverlaydamguicontentassetsmoreinfohtmlpath();

	/*! \brief Set 
	 */
	void setMntoverlaydamguicontentassetsmoreinfohtmlpath(ConfigNodePropertyString  mntoverlaydamguicontentassetsmoreinfohtmlpath);

private:
	ConfigNodePropertyString moreInfo;
	ConfigNodePropertyString mntoverlaydamguicontentassetsmoreinfohtmlpath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletCompanionServletProperties_H_ */
