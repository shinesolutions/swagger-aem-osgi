
/*
 * ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties_H_


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

class ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties();
    ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties();


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

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties_H_ */
