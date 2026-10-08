
/*
 * OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties();
    OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTotalWidth();

	/*! \brief Set 
	 */
	void setTotalWidth(ConfigNodePropertyInteger totalWidth);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getColWidthName();

	/*! \brief Set 
	 */
	void setColWidthName(ConfigNodePropertyInteger colWidthName);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getColWidthResult();

	/*! \brief Set 
	 */
	void setColWidthResult(ConfigNodePropertyInteger colWidthResult);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getColWidthTiming();

	/*! \brief Set 
	 */
	void setColWidthTiming(ConfigNodePropertyInteger colWidthTiming);


    private:
    ConfigNodePropertyInteger totalWidth;
    ConfigNodePropertyInteger colWidthName;
    ConfigNodePropertyInteger colWidthResult;
    ConfigNodePropertyInteger colWidthTiming;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties_H_ */
