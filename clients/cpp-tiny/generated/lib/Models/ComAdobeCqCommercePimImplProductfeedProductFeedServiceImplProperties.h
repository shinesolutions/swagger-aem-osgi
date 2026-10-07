
/*
 * ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties();
    ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getFeedgeneratoralgorithm();

	/*! \brief Set 
	 */
	void setFeedgeneratoralgorithm(ConfigNodePropertyDropDown feedgeneratoralgorithm);


    private:
    ConfigNodePropertyDropDown feedgeneratoralgorithm;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties_H_ */
