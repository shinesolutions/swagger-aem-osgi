
/*
 * ComDayCqDamCoreImplServletCompanionServletInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCompanionServletInfo_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCompanionServletInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqDamCoreImplServletCompanionServletProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplServletCompanionServletInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletCompanionServletInfo();
    ComDayCqDamCoreImplServletCompanionServletInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletCompanionServletInfo();


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
	ComDayCqDamCoreImplServletCompanionServletProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamCoreImplServletCompanionServletProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqDamCoreImplServletCompanionServletProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCompanionServletInfo_H_ */
