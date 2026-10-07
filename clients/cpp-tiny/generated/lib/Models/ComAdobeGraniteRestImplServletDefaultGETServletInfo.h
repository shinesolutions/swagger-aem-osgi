
/*
 * ComAdobeGraniteRestImplServletDefaultGETServletInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteRestImplServletDefaultGETServletInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteRestImplServletDefaultGETServletInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteRestImplServletDefaultGETServletProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteRestImplServletDefaultGETServletInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteRestImplServletDefaultGETServletInfo();
    ComAdobeGraniteRestImplServletDefaultGETServletInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteRestImplServletDefaultGETServletInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	ComAdobeGraniteRestImplServletDefaultGETServletProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteRestImplServletDefaultGETServletProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteRestImplServletDefaultGETServletProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteRestImplServletDefaultGETServletInfo_H_ */
