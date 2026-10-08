
/*
 * ComAdobeGraniteInfocollectorInfoCollectorInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteInfocollectorInfoCollectorInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteInfocollectorInfoCollectorInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteInfocollectorInfoCollectorProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteInfocollectorInfoCollectorInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteInfocollectorInfoCollectorInfo();
    ComAdobeGraniteInfocollectorInfoCollectorInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteInfocollectorInfoCollectorInfo();


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
	ComAdobeGraniteInfocollectorInfoCollectorProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteInfocollectorInfoCollectorProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteInfocollectorInfoCollectorProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteInfocollectorInfoCollectorInfo_H_ */
