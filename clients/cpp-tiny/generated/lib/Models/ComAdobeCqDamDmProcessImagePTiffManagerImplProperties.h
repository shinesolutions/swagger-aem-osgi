
/*
 * ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamDmProcessImagePTiffManagerImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamDmProcessImagePTiffManagerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamDmProcessImagePTiffManagerImplProperties();
    ComAdobeCqDamDmProcessImagePTiffManagerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamDmProcessImagePTiffManagerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxMemory();

	/*! \brief Set 
	 */
	void setMaxMemory(ConfigNodePropertyInteger maxMemory);


    private:
    ConfigNodePropertyInteger maxMemory;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamDmProcessImagePTiffManagerImplProperties_H_ */
