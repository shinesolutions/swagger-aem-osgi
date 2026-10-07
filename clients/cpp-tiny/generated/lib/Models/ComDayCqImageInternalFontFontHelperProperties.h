
/*
 * ComDayCqImageInternalFontFontHelperProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqImageInternalFontFontHelperProperties_H_
#define TINY_CPP_CLIENT_ComDayCqImageInternalFontFontHelperProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqImageInternalFontFontHelperProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqImageInternalFontFontHelperProperties();
    ComDayCqImageInternalFontFontHelperProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqImageInternalFontFontHelperProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFontpath();

	/*! \brief Set 
	 */
	void setFontpath(ConfigNodePropertyArray fontpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOversamplingFactor();

	/*! \brief Set 
	 */
	void setOversamplingFactor(ConfigNodePropertyInteger oversamplingFactor);


    private:
    ConfigNodePropertyArray fontpath;
    ConfigNodePropertyInteger oversamplingFactor;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqImageInternalFontFontHelperProperties_H_ */
