/*
 * ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties_H_
#define _ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties();
	ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDamshowexpired();

	/*! \brief Set 
	 */
	void setDamshowexpired(ConfigNodePropertyBoolean  damshowexpired);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDamshowhidden();

	/*! \brief Set 
	 */
	void setDamshowhidden(ConfigNodePropertyBoolean  damshowhidden);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getTagTitleSearch();

	/*! \brief Set 
	 */
	void setTagTitleSearch(ConfigNodePropertyBoolean  tagTitleSearch);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGuessTotal();

	/*! \brief Set 
	 */
	void setGuessTotal(ConfigNodePropertyString  guessTotal);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDamexpiryProperty();

	/*! \brief Set 
	 */
	void setDamexpiryProperty(ConfigNodePropertyString  damexpiryProperty);

private:
	ConfigNodePropertyBoolean damshowexpired;
	ConfigNodePropertyBoolean damshowhidden;
	ConfigNodePropertyBoolean tagTitleSearch;
	ConfigNodePropertyString guessTotal;
	ConfigNodePropertyString damexpiryProperty;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties_H_ */
