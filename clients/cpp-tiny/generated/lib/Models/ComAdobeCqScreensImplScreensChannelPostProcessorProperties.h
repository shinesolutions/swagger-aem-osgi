
/*
 * ComAdobeCqScreensImplScreensChannelPostProcessorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqScreensImplScreensChannelPostProcessorProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqScreensImplScreensChannelPostProcessorProperties_H_


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

class ComAdobeCqScreensImplScreensChannelPostProcessorProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqScreensImplScreensChannelPostProcessorProperties();
    ComAdobeCqScreensImplScreensChannelPostProcessorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqScreensImplScreensChannelPostProcessorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getScreenschannelspropertiestoremove();

	/*! \brief Set 
	 */
	void setScreenschannelspropertiestoremove(ConfigNodePropertyArray screenschannelspropertiestoremove);


    private:
    ConfigNodePropertyArray screenschannelspropertiestoremove;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqScreensImplScreensChannelPostProcessorProperties_H_ */
