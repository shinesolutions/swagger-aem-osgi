
/*
 * ComDayCqPollingImporterImplManagedPollConfigImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqPollingImporterImplManagedPollConfigImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqPollingImporterImplManagedPollConfigImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqPollingImporterImplManagedPollConfigImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqPollingImporterImplManagedPollConfigImplProperties();
    ComDayCqPollingImporterImplManagedPollConfigImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqPollingImporterImplManagedPollConfigImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getId();

	/*! \brief Set 
	 */
	void setId(ConfigNodePropertyString id);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getReference();

	/*! \brief Set 
	 */
	void setReference(ConfigNodePropertyBoolean reference);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getInterval();

	/*! \brief Set 
	 */
	void setInterval(ConfigNodePropertyInteger interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getExpression();

	/*! \brief Set 
	 */
	void setExpression(ConfigNodePropertyString expression);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSource();

	/*! \brief Set 
	 */
	void setSource(ConfigNodePropertyString source);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTarget();

	/*! \brief Set 
	 */
	void setTarget(ConfigNodePropertyString target);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLogin();

	/*! \brief Set 
	 */
	void setLogin(ConfigNodePropertyString login);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPassword();

	/*! \brief Set 
	 */
	void setPassword(ConfigNodePropertyString password);


    private:
    ConfigNodePropertyString id;
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyBoolean reference;
    ConfigNodePropertyInteger interval;
    ConfigNodePropertyString expression;
    ConfigNodePropertyString source;
    ConfigNodePropertyString target;
    ConfigNodePropertyString login;
    ConfigNodePropertyString password;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqPollingImporterImplManagedPollConfigImplProperties_H_ */
