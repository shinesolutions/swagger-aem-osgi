
/*
 * ComDayCqDamHandlerFfmpegLocatorImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamHandlerFfmpegLocatorImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamHandlerFfmpegLocatorImplProperties_H_


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

class ComDayCqDamHandlerFfmpegLocatorImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamHandlerFfmpegLocatorImplProperties();
    ComDayCqDamHandlerFfmpegLocatorImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamHandlerFfmpegLocatorImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExecutablesearchpath();

	/*! \brief Set 
	 */
	void setExecutablesearchpath(ConfigNodePropertyArray executablesearchpath);


    private:
    ConfigNodePropertyArray executablesearchpath;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamHandlerFfmpegLocatorImplProperties_H_ */
