using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties
    /// </summary>
    public sealed class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties:  IEquatable<ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties>
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
        /// ObservedPath
        /// </summary>
        public ConfigNodePropertyString ObservedPath { get; private set; }

        /// <summary>
        /// ServiceName
        /// </summary>
        public ConfigNodePropertyString ServiceName { get; private set; }

        /// <summary>
        /// PropertyNames
        /// </summary>
        public ConfigNodePropertyString PropertyNames { get; private set; }

        /// <summary>
        /// DistributionDelay
        /// </summary>
        public ConfigNodePropertyInteger DistributionDelay { get; private set; }

        /// <summary>
        /// ServiceUserTarget
        /// </summary>
        public ConfigNodePropertyString ServiceUserTarget { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties()
        {
        }

        private ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties(ConfigNodePropertyBoolean Enabled, ConfigNodePropertyString AgentName, ConfigNodePropertyString DiffPath, ConfigNodePropertyString ObservedPath, ConfigNodePropertyString ServiceName, ConfigNodePropertyString PropertyNames, ConfigNodePropertyInteger DistributionDelay, ConfigNodePropertyString ServiceUserTarget)
        {
            
            this.Enabled = Enabled;
            
            this.AgentName = AgentName;
            
            this.DiffPath = DiffPath;
            
            this.ObservedPath = ObservedPath;
            
            this.ServiceName = ServiceName;
            
            this.PropertyNames = PropertyNames;
            
            this.DistributionDelay = DistributionDelay;
            
            this.ServiceUserTarget = ServiceUserTarget;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder</returns>
        public static ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder</returns>
        public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled)
                .AgentName(AgentName)
                .DiffPath(DiffPath)
                .ObservedPath(ObservedPath)
                .ServiceName(ServiceName)
                .PropertyNames(PropertyNames)
                .DistributionDelay(DistributionDelay)
                .ServiceUserTarget(ServiceUserTarget);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties left, ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties left, ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.
        /// </summary>
        public sealed class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyString _AgentName;
            private ConfigNodePropertyString _DiffPath;
            private ConfigNodePropertyString _ObservedPath;
            private ConfigNodePropertyString _ServiceName;
            private ConfigNodePropertyString _PropertyNames;
            private ConfigNodePropertyInteger _DistributionDelay;
            private ConfigNodePropertyString _ServiceUserTarget;

            internal ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.AgentName property.
            /// </summary>
            /// <param name="value">AgentName</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder AgentName(ConfigNodePropertyString value)
            {
                _AgentName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.DiffPath property.
            /// </summary>
            /// <param name="value">DiffPath</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder DiffPath(ConfigNodePropertyString value)
            {
                _DiffPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.ObservedPath property.
            /// </summary>
            /// <param name="value">ObservedPath</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder ObservedPath(ConfigNodePropertyString value)
            {
                _ObservedPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.ServiceName property.
            /// </summary>
            /// <param name="value">ServiceName</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder ServiceName(ConfigNodePropertyString value)
            {
                _ServiceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.PropertyNames property.
            /// </summary>
            /// <param name="value">PropertyNames</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder PropertyNames(ConfigNodePropertyString value)
            {
                _PropertyNames = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.DistributionDelay property.
            /// </summary>
            /// <param name="value">DistributionDelay</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder DistributionDelay(ConfigNodePropertyInteger value)
            {
                _DistributionDelay = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.ServiceUserTarget property.
            /// </summary>
            /// <param name="value">ServiceUserTarget</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesBuilder ServiceUserTarget(ConfigNodePropertyString value)
            {
                _ServiceUserTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties</returns>
            public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties Build()
            {
                Validate();
                return new ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties(
                    Enabled: _Enabled,
                    AgentName: _AgentName,
                    DiffPath: _DiffPath,
                    ObservedPath: _ObservedPath,
                    ServiceName: _ServiceName,
                    PropertyNames: _PropertyNames,
                    DistributionDelay: _DistributionDelay,
                    ServiceUserTarget: _ServiceUserTarget
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}