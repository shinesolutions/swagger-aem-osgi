
/*
 * ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties_H_


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

class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties();
    ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcludesearchpath();

	/*! \brief Set 
	 */
	void setExcludesearchpath(ConfigNodePropertyArray excludesearchpath);


    private:
    ConfigNodePropertyArray hctags;
    ConfigNodePropertyArray excludesearchpath;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties_H_ */
