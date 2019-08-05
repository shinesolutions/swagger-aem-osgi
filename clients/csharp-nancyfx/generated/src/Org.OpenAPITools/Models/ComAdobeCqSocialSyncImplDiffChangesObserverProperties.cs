using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSyncImplDiffChangesObserverProperties
    /// </summary>
    public sealed class ComAdobeCqSocialSyncImplDiffChangesObserverProperties:  IEquatable<ComAdobeCqSocialSyncImplDiffChangesObserverProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }

        /// <summary>
        /// AgentName
        /// </summary>
        public ConfigNodePropertyString AgentName { get; private set; }

        /// <summary>
        /// DiffPath
        /// </summary>
        public ConfigNodePropertyString DiffPath { get; private set; }

        /// <summary>
        /// PropertyNames
        /// </summary>
        public ConfigNodePropertyString PropertyNames { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSyncImplDiffChangesObserverProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSyncImplDiffChangesObserverProperties()
        {
        }

        private ComAdobeCqSocialSyncImplDiffChangesObserverProperties(ConfigNodePropertyBoolean Enabled, ConfigNodePropertyString AgentName, ConfigNodePropertyString DiffPath, ConfigNodePropertyString PropertyNames)
        {
            
            this.Enabled = Enabled;
            
            this.AgentName = AgentName;
            
            this.DiffPath = DiffPath;
            
            this.PropertyNames = PropertyNames;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSyncImplDiffChangesObserverProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder</returns>
        public static ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder</returns>
        public ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled)
                .AgentName(AgentName)
                .DiffPath(DiffPath)
                .PropertyNames(PropertyNames);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialSyncImplDiffChangesObserverProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSyncImplDiffChangesObserverProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSyncImplDiffChangesObserverProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSyncImplDiffChangesObserverProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSyncImplDiffChangesObserverProperties left, ComAdobeCqSocialSyncImplDiffChangesObserverProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSyncImplDiffChangesObserverProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSyncImplDiffChangesObserverProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSyncImplDiffChangesObserverProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSyncImplDiffChangesObserverProperties left, ComAdobeCqSocialSyncImplDiffChangesObserverProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSyncImplDiffChangesObserverProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyString _AgentName;
            private ConfigNodePropertyString _DiffPath;
            private ConfigNodePropertyString _PropertyNames;

            internal ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplDiffChangesObserverProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplDiffChangesObserverProperties.AgentName property.
            /// </summary>
            /// <param name="value">AgentName</param>
            public ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder AgentName(ConfigNodePropertyString value)
            {
                _AgentName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplDiffChangesObserverProperties.DiffPath property.
            /// </summary>
            /// <param name="value">DiffPath</param>
            public ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder DiffPath(ConfigNodePropertyString value)
            {
                _DiffPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplDiffChangesObserverProperties.PropertyNames property.
            /// </summary>
            /// <param name="value">PropertyNames</param>
            public ComAdobeCqSocialSyncImplDiffChangesObserverPropertiesBuilder PropertyNames(ConfigNodePropertyString value)
            {
                _PropertyNames = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSyncImplDiffChangesObserverProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialSyncImplDiffChangesObserverProperties</returns>
            public ComAdobeCqSocialSyncImplDiffChangesObserverProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialSyncImplDiffChangesObserverProperties(
                    Enabled: _Enabled,
                    AgentName: _AgentName,
                    DiffPath: _DiffPath,
                    PropertyNames: _PropertyNames
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}