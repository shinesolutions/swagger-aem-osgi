
/*
 * ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties();
    ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamwebdavversionlinkingenable();

	/*! \brief Set 
	 */
	void setCqdamwebdavversionlinkingenable(ConfigNodePropertyBoolean cqdamwebdavversionlinkingenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamwebdavversionlinkingschedulerperiod();

	/*! \brief Set 
	 */
	void setCqdamwebdavversionlinkingschedulerperiod(ConfigNodePropertyInteger cqdamwebdavversionlinkingschedulerperiod);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamwebdavversionlinkingstagingtimeout();

	/*! \brief Set 
	 */
	void setCqdamwebdavversionlinkingstagingtimeout(ConfigNodePropertyInteger cqdamwebdavversionlinkingstagingtimeout);


    private:
    ConfigNodePropertyBoolean cqdamwebdavversionlinkingenable;
    ConfigNodePropertyInteger cqdamwebdavversionlinkingschedulerperiod;
    ConfigNodePropertyInteger cqdamwebdavversionlinkingstagingtimeout;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties_H_ */
