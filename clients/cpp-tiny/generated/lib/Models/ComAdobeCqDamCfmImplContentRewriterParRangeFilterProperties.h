
/*
 * ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties_H_


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

class ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties();
    ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPipelinetype();

	/*! \brief Set 
	 */
	void setPipelinetype(ConfigNodePropertyString pipelinetype);


    private:
    ConfigNodePropertyString pipelinetype;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties_H_ */
