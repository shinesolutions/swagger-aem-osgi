
/*
 * ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties();
    ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString eventfilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFontmgrsystemfontdir();

	/*! \brief Set 
	 */
	void setFontmgrsystemfontdir(ConfigNodePropertyArray fontmgrsystemfontdir);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFontmgradobefontdir();

	/*! \brief Set 
	 */
	void setFontmgradobefontdir(ConfigNodePropertyString fontmgradobefontdir);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFontmgrcustomerfontdir();

	/*! \brief Set 
	 */
	void setFontmgrcustomerfontdir(ConfigNodePropertyString fontmgrcustomerfontdir);


    private:
    ConfigNodePropertyString eventfilter;
    ConfigNodePropertyArray fontmgrsystemfontdir;
    ConfigNodePropertyString fontmgradobefontdir;
    ConfigNodePropertyString fontmgrcustomerfontdir;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties_H_ */
