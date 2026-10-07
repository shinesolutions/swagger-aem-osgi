
/*
 * ComDayCqWcmUndoUndoConfigProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmUndoUndoConfigProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmUndoUndoConfigProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmUndoUndoConfigProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmUndoUndoConfigProperties();
    ComDayCqWcmUndoUndoConfigProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmUndoUndoConfigProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqwcmundoenabled();

	/*! \brief Set 
	 */
	void setCqwcmundoenabled(ConfigNodePropertyBoolean cqwcmundoenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqwcmundopath();

	/*! \brief Set 
	 */
	void setCqwcmundopath(ConfigNodePropertyString cqwcmundopath);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqwcmundovalidity();

	/*! \brief Set 
	 */
	void setCqwcmundovalidity(ConfigNodePropertyInteger cqwcmundovalidity);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqwcmundosteps();

	/*! \brief Set 
	 */
	void setCqwcmundosteps(ConfigNodePropertyInteger cqwcmundosteps);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqwcmundopersistence();

	/*! \brief Set 
	 */
	void setCqwcmundopersistence(ConfigNodePropertyString cqwcmundopersistence);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqwcmundopersistencemode();

	/*! \brief Set 
	 */
	void setCqwcmundopersistencemode(ConfigNodePropertyBoolean cqwcmundopersistencemode);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqwcmundomarkermode();

	/*! \brief Set 
	 */
	void setCqwcmundomarkermode(ConfigNodePropertyString cqwcmundomarkermode);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmundowhitelist();

	/*! \brief Set 
	 */
	void setCqwcmundowhitelist(ConfigNodePropertyArray cqwcmundowhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmundoblacklist();

	/*! \brief Set 
	 */
	void setCqwcmundoblacklist(ConfigNodePropertyArray cqwcmundoblacklist);


    private:
    ConfigNodePropertyBoolean cqwcmundoenabled;
    ConfigNodePropertyString cqwcmundopath;
    ConfigNodePropertyInteger cqwcmundovalidity;
    ConfigNodePropertyInteger cqwcmundosteps;
    ConfigNodePropertyString cqwcmundopersistence;
    ConfigNodePropertyBoolean cqwcmundopersistencemode;
    ConfigNodePropertyString cqwcmundomarkermode;
    ConfigNodePropertyArray cqwcmundowhitelist;
    ConfigNodePropertyArray cqwcmundoblacklist;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmUndoUndoConfigProperties_H_ */
