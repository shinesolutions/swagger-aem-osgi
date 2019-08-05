using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties
    /// </summary>
    public sealed class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties:  IEquatable<ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties>
    { 
        /// <summary>
        /// FullGcDays
        /// </summary>
        public ConfigNodePropertyArray FullGcDays { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties()
        {
        }

        private ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties(ConfigNodePropertyArray FullGcDays)
        {
            
            this.FullGcDays = FullGcDays;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder</returns>
        public static ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder</returns>
        public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder With()
        {
            return Builder()
                .FullGcDays(FullGcDays);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties left, ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties left, ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.
        /// </summary>
        public sealed class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder
        {
            private ConfigNodePropertyArray _FullGcDays;

            internal ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.FullGcDays property.
            /// </summary>
            /// <param name="value">FullGcDays</param>
            public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesBuilder FullGcDays(ConfigNodePropertyArray value)
            {
                _FullGcDays = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties</returns>
            public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties Build()
            {
                Validate();
                return new ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties(
                    FullGcDays: _FullGcDays
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}