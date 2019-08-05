using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplEventDamEventAuditListenerProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplEventDamEventAuditListenerProperties:  IEquatable<ComDayCqDamCoreImplEventDamEventAuditListenerProperties>
    { 
        /// <summary>
        /// EventFilter
        /// </summary>
        public ConfigNodePropertyString EventFilter { get; private set; }

        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplEventDamEventAuditListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplEventDamEventAuditListenerProperties()
        {
        }

        private ComDayCqDamCoreImplEventDamEventAuditListenerProperties(ConfigNodePropertyString EventFilter, ConfigNodePropertyBoolean Enabled)
        {
            
            this.EventFilter = EventFilter;
            
            this.Enabled = Enabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplEventDamEventAuditListenerProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder</returns>
        public ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder With()
        {
            return Builder()
                .EventFilter(EventFilter)
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

        public bool Equals(ComDayCqDamCoreImplEventDamEventAuditListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplEventDamEventAuditListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplEventDamEventAuditListenerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplEventDamEventAuditListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplEventDamEventAuditListenerProperties left, ComDayCqDamCoreImplEventDamEventAuditListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplEventDamEventAuditListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplEventDamEventAuditListenerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplEventDamEventAuditListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplEventDamEventAuditListenerProperties left, ComDayCqDamCoreImplEventDamEventAuditListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplEventDamEventAuditListenerProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder
        {
            private ConfigNodePropertyString _EventFilter;
            private ConfigNodePropertyBoolean _Enabled;

            internal ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplEventDamEventAuditListenerProperties.EventFilter property.
            /// </summary>
            /// <param name="value">EventFilter</param>
            public ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder EventFilter(ConfigNodePropertyString value)
            {
                _EventFilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplEventDamEventAuditListenerProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplEventDamEventAuditListenerProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplEventDamEventAuditListenerProperties</returns>
            public ComDayCqDamCoreImplEventDamEventAuditListenerProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplEventDamEventAuditListenerProperties(
                    EventFilter: _EventFilter,
                    Enabled: _Enabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}