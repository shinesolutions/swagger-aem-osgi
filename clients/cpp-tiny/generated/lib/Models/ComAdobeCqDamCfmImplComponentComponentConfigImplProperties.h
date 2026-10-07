
/*
 * ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamCfmImplComponentComponentConfigImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamCfmImplComponentComponentConfigImplProperties_H_


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

class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamCfmImplComponentComponentConfigImplProperties();
    ComAdobeCqDamCfmImplComponentComponentConfigImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamCfmImplComponentComponentConfigImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDamcfmcomponentresourceType();

	/*! \brief Set 
	 */
	void setDamcfmcomponentresourceType(ConfigNodePropertyString damcfmcomponentresourceType);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDamcfmcomponentfileReferenceProp();

	/*! \brief Set 
	 */
	void setDamcfmcomponentfileReferenceProp(ConfigNodePropertyString damcfmcomponentfileReferenceProp);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDamcfmcomponentelementsProp();

	/*! \brief Set 
	 */
	void setDamcfmcomponentelementsProp(ConfigNodePropertyString damcfmcomponentelementsProp);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDamcfmcomponentvariationProp();

	/*! \brief Set 
	 */
	void setDamcfmcomponentvariationProp(ConfigNodePropertyString damcfmcomponentvariationProp);


    private:
    ConfigNodePropertyString damcfmcomponentresourceType;
    ConfigNodePropertyString damcfmcomponentfileReferenceProp;
    ConfigNodePropertyString damcfmcomponentelementsProp;
    ConfigNodePropertyString damcfmcomponentvariationProp;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamCfmImplComponentComponentConfigImplProperties_H_ */
