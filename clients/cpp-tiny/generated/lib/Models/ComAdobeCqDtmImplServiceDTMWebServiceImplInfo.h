
/*
 * ComAdobeCqDtmImplServiceDTMWebServiceImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDtmImplServiceDTMWebServiceImplInfo_H_
#define TINY_CPP_CLIENT_ComAdobeCqDtmImplServiceDTMWebServiceImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqDtmImplServiceDTMWebServiceImplInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDtmImplServiceDTMWebServiceImplInfo();
    ComAdobeCqDtmImplServiceDTMWebServiceImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDtmImplServiceDTMWebServiceImplInfo();


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
	ComAdobeCqDtmImplServiceDTMWebServiceImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqDtmImplServiceDTMWebServiceImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeCqDtmImplServiceDTMWebServiceImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDtmImplServiceDTMWebServiceImplInfo_H_ */
