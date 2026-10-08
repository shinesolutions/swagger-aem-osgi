
/*
 * ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties();
    ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getStreamPath();

	/*! \brief Set 
	 */
	void setStreamPath(ConfigNodePropertyString streamPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getStreamName();

	/*! \brief Set 
	 */
	void setStreamName(ConfigNodePropertyString streamName);


    private:
    ConfigNodePropertyString streamPath;
    ConfigNodePropertyString streamName;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties_H_ */
