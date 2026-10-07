
/*
 * ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo_H_
#define TINY_CPP_CLIENT_ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo();
    ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo();


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
	ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo_H_ */
