using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqAccountImplAccountManagementServletProperties
    /// </summary>
    public sealed class ComAdobeCqAccountImplAccountManagementServletProperties:  IEquatable<ComAdobeCqAccountImplAccountManagementServletProperties>
    { 
        /// <summary>
        /// CqAccountmanagerConfigInformnewaccountMail
        /// </summary>
        public ConfigNodePropertyString CqAccountmanagerConfigInformnewaccountMail { get; private set; }

        /// <summary>
        /// CqAccountmanagerConfigInformnewpwdMail
        /// </summary>
        public ConfigNodePropertyString CqAccountmanagerConfigInformnewpwdMail { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqAccountImplAccountManagementServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqAccountImplAccountManagementServletProperties()
        {
        }

        private ComAdobeCqAccountImplAccountManagementServletProperties(ConfigNodePropertyString CqAccountmanagerConfigInformnewaccountMail, ConfigNodePropertyString CqAccountmanagerConfigInformnewpwdMail)
        {
            
            this.CqAccountmanagerConfigInformnewaccountMail = CqAccountmanagerConfigInformnewaccountMail;
            
            this.CqAccountmanagerConfigInformnewpwdMail = CqAccountmanagerConfigInformnewpwdMail;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqAccountImplAccountManagementServletProperties.
        /// </summary>
        /// <returns>ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder</returns>
        public static ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder Builder()
        {
            return new ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder</returns>
        public ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder With()
        {
            return Builder()
                .CqAccountmanagerConfigInformnewaccountMail(CqAccountmanagerConfigInformnewaccountMail)
                .CqAccountmanagerConfigInformnewpwdMail(CqAccountmanagerConfigInformnewpwdMail);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqAccountImplAccountManagementServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqAccountImplAccountManagementServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAccountImplAccountManagementServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqAccountImplAccountManagementServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqAccountImplAccountManagementServletProperties left, ComAdobeCqAccountImplAccountManagementServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqAccountImplAccountManagementServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAccountImplAccountManagementServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqAccountImplAccountManagementServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqAccountImplAccountManagementServletProperties left, ComAdobeCqAccountImplAccountManagementServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqAccountImplAccountManagementServletProperties.
        /// </summary>
        public sealed class ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder
        {
            private ConfigNodePropertyString _CqAccountmanagerConfigInformnewaccountMail;
            private ConfigNodePropertyString _CqAccountmanagerConfigInformnewpwdMail;

            internal ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountImplAccountManagementServletProperties.CqAccountmanagerConfigInformnewaccountMail property.
            /// </summary>
            /// <param name="value">CqAccountmanagerConfigInformnewaccountMail</param>
            public ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder CqAccountmanagerConfigInformnewaccountMail(ConfigNodePropertyString value)
            {
                _CqAccountmanagerConfigInformnewaccountMail = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountImplAccountManagementServletProperties.CqAccountmanagerConfigInformnewpwdMail property.
            /// </summary>
            /// <param name="value">CqAccountmanagerConfigInformnewpwdMail</param>
            public ComAdobeCqAccountImplAccountManagementServletPropertiesBuilder CqAccountmanagerConfigInformnewpwdMail(ConfigNodePropertyString value)
            {
                _CqAccountmanagerConfigInformnewpwdMail = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqAccountImplAccountManagementServletProperties.
            /// </summary>
            /// <returns>ComAdobeCqAccountImplAccountManagementServletProperties</returns>
            public ComAdobeCqAccountImplAccountManagementServletProperties Build()
            {
                Validate();
                return new ComAdobeCqAccountImplAccountManagementServletProperties(
                    CqAccountmanagerConfigInformnewaccountMail: _CqAccountmanagerConfigInformnewaccountMail,
                    CqAccountmanagerConfigInformnewpwdMail: _CqAccountmanagerConfigInformnewpwdMail
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}