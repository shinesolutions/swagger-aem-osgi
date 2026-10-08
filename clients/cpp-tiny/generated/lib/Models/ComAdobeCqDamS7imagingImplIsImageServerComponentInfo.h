
/*
 * ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamS7imagingImplIsImageServerComponentInfo_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamS7imagingImplIsImageServerComponentInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqDamS7imagingImplIsImageServerComponentInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamS7imagingImplIsImageServerComponentInfo();
    ComAdobeCqDamS7imagingImplIsImageServerComponentInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamS7imagingImplIsImageServerComponentInfo();


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
	ComAdobeCqDamS7imagingImplIsImageServerComponentProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqDamS7imagingImplIsImageServerComponentProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeCqDamS7imagingImplIsImageServerComponentProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamS7imagingImplIsImageServerComponentInfo_H_ */
