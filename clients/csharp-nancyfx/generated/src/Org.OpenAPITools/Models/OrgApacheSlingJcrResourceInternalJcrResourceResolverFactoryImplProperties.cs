using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties
    /// </summary>
    public sealed class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties:  IEquatable<OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties>
    { 
        /// <summary>
        /// ResourceResolverSearchpath
        /// </summary>
        public ConfigNodePropertyArray ResourceResolverSearchpath { get; private set; }

        /// <summary>
        /// ResourceResolverManglenamespaces
        /// </summary>
        public ConfigNodePropertyBoolean ResourceResolverManglenamespaces { get; private set; }

        /// <summary>
        /// ResourceResolverAllowDirect
        /// </summary>
        public ConfigNodePropertyBoolean ResourceResolverAllowDirect { get; private set; }

        /// <summary>
        /// ResourceResolverRequiredProviders
        /// </summary>
        public ConfigNodePropertyArray ResourceResolverRequiredProviders { get; private set; }

        /// <summary>
        /// ResourceResolverRequiredProvidernames
        /// </summary>
        public ConfigNodePropertyArray ResourceResolverRequiredProvidernames { get; private set; }

        /// <summary>
        /// ResourceResolverVirtual
        /// </summary>
        public ConfigNodePropertyArray ResourceResolverVirtual { get; private set; }

        /// <summary>
        /// ResourceResolverMapping
        /// </summary>
        public ConfigNodePropertyArray ResourceResolverMapping { get; private set; }

        /// <summary>
        /// ResourceResolverMapLocation
        /// </summary>
        public ConfigNodePropertyString ResourceResolverMapLocation { get; private set; }

        /// <summary>
        /// ResourceResolverMapObservation
        /// </summary>
        public ConfigNodePropertyArray ResourceResolverMapObservation { get; private set; }

        /// <summary>
        /// ResourceResolverDefaultVanityRedirectStatus
        /// </summary>
        public ConfigNodePropertyInteger ResourceResolverDefaultVanityRedirectStatus { get; private set; }

        /// <summary>
        /// ResourceResolverEnableVanitypath
        /// </summary>
        public ConfigNodePropertyBoolean ResourceResolverEnableVanitypath { get; private set; }

        /// <summary>
        /// ResourceResolverVanitypathMaxEntries
        /// </summary>
        public ConfigNodePropertyInteger ResourceResolverVanitypathMaxEntries { get; private set; }

        /// <summary>
        /// ResourceResolverVanitypathMaxEntriesStartup
        /// </summary>
        public ConfigNodePropertyBoolean ResourceResolverVanitypathMaxEntriesStartup { get; private set; }

        /// <summary>
        /// ResourceResolverVanitypathBloomfilterMaxBytes
        /// </summary>
        public ConfigNodePropertyInteger ResourceResolverVanitypathBloomfilterMaxBytes { get; private set; }

        /// <summary>
        /// ResourceResolverOptimizeAliasResolution
        /// </summary>
        public ConfigNodePropertyBoolean ResourceResolverOptimizeAliasResolution { get; private set; }

        /// <summary>
        /// ResourceResolverVanitypathWhitelist
        /// </summary>
        public ConfigNodePropertyArray ResourceResolverVanitypathWhitelist { get; private set; }

        /// <summary>
        /// ResourceResolverVanitypathBlacklist
        /// </summary>
        public ConfigNodePropertyArray ResourceResolverVanitypathBlacklist { get; private set; }

        /// <summary>
        /// ResourceResolverVanityPrecedence
        /// </summary>
        public ConfigNodePropertyBoolean ResourceResolverVanityPrecedence { get; private set; }

        /// <summary>
        /// ResourceResolverProviderhandlingParanoid
        /// </summary>
        public ConfigNodePropertyBoolean ResourceResolverProviderhandlingParanoid { get; private set; }

        /// <summary>
        /// ResourceResolverLogClosing
        /// </summary>
        public ConfigNodePropertyBoolean ResourceResolverLogClosing { get; private set; }

        /// <summary>
        /// ResourceResolverLogUnclosed
        /// </summary>
        public ConfigNodePropertyBoolean ResourceResolverLogUnclosed { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties()
        {
        }

        private OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties(ConfigNodePropertyArray ResourceResolverSearchpath, ConfigNodePropertyBoolean ResourceResolverManglenamespaces, ConfigNodePropertyBoolean ResourceResolverAllowDirect, ConfigNodePropertyArray ResourceResolverRequiredProviders, ConfigNodePropertyArray ResourceResolverRequiredProvidernames, ConfigNodePropertyArray ResourceResolverVirtual, ConfigNodePropertyArray ResourceResolverMapping, ConfigNodePropertyString ResourceResolverMapLocation, ConfigNodePropertyArray ResourceResolverMapObservation, ConfigNodePropertyInteger ResourceResolverDefaultVanityRedirectStatus, ConfigNodePropertyBoolean ResourceResolverEnableVanitypath, ConfigNodePropertyInteger ResourceResolverVanitypathMaxEntries, ConfigNodePropertyBoolean ResourceResolverVanitypathMaxEntriesStartup, ConfigNodePropertyInteger ResourceResolverVanitypathBloomfilterMaxBytes, ConfigNodePropertyBoolean ResourceResolverOptimizeAliasResolution, ConfigNodePropertyArray ResourceResolverVanitypathWhitelist, ConfigNodePropertyArray ResourceResolverVanitypathBlacklist, ConfigNodePropertyBoolean ResourceResolverVanityPrecedence, ConfigNodePropertyBoolean ResourceResolverProviderhandlingParanoid, ConfigNodePropertyBoolean ResourceResolverLogClosing, ConfigNodePropertyBoolean ResourceResolverLogUnclosed)
        {
            
            this.ResourceResolverSearchpath = ResourceResolverSearchpath;
            
            this.ResourceResolverManglenamespaces = ResourceResolverManglenamespaces;
            
            this.ResourceResolverAllowDirect = ResourceResolverAllowDirect;
            
            this.ResourceResolverRequiredProviders = ResourceResolverRequiredProviders;
            
            this.ResourceResolverRequiredProvidernames = ResourceResolverRequiredProvidernames;
            
            this.ResourceResolverVirtual = ResourceResolverVirtual;
            
            this.ResourceResolverMapping = ResourceResolverMapping;
            
            this.ResourceResolverMapLocation = ResourceResolverMapLocation;
            
            this.ResourceResolverMapObservation = ResourceResolverMapObservation;
            
            this.ResourceResolverDefaultVanityRedirectStatus = ResourceResolverDefaultVanityRedirectStatus;
            
            this.ResourceResolverEnableVanitypath = ResourceResolverEnableVanitypath;
            
            this.ResourceResolverVanitypathMaxEntries = ResourceResolverVanitypathMaxEntries;
            
            this.ResourceResolverVanitypathMaxEntriesStartup = ResourceResolverVanitypathMaxEntriesStartup;
            
            this.ResourceResolverVanitypathBloomfilterMaxBytes = ResourceResolverVanitypathBloomfilterMaxBytes;
            
            this.ResourceResolverOptimizeAliasResolution = ResourceResolverOptimizeAliasResolution;
            
            this.ResourceResolverVanitypathWhitelist = ResourceResolverVanitypathWhitelist;
            
            this.ResourceResolverVanitypathBlacklist = ResourceResolverVanitypathBlacklist;
            
            this.ResourceResolverVanityPrecedence = ResourceResolverVanityPrecedence;
            
            this.ResourceResolverProviderhandlingParanoid = ResourceResolverProviderhandlingParanoid;
            
            this.ResourceResolverLogClosing = ResourceResolverLogClosing;
            
            this.ResourceResolverLogUnclosed = ResourceResolverLogUnclosed;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder</returns>
        public static OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder Builder()
        {
            return new OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder</returns>
        public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder With()
        {
            return Builder()
                .ResourceResolverSearchpath(ResourceResolverSearchpath)
                .ResourceResolverManglenamespaces(ResourceResolverManglenamespaces)
                .ResourceResolverAllowDirect(ResourceResolverAllowDirect)
                .ResourceResolverRequiredProviders(ResourceResolverRequiredProviders)
                .ResourceResolverRequiredProvidernames(ResourceResolverRequiredProvidernames)
                .ResourceResolverVirtual(ResourceResolverVirtual)
                .ResourceResolverMapping(ResourceResolverMapping)
                .ResourceResolverMapLocation(ResourceResolverMapLocation)
                .ResourceResolverMapObservation(ResourceResolverMapObservation)
                .ResourceResolverDefaultVanityRedirectStatus(ResourceResolverDefaultVanityRedirectStatus)
                .ResourceResolverEnableVanitypath(ResourceResolverEnableVanitypath)
                .ResourceResolverVanitypathMaxEntries(ResourceResolverVanitypathMaxEntries)
                .ResourceResolverVanitypathMaxEntriesStartup(ResourceResolverVanitypathMaxEntriesStartup)
                .ResourceResolverVanitypathBloomfilterMaxBytes(ResourceResolverVanitypathBloomfilterMaxBytes)
                .ResourceResolverOptimizeAliasResolution(ResourceResolverOptimizeAliasResolution)
                .ResourceResolverVanitypathWhitelist(ResourceResolverVanitypathWhitelist)
                .ResourceResolverVanitypathBlacklist(ResourceResolverVanitypathBlacklist)
                .ResourceResolverVanityPrecedence(ResourceResolverVanityPrecedence)
                .ResourceResolverProviderhandlingParanoid(ResourceResolverProviderhandlingParanoid)
                .ResourceResolverLogClosing(ResourceResolverLogClosing)
                .ResourceResolverLogUnclosed(ResourceResolverLogUnclosed);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties left, OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties left, OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.
        /// </summary>
        public sealed class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _ResourceResolverSearchpath;
            private ConfigNodePropertyBoolean _ResourceResolverManglenamespaces;
            private ConfigNodePropertyBoolean _ResourceResolverAllowDirect;
            private ConfigNodePropertyArray _ResourceResolverRequiredProviders;
            private ConfigNodePropertyArray _ResourceResolverRequiredProvidernames;
            private ConfigNodePropertyArray _ResourceResolverVirtual;
            private ConfigNodePropertyArray _ResourceResolverMapping;
            private ConfigNodePropertyString _ResourceResolverMapLocation;
            private ConfigNodePropertyArray _ResourceResolverMapObservation;
            private ConfigNodePropertyInteger _ResourceResolverDefaultVanityRedirectStatus;
            private ConfigNodePropertyBoolean _ResourceResolverEnableVanitypath;
            private ConfigNodePropertyInteger _ResourceResolverVanitypathMaxEntries;
            private ConfigNodePropertyBoolean _ResourceResolverVanitypathMaxEntriesStartup;
            private ConfigNodePropertyInteger _ResourceResolverVanitypathBloomfilterMaxBytes;
            private ConfigNodePropertyBoolean _ResourceResolverOptimizeAliasResolution;
            private ConfigNodePropertyArray _ResourceResolverVanitypathWhitelist;
            private ConfigNodePropertyArray _ResourceResolverVanitypathBlacklist;
            private ConfigNodePropertyBoolean _ResourceResolverVanityPrecedence;
            private ConfigNodePropertyBoolean _ResourceResolverProviderhandlingParanoid;
            private ConfigNodePropertyBoolean _ResourceResolverLogClosing;
            private ConfigNodePropertyBoolean _ResourceResolverLogUnclosed;

            internal OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverSearchpath property.
            /// </summary>
            /// <param name="value">ResourceResolverSearchpath</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverSearchpath(ConfigNodePropertyArray value)
            {
                _ResourceResolverSearchpath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverManglenamespaces property.
            /// </summary>
            /// <param name="value">ResourceResolverManglenamespaces</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverManglenamespaces(ConfigNodePropertyBoolean value)
            {
                _ResourceResolverManglenamespaces = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverAllowDirect property.
            /// </summary>
            /// <param name="value">ResourceResolverAllowDirect</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverAllowDirect(ConfigNodePropertyBoolean value)
            {
                _ResourceResolverAllowDirect = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverRequiredProviders property.
            /// </summary>
            /// <param name="value">ResourceResolverRequiredProviders</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverRequiredProviders(ConfigNodePropertyArray value)
            {
                _ResourceResolverRequiredProviders = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverRequiredProvidernames property.
            /// </summary>
            /// <param name="value">ResourceResolverRequiredProvidernames</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverRequiredProvidernames(ConfigNodePropertyArray value)
            {
                _ResourceResolverRequiredProvidernames = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverVirtual property.
            /// </summary>
            /// <param name="value">ResourceResolverVirtual</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverVirtual(ConfigNodePropertyArray value)
            {
                _ResourceResolverVirtual = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverMapping property.
            /// </summary>
            /// <param name="value">ResourceResolverMapping</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverMapping(ConfigNodePropertyArray value)
            {
                _ResourceResolverMapping = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverMapLocation property.
            /// </summary>
            /// <param name="value">ResourceResolverMapLocation</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverMapLocation(ConfigNodePropertyString value)
            {
                _ResourceResolverMapLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverMapObservation property.
            /// </summary>
            /// <param name="value">ResourceResolverMapObservation</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverMapObservation(ConfigNodePropertyArray value)
            {
                _ResourceResolverMapObservation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverDefaultVanityRedirectStatus property.
            /// </summary>
            /// <param name="value">ResourceResolverDefaultVanityRedirectStatus</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverDefaultVanityRedirectStatus(ConfigNodePropertyInteger value)
            {
                _ResourceResolverDefaultVanityRedirectStatus = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverEnableVanitypath property.
            /// </summary>
            /// <param name="value">ResourceResolverEnableVanitypath</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverEnableVanitypath(ConfigNodePropertyBoolean value)
            {
                _ResourceResolverEnableVanitypath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverVanitypathMaxEntries property.
            /// </summary>
            /// <param name="value">ResourceResolverVanitypathMaxEntries</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverVanitypathMaxEntries(ConfigNodePropertyInteger value)
            {
                _ResourceResolverVanitypathMaxEntries = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverVanitypathMaxEntriesStartup property.
            /// </summary>
            /// <param name="value">ResourceResolverVanitypathMaxEntriesStartup</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverVanitypathMaxEntriesStartup(ConfigNodePropertyBoolean value)
            {
                _ResourceResolverVanitypathMaxEntriesStartup = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverVanitypathBloomfilterMaxBytes property.
            /// </summary>
            /// <param name="value">ResourceResolverVanitypathBloomfilterMaxBytes</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverVanitypathBloomfilterMaxBytes(ConfigNodePropertyInteger value)
            {
                _ResourceResolverVanitypathBloomfilterMaxBytes = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverOptimizeAliasResolution property.
            /// </summary>
            /// <param name="value">ResourceResolverOptimizeAliasResolution</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverOptimizeAliasResolution(ConfigNodePropertyBoolean value)
            {
                _ResourceResolverOptimizeAliasResolution = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverVanitypathWhitelist property.
            /// </summary>
            /// <param name="value">ResourceResolverVanitypathWhitelist</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverVanitypathWhitelist(ConfigNodePropertyArray value)
            {
                _ResourceResolverVanitypathWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverVanitypathBlacklist property.
            /// </summary>
            /// <param name="value">ResourceResolverVanitypathBlacklist</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverVanitypathBlacklist(ConfigNodePropertyArray value)
            {
                _ResourceResolverVanitypathBlacklist = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverVanityPrecedence property.
            /// </summary>
            /// <param name="value">ResourceResolverVanityPrecedence</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverVanityPrecedence(ConfigNodePropertyBoolean value)
            {
                _ResourceResolverVanityPrecedence = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverProviderhandlingParanoid property.
            /// </summary>
            /// <param name="value">ResourceResolverProviderhandlingParanoid</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverProviderhandlingParanoid(ConfigNodePropertyBoolean value)
            {
                _ResourceResolverProviderhandlingParanoid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverLogClosing property.
            /// </summary>
            /// <param name="value">ResourceResolverLogClosing</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverLogClosing(ConfigNodePropertyBoolean value)
            {
                _ResourceResolverLogClosing = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.ResourceResolverLogUnclosed property.
            /// </summary>
            /// <param name="value">ResourceResolverLogUnclosed</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesBuilder ResourceResolverLogUnclosed(ConfigNodePropertyBoolean value)
            {
                _ResourceResolverLogUnclosed = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties</returns>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties Build()
            {
                Validate();
                return new OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties(
                    ResourceResolverSearchpath: _ResourceResolverSearchpath,
                    ResourceResolverManglenamespaces: _ResourceResolverManglenamespaces,
                    ResourceResolverAllowDirect: _ResourceResolverAllowDirect,
                    ResourceResolverRequiredProviders: _ResourceResolverRequiredProviders,
                    ResourceResolverRequiredProvidernames: _ResourceResolverRequiredProvidernames,
                    ResourceResolverVirtual: _ResourceResolverVirtual,
                    ResourceResolverMapping: _ResourceResolverMapping,
                    ResourceResolverMapLocation: _ResourceResolverMapLocation,
                    ResourceResolverMapObservation: _ResourceResolverMapObservation,
                    ResourceResolverDefaultVanityRedirectStatus: _ResourceResolverDefaultVanityRedirectStatus,
                    ResourceResolverEnableVanitypath: _ResourceResolverEnableVanitypath,
                    ResourceResolverVanitypathMaxEntries: _ResourceResolverVanitypathMaxEntries,
                    ResourceResolverVanitypathMaxEntriesStartup: _ResourceResolverVanitypathMaxEntriesStartup,
                    ResourceResolverVanitypathBloomfilterMaxBytes: _ResourceResolverVanitypathBloomfilterMaxBytes,
                    ResourceResolverOptimizeAliasResolution: _ResourceResolverOptimizeAliasResolution,
                    ResourceResolverVanitypathWhitelist: _ResourceResolverVanitypathWhitelist,
                    ResourceResolverVanitypathBlacklist: _ResourceResolverVanitypathBlacklist,
                    ResourceResolverVanityPrecedence: _ResourceResolverVanityPrecedence,
                    ResourceResolverProviderhandlingParanoid: _ResourceResolverProviderhandlingParanoid,
                    ResourceResolverLogClosing: _ResourceResolverLogClosing,
                    ResourceResolverLogUnclosed: _ResourceResolverLogUnclosed
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}