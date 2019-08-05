using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowPurgeSchedulerProperties
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowPurgeSchedulerProperties:  IEquatable<ComAdobeGraniteWorkflowPurgeSchedulerProperties>
    { 
        /// <summary>
        /// ScheduledpurgeName
        /// </summary>
        public ConfigNodePropertyString ScheduledpurgeName { get; private set; }

        /// <summary>
        /// ScheduledpurgeWorkflowStatus
        /// </summary>
        public ConfigNodePropertyDropDown ScheduledpurgeWorkflowStatus { get; private set; }

        /// <summary>
        /// ScheduledpurgeModelIds
        /// </summary>
        public ConfigNodePropertyArray ScheduledpurgeModelIds { get; private set; }

        /// <summary>
        /// ScheduledpurgeDaysold
        /// </summary>
        public ConfigNodePropertyInteger ScheduledpurgeDaysold { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowPurgeSchedulerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowPurgeSchedulerProperties()
        {
        }

        private ComAdobeGraniteWorkflowPurgeSchedulerProperties(ConfigNodePropertyString ScheduledpurgeName, ConfigNodePropertyDropDown ScheduledpurgeWorkflowStatus, ConfigNodePropertyArray ScheduledpurgeModelIds, ConfigNodePropertyInteger ScheduledpurgeDaysold)
        {
            
            this.ScheduledpurgeName = ScheduledpurgeName;
            
            this.ScheduledpurgeWorkflowStatus = ScheduledpurgeWorkflowStatus;
            
            this.ScheduledpurgeModelIds = ScheduledpurgeModelIds;
            
            this.ScheduledpurgeDaysold = ScheduledpurgeDaysold;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowPurgeSchedulerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder</returns>
        public static ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder</returns>
        public ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder With()
        {
            return Builder()
                .ScheduledpurgeName(ScheduledpurgeName)
                .ScheduledpurgeWorkflowStatus(ScheduledpurgeWorkflowStatus)
                .ScheduledpurgeModelIds(ScheduledpurgeModelIds)
                .ScheduledpurgeDaysold(ScheduledpurgeDaysold);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteWorkflowPurgeSchedulerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowPurgeSchedulerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowPurgeSchedulerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowPurgeSchedulerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowPurgeSchedulerProperties left, ComAdobeGraniteWorkflowPurgeSchedulerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowPurgeSchedulerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowPurgeSchedulerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowPurgeSchedulerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowPurgeSchedulerProperties left, ComAdobeGraniteWorkflowPurgeSchedulerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowPurgeSchedulerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder
        {
            private ConfigNodePropertyString _ScheduledpurgeName;
            private ConfigNodePropertyDropDown _ScheduledpurgeWorkflowStatus;
            private ConfigNodePropertyArray _ScheduledpurgeModelIds;
            private ConfigNodePropertyInteger _ScheduledpurgeDaysold;

            internal ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowPurgeSchedulerProperties.ScheduledpurgeName property.
            /// </summary>
            /// <param name="value">ScheduledpurgeName</param>
            public ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder ScheduledpurgeName(ConfigNodePropertyString value)
            {
                _ScheduledpurgeName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowPurgeSchedulerProperties.ScheduledpurgeWorkflowStatus property.
            /// </summary>
            /// <param name="value">ScheduledpurgeWorkflowStatus</param>
            public ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder ScheduledpurgeWorkflowStatus(ConfigNodePropertyDropDown value)
            {
                _ScheduledpurgeWorkflowStatus = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowPurgeSchedulerProperties.ScheduledpurgeModelIds property.
            /// </summary>
            /// <param name="value">ScheduledpurgeModelIds</param>
            public ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder ScheduledpurgeModelIds(ConfigNodePropertyArray value)
            {
                _ScheduledpurgeModelIds = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowPurgeSchedulerProperties.ScheduledpurgeDaysold property.
            /// </summary>
            /// <param name="value">ScheduledpurgeDaysold</param>
            public ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder ScheduledpurgeDaysold(ConfigNodePropertyInteger value)
            {
                _ScheduledpurgeDaysold = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowPurgeSchedulerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowPurgeSchedulerProperties</returns>
            public ComAdobeGraniteWorkflowPurgeSchedulerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowPurgeSchedulerProperties(
                    ScheduledpurgeName: _ScheduledpurgeName,
                    ScheduledpurgeWorkflowStatus: _ScheduledpurgeWorkflowStatus,
                    ScheduledpurgeModelIds: _ScheduledpurgeModelIds,
                    ScheduledpurgeDaysold: _ScheduledpurgeDaysold
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}