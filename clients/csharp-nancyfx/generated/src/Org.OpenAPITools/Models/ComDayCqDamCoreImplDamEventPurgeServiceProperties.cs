using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplDamEventPurgeServiceProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplDamEventPurgeServiceProperties:  IEquatable<ComDayCqDamCoreImplDamEventPurgeServiceProperties>
    { 
        /// <summary>
        /// SchedulerExpression
        /// </summary>
        public ConfigNodePropertyString SchedulerExpression { get; private set; }

        /// <summary>
        /// MaxSavedActivities
        /// </summary>
        public ConfigNodePropertyInteger MaxSavedActivities { get; private set; }

        /// <summary>
        /// SaveInterval
        /// </summary>
        public ConfigNodePropertyInteger SaveInterval { get; private set; }

        /// <summary>
        /// EnableActivityPurge
        /// </summary>
        public ConfigNodePropertyBoolean EnableActivityPurge { get; private set; }

        /// <summary>
        /// EventTypes
        /// </summary>
        public ConfigNodePropertyDropDown EventTypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplDamEventPurgeServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplDamEventPurgeServiceProperties()
        {
        }

        private ComDayCqDamCoreImplDamEventPurgeServiceProperties(ConfigNodePropertyString SchedulerExpression, ConfigNodePropertyInteger MaxSavedActivities, ConfigNodePropertyInteger SaveInterval, ConfigNodePropertyBoolean EnableActivityPurge, ConfigNodePropertyDropDown EventTypes)
        {
            
            this.SchedulerExpression = SchedulerExpression;
            
            this.MaxSavedActivities = MaxSavedActivities;
            
            this.SaveInterval = SaveInterval;
            
            this.EnableActivityPurge = EnableActivityPurge;
            
            this.EventTypes = EventTypes;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplDamEventPurgeServiceProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder</returns>
        public static ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder</returns>
        public ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder With()
        {
            return Builder()
                .SchedulerExpression(SchedulerExpression)
                .MaxSavedActivities(MaxSavedActivities)
                .SaveInterval(SaveInterval)
                .EnableActivityPurge(EnableActivityPurge)
                .EventTypes(EventTypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplDamEventPurgeServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplDamEventPurgeServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplDamEventPurgeServiceProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplDamEventPurgeServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplDamEventPurgeServiceProperties left, ComDayCqDamCoreImplDamEventPurgeServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplDamEventPurgeServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplDamEventPurgeServiceProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplDamEventPurgeServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplDamEventPurgeServiceProperties left, ComDayCqDamCoreImplDamEventPurgeServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplDamEventPurgeServiceProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder
        {
            private ConfigNodePropertyString _SchedulerExpression;
            private ConfigNodePropertyInteger _MaxSavedActivities;
            private ConfigNodePropertyInteger _SaveInterval;
            private ConfigNodePropertyBoolean _EnableActivityPurge;
            private ConfigNodePropertyDropDown _EventTypes;

            internal ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventPurgeServiceProperties.SchedulerExpression property.
            /// </summary>
            /// <param name="value">SchedulerExpression</param>
            public ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder SchedulerExpression(ConfigNodePropertyString value)
            {
                _SchedulerExpression = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventPurgeServiceProperties.MaxSavedActivities property.
            /// </summary>
            /// <param name="value">MaxSavedActivities</param>
            public ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder MaxSavedActivities(ConfigNodePropertyInteger value)
            {
                _MaxSavedActivities = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventPurgeServiceProperties.SaveInterval property.
            /// </summary>
            /// <param name="value">SaveInterval</param>
            public ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder SaveInterval(ConfigNodePropertyInteger value)
            {
                _SaveInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventPurgeServiceProperties.EnableActivityPurge property.
            /// </summary>
            /// <param name="value">EnableActivityPurge</param>
            public ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder EnableActivityPurge(ConfigNodePropertyBoolean value)
            {
                _EnableActivityPurge = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventPurgeServiceProperties.EventTypes property.
            /// </summary>
            /// <param name="value">EventTypes</param>
            public ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder EventTypes(ConfigNodePropertyDropDown value)
            {
                _EventTypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplDamEventPurgeServiceProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplDamEventPurgeServiceProperties</returns>
            public ComDayCqDamCoreImplDamEventPurgeServiceProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplDamEventPurgeServiceProperties(
                    SchedulerExpression: _SchedulerExpression,
                    MaxSavedActivities: _MaxSavedActivities,
                    SaveInterval: _SaveInterval,
                    EnableActivityPurge: _EnableActivityPurge,
                    EventTypes: _EventTypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}