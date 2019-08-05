using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties:  IEquatable<OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties>
    { 
        /// <summary>
        /// MaxItems
        /// </summary>
        public ConfigNodePropertyInteger MaxItems { get; private set; }

        /// <summary>
        /// MaxPathDepth
        /// </summary>
        public ConfigNodePropertyInteger MaxPathDepth { get; private set; }

        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties(ConfigNodePropertyInteger MaxItems, ConfigNodePropertyInteger MaxPathDepth, ConfigNodePropertyBoolean Enabled)
        {
            
            this.MaxItems = MaxItems;
            
            this.MaxPathDepth = MaxPathDepth;
            
            this.Enabled = Enabled;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder With()
        {
            return Builder()
                .MaxItems(MaxItems)
                .MaxPathDepth(MaxPathDepth)
                .Enabled(Enabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties left, OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties left, OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MaxItems;
            private ConfigNodePropertyInteger _MaxPathDepth;
            private ConfigNodePropertyBoolean _Enabled;

            internal OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.MaxItems property.
            /// </summary>
            /// <param name="value">MaxItems</param>
            public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder MaxItems(ConfigNodePropertyInteger value)
            {
                _MaxItems = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.MaxPathDepth property.
            /// </summary>
            /// <param name="value">MaxPathDepth</param>
            public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder MaxPathDepth(ConfigNodePropertyInteger value)
            {
                _MaxPathDepth = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties</returns>
            public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties(
                    MaxItems: _MaxItems,
                    MaxPathDepth: _MaxPathDepth,
                    Enabled: _Enabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}