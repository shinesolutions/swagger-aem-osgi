
/*
 * ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo();
    ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo();


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
	ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo_H_ */
