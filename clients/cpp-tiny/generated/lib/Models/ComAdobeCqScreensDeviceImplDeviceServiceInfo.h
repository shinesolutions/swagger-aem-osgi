
/*
 * ComAdobeCqScreensDeviceImplDeviceServiceInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqScreensDeviceImplDeviceServiceInfo_H_
#define TINY_CPP_CLIENT_ComAdobeCqScreensDeviceImplDeviceServiceInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeCqScreensDeviceImplDeviceServiceProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqScreensDeviceImplDeviceServiceInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqScreensDeviceImplDeviceServiceInfo();
    ComAdobeCqScreensDeviceImplDeviceServiceInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqScreensDeviceImplDeviceServiceInfo();


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
	ComAdobeCqScreensDeviceImplDeviceServiceProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqScreensDeviceImplDeviceServiceProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeCqScreensDeviceImplDeviceServiceProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqScreensDeviceImplDeviceServiceInfo_H_ */
