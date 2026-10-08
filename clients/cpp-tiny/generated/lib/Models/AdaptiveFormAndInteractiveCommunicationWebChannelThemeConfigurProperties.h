
/*
 * AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties_H_
#define TINY_CPP_CLIENT_AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties{
public:

    /*! \brief Constructor.
	 */
    AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties();
    AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFontList();

	/*! \brief Set 
	 */
	void setFontList(ConfigNodePropertyArray fontList);


    private:
    ConfigNodePropertyArray fontList;
};
}

#endif /* TINY_CPP_CLIENT_AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties_H_ */
