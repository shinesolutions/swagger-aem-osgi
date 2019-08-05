using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDtmImplServletsDTMDeployHookServletProperties
    /// </summary>
    public sealed class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties:  IEquatable<ComAdobeCqDtmImplServletsDTMDeployHookServletProperties>
    { 
        /// <summary>
        /// DtmStagingIpWhitelist
        /// </summary>
        public ConfigNodePropertyArray DtmStagingIpWhitelist { get; private set; }

        /// <summary>
        /// DtmProductionIpWhitelist
        /// </summary>
        public ConfigNodePropertyArray DtmProductionIpWhitelist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDtmImplServletsDTMDeployHookServletProperties()
        {
        }

        private ComAdobeCqDtmImplServletsDTMDeployHookServletProperties(ConfigNodePropertyArray DtmStagingIpWhitelist, ConfigNodePropertyArray DtmProductionIpWhitelist)
        {
            
            this.DtmStagingIpWhitelist = DtmStagingIpWhitelist;
            
            this.DtmProductionIpWhitelist = DtmProductionIpWhitelist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.
        /// </summary>
        /// <returns>ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder</returns>
        public static ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder Builder()
        {
            return new ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder</returns>
        public ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder With()
        {
            return Builder()
                .DtmStagingIpWhitelist(DtmStagingIpWhitelist)
                .DtmProductionIpWhitelist(DtmProductionIpWhitelist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDtmImplServletsDTMDeployHookServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDtmImplServletsDTMDeployHookServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqDtmImplServletsDTMDeployHookServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDtmImplServletsDTMDeployHookServletProperties left, ComAdobeCqDtmImplServletsDTMDeployHookServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDtmImplServletsDTMDeployHookServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqDtmImplServletsDTMDeployHookServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDtmImplServletsDTMDeployHookServletProperties left, ComAdobeCqDtmImplServletsDTMDeployHookServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.
        /// </summary>
        public sealed class ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _DtmStagingIpWhitelist;
            private ConfigNodePropertyArray _DtmProductionIpWhitelist;

            internal ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.DtmStagingIpWhitelist property.
            /// </summary>
            /// <param name="value">DtmStagingIpWhitelist</param>
            public ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder DtmStagingIpWhitelist(ConfigNodePropertyArray value)
            {
                _DtmStagingIpWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.DtmProductionIpWhitelist property.
            /// </summary>
            /// <param name="value">DtmProductionIpWhitelist</param>
            public ComAdobeCqDtmImplServletsDTMDeployHookServletPropertiesBuilder DtmProductionIpWhitelist(ConfigNodePropertyArray value)
            {
                _DtmProductionIpWhitelist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.
            /// </summary>
            /// <returns>ComAdobeCqDtmImplServletsDTMDeployHookServletProperties</returns>
            public ComAdobeCqDtmImplServletsDTMDeployHookServletProperties Build()
            {
                Validate();
                return new ComAdobeCqDtmImplServletsDTMDeployHookServletProperties(
                    DtmStagingIpWhitelist: _DtmStagingIpWhitelist,
                    DtmProductionIpWhitelist: _DtmProductionIpWhitelist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}