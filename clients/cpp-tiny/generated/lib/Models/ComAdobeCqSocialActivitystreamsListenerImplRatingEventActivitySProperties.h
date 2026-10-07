
/*
 * ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties();
    ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRanking();

	/*! \brief Set 
	 */
	void setRanking(ConfigNodePropertyInteger ranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnable();

	/*! \brief Set 
	 */
	void setEnable(ConfigNodePropertyBoolean enable);


    private:
    ConfigNodePropertyInteger ranking;
    ConfigNodePropertyBoolean enable;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties_H_ */
