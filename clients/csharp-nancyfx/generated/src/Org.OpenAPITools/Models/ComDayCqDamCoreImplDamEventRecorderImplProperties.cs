using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplDamEventRecorderImplProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplDamEventRecorderImplProperties:  IEquatable<ComDayCqDamCoreImplDamEventRecorderImplProperties>
    { 
        /// <summary>
        /// EventFilter
        /// </summary>
        public ConfigNodePropertyString EventFilter { get; private set; }

        /// <summary>
        /// EventQueueLength
        /// </summary>
        public ConfigNodePropertyInteger EventQueueLength { get; private set; }

        /// <summary>
        /// EventrecorderEnabled
        /// </summary>
        public ConfigNodePropertyBoolean EventrecorderEnabled { get; private set; }

        /// <summary>
        /// EventrecorderBlacklist
        /// </summary>
        public ConfigNodePropertyArray EventrecorderBlacklist { get; private set; }

        /// <summary>
        /// EventrecorderEventtypes
        /// </summary>
        public ConfigNodePropertyDropDown EventrecorderEventtypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplDamEventRecorderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplDamEventRecorderImplProperties()
        {
        }

        private ComDayCqDamCoreImplDamEventRecorderImplProperties(ConfigNodePropertyString EventFilter, ConfigNodePropertyInteger EventQueueLength, ConfigNodePropertyBoolean EventrecorderEnabled, ConfigNodePropertyArray EventrecorderBlacklist, ConfigNodePropertyDropDown EventrecorderEventtypes)
        {
            
            this.EventFilter = EventFilter;
            
            this.EventQueueLength = EventQueueLength;
            
            this.EventrecorderEnabled = EventrecorderEnabled;
            
            this.EventrecorderBlacklist = EventrecorderBlacklist;
            
            this.EventrecorderEventtypes = EventrecorderEventtypes;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplDamEventRecorderImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder</returns>
        public ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder With()
        {
            return Builder()
                .EventFilter(EventFilter)
                .EventQueueLength(EventQueueLength)
                .EventrecorderEnabled(EventrecorderEnabled)
                .EventrecorderBlacklist(EventrecorderBlacklist)
                .EventrecorderEventtypes(EventrecorderEventtypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplDamEventRecorderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplDamEventRecorderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplDamEventRecorderImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplDamEventRecorderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplDamEventRecorderImplProperties left, ComDayCqDamCoreImplDamEventRecorderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplDamEventRecorderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplDamEventRecorderImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplDamEventRecorderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplDamEventRecorderImplProperties left, ComDayCqDamCoreImplDamEventRecorderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplDamEventRecorderImplProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _EventFilter;
            private ConfigNodePropertyInteger _EventQueueLength;
            private ConfigNodePropertyBoolean _EventrecorderEnabled;
            private ConfigNodePropertyArray _EventrecorderBlacklist;
            private ConfigNodePropertyDropDown _EventrecorderEventtypes;

            internal ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventRecorderImplProperties.EventFilter property.
            /// </summary>
            /// <param name="value">EventFilter</param>
            public ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder EventFilter(ConfigNodePropertyString value)
            {
                _EventFilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventRecorderImplProperties.EventQueueLength property.
            /// </summary>
            /// <param name="value">EventQueueLength</param>
            public ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder EventQueueLength(ConfigNodePropertyInteger value)
            {
                _EventQueueLength = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventRecorderImplProperties.EventrecorderEnabled property.
            /// </summary>
            /// <param name="value">EventrecorderEnabled</param>
            public ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder EventrecorderEnabled(ConfigNodePropertyBoolean value)
            {
                _EventrecorderEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventRecorderImplProperties.EventrecorderBlacklist property.
            /// </summary>
            /// <param name="value">EventrecorderBlacklist</param>
            public ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder EventrecorderBlacklist(ConfigNodePropertyArray value)
            {
                _EventrecorderBlacklist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventRecorderImplProperties.EventrecorderEventtypes property.
            /// </summary>
            /// <param name="value">EventrecorderEventtypes</param>
            public ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder EventrecorderEventtypes(ConfigNodePropertyDropDown value)
            {
                _EventrecorderEventtypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplDamEventRecorderImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplDamEventRecorderImplProperties</returns>
            public ComDayCqDamCoreImplDamEventRecorderImplProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplDamEventRecorderImplProperties(
                    EventFilter: _EventFilter,
                    EventQueueLength: _EventQueueLength,
                    EventrecorderEnabled: _EventrecorderEnabled,
                    EventrecorderBlacklist: _EventrecorderBlacklist,
                    EventrecorderEventtypes: _EventrecorderEventtypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}