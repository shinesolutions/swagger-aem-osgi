
/*
 * ComAdobeGraniteAcpPlatformPlatformServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAcpPlatformPlatformServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAcpPlatformPlatformServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteAcpPlatformPlatformServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAcpPlatformPlatformServletProperties();
    ComAdobeGraniteAcpPlatformPlatformServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAcpPlatformPlatformServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQuerylimit();

	/*! \brief Set 
	 */
	void setQuerylimit(ConfigNodePropertyInteger querylimit);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFiletypeextensionmap();

	/*! \brief Set 
	 */
	void setFiletypeextensionmap(ConfigNodePropertyArray filetypeextensionmap);


    private:
    ConfigNodePropertyInteger querylimit;
    ConfigNodePropertyArray filetypeextensionmap;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAcpPlatformPlatformServletProperties_H_ */
