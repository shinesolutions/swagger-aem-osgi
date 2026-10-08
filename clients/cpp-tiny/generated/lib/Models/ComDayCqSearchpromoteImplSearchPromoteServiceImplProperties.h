
/*
 * ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties();
    ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqsearchpromoteconfigurationserveruri();

	/*! \brief Set 
	 */
	void setCqsearchpromoteconfigurationserveruri(ConfigNodePropertyString cqsearchpromoteconfigurationserveruri);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqsearchpromoteconfigurationenvironment();

	/*! \brief Set 
	 */
	void setCqsearchpromoteconfigurationenvironment(ConfigNodePropertyString cqsearchpromoteconfigurationenvironment);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnectiontimeout();

	/*! \brief Set 
	 */
	void setConnectiontimeout(ConfigNodePropertyInteger connectiontimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSockettimeout();

	/*! \brief Set 
	 */
	void setSockettimeout(ConfigNodePropertyInteger sockettimeout);


    private:
    ConfigNodePropertyString cqsearchpromoteconfigurationserveruri;
    ConfigNodePropertyString cqsearchpromoteconfigurationenvironment;
    ConfigNodePropertyInteger connectiontimeout;
    ConfigNodePropertyInteger sockettimeout;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties_H_ */
