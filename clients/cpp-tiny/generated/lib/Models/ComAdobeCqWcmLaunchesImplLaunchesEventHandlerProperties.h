
/*
 * ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties();
    ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties();


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
	ConfigNodePropertyInteger getLauncheseventhandlerthreadpoolmaxsize();

	/*! \brief Set 
	 */
	void setLauncheseventhandlerthreadpoolmaxsize(ConfigNodePropertyInteger launcheseventhandlerthreadpoolmaxsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getLauncheseventhandlerthreadpoolpriority();

	/*! \brief Set 
	 */
	void setLauncheseventhandlerthreadpoolpriority(ConfigNodePropertyDropDown launcheseventhandlerthreadpoolpriority);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLauncheseventhandlerupdatelastmodification();

	/*! \brief Set 
	 */
	void setLauncheseventhandlerupdatelastmodification(ConfigNodePropertyBoolean launcheseventhandlerupdatelastmodification);


    private:
    ConfigNodePropertyString eventfilter;
    ConfigNodePropertyInteger launcheseventhandlerthreadpoolmaxsize;
    ConfigNodePropertyDropDown launcheseventhandlerthreadpoolpriority;
    ConfigNodePropertyBoolean launcheseventhandlerupdatelastmodification;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties_H_ */
