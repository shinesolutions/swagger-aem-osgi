
/*
 * ConfigNodePropertyDropDown.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConfigNodePropertyDropDown_H_
#define TINY_CPP_CLIENT_ConfigNodePropertyDropDown_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "ConfigNodePropertyDropDown_type.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConfigNodePropertyDropDown{
public:

    /*! \brief Constructor.
	 */
    ConfigNodePropertyDropDown();
    ConfigNodePropertyDropDown(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConfigNodePropertyDropDown();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get property name
	 */
	std::string getName();

	/*! \brief Set property name
	 */
	void setName(std::string name);
	/*! \brief Get True if optional
	 */
	bool isOptional();

	/*! \brief Set True if optional
	 */
	void setOptional(bool optional);
	/*! \brief Get True if property is set
	 */
	bool isIsSet();

	/*! \brief Set True if property is set
	 */
	void setIsSet(bool is_set);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown_type getType();

	/*! \brief Set 
	 */
	void setType(ConfigNodePropertyDropDown_type type);
	/*! \brief Get Property value
	 */
	AnyType getValue();

	/*! \brief Set Property value
	 */
	void setValue(AnyType value);
	/*! \brief Get Property description
	 */
	std::string getDescription();

	/*! \brief Set Property description
	 */
	void setDescription(std::string description);


    private:
    std::string name{};
    bool optional{};
    bool is_set{};
    ConfigNodePropertyDropDown_type type;
    AnyType value;
    std::string description{};
};
}

#endif /* TINY_CPP_CLIENT_ConfigNodePropertyDropDown_H_ */
