using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties
    /// </summary>
    public sealed class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties:  IEquatable<ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties>
    { 
        /// <summary>
        /// PurgeCompleted
        /// </summary>
        public ConfigNodePropertyBoolean PurgeCompleted { get; private set; }

        /// <summary>
        /// CompletedAge
        /// </summary>
        public ConfigNodePropertyInteger CompletedAge { get; private set; }

        /// <summary>
        /// PurgeActive
        /// </summary>
        public ConfigNodePropertyBoolean PurgeActive { get; private set; }

        /// <summary>
        /// ActiveAge
        /// </summary>
        public ConfigNodePropertyInteger ActiveAge { get; private set; }

        /// <summary>
        /// SaveThreshold
        /// </summary>
        public ConfigNodePropertyInteger SaveThreshold { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties()
        {
        }

        private ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties(ConfigNodePropertyBoolean PurgeCompleted, ConfigNodePropertyInteger CompletedAge, ConfigNodePropertyBoolean PurgeActive, ConfigNodePropertyInteger ActiveAge, ConfigNodePropertyInteger SaveThreshold)
        {
            
            this.PurgeCompleted = PurgeCompleted;
            
            this.CompletedAge = CompletedAge;
            
            this.PurgeActive = PurgeActive;
            
            this.ActiveAge = ActiveAge;
            
            this.SaveThreshold = SaveThreshold;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder</returns>
        public static ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder</returns>
        public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder With()
        {
            return Builder()
                .PurgeCompleted(PurgeCompleted)
                .CompletedAge(CompletedAge)
                .PurgeActive(PurgeActive)
                .ActiveAge(ActiveAge)
                .SaveThreshold(SaveThreshold);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties left, ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties left, ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.
        /// </summary>
        public sealed class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _PurgeCompleted;
            private ConfigNodePropertyInteger _CompletedAge;
            private ConfigNodePropertyBoolean _PurgeActive;
            private ConfigNodePropertyInteger _ActiveAge;
            private ConfigNodePropertyInteger _SaveThreshold;

            internal ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.PurgeCompleted property.
            /// </summary>
            /// <param name="value">PurgeCompleted</param>
            public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder PurgeCompleted(ConfigNodePropertyBoolean value)
            {
                _PurgeCompleted = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.CompletedAge property.
            /// </summary>
            /// <param name="value">CompletedAge</param>
            public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder CompletedAge(ConfigNodePropertyInteger value)
            {
                _CompletedAge = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.PurgeActive property.
            /// </summary>
            /// <param name="value">PurgeActive</param>
            public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder PurgeActive(ConfigNodePropertyBoolean value)
            {
                _PurgeActive = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.ActiveAge property.
            /// </summary>
            /// <param name="value">ActiveAge</param>
            public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder ActiveAge(ConfigNodePropertyInteger value)
            {
                _ActiveAge = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.SaveThreshold property.
            /// </summary>
            /// <param name="value">SaveThreshold</param>
            public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesBuilder SaveThreshold(ConfigNodePropertyInteger value)
            {
                _SaveThreshold = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties</returns>
            public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties Build()
            {
                Validate();
                return new ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties(
                    PurgeCompleted: _PurgeCompleted,
                    CompletedAge: _CompletedAge,
                    PurgeActive: _PurgeActive,
                    ActiveAge: _ActiveAge,
                    SaveThreshold: _SaveThreshold
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}