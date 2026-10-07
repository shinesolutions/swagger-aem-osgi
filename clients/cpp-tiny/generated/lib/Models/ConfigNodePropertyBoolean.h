
/*
 * ConfigNodePropertyBoolean.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConfigNodePropertyBoolean_H_
#define TINY_CPP_CLIENT_ConfigNodePropertyBoolean_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConfigNodePropertyBoolean{
public:

    /*! \brief Constructor.
	 */
    ConfigNodePropertyBoolean();
    ConfigNodePropertyBoolean(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConfigNodePropertyBoolean();


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
	/*! \brief Get Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
	 */
	int getType();

	/*! \brief Set Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
	 */
	void setType(int type);
	/*! \brief Get Property value
	 */
	bool isValue();

	/*! \brief Set Property value
	 */
	void setValue(bool value);
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
    int type{};
    bool value{};
    std::string description{};
};
}

#endif /* TINY_CPP_CLIENT_ConfigNodePropertyBoolean_H_ */
