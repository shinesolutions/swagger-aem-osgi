using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqProjectsPurgeSchedulerProperties
    /// </summary>
    public sealed class ComAdobeCqProjectsPurgeSchedulerProperties:  IEquatable<ComAdobeCqProjectsPurgeSchedulerProperties>
    { 
        /// <summary>
        /// ScheduledpurgeName
        /// </summary>
        public ConfigNodePropertyString ScheduledpurgeName { get; private set; }

        /// <summary>
        /// ScheduledpurgePurgeActive
        /// </summary>
        public ConfigNodePropertyBoolean ScheduledpurgePurgeActive { get; private set; }

        /// <summary>
        /// ScheduledpurgeTemplates
        /// </summary>
        public ConfigNodePropertyArray ScheduledpurgeTemplates { get; private set; }

        /// <summary>
        /// ScheduledpurgePurgeGroups
        /// </summary>
        public ConfigNodePropertyBoolean ScheduledpurgePurgeGroups { get; private set; }

        /// <summary>
        /// ScheduledpurgePurgeAssets
        /// </summary>
        public ConfigNodePropertyBoolean ScheduledpurgePurgeAssets { get; private set; }

        /// <summary>
        /// ScheduledpurgeTerminateRunningWorkflows
        /// </summary>
        public ConfigNodePropertyBoolean ScheduledpurgeTerminateRunningWorkflows { get; private set; }

        /// <summary>
        /// ScheduledpurgeDaysold
        /// </summary>
        public ConfigNodePropertyInteger ScheduledpurgeDaysold { get; private set; }

        /// <summary>
        /// ScheduledpurgeSaveThreshold
        /// </summary>
        public ConfigNodePropertyInteger ScheduledpurgeSaveThreshold { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqProjectsPurgeSchedulerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqProjectsPurgeSchedulerProperties()
        {
        }

        private ComAdobeCqProjectsPurgeSchedulerProperties(ConfigNodePropertyString ScheduledpurgeName, ConfigNodePropertyBoolean ScheduledpurgePurgeActive, ConfigNodePropertyArray ScheduledpurgeTemplates, ConfigNodePropertyBoolean ScheduledpurgePurgeGroups, ConfigNodePropertyBoolean ScheduledpurgePurgeAssets, ConfigNodePropertyBoolean ScheduledpurgeTerminateRunningWorkflows, ConfigNodePropertyInteger ScheduledpurgeDaysold, ConfigNodePropertyInteger ScheduledpurgeSaveThreshold)
        {
            
            this.ScheduledpurgeName = ScheduledpurgeName;
            
            this.ScheduledpurgePurgeActive = ScheduledpurgePurgeActive;
            
            this.ScheduledpurgeTemplates = ScheduledpurgeTemplates;
            
            this.ScheduledpurgePurgeGroups = ScheduledpurgePurgeGroups;
            
            this.ScheduledpurgePurgeAssets = ScheduledpurgePurgeAssets;
            
            this.ScheduledpurgeTerminateRunningWorkflows = ScheduledpurgeTerminateRunningWorkflows;
            
            this.ScheduledpurgeDaysold = ScheduledpurgeDaysold;
            
            this.ScheduledpurgeSaveThreshold = ScheduledpurgeSaveThreshold;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqProjectsPurgeSchedulerProperties.
        /// </summary>
        /// <returns>ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder</returns>
        public static ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder Builder()
        {
            return new ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder</returns>
        public ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder With()
        {
            return Builder()
                .ScheduledpurgeName(ScheduledpurgeName)
                .ScheduledpurgePurgeActive(ScheduledpurgePurgeActive)
                .ScheduledpurgeTemplates(ScheduledpurgeTemplates)
                .ScheduledpurgePurgeGroups(ScheduledpurgePurgeGroups)
                .ScheduledpurgePurgeAssets(ScheduledpurgePurgeAssets)
                .ScheduledpurgeTerminateRunningWorkflows(ScheduledpurgeTerminateRunningWorkflows)
                .ScheduledpurgeDaysold(ScheduledpurgeDaysold)
                .ScheduledpurgeSaveThreshold(ScheduledpurgeSaveThreshold);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqProjectsPurgeSchedulerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqProjectsPurgeSchedulerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqProjectsPurgeSchedulerProperties</param>
        /// <param name="right">Compared (ComAdobeCqProjectsPurgeSchedulerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqProjectsPurgeSchedulerProperties left, ComAdobeCqProjectsPurgeSchedulerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqProjectsPurgeSchedulerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqProjectsPurgeSchedulerProperties</param>
        /// <param name="right">Compared (ComAdobeCqProjectsPurgeSchedulerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqProjectsPurgeSchedulerProperties left, ComAdobeCqProjectsPurgeSchedulerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqProjectsPurgeSchedulerProperties.
        /// </summary>
        public sealed class ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder
        {
            private ConfigNodePropertyString _ScheduledpurgeName;
            private ConfigNodePropertyBoolean _ScheduledpurgePurgeActive;
            private ConfigNodePropertyArray _ScheduledpurgeTemplates;
            private ConfigNodePropertyBoolean _ScheduledpurgePurgeGroups;
            private ConfigNodePropertyBoolean _ScheduledpurgePurgeAssets;
            private ConfigNodePropertyBoolean _ScheduledpurgeTerminateRunningWorkflows;
            private ConfigNodePropertyInteger _ScheduledpurgeDaysold;
            private ConfigNodePropertyInteger _ScheduledpurgeSaveThreshold;

            internal ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsPurgeSchedulerProperties.ScheduledpurgeName property.
            /// </summary>
            /// <param name="value">ScheduledpurgeName</param>
            public ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder ScheduledpurgeName(ConfigNodePropertyString value)
            {
                _ScheduledpurgeName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsPurgeSchedulerProperties.ScheduledpurgePurgeActive property.
            /// </summary>
            /// <param name="value">ScheduledpurgePurgeActive</param>
            public ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder ScheduledpurgePurgeActive(ConfigNodePropertyBoolean value)
            {
                _ScheduledpurgePurgeActive = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsPurgeSchedulerProperties.ScheduledpurgeTemplates property.
            /// </summary>
            /// <param name="value">ScheduledpurgeTemplates</param>
            public ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder ScheduledpurgeTemplates(ConfigNodePropertyArray value)
            {
                _ScheduledpurgeTemplates = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsPurgeSchedulerProperties.ScheduledpurgePurgeGroups property.
            /// </summary>
            /// <param name="value">ScheduledpurgePurgeGroups</param>
            public ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder ScheduledpurgePurgeGroups(ConfigNodePropertyBoolean value)
            {
                _ScheduledpurgePurgeGroups = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsPurgeSchedulerProperties.ScheduledpurgePurgeAssets property.
            /// </summary>
            /// <param name="value">ScheduledpurgePurgeAssets</param>
            public ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder ScheduledpurgePurgeAssets(ConfigNodePropertyBoolean value)
            {
                _ScheduledpurgePurgeAssets = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsPurgeSchedulerProperties.ScheduledpurgeTerminateRunningWorkflows property.
            /// </summary>
            /// <param name="value">ScheduledpurgeTerminateRunningWorkflows</param>
            public ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder ScheduledpurgeTerminateRunningWorkflows(ConfigNodePropertyBoolean value)
            {
                _ScheduledpurgeTerminateRunningWorkflows = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsPurgeSchedulerProperties.ScheduledpurgeDaysold property.
            /// </summary>
            /// <param name="value">ScheduledpurgeDaysold</param>
            public ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder ScheduledpurgeDaysold(ConfigNodePropertyInteger value)
            {
                _ScheduledpurgeDaysold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsPurgeSchedulerProperties.ScheduledpurgeSaveThreshold property.
            /// </summary>
            /// <param name="value">ScheduledpurgeSaveThreshold</param>
            public ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder ScheduledpurgeSaveThreshold(ConfigNodePropertyInteger value)
            {
                _ScheduledpurgeSaveThreshold = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqProjectsPurgeSchedulerProperties.
            /// </summary>
            /// <returns>ComAdobeCqProjectsPurgeSchedulerProperties</returns>
            public ComAdobeCqProjectsPurgeSchedulerProperties Build()
            {
                Validate();
                return new ComAdobeCqProjectsPurgeSchedulerProperties(
                    ScheduledpurgeName: _ScheduledpurgeName,
                    ScheduledpurgePurgeActive: _ScheduledpurgePurgeActive,
                    ScheduledpurgeTemplates: _ScheduledpurgeTemplates,
                    ScheduledpurgePurgeGroups: _ScheduledpurgePurgeGroups,
                    ScheduledpurgePurgeAssets: _ScheduledpurgePurgeAssets,
                    ScheduledpurgeTerminateRunningWorkflows: _ScheduledpurgeTerminateRunningWorkflows,
                    ScheduledpurgeDaysold: _ScheduledpurgeDaysold,
                    ScheduledpurgeSaveThreshold: _ScheduledpurgeSaveThreshold
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}