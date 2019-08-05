using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties:  IEquatable<OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// Type
        /// </summary>
        public ConfigNodePropertyDropDown Type { get; private set; }

        /// <summary>
        /// FormatTarget
        /// </summary>
        public ConfigNodePropertyString FormatTarget { get; private set; }

        /// <summary>
        /// TempFsFolder
        /// </summary>
        public ConfigNodePropertyString TempFsFolder { get; private set; }

        /// <summary>
        /// FileThreshold
        /// </summary>
        public ConfigNodePropertyInteger FileThreshold { get; private set; }

        /// <summary>
        /// MemoryUnit
        /// </summary>
        public ConfigNodePropertyDropDown MemoryUnit { get; private set; }

        /// <summary>
        /// UseOffHeapMemory
        /// </summary>
        public ConfigNodePropertyBoolean UseOffHeapMemory { get; private set; }

        /// <summary>
        /// DigestAlgorithm
        /// </summary>
        public ConfigNodePropertyDropDown DigestAlgorithm { get; private set; }

        /// <summary>
        /// MonitoringQueueSize
        /// </summary>
        public ConfigNodePropertyInteger MonitoringQueueSize { get; private set; }

        /// <summary>
        /// CleanupDelay
        /// </summary>
        public ConfigNodePropertyInteger CleanupDelay { get; private set; }

        /// <summary>
        /// PackageFilters
        /// </summary>
        public ConfigNodePropertyArray PackageFilters { get; private set; }

        /// <summary>
        /// PropertyFilters
        /// </summary>
        public ConfigNodePropertyArray PropertyFilters { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties()
        {
        }

        private OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties(ConfigNodePropertyString Name, ConfigNodePropertyDropDown Type, ConfigNodePropertyString FormatTarget, ConfigNodePropertyString TempFsFolder, ConfigNodePropertyInteger FileThreshold, ConfigNodePropertyDropDown MemoryUnit, ConfigNodePropertyBoolean UseOffHeapMemory, ConfigNodePropertyDropDown DigestAlgorithm, ConfigNodePropertyInteger MonitoringQueueSize, ConfigNodePropertyInteger CleanupDelay, ConfigNodePropertyArray PackageFilters, ConfigNodePropertyArray PropertyFilters)
        {
            
            this.Name = Name;
            
            this.Type = Type;
            
            this.FormatTarget = FormatTarget;
            
            this.TempFsFolder = TempFsFolder;
            
            this.FileThreshold = FileThreshold;
            
            this.MemoryUnit = MemoryUnit;
            
            this.UseOffHeapMemory = UseOffHeapMemory;
            
            this.DigestAlgorithm = DigestAlgorithm;
            
            this.MonitoringQueueSize = MonitoringQueueSize;
            
            this.CleanupDelay = CleanupDelay;
            
            this.PackageFilters = PackageFilters;
            
            this.PropertyFilters = PropertyFilters;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder</returns>
        public OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Type(Type)
                .FormatTarget(FormatTarget)
                .TempFsFolder(TempFsFolder)
                .FileThreshold(FileThreshold)
                .MemoryUnit(MemoryUnit)
                .UseOffHeapMemory(UseOffHeapMemory)
                .DigestAlgorithm(DigestAlgorithm)
                .MonitoringQueueSize(MonitoringQueueSize)
                .CleanupDelay(CleanupDelay)
                .PackageFilters(PackageFilters)
                .PropertyFilters(PropertyFilters);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties left, OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties left, OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyDropDown _Type;
            private ConfigNodePropertyString _FormatTarget;
            private ConfigNodePropertyString _TempFsFolder;
            private ConfigNodePropertyInteger _FileThreshold;
            private ConfigNodePropertyDropDown _MemoryUnit;
            private ConfigNodePropertyBoolean _UseOffHeapMemory;
            private ConfigNodePropertyDropDown _DigestAlgorithm;
            private ConfigNodePropertyInteger _MonitoringQueueSize;
            private ConfigNodePropertyInteger _CleanupDelay;
            private ConfigNodePropertyArray _PackageFilters;
            private ConfigNodePropertyArray _PropertyFilters;

            internal OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder Type(ConfigNodePropertyDropDown value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.FormatTarget property.
            /// </summary>
            /// <param name="value">FormatTarget</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder FormatTarget(ConfigNodePropertyString value)
            {
                _FormatTarget = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.TempFsFolder property.
            /// </summary>
            /// <param name="value">TempFsFolder</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder TempFsFolder(ConfigNodePropertyString value)
            {
                _TempFsFolder = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.FileThreshold property.
            /// </summary>
            /// <param name="value">FileThreshold</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder FileThreshold(ConfigNodePropertyInteger value)
            {
                _FileThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.MemoryUnit property.
            /// </summary>
            /// <param name="value">MemoryUnit</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder MemoryUnit(ConfigNodePropertyDropDown value)
            {
                _MemoryUnit = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.UseOffHeapMemory property.
            /// </summary>
            /// <param name="value">UseOffHeapMemory</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder UseOffHeapMemory(ConfigNodePropertyBoolean value)
            {
                _UseOffHeapMemory = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.DigestAlgorithm property.
            /// </summary>
            /// <param name="value">DigestAlgorithm</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder DigestAlgorithm(ConfigNodePropertyDropDown value)
            {
                _DigestAlgorithm = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.MonitoringQueueSize property.
            /// </summary>
            /// <param name="value">MonitoringQueueSize</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder MonitoringQueueSize(ConfigNodePropertyInteger value)
            {
                _MonitoringQueueSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.CleanupDelay property.
            /// </summary>
            /// <param name="value">CleanupDelay</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder CleanupDelay(ConfigNodePropertyInteger value)
            {
                _CleanupDelay = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.PackageFilters property.
            /// </summary>
            /// <param name="value">PackageFilters</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder PackageFilters(ConfigNodePropertyArray value)
            {
                _PackageFilters = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.PropertyFilters property.
            /// </summary>
            /// <param name="value">PropertyFilters</param>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder PropertyFilters(ConfigNodePropertyArray value)
            {
                _PropertyFilters = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties</returns>
            public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties(
                    Name: _Name,
                    Type: _Type,
                    FormatTarget: _FormatTarget,
                    TempFsFolder: _TempFsFolder,
                    FileThreshold: _FileThreshold,
                    MemoryUnit: _MemoryUnit,
                    UseOffHeapMemory: _UseOffHeapMemory,
                    DigestAlgorithm: _DigestAlgorithm,
                    MonitoringQueueSize: _MonitoringQueueSize,
                    CleanupDelay: _CleanupDelay,
                    PackageFilters: _PackageFilters,
                    PropertyFilters: _PropertyFilters
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}