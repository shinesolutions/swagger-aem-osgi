using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqAccountApiAccountManagementServiceProperties
    /// </summary>
    public sealed class ComAdobeCqAccountApiAccountManagementServiceProperties:  IEquatable<ComAdobeCqAccountApiAccountManagementServiceProperties>
    { 
        /// <summary>
        /// CqAccountmanagerTokenValidityPeriod
        /// </summary>
        public ConfigNodePropertyInteger CqAccountmanagerTokenValidityPeriod { get; private set; }

        /// <summary>
        /// CqAccountmanagerConfigRequestnewaccountMail
        /// </summary>
        public ConfigNodePropertyString CqAccountmanagerConfigRequestnewaccountMail { get; private set; }

        /// <summary>
        /// CqAccountmanagerConfigRequestnewpwdMail
        /// </summary>
        public ConfigNodePropertyString CqAccountmanagerConfigRequestnewpwdMail { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqAccountApiAccountManagementServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqAccountApiAccountManagementServiceProperties()
        {
        }

        private ComAdobeCqAccountApiAccountManagementServiceProperties(ConfigNodePropertyInteger CqAccountmanagerTokenValidityPeriod, ConfigNodePropertyString CqAccountmanagerConfigRequestnewaccountMail, ConfigNodePropertyString CqAccountmanagerConfigRequestnewpwdMail)
        {
            
            this.CqAccountmanagerTokenValidityPeriod = CqAccountmanagerTokenValidityPeriod;
            
            this.CqAccountmanagerConfigRequestnewaccountMail = CqAccountmanagerConfigRequestnewaccountMail;
            
            this.CqAccountmanagerConfigRequestnewpwdMail = CqAccountmanagerConfigRequestnewpwdMail;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqAccountApiAccountManagementServiceProperties.
        /// </summary>
        /// <returns>ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder</returns>
        public static ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder Builder()
        {
            return new ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder</returns>
        public ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder With()
        {
            return Builder()
                .CqAccountmanagerTokenValidityPeriod(CqAccountmanagerTokenValidityPeriod)
                .CqAccountmanagerConfigRequestnewaccountMail(CqAccountmanagerConfigRequestnewaccountMail)
                .CqAccountmanagerConfigRequestnewpwdMail(CqAccountmanagerConfigRequestnewpwdMail);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqAccountApiAccountManagementServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqAccountApiAccountManagementServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAccountApiAccountManagementServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqAccountApiAccountManagementServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqAccountApiAccountManagementServiceProperties left, ComAdobeCqAccountApiAccountManagementServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqAccountApiAccountManagementServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAccountApiAccountManagementServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqAccountApiAccountManagementServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqAccountApiAccountManagementServiceProperties left, ComAdobeCqAccountApiAccountManagementServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqAccountApiAccountManagementServiceProperties.
        /// </summary>
        public sealed class ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqAccountmanagerTokenValidityPeriod;
            private ConfigNodePropertyString _CqAccountmanagerConfigRequestnewaccountMail;
            private ConfigNodePropertyString _CqAccountmanagerConfigRequestnewpwdMail;

            internal ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountApiAccountManagementServiceProperties.CqAccountmanagerTokenValidityPeriod property.
            /// </summary>
            /// <param name="value">CqAccountmanagerTokenValidityPeriod</param>
            public ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder CqAccountmanagerTokenValidityPeriod(ConfigNodePropertyInteger value)
            {
                _CqAccountmanagerTokenValidityPeriod = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountApiAccountManagementServiceProperties.CqAccountmanagerConfigRequestnewaccountMail property.
            /// </summary>
            /// <param name="value">CqAccountmanagerConfigRequestnewaccountMail</param>
            public ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder CqAccountmanagerConfigRequestnewaccountMail(ConfigNodePropertyString value)
            {
                _CqAccountmanagerConfigRequestnewaccountMail = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountApiAccountManagementServiceProperties.CqAccountmanagerConfigRequestnewpwdMail property.
            /// </summary>
            /// <param name="value">CqAccountmanagerConfigRequestnewpwdMail</param>
            public ComAdobeCqAccountApiAccountManagementServicePropertiesBuilder CqAccountmanagerConfigRequestnewpwdMail(ConfigNodePropertyString value)
            {
                _CqAccountmanagerConfigRequestnewpwdMail = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqAccountApiAccountManagementServiceProperties.
            /// </summary>
            /// <returns>ComAdobeCqAccountApiAccountManagementServiceProperties</returns>
            public ComAdobeCqAccountApiAccountManagementServiceProperties Build()
            {
                Validate();
                return new ComAdobeCqAccountApiAccountManagementServiceProperties(
                    CqAccountmanagerTokenValidityPeriod: _CqAccountmanagerTokenValidityPeriod,
                    CqAccountmanagerConfigRequestnewaccountMail: _CqAccountmanagerConfigRequestnewaccountMail,
                    CqAccountmanagerConfigRequestnewpwdMail: _CqAccountmanagerConfigRequestnewpwdMail
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}