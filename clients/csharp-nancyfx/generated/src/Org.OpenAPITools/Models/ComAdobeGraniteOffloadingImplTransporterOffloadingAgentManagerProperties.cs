using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties
    /// </summary>
    public sealed class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties:  IEquatable<ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties>
    { 
        /// <summary>
        /// OffloadingAgentmanagerEnabled
        /// </summary>
        public ConfigNodePropertyBoolean OffloadingAgentmanagerEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties()
        {
        }

        private ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties(ConfigNodePropertyBoolean OffloadingAgentmanagerEnabled)
        {
            
            this.OffloadingAgentmanagerEnabled = OffloadingAgentmanagerEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder</returns>
        public static ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder</returns>
        public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder With()
        {
            return Builder()
                .OffloadingAgentmanagerEnabled(OffloadingAgentmanagerEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties left, ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties left, ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _OffloadingAgentmanagerEnabled;

            internal ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.OffloadingAgentmanagerEnabled property.
            /// </summary>
            /// <param name="value">OffloadingAgentmanagerEnabled</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder OffloadingAgentmanagerEnabled(ConfigNodePropertyBoolean value)
            {
                _OffloadingAgentmanagerEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties</returns>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties(
                    OffloadingAgentmanagerEnabled: _OffloadingAgentmanagerEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}