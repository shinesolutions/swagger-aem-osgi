
/*
 * ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo_H_
#define TINY_CPP_CLIENT_ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo();
    ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo();


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
	ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo_H_ */
