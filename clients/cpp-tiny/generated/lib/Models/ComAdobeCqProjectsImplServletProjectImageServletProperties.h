
/*
 * ComAdobeCqProjectsImplServletProjectImageServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqProjectsImplServletProjectImageServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqProjectsImplServletProjectImageServletProperties_H_


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

class ComAdobeCqProjectsImplServletProjectImageServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqProjectsImplServletProjectImageServletProperties();
    ComAdobeCqProjectsImplServletProjectImageServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqProjectsImplServletProjectImageServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getImagequality();

	/*! \brief Set 
	 */
	void setImagequality(ConfigNodePropertyString imagequality);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getImagesupportedresolutions();

	/*! \brief Set 
	 */
	void setImagesupportedresolutions(ConfigNodePropertyString imagesupportedresolutions);


    private:
    ConfigNodePropertyString imagequality;
    ConfigNodePropertyString imagesupportedresolutions;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqProjectsImplServletProjectImageServletProperties_H_ */
