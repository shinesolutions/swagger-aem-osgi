/*
 * AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.h
 *
 * 
 */

#ifndef _AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties_H_
#define _AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties_H_


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

class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties();
	AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFontList();

	/*! \brief Set 
	 */
	void setFontList(ConfigNodePropertyArray  fontList);

private:
	ConfigNodePropertyArray fontList;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties_H_ */
